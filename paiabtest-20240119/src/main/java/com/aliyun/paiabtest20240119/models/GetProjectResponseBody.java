// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    @NameInMap("DefaultDomainId")
    public String defaultDomainId;

    @NameInMap("DefaultLayerId")
    public String defaultLayerId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponseBody self = new GetProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectResponseBody setDefaultDomainId(String defaultDomainId) {
        this.defaultDomainId = defaultDomainId;
        return this;
    }
    public String getDefaultDomainId() {
        return this.defaultDomainId;
    }

    public GetProjectResponseBody setDefaultLayerId(String defaultLayerId) {
        this.defaultLayerId = defaultLayerId;
        return this;
    }
    public String getDefaultLayerId() {
        return this.defaultLayerId;
    }

    public GetProjectResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetProjectResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetProjectResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetProjectResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetProjectResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
