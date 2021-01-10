// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSPlanRequest extends TeaModel {
    @NameInMap("PlanQueryJsonStr")
    public String planQueryJsonStr;

    @NameInMap("Workspace")
    public String workspace;

    public static GetAKSPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAKSPlanRequest self = new GetAKSPlanRequest();
        return TeaModel.build(map, self);
    }

    public GetAKSPlanRequest setPlanQueryJsonStr(String planQueryJsonStr) {
        this.planQueryJsonStr = planQueryJsonStr;
        return this;
    }
    public String getPlanQueryJsonStr() {
        return this.planQueryJsonStr;
    }

    public GetAKSPlanRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
