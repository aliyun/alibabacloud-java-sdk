// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class AddGatewayRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FeNodeNumber")
    public Integer feNodeNumber;

    /**
     * <strong>example:</strong>
     * <p>eas_automation_test</p>
     */
    @NameInMap("GatewayName")
    public String gatewayName;

    /**
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static AddGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayRequest self = new AddGatewayRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewayRequest setFeNodeNumber(Integer feNodeNumber) {
        this.feNodeNumber = feNodeNumber;
        return this;
    }
    public Integer getFeNodeNumber() {
        return this.feNodeNumber;
    }

    public AddGatewayRequest setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

    public AddGatewayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
