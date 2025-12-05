// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SaveEnvRequest extends TeaModel {
    /**
     * <p>The JMeter environment.</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The name of the file. Make sure that the file name is the same as the file name in the value of <strong>FileOssAddress</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>json.jar</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The Object Storage Service (OSS) URL of the file. Make sure that the file is accessible from the Internet.</p>
         * <blockquote>
         * <p> Only OSS URLs in the China (Shanghai) region are supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/json.jar">https://test.oss-cn-shanghai.aliyuncs.com/json.jar</a></p>
         */
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
        /**
         * <p>The description of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>远程主机</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>remote_hosts</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
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
        /**
         * <p>The ID of the JMeter environment. To create a JMeter environment, leave this parameter empty. To update a JMeter environment, specify the ID of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>10YPA8H</p>
         */
        @NameInMap("EnvId")
        public String envId;

        /**
         * <p>The name of the environment.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-create</p>
         */
        @NameInMap("EnvName")
        public String envName;

        /**
         * <p>The files on which the environment depends.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Files")
        public java.util.List<SaveEnvRequestEnvFiles> files;

        /**
         * <p>The extension label.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("JmeterPluginLabel")
        public String jmeterPluginLabel;

        /**
         * <p>The JMeter attributes.</p>
         */
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
