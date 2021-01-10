// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCFlowUidInfoRequest extends TeaModel {
    @NameInMap("Elastic")
    public Boolean elastic;

    @NameInMap("Gray")
    public Boolean gray;

    @NameInMap("Press")
    public Boolean press;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static QueryLDCFlowUidInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCFlowUidInfoRequest self = new QueryLDCFlowUidInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLDCFlowUidInfoRequest setElastic(Boolean elastic) {
        this.elastic = elastic;
        return this;
    }
    public Boolean getElastic() {
        return this.elastic;
    }

    public QueryLDCFlowUidInfoRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public QueryLDCFlowUidInfoRequest setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

    public QueryLDCFlowUidInfoRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
