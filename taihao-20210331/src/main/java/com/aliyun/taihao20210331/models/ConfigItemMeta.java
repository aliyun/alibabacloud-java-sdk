// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ConfigItemMeta extends TeaModel {
    // description
    @NameInMap("description")
    public String description;

    // name
    @NameInMap("name")
    public String name;

    // readOnly
    @NameInMap("readOnly")
    public Boolean readOnly;

    // tags
    @NameInMap("tags")
    public java.util.List<String> tags;

    // visible
    @NameInMap("visible")
    public Boolean visible;

    public static ConfigItemMeta build(java.util.Map<String, ?> map) throws Exception {
        ConfigItemMeta self = new ConfigItemMeta();
        return TeaModel.build(map, self);
    }

    public ConfigItemMeta setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConfigItemMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConfigItemMeta setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public ConfigItemMeta setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public ConfigItemMeta setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }
    public Boolean getVisible() {
        return this.visible;
    }

}
