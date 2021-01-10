// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllCasLoadbalanceMountRequest extends TeaModel {
    @NameInMap("LoadbalanceId")
    public String loadbalanceId;

    @NameInMap("Workspace")
    public String workspace;

    public static AllCasLoadbalanceMountRequest build(java.util.Map<String, ?> map) throws Exception {
        AllCasLoadbalanceMountRequest self = new AllCasLoadbalanceMountRequest();
        return TeaModel.build(map, self);
    }

    public AllCasLoadbalanceMountRequest setLoadbalanceId(String loadbalanceId) {
        this.loadbalanceId = loadbalanceId;
        return this;
    }
    public String getLoadbalanceId() {
        return this.loadbalanceId;
    }

    public AllCasLoadbalanceMountRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
