// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MLLabelParam extends TeaModel {
    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("labelId")
    public String labelId;

    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    @NameInMap("name")
    public String name;

    @NameInMap("settings")
    public java.util.List<MLLabelParamSettings> settings;

    @NameInMap("type")
    public String type;

    public static MLLabelParam build(java.util.Map<String, ?> map) throws Exception {
        MLLabelParam self = new MLLabelParam();
        return TeaModel.build(map, self);
    }

    public MLLabelParam setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public MLLabelParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MLLabelParam setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public MLLabelParam setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public MLLabelParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MLLabelParam setSettings(java.util.List<MLLabelParamSettings> settings) {
        this.settings = settings;
        return this;
    }
    public java.util.List<MLLabelParamSettings> getSettings() {
        return this.settings;
    }

    public MLLabelParam setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class MLLabelParamSettings extends TeaModel {
        @NameInMap("config")
        public String config;

        @NameInMap("mode")
        public String mode;

        @NameInMap("type")
        public String type;

        @NameInMap("version")
        public String version;

        public static MLLabelParamSettings build(java.util.Map<String, ?> map) throws Exception {
            MLLabelParamSettings self = new MLLabelParamSettings();
            return TeaModel.build(map, self);
        }

        public MLLabelParamSettings setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public MLLabelParamSettings setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public MLLabelParamSettings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public MLLabelParamSettings setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
