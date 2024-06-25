// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DeleteIpamPoolAllocationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B90776C8-F703-51D5-893A-AD1CA699D535</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpamPoolAllocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpamPoolAllocationResponseBody self = new DeleteIpamPoolAllocationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpamPoolAllocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
