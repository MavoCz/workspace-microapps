package com.citrix.microapps.bundlegen.bundles;

import java.util.List;
import java.util.Optional;

import com.citrix.microapps.bundlegen.pojo.MetadataIn;

/**
 * Bundle with all information from filesystem and metadata file.
 */
@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
public class Bundle {
    private final FsBundle fs;
    private final Optional<MetadataIn> metadata;
    private final List<ValidationException> issues;

    public Bundle(FsBundle fs, Optional<MetadataIn> metadata, List<ValidationException> issues) {
        this.fs = fs;
        this.metadata = metadata;
        this.issues = issues;
    }

    public FsBundle getFs() {
        return fs;
    }

    public MetadataIn getMetadata() {
        return metadata.orElseThrow(() -> new IllegalStateException("No metadata"));
    }

    public List<ValidationException> getIssues() {
        return issues;
    }

    @Override
    public String toString() {
        return fs.toString();
    }
}
