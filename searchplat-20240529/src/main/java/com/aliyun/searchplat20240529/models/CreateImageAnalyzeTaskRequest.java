// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateImageAnalyzeTaskRequest extends TeaModel {
    @NameInMap("document")
    public CreateImageAnalyzeTaskRequestDocument document;

    public static CreateImageAnalyzeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageAnalyzeTaskRequest self = new CreateImageAnalyzeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageAnalyzeTaskRequest setDocument(CreateImageAnalyzeTaskRequestDocument document) {
        this.document = document;
        return this;
    }
    public CreateImageAnalyzeTaskRequestDocument getDocument() {
        return this.document;
    }

    public static class CreateImageAnalyzeTaskRequestDocument extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("file_name")
        public String fileName;

        @NameInMap("file_type")
        public String fileType;

        @NameInMap("url")
        public String url;

        public static CreateImageAnalyzeTaskRequestDocument build(java.util.Map<String, ?> map) throws Exception {
            CreateImageAnalyzeTaskRequestDocument self = new CreateImageAnalyzeTaskRequestDocument();
            return TeaModel.build(map, self);
        }

        public CreateImageAnalyzeTaskRequestDocument setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateImageAnalyzeTaskRequestDocument setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateImageAnalyzeTaskRequestDocument setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public CreateImageAnalyzeTaskRequestDocument setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
