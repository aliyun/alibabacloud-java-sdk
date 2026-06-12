// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MLLabelParam extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1695090077</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The description of the tag table.</p>
     * 
     * <strong>example:</strong>
     * <p>默认表</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The unique identifier of the tag table.</p>
     * 
     * <strong>example:</strong>
     * <p>abbd488f6dd42d294495fb780858e83d</p>
     */
    @NameInMap("labelId")
    public String labelId;

    /**
     * <p>The last modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>1695090077</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    /**
     * <p>The name of the tag table.</p>
     * 
     * <strong>example:</strong>
     * <p>标签表</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The configurations of the tag tables.</p>
     */
    @NameInMap("settings")
    public java.util.List<MLLabelParamSettings> settings;

    /**
     * <p>The type of the tag table.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
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
        /**
         * <p>The details of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("config")
        public String config;

        /**
         * <p>The mode of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>builtin</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The task type of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Trace.RCA</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The version number of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
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
