// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    // 模板内容，请注意控制总字数在70个字以内，超出部分按长短信收费，按67个字为单位记一条短信，必须在结尾添加"回T退订"
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

}
