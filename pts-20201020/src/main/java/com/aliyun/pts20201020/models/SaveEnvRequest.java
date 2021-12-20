// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SaveEnvRequest extends TeaModel {
    // 环境
    @NameInMap("Env")
    public SaveEnvRequestEnv env;

    public static SaveEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveEnvRequest self = new SaveEnvRequest();
        return TeaModel.build(map, self);
    }

    public SaveEnvRequest setEnv(SaveEnvRequestEnv env) {
        this.env = env;
        return this;
    }
    public SaveEnvRequestEnv getEnv() {
        return this.env;
    }

    public static class SaveEnvRequestEnvFiles extends TeaModel {
        // 文件名
        @NameInMap("FileName")
        public String fileName;

        // 文件oss地址，目前只支持上海region的oss地址
        @NameInMap("FileOssAddress")
        public String fileOssAddress;

        public static SaveEnvRequestEnvFiles build(java.util.Map<String, ?> map) throws Exception {
            SaveEnvRequestEnvFiles self = new SaveEnvRequestEnvFiles();
            return TeaModel.build(map, self);
        }

        public SaveEnvRequestEnvFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SaveEnvRequestEnvFiles setFileOssAddress(String fileOssAddress) {
            this.fileOssAddress = fileOssAddress;
            return this;
        }
        public String getFileOssAddress() {
            return this.fileOssAddress;
        }

    }

    public static class SaveEnvRequestEnvProperties extends TeaModel {
        // 描述
        @NameInMap("Description")
        public String description;

        // 属性名
        @NameInMap("Name")
        public String name;

        // 属性值
        @NameInMap("Value")
        public String value;

        public static SaveEnvRequestEnvProperties build(java.util.Map<String, ?> map) throws Exception {
            SaveEnvRequestEnvProperties self = new SaveEnvRequestEnvProperties();
            return TeaModel.build(map, self);
        }

        public SaveEnvRequestEnvProperties setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SaveEnvRequestEnvProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SaveEnvRequestEnvProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SaveEnvRequestEnv extends TeaModel {
        // 环境id，不填表示新建环境，填了表示修改该环境
        @NameInMap("EnvId")
        public String envId;

        // 环境名称
        @NameInMap("EnvName")
        public String envName;

        // 环境依赖的文件
        @NameInMap("Files")
        public java.util.List<SaveEnvRequestEnvFiles> files;

        // jmeter插件的环境标签
        @NameInMap("JmeterPluginLabel")
        public String jmeterPluginLabel;

        // jmeter属性
        @NameInMap("Properties")
        public java.util.List<SaveEnvRequestEnvProperties> properties;

        public static SaveEnvRequestEnv build(java.util.Map<String, ?> map) throws Exception {
            SaveEnvRequestEnv self = new SaveEnvRequestEnv();
            return TeaModel.build(map, self);
        }

        public SaveEnvRequestEnv setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public SaveEnvRequestEnv setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public SaveEnvRequestEnv setFiles(java.util.List<SaveEnvRequestEnvFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<SaveEnvRequestEnvFiles> getFiles() {
            return this.files;
        }

        public SaveEnvRequestEnv setJmeterPluginLabel(String jmeterPluginLabel) {
            this.jmeterPluginLabel = jmeterPluginLabel;
            return this;
        }
        public String getJmeterPluginLabel() {
            return this.jmeterPluginLabel;
        }

        public SaveEnvRequestEnv setProperties(java.util.List<SaveEnvRequestEnvProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<SaveEnvRequestEnvProperties> getProperties() {
            return this.properties;
        }

    }

}
