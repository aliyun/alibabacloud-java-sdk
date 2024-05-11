// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetCrowdResponseBody extends TeaModel {
    @NameInMap("CrowdId")
    public String crowdId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Label")
    public String label;

    @NameInMap("Name")
    public String name;

    @NameInMap("Quantity")
    public String quantity;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Users")
    public String users;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetCrowdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdResponseBody self = new GetCrowdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCrowdResponseBody setCrowdId(String crowdId) {
        this.crowdId = crowdId;
        return this;
    }
    public String getCrowdId() {
        return this.crowdId;
    }

    public GetCrowdResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetCrowdResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetCrowdResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetCrowdResponseBody setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public GetCrowdResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetCrowdResponseBody setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public GetCrowdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCrowdResponseBody setUsers(String users) {
        this.users = users;
        return this;
    }
    public String getUsers() {
        return this.users;
    }

    public GetCrowdResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
