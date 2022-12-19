// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateAgentClientInstallRequest extends TeaModel {
    // The IDs of the servers on which you want to install the Security Center agent. Separate multiple IDs with commas (,).
    // 
    // >  You must specify at least one of the **InstanceIds** and **Uuids** parameters before you can call this operation.
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Lang")
    public String lang;

    // The UUIDs of the servers on which you want to install the Security Center agent. Separate multiple UUIDs with commas (,).
    // 
    // >  You must specify at least one of the **InstanceIds** and **Uuids** parameters before you can call this operation.
    @NameInMap("Uuids")
    public String uuids;

    public static OperateAgentClientInstallRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAgentClientInstallRequest self = new OperateAgentClientInstallRequest();
        return TeaModel.build(map, self);
    }

    public OperateAgentClientInstallRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public OperateAgentClientInstallRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public OperateAgentClientInstallRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
