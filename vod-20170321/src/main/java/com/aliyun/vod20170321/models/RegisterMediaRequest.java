// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegisterMediaRequest extends TeaModel {
    @NameInMap("RegisterMetadatas")
    public String registerMetadatas;

    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("WorkflowId")
    public String workflowId;

    public static RegisterMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaRequest self = new RegisterMediaRequest();
        return TeaModel.build(map, self);
    }

    public RegisterMediaRequest setRegisterMetadatas(String registerMetadatas) {
        this.registerMetadatas = registerMetadatas;
        return this;
    }
    public String getRegisterMetadatas() {
        return this.registerMetadatas;
    }

    public RegisterMediaRequest setTemplateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    public RegisterMediaRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public RegisterMediaRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
