// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBEndpointAddressResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBEndpointAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBEndpointAddressResponseBody self = new CreateDBEndpointAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBEndpointAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
