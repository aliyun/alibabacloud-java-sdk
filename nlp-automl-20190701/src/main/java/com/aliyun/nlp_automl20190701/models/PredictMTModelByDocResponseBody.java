// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class PredictMTModelByDocResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DocId")
    public String docId;

    /**
     * <strong>example:</strong>
     * <p>86D18195-D89C-4C8C-9DC4-5FCE789CE6D5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PredictMTModelByDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PredictMTModelByDocResponseBody self = new PredictMTModelByDocResponseBody();
        return TeaModel.build(map, self);
    }

    public PredictMTModelByDocResponseBody setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public PredictMTModelByDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
