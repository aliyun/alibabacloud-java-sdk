// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class TemplateSpec extends TeaModel {
    // The raw content of the template.
    @NameInMap("content")
    public String content;

    // The media type of the template content. At the moment, only "application/hcl+terraform" is supported.
    @NameInMap("contentType")
    public String contentType;

    // The content of RAM policy  required for this template.
    @NameInMap("ramPolicy")
    public String ramPolicy;

    // The type of the applicable resource for this template. Must be either "Environment" or "Service".
    @NameInMap("type")
    public String type;

    public static TemplateSpec build(java.util.Map<String, ?> map) throws Exception {
        TemplateSpec self = new TemplateSpec();
        return TeaModel.build(map, self);
    }

    public TemplateSpec setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public TemplateSpec setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public TemplateSpec setRamPolicy(String ramPolicy) {
        this.ramPolicy = ramPolicy;
        return this;
    }
    public String getRamPolicy() {
        return this.ramPolicy;
    }

    public TemplateSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
