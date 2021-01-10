// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutAppcreaterepoRequest extends TeaModel {
    @NameInMap("Group")
    public String group;

    @NameInMap("InitProject")
    public String initProject;

    @NameInMap("Repo")
    public String repo;

    @NameInMap("RepoDescription")
    public String repoDescription;

    @NameInMap("TenantIdOrg")
    public String tenantIdOrg;

    @NameInMap("VisibilityLevel")
    public String visibilityLevel;

    public static CreateLinkeBahamutAppcreaterepoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutAppcreaterepoRequest self = new CreateLinkeBahamutAppcreaterepoRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutAppcreaterepoRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public CreateLinkeBahamutAppcreaterepoRequest setInitProject(String initProject) {
        this.initProject = initProject;
        return this;
    }
    public String getInitProject() {
        return this.initProject;
    }

    public CreateLinkeBahamutAppcreaterepoRequest setRepo(String repo) {
        this.repo = repo;
        return this;
    }
    public String getRepo() {
        return this.repo;
    }

    public CreateLinkeBahamutAppcreaterepoRequest setRepoDescription(String repoDescription) {
        this.repoDescription = repoDescription;
        return this;
    }
    public String getRepoDescription() {
        return this.repoDescription;
    }

    public CreateLinkeBahamutAppcreaterepoRequest setTenantIdOrg(String tenantIdOrg) {
        this.tenantIdOrg = tenantIdOrg;
        return this;
    }
    public String getTenantIdOrg() {
        return this.tenantIdOrg;
    }

    public CreateLinkeBahamutAppcreaterepoRequest setVisibilityLevel(String visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }
    public String getVisibilityLevel() {
        return this.visibilityLevel;
    }

}
