// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class JudgeLinkeBahamutDiffbetweenbranchesRequest extends TeaModel {
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("MrSourceBranch")
    public String mrSourceBranch;

    @NameInMap("MrTargetBranch")
    public String mrTargetBranch;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("TenantName")
    public String tenantName;

    public static JudgeLinkeBahamutDiffbetweenbranchesRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeLinkeBahamutDiffbetweenbranchesRequest self = new JudgeLinkeBahamutDiffbetweenbranchesRequest();
        return TeaModel.build(map, self);
    }

    public JudgeLinkeBahamutDiffbetweenbranchesRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public JudgeLinkeBahamutDiffbetweenbranchesRequest setMrSourceBranch(String mrSourceBranch) {
        this.mrSourceBranch = mrSourceBranch;
        return this;
    }
    public String getMrSourceBranch() {
        return this.mrSourceBranch;
    }

    public JudgeLinkeBahamutDiffbetweenbranchesRequest setMrTargetBranch(String mrTargetBranch) {
        this.mrTargetBranch = mrTargetBranch;
        return this;
    }
    public String getMrTargetBranch() {
        return this.mrTargetBranch;
    }

    public JudgeLinkeBahamutDiffbetweenbranchesRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public JudgeLinkeBahamutDiffbetweenbranchesRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
