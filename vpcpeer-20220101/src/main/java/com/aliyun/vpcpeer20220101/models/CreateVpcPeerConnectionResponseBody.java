// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class CreateVpcPeerConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance on which the VPC peering connection is created.</p>
     * 
     * <strong>example:</strong>
     * <p>pcc-lnk0m24khwvtkm****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVpcPeerConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcPeerConnectionResponseBody self = new CreateVpcPeerConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpcPeerConnectionResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateVpcPeerConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
