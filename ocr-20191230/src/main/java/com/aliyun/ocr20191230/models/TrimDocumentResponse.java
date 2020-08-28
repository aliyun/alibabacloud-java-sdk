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

    public static class TrimDocumentResponseData extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static TrimDocumentResponseData build(java.util.Map<String, ?> map) throws Exception {
            TrimDocumentResponseData self = new TrimDocumentResponseData();
            return TeaModel.build(map, self);
        }

    }

}
