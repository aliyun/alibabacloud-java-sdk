// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class ThirdPartyTransferRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrgId")
    public String orgId;

    public static ThirdPartyTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        ThirdPartyTransferRequest self = new ThirdPartyTransferRequest();
        return TeaModel.build(map, self);
    }

    public ThirdPartyTransferRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ThirdPartyTransferRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

}
