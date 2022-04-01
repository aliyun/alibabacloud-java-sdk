// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ConfigFileMeta extends TeaModel {
    // configItems
    @NameInMap("configItems")
    public java.util.List<ConfigItemMeta> configItems;

    // description
    @NameInMap("description")
    public String description;

    // index
    @NameInMap("index")
    public Long index;

    // name
    @NameInMap("name")
    public String name;

    // readOnly
    @NameInMap("readOnly")
    public Boolean readOnly;

    // visible
    @NameInMap("visible")
    public Boolean visible;

    public static ConfigFileMeta build(java.util.Map<String, ?> map) throws Exception {
        ConfigFileMeta self = new ConfigFileMeta();
        return TeaModel.build(map, self);
    }

    public ConfigFileMeta setConfigItems(java.util.List<ConfigItemMeta> configItems) {
        this.configItems = configItems;
        return this;
    }
    public java.util.List<ConfigItemMeta> getConfigItems() {
        return this.configItems;
    }

    public ConfigFileMeta setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConfigFileMeta setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

    public ConfigFileMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConfigFileMeta setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public ConfigFileMeta setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }
    public Boolean getVisible() {
        return this.visible;
    }

}
