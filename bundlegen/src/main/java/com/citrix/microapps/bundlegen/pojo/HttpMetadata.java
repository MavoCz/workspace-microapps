package com.citrix.microapps.bundlegen.pojo;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata loaded from `metadata.json` for HTTP integrations.
 */
public class HttpMetadata extends Metadata {
    private final UUID id;  // TODO: Remove it from source json?

    @JsonCreator
    public HttpMetadata(
            @JsonProperty(value = "type", required = true) Type type,
            @JsonProperty(value = "vendor", required = true) String vendor,
            @JsonProperty(value = "id", required = true) UUID id,
            @JsonProperty(value = "title", required = true) String title,
            @JsonProperty(value = "description", required = true) String description,
            @JsonProperty(value = "iconUrl", required = true) URI iconUrl,
            @JsonProperty(value = "masVersion", required = true) String masVersion,
            @JsonProperty(value = "categories", required = true) List<Category> categories,
            @JsonProperty(value = "created", required = true) String created,
            @JsonProperty(value = "supportsOAuthForActions", required = true) boolean supportsOAuthForActions,
            @JsonProperty(value = "i18nLanguages", required = true) List<String> i18nLanguages,
            @JsonProperty(value = "apps", required = true) List<App> apps,
            @JsonProperty(value = "vaResolvers", required = true) List<VaResolver> vaResolvers,
            @JsonProperty(value = "tags", required = true) List<Tag> tags
    ) {
        super(type,
                vendor,
                title,
                description,
                iconUrl,
                masVersion,
                categories,
                created,
                supportsOAuthForActions,
                i18nLanguages,
                apps,
                vaResolvers,
                tags);

        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
