// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCFlowSiteRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static DeleteLDCFlowSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCFlowSiteRequest self = new DeleteLDCFlowSiteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLDCFlowSiteRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteLDCFlowSiteRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DeleteLDCFlowSiteRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
