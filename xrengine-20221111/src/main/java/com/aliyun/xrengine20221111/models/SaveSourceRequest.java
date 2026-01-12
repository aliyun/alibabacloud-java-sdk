// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class SaveSourceRequest extends TeaModel {
    @NameInMap("ChangeStatus")
    public Boolean changeStatus;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("NeedCheck")
    public Boolean needCheck;

    @NameInMap("ProjectId")
    public Long projectId;

    public static SaveSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSourceRequest self = new SaveSourceRequest();
        return TeaModel.build(map, self);
    }

    public SaveSourceRequest setChangeStatus(Boolean changeStatus) {
        this.changeStatus = changeStatus;
        return this;
    }
    public Boolean getChangeStatus() {
        return this.changeStatus;
    }

    public SaveSourceRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public SaveSourceRequest setNeedCheck(Boolean needCheck) {
        this.needCheck = needCheck;
        return this;
    }
    public Boolean getNeedCheck() {
        return this.needCheck;
    }

    public SaveSourceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
