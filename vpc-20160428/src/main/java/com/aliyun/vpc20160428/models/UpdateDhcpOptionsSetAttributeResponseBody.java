// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateDhcpOptionsSetAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDhcpOptionsSetAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDhcpOptionsSetAttributeResponseBody self = new UpdateDhcpOptionsSetAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDhcpOptionsSetAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
