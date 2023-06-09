// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The return results.</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static GetDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainResponseBody self = new GetDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDomainResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
