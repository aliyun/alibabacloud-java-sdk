// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class TrimDocumentResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public TrimDocumentResponseData data;

    public static TrimDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        TrimDocumentResponse self = new TrimDocumentResponse();
        return TeaModel.build(map, self);
    }

    public TrimDocumentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrimDocumentResponse setData(TrimDocumentResponseData data) {
        this.data = data;
        return this;
    }
    public TrimDocumentResponseData getData() {
        return this.data;
    }

    public static class TrimDocumentResponseData extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static TrimDocumentResponseData build(java.util.Map<String, ?> map) throws Exception {
            TrimDocumentResponseData self = new TrimDocumentResponseData();
            return TeaModel.build(map, self);
        }

        public TrimDocumentResponseData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
