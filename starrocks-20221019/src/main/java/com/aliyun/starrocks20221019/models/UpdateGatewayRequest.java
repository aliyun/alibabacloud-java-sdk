// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class UpdateGatewayRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FeNodeNumber")
    public Integer feNodeNumber;

    /**
     * <strong>example:</strong>
     * <p>dg-65u7d65p5960fjq7</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>polar-byd-glm-47</p>
     */
    @NameInMap("GatewayName")
    public String gatewayName;

    /**
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRequest self = new UpdateGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRequest setFeNodeNumber(Integer feNodeNumber) {
        this.feNodeNumber = feNodeNumber;
        return this;
    }
    public Integer getFeNodeNumber() {
        return this.feNodeNumber;
    }

    public UpdateGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRequest setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

    public UpdateGatewayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
