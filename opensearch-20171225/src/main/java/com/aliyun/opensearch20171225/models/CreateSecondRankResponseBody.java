// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSecondRankResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the fine sort expression.</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static CreateSecondRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecondRankResponseBody self = new CreateSecondRankResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecondRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSecondRankResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
