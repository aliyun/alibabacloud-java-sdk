// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamScopeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIpamScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamScopeResponseBody self = new UpdateIpamScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpamScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
