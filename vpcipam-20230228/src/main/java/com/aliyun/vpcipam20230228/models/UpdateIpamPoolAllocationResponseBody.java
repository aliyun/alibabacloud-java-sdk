// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamPoolAllocationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIpamPoolAllocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamPoolAllocationResponseBody self = new UpdateIpamPoolAllocationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpamPoolAllocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
