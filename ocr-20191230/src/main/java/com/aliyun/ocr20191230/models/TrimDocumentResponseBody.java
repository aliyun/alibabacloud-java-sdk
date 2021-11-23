// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class TrimDocumentResponseBody extends TeaModel {
    @NameInMap("Data")
    public TrimDocumentResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static TrimDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrimDocumentResponseBody self = new TrimDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public TrimDocumentResponseBody setData(TrimDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TrimDocumentResponseBodyData getData() {
        return this.data;
    }

    public TrimDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TrimDocumentResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static TrimDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TrimDocumentResponseBodyData self = new TrimDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TrimDocumentResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
