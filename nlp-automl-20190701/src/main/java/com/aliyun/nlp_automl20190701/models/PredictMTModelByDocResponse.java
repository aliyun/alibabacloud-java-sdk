// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class PredictMTModelByDocResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DocId")
    @Validation(required = true)
    public String docId;

    public static PredictMTModelByDocResponse build(java.util.Map<String, ?> map) throws Exception {
        PredictMTModelByDocResponse self = new PredictMTModelByDocResponse();
        return TeaModel.build(map, self);
    }

    public PredictMTModelByDocResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PredictMTModelByDocResponse setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

}
