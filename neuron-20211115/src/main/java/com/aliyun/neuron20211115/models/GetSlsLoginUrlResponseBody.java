// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetSlsLoginUrlResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("slsLoginUrl")
    public String slsLoginUrl;

    public static GetSlsLoginUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSlsLoginUrlResponseBody self = new GetSlsLoginUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSlsLoginUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSlsLoginUrlResponseBody setSlsLoginUrl(String slsLoginUrl) {
        this.slsLoginUrl = slsLoginUrl;
        return this;
    }
    public String getSlsLoginUrl() {
        return this.slsLoginUrl;
    }

}
