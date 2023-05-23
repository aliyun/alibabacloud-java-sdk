// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    /**
     * <p>模板内容，请注意控制总字数在70个字以内，超出部分按长短信收费，按67个字为单位记一条短信，营销短信必须在结尾添加“回T退订”。</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>申请说明。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>模板名称。</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>签名名称，同时只能指定签名名称或签名ID其中之一。</p>
     */
    @NameInMap("Signature")
    public String signature;

    /**
     * <p>签名ID，可通过ListSignatures获取审核状态为已通过的签名列表，获取签名ID。</p>
     */
    @NameInMap("SignatureId")
    public String signatureId;

    /**
     * <p>模板类型。</p>
     * <p>- 0 : 验证码。</p>
     * <p>- 1 : 短信通知。</p>
     * <p>- 2 : 推广短信。</p>
     */
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
