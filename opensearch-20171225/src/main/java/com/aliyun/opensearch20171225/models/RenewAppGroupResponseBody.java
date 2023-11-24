// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RenewAppGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the application was renewed.</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static RenewAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewAppGroupResponseBody self = new RenewAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewAppGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenewAppGroupResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
