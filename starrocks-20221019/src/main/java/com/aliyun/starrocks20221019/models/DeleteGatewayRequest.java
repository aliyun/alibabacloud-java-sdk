// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DeleteGatewayRequest extends TeaModel {
    /**
     * <p>The gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2r69r8kpmn56k5s3</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayRequest self = new DeleteGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DeleteGatewayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
