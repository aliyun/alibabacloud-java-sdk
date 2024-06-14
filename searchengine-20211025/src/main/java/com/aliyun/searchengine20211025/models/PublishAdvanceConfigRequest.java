// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class PublishAdvanceConfigRequest extends TeaModel {
    @NameInMap("desc")
    public String desc;

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
        @NameInMap("content")
        public String content;

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
        @NameInMap("config")
        public PublishAdvanceConfigRequestFilesConfig config;

        @NameInMap("dirName")
        public String dirName;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("operateType")
        public String operateType;

        @NameInMap("ossPath")
        public String ossPath;

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
