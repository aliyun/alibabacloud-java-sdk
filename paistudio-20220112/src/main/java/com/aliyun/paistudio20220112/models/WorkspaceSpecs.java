// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class WorkspaceSpecs extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Specs")
    public java.util.List<WorkspaceSpec> specs;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static WorkspaceSpecs build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceSpecs self = new WorkspaceSpecs();
        return TeaModel.build(map, self);
    }

    public WorkspaceSpecs setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public WorkspaceSpecs setSpecs(java.util.List<WorkspaceSpec> specs) {
        this.specs = specs;
        return this;
    }
    public java.util.List<WorkspaceSpec> getSpecs() {
        return this.specs;
    }

    public WorkspaceSpecs setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
