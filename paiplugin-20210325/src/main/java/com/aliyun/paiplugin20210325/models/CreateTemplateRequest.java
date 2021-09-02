// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    // 模板内容，请注意控制总字数在70个字以内，超出部分按长短信收费，按67个字为单位记一条短信，必须在结尾添加”回T退订“
    @NameInMap("Content")
    public String content;

    // 申请说明
    @NameInMap("Description")
    public String description;

    // 模板名称
    @NameInMap("Name")
    public String name;

    // 无需填写
    @NameInMap("ProcessInstanceID")
    public String processInstanceID;

    // 签名ID
    @NameInMap("SignatureID")
    public String signatureID;

    // 模板类型：
    // 0：验证码。
    // 1：短信通知。
    // 2：推广短信。
    // 3：国际/港澳台消息。
    @NameInMap("Type")
    public Integer type;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTemplateRequest setProcessInstanceID(String processInstanceID) {
        this.processInstanceID = processInstanceID;
        return this;
    }
    public String getProcessInstanceID() {
        return this.processInstanceID;
    }

    public CreateTemplateRequest setSignatureID(String signatureID) {
        this.signatureID = signatureID;
        return this;
    }
    public String getSignatureID() {
        return this.signatureID;
    }

    public CreateTemplateRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
