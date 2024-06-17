// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ConfigValue extends TeaModel {
    @NameInMap("desc")
    public String desc;

    @NameInMap("files")
    public java.util.List<ConfigValueFiles> files;

    public static ConfigValue build(java.util.Map<String, ?> map) throws Exception {
        ConfigValue self = new ConfigValue();
        return TeaModel.build(map, self);
    }

    public ConfigValue setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ConfigValue setFiles(java.util.List<ConfigValueFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<ConfigValueFiles> getFiles() {
        return this.files;
    }

    public static class ConfigValueFilesConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>$dictContent</p>
         */
        @NameInMap("content")
        public String content;

        @NameInMap("variables")
        public java.util.Map<String, ConfigValueFilesConfigVariablesValue> variables;

        public static ConfigValueFilesConfig build(java.util.Map<String, ?> map) throws Exception {
            ConfigValueFilesConfig self = new ConfigValueFilesConfig();
            return TeaModel.build(map, self);
        }

        public ConfigValueFilesConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ConfigValueFilesConfig setVariables(java.util.Map<String, ConfigValueFilesConfigVariablesValue> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.Map<String, ConfigValueFilesConfigVariablesValue> getVariables() {
            return this.variables;
        }

    }

    public static class ConfigValueFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("operateType")
        public String operateType;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("parentFullPath")
        public String parentFullPath;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("config")
        public ConfigValueFilesConfig config;

        /**
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("dirName")
        public String dirName;

        public static ConfigValueFiles build(java.util.Map<String, ?> map) throws Exception {
            ConfigValueFiles self = new ConfigValueFiles();
            return TeaModel.build(map, self);
        }

        public ConfigValueFiles setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public ConfigValueFiles setParentFullPath(String parentFullPath) {
            this.parentFullPath = parentFullPath;
            return this;
        }
        public String getParentFullPath() {
            return this.parentFullPath;
        }

        public ConfigValueFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ConfigValueFiles setConfig(ConfigValueFilesConfig config) {
            this.config = config;
            return this;
        }
        public ConfigValueFilesConfig getConfig() {
            return this.config;
        }

        public ConfigValueFiles setDirName(String dirName) {
            this.dirName = dirName;
            return this;
        }
        public String getDirName() {
            return this.dirName;
        }

    }

}
