// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class DeleteProjectRequest extends TeaModel {
    // 舆情项目id
    @NameInMap("id")
    public Long id;

    // 修改人uid
    @NameInMap("modifiedUserId")
    public String modifiedUserId;

    // 修改人名称
    @NameInMap("modifiedUserName")
    public String modifiedUserName;

    // 请求id
    @NameInMap("requestId")
    public String requestId;

    // 舆情团队HashId
    @NameInMap("teamHashId")
    public String teamHashId;

    public static DeleteProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectRequest self = new DeleteProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProjectRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteProjectRequest setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
        return this;
    }
    public String getModifiedUserId() {
        return this.modifiedUserId;
    }

    public DeleteProjectRequest setModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
        return this;
    }
    public String getModifiedUserName() {
        return this.modifiedUserName;
    }

    public DeleteProjectRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteProjectRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
