// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetLayerResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DomainId")
    public String domainId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("IsDefaultLayer")
    public Boolean isDefaultLayer;

    @NameInMap("LayerId")
    public String layerId;

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

    public static GetLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLayerResponseBody self = new GetLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLayerResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetLayerResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public GetLayerResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetLayerResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetLayerResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetLayerResponseBody setIsDefaultLayer(Boolean isDefaultLayer) {
        this.isDefaultLayer = isDefaultLayer;
        return this;
    }
    public Boolean getIsDefaultLayer() {
        return this.isDefaultLayer;
    }

    public GetLayerResponseBody setLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }
    public String getLayerId() {
        return this.layerId;
    }

    public GetLayerResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLayerResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetLayerResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLayerResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
