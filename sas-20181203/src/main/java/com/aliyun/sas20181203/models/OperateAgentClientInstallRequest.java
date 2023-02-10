// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateAgentClientInstallRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Lang")
    public String lang;

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
