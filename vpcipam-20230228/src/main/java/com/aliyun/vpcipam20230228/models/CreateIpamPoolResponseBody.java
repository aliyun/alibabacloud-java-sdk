// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamPoolResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ipam-pool-6rcq3tobayc20t****</p>
     */
    @NameInMap("IpamPoolId")
    public String ipamPoolId;

    /**
     * <strong>example:</strong>
     * <p>BB2C39DE-CEB8-595A-981A-F2EFCBE7324E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIpamPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamPoolResponseBody self = new CreateIpamPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpamPoolResponseBody setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
        return this;
    }
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    public CreateIpamPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
