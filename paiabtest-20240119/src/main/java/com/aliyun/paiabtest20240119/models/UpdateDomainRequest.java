// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateDomainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BucketType")
    public String bucketType;

    @NameInMap("Condition")
    public String condition;

    @NameInMap("CrowIds")
    public String crowIds;

    @NameInMap("DebugUsers")
    public String debugUsers;

    @NameInMap("Description")
    public String description;

    @NameInMap("Flow")
    public Long flow;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static UpdateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRequest self = new UpdateDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRequest setBucketType(String bucketType) {
        this.bucketType = bucketType;
        return this;
    }
    public String getBucketType() {
        return this.bucketType;
    }

    public UpdateDomainRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public UpdateDomainRequest setCrowIds(String crowIds) {
        this.crowIds = crowIds;
        return this;
    }
    public String getCrowIds() {
        return this.crowIds;
    }

    public UpdateDomainRequest setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public UpdateDomainRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDomainRequest setFlow(Long flow) {
        this.flow = flow;
        return this;
    }
    public Long getFlow() {
        return this.flow;
    }

    public UpdateDomainRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDomainRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
