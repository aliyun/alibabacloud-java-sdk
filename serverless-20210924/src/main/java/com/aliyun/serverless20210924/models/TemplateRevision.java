// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class TemplateRevision extends TeaModel {
    // A time representing the server time when this object was created. Clients may not set this value. Populated by the system. Read-only.
    @NameInMap("createdTime")
    public String createdTime;

    // The kind of the resource.
    @NameInMap("kind")
    public String kind;

    // Specification of the desired behavior of the Template.
    @NameInMap("spec")
    public TemplateSpec spec;

    // Most recently observed status of the Template. This data may not be up-to-date. Populated by the system. Read-only.
    @NameInMap("status")
    public TemplateStatus status;

    // The generation of the template.
    @NameInMap("templateGeneration")
    public Integer templateGeneration;

    // The name of a template.
    @NameInMap("templateName")
    public String templateName;

    // The version of a template.
    @NameInMap("templateVersion")
    public Integer templateVersion;

    // Main user ID of an Aliyun account.
    @NameInMap("uid")
    public String uid;

    public static TemplateRevision build(java.util.Map<String, ?> map) throws Exception {
        TemplateRevision self = new TemplateRevision();
        return TeaModel.build(map, self);
    }

    public TemplateRevision setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public TemplateRevision setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public TemplateRevision setSpec(TemplateSpec spec) {
        this.spec = spec;
        return this;
    }
    public TemplateSpec getSpec() {
        return this.spec;
    }

    public TemplateRevision setStatus(TemplateStatus status) {
        this.status = status;
        return this;
    }
    public TemplateStatus getStatus() {
        return this.status;
    }

    public TemplateRevision setTemplateGeneration(Integer templateGeneration) {
        this.templateGeneration = templateGeneration;
        return this;
    }
    public Integer getTemplateGeneration() {
        return this.templateGeneration;
    }

    public TemplateRevision setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public TemplateRevision setTemplateVersion(Integer templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Integer getTemplateVersion() {
        return this.templateVersion;
    }

    public TemplateRevision setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
