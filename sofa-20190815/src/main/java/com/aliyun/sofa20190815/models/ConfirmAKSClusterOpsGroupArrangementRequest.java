// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmAKSClusterOpsGroupArrangementRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("Workspace")
    public String workspace;

    public static ConfirmAKSClusterOpsGroupArrangementRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAKSClusterOpsGroupArrangementRequest self = new ConfirmAKSClusterOpsGroupArrangementRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmAKSClusterOpsGroupArrangementRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ConfirmAKSClusterOpsGroupArrangementRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ConfirmAKSClusterOpsGroupArrangementRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
