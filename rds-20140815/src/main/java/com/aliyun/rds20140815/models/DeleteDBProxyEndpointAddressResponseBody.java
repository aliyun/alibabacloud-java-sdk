// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBProxyEndpointAddressResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>343356C6-64B2-4245-ADEB-C9BD165EDD11</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBProxyEndpointAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBProxyEndpointAddressResponseBody self = new DeleteDBProxyEndpointAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBProxyEndpointAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
