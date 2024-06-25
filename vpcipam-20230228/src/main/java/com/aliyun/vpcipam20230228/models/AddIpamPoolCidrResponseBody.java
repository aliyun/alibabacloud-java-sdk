// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class AddIpamPoolCidrResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>558BC336-8B88-53B0-B4AD-980EE900AB01</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddIpamPoolCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddIpamPoolCidrResponseBody self = new AddIpamPoolCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public AddIpamPoolCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
