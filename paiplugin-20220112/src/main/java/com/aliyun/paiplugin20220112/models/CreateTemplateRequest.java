// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    // 模板内容，请注意控制总字数在70个字以内，超出部分按长短信收费，按67个字为单位记一条短信，营销短信必须在结尾添加“回T退订”。
    @NameInMap("Content")
    public String content;

    // 申请说明。
    @NameInMap("Description")
    public String description;

    // 模板名称。
    @NameInMap("Name")
    public String name;

    // 签名名称，同时只能指定签名名称或签名Id其中之一。
    @NameInMap("Signature")
    public String signature;

    // 签名Id，可通过ListSignatures获取审核状态为已通过的签名列表，获取签名Id。
    @NameInMap("SignatureId")
    public String signatureId;

    // 模板类型。
    // - 0 : 验证码。
    // - 1 : 短信通知。
    // - 2 : 推广短信。
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

    public CreateTemplateRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CreateTemplateRequest setSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }
    public String getSignatureId() {
        return this.signatureId;
    }

    public CreateTemplateRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
