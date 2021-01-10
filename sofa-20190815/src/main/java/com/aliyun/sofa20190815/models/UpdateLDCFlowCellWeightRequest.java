// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFlowCellWeightRequest extends TeaModel {
    @NameInMap("CellGroup")
    public String cellGroup;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Press")
    public Boolean press;

    @NameInMap("WeightInfoListJsonStr")
    public String weightInfoListJsonStr;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static UpdateLDCFlowCellWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFlowCellWeightRequest self = new UpdateLDCFlowCellWeightRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFlowCellWeightRequest setCellGroup(String cellGroup) {
        this.cellGroup = cellGroup;
        return this;
    }
    public String getCellGroup() {
        return this.cellGroup;
    }

    public UpdateLDCFlowCellWeightRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateLDCFlowCellWeightRequest setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

    public UpdateLDCFlowCellWeightRequest setWeightInfoListJsonStr(String weightInfoListJsonStr) {
        this.weightInfoListJsonStr = weightInfoListJsonStr;
        return this;
    }
    public String getWeightInfoListJsonStr() {
        return this.weightInfoListJsonStr;
    }

    public UpdateLDCFlowCellWeightRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
