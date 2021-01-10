// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutAppcustomciconfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Branch")
    public String branch;

    @NameInMap("Created")
    public Long created;

    @NameInMap("Crontab")
    public String crontab;

    @NameInMap("Deleted")
    public Boolean deleted;

    @NameInMap("Id")
    public String id;

    @NameInMap("LastModified")
    public Long lastModified;

    @NameInMap("Name")
    public String name;

    @NameInMap("PipelineInstanceId")
    public Long pipelineInstanceId;

    @NameInMap("PipelineTemplateId")
    public Long pipelineTemplateId;

    @NameInMap("PipelineTemplateName")
    public String pipelineTemplateName;

    @NameInMap("TenantId")
    public String tenantId;

    public static SaveLinkeBahamutAppcustomciconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutAppcustomciconfigRequest self = new SaveLinkeBahamutAppcustomciconfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutAppcustomciconfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SaveLinkeBahamutAppcustomciconfigRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public SaveLinkeBahamutAppcustomciconfigRequest setCreated(Long created) {
        this.created = created;
        return this;
    }
    public Long getCreated() {
        return this.created;
    }

    public SaveLinkeBahamutAppcustomciconfigRequest setCrontab(String crontab) {
        this.crontab = crontab;
        return this;
    }
    public String getCrontab() {
        return this.crontab;
    }

    public SaveLinkeBahamutAppcustomciconfigRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public SaveLinkeBahamutAppcustomciconfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SaveLinkeBahamutAppcustomciconfigRequest setLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public Long getLastModified() {
        return this.lastModified;
    }

    public SaveLinkeBahamutAppcustomciconfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SaveLinkeBahamutAppcustomciconfigRequest setPipelineInstanceId(Long pipelineInstanceId) {
        this.pipelineInstanceId = pipelineInstanceId;
        return this;
    }
    public Long getPipelineInstanceId() {
        return this.pipelineInstanceId;
    }

    public SaveLinkeBahamutAppcustomciconfigRequest setPipelineTemplateId(Long pipelineTemplateId) {
        this.pipelineTemplateId = pipelineTemplateId;
        return this;
    }
    public Long getPipelineTemplateId() {
        return this.pipelineTemplateId;
    }

    public SaveLinkeBahamutAppcustomciconfigRequest setPipelineTemplateName(String pipelineTemplateName) {
        this.pipelineTemplateName = pipelineTemplateName;
        return this;
    }
    public String getPipelineTemplateName() {
        return this.pipelineTemplateName;
    }

    public SaveLinkeBahamutAppcustomciconfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
