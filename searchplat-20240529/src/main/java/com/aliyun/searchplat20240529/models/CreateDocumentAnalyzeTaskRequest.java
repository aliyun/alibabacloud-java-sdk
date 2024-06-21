// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateDocumentAnalyzeTaskRequest extends TeaModel {
    @NameInMap("document")
    public CreateDocumentAnalyzeTaskRequestDocument document;

    @NameInMap("output")
    public CreateDocumentAnalyzeTaskRequestOutput output;

    public static CreateDocumentAnalyzeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDocumentAnalyzeTaskRequest self = new CreateDocumentAnalyzeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDocumentAnalyzeTaskRequest setDocument(CreateDocumentAnalyzeTaskRequestDocument document) {
        this.document = document;
        return this;
    }
    public CreateDocumentAnalyzeTaskRequestDocument getDocument() {
        return this.document;
    }

    public CreateDocumentAnalyzeTaskRequest setOutput(CreateDocumentAnalyzeTaskRequestOutput output) {
        this.output = output;
        return this;
    }
    public CreateDocumentAnalyzeTaskRequestOutput getOutput() {
        return this.output;
    }

    public static class CreateDocumentAnalyzeTaskRequestDocument extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("file_name")
        public String fileName;

        @NameInMap("file_type")
        public String fileType;

        @NameInMap("url")
        public String url;

        public static CreateDocumentAnalyzeTaskRequestDocument build(java.util.Map<String, ?> map) throws Exception {
            CreateDocumentAnalyzeTaskRequestDocument self = new CreateDocumentAnalyzeTaskRequestDocument();
            return TeaModel.build(map, self);
        }

        public CreateDocumentAnalyzeTaskRequestDocument setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateDocumentAnalyzeTaskRequestDocument setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateDocumentAnalyzeTaskRequestDocument setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public CreateDocumentAnalyzeTaskRequestDocument setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateDocumentAnalyzeTaskRequestOutput extends TeaModel {
        @NameInMap("image_storage")
        public String imageStorage;

        public static CreateDocumentAnalyzeTaskRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            CreateDocumentAnalyzeTaskRequestOutput self = new CreateDocumentAnalyzeTaskRequestOutput();
            return TeaModel.build(map, self);
        }

        public CreateDocumentAnalyzeTaskRequestOutput setImageStorage(String imageStorage) {
            this.imageStorage = imageStorage;
            return this;
        }
        public String getImageStorage() {
            return this.imageStorage;
        }

    }

}
