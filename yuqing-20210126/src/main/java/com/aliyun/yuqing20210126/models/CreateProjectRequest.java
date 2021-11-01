// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    // 创建者uid
    @NameInMap("createUserId")
    public String createUserId;

    // 创建者名称
    @NameInMap("createUserName")
    public String createUserName;

    // 舆情项目对象
    @NameInMap("project")
    public Project project;

    // 请求id
    @NameInMap("requestId")
    public String requestId;

    // 舆情团队HashId
    @NameInMap("teamHashId")
    public String teamHashId;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public CreateProjectRequest setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public CreateProjectRequest setProject(Project project) {
        this.project = project;
        return this;
    }
    public Project getProject() {
        return this.project;
    }

    public CreateProjectRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProjectRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
