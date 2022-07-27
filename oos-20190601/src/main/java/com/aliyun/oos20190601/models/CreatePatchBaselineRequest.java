// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreatePatchBaselineRequest extends TeaModel {
    @NameInMap("ApprovalRules")
    public String approvalRules;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("OperationSystem")
    public String operationSystem;

    @NameInMap("RegionId")
    public String regionId;

    public static CreatePatchBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePatchBaselineRequest self = new CreatePatchBaselineRequest();
        return TeaModel.build(map, self);
    }

    public CreatePatchBaselineRequest setApprovalRules(String approvalRules) {
        this.approvalRules = approvalRules;
        return this;
    }
    public String getApprovalRules() {
        return this.approvalRules;
    }

    public CreatePatchBaselineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePatchBaselineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePatchBaselineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePatchBaselineRequest setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
        return this;
    }
    public String getOperationSystem() {
        return this.operationSystem;
    }

    public CreatePatchBaselineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
