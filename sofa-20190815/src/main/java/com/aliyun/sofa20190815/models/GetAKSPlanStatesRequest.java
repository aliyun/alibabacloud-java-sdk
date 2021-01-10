// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSPlanStatesRequest extends TeaModel {
    @NameInMap("PlanQueryJsonStr")
    public String planQueryJsonStr;

    @NameInMap("Workspace")
    public String workspace;

    public static GetAKSPlanStatesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAKSPlanStatesRequest self = new GetAKSPlanStatesRequest();
        return TeaModel.build(map, self);
    }

    public GetAKSPlanStatesRequest setPlanQueryJsonStr(String planQueryJsonStr) {
        this.planQueryJsonStr = planQueryJsonStr;
        return this;
    }
    public String getPlanQueryJsonStr() {
        return this.planQueryJsonStr;
    }

    public GetAKSPlanStatesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
