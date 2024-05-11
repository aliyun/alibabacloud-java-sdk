// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetDomainResponseBody extends TeaModel {
    @NameInMap("BucketType")
    public String bucketType;

    @NameInMap("Condition")
    public String condition;

    @NameInMap("CrowdIds")
    public String crowdIds;

    @NameInMap("DebugUsers")
    public String debugUsers;

    @NameInMap("Description")
    public String description;

    @NameInMap("DomainId")
    public String domainId;

    @NameInMap("Flow")
    public Long flow;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("IsDefaultDomain")
    public Boolean isDefaultDomain;

    @NameInMap("LayerId")
    public String layerId;

    @NameInMap("LayerName")
    public String layerName;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainResponseBody self = new GetDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainResponseBody setBucketType(String bucketType) {
        this.bucketType = bucketType;
        return this;
    }
    public String getBucketType() {
        return this.bucketType;
    }

    public GetDomainResponseBody setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public GetDomainResponseBody setCrowdIds(String crowdIds) {
        this.crowdIds = crowdIds;
        return this;
    }
    public String getCrowdIds() {
        return this.crowdIds;
    }

    public GetDomainResponseBody setDebugUsers(String debugUsers) {
        this.debugUsers = debugUsers;
        return this;
    }
    public String getDebugUsers() {
        return this.debugUsers;
    }

    public GetDomainResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetDomainResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public GetDomainResponseBody setFlow(Long flow) {
        this.flow = flow;
        return this;
    }
    public Long getFlow() {
        return this.flow;
    }

    public GetDomainResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetDomainResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetDomainResponseBody setIsDefaultDomain(Boolean isDefaultDomain) {
        this.isDefaultDomain = isDefaultDomain;
        return this;
    }
    public Boolean getIsDefaultDomain() {
        return this.isDefaultDomain;
    }

    public GetDomainResponseBody setLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }
    public String getLayerId() {
        return this.layerId;
    }

    public GetDomainResponseBody setLayerName(String layerName) {
        this.layerName = layerName;
        return this;
    }
    public String getLayerName() {
        return this.layerName;
    }

    public GetDomainResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDomainResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetDomainResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDomainResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
