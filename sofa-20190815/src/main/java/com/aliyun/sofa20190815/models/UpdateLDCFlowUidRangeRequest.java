// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFlowUidRangeRequest extends TeaModel {
    @NameInMap("CellGroup")
    public String cellGroup;

    @NameInMap("Gray")
    public Boolean gray;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Press")
    public Boolean press;

    @NameInMap("UidRangesJsonStr")
    public String uidRangesJsonStr;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static UpdateLDCFlowUidRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFlowUidRangeRequest self = new UpdateLDCFlowUidRangeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFlowUidRangeRequest setCellGroup(String cellGroup) {
        this.cellGroup = cellGroup;
        return this;
    }
    public String getCellGroup() {
        return this.cellGroup;
    }

    public UpdateLDCFlowUidRangeRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public UpdateLDCFlowUidRangeRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateLDCFlowUidRangeRequest setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

    public UpdateLDCFlowUidRangeRequest setUidRangesJsonStr(String uidRangesJsonStr) {
        this.uidRangesJsonStr = uidRangesJsonStr;
        return this;
    }
    public String getUidRangesJsonStr() {
        return this.uidRangesJsonStr;
    }

    public UpdateLDCFlowUidRangeRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
