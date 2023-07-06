// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    @NameInMap("isInfo")
    public Boolean isInfo;

    @NameInMap("project")
    public Project project;

    @NameInMap("projectId")
    public Long projectId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("teamHashId")
    public String teamHashId;

    @NameInMap("updateUserId")
    public String updateUserId;

    @NameInMap("updateUserName")
    public String updateUserName;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setIsInfo(Boolean isInfo) {
        this.isInfo = isInfo;
        return this;
    }
    public Boolean getIsInfo() {
        return this.isInfo;
    }

    public UpdateProjectRequest setProject(Project project) {
        this.project = project;
        return this;
    }
    public Project getProject() {
        return this.project;
    }

    public UpdateProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateProjectRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProjectRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

    public UpdateProjectRequest setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
        return this;
    }
    public String getUpdateUserId() {
        return this.updateUserId;
    }

    public UpdateProjectRequest setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
        return this;
    }
    public String getUpdateUserName() {
        return this.updateUserName;
    }

}
