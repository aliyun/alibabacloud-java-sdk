// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class TogglePublicSlbRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnablePublicSlb")
    public Boolean enablePublicSlb;

    /**
     * <strong>example:</strong>
     * <p>gw-0002xci9buu68ongixvk</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static TogglePublicSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        TogglePublicSlbRequest self = new TogglePublicSlbRequest();
        return TeaModel.build(map, self);
    }

    public TogglePublicSlbRequest setEnablePublicSlb(Boolean enablePublicSlb) {
        this.enablePublicSlb = enablePublicSlb;
        return this;
    }
    public Boolean getEnablePublicSlb() {
        return this.enablePublicSlb;
    }

    public TogglePublicSlbRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public TogglePublicSlbRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
