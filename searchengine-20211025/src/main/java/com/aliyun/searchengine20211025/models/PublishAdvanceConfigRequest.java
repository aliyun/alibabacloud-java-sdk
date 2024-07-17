// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class PublishAdvanceConfigRequest extends TeaModel {
    /**
     * <p>The description of the advanced configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom configuration</p>
     */
    @NameInMap("desc")
    public String desc;

    /**
     * <p>The files.</p>
     */
    @NameInMap("files")
    public java.util.List<PublishAdvanceConfigRequestFiles> files;

    public static PublishAdvanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishAdvanceConfigRequest self = new PublishAdvanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public PublishAdvanceConfigRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public PublishAdvanceConfigRequest setFiles(java.util.List<PublishAdvanceConfigRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<PublishAdvanceConfigRequestFiles> getFiles() {
        return this.files;
    }

    public static class PublishAdvanceConfigRequestFilesConfig extends TeaModel {
        /**
         * <p>The file content.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;url\&quot;:\&quot;<a href="http://xxxxxx.aliyuncs.com/outnet_hz/packages/xxxxx/opensearch_offline_plugins_xxxxx.tar%5C%5C%22%7D">http://xxxxxx.aliyuncs.com/outnet_hz/packages/xxxxx/opensearch_offline_plugins_xxxxx.tar\\&quot;}</a></p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The variables.</p>
         */
        @NameInMap("variables")
        public java.util.Map<String, FilesConfigVariablesValue> variables;

        public static PublishAdvanceConfigRequestFilesConfig build(java.util.Map<String, ?> map) throws Exception {
            PublishAdvanceConfigRequestFilesConfig self = new PublishAdvanceConfigRequestFilesConfig();
            return TeaModel.build(map, self);
        }

        public PublishAdvanceConfigRequestFilesConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public PublishAdvanceConfigRequestFilesConfig setVariables(java.util.Map<String, FilesConfigVariablesValue> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.Map<String, FilesConfigVariablesValue> getVariables() {
            return this.variables;
        }

    }

    public static class PublishAdvanceConfigRequestFiles extends TeaModel {
        /**
         * <p>The information about the advanced configuration.</p>
         */
        @NameInMap("config")
        public PublishAdvanceConfigRequestFilesConfig config;

        /**
         * <p>The directory name.</p>
         * 
         * <strong>example:</strong>
         * <p>/clusters</p>
         */
        @NameInMap("dirName")
        public String dirName;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>vector_question_schema.json</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The operation type. Valid values: UPDATE and DELETE. Default value: UPDATE.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("operateType")
        public String operateType;

        /**
         * <p>The path of the Object Storage Service (OSS) object.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://opensearch/test.json</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>The path of the parent directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("parentFullPath")
        public String parentFullPath;

        public static PublishAdvanceConfigRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            PublishAdvanceConfigRequestFiles self = new PublishAdvanceConfigRequestFiles();
            return TeaModel.build(map, self);
        }

        public PublishAdvanceConfigRequestFiles setConfig(PublishAdvanceConfigRequestFilesConfig config) {
            this.config = config;
            return this;
        }
        public PublishAdvanceConfigRequestFilesConfig getConfig() {
            return this.config;
        }

        public PublishAdvanceConfigRequestFiles setDirName(String dirName) {
            this.dirName = dirName;
            return this;
        }
        public String getDirName() {
            return this.dirName;
        }

        public PublishAdvanceConfigRequestFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public PublishAdvanceConfigRequestFiles setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public PublishAdvanceConfigRequestFiles setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public PublishAdvanceConfigRequestFiles setParentFullPath(String parentFullPath) {
            this.parentFullPath = parentFullPath;
            return this;
        }
        public String getParentFullPath() {
            return this.parentFullPath;
        }

    }

}
