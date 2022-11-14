// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class GetPredictResultResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPredictResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPredictResultResponseBody self = new GetPredictResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPredictResultResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetPredictResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
