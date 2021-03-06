// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CodeSourceItem extends TeaModel {
    // 代码源ID
    @NameInMap("CodeSourceId")
    public String codeSourceId;

    // 代码源配置的名字
    @NameInMap("DisplayName")
    public String displayName;

    // 代码源详细描述
    @NameInMap("Description")
    public String description;

    // 代码仓库地址
    @NameInMap("CodeRepo")
    public String codeRepo;

    // 代码分支
    @NameInMap("CodeBranch")
    public String codeBranch;

    // 代码Commit ID
    @NameInMap("CodeCommit")
    public String codeCommit;

    // 访问代码仓库的用户名
    @NameInMap("CodeRepoUserName")
    public String codeRepoUserName;

    // 访问代码仓库所用的AccessToken
    @NameInMap("CodeRepoAccessToken")
    public String codeRepoAccessToken;

    // 代码源配置的用户ID
    @NameInMap("UserId")
    public String userId;

    // 创建时间
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 修改时间
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    public static CodeSourceItem build(java.util.Map<String, ?> map) throws Exception {
        CodeSourceItem self = new CodeSourceItem();
        return TeaModel.build(map, self);
    }

    public CodeSourceItem setCodeSourceId(String codeSourceId) {
        this.codeSourceId = codeSourceId;
        return this;
    }
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    public CodeSourceItem setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CodeSourceItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CodeSourceItem setCodeRepo(String codeRepo) {
        this.codeRepo = codeRepo;
        return this;
    }
    public String getCodeRepo() {
        return this.codeRepo;
    }

    public CodeSourceItem setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
        return this;
    }
    public String getCodeBranch() {
        return this.codeBranch;
    }

    public CodeSourceItem setCodeCommit(String codeCommit) {
        this.codeCommit = codeCommit;
        return this;
    }
    public String getCodeCommit() {
        return this.codeCommit;
    }

    public CodeSourceItem setCodeRepoUserName(String codeRepoUserName) {
        this.codeRepoUserName = codeRepoUserName;
        return this;
    }
    public String getCodeRepoUserName() {
        return this.codeRepoUserName;
    }

    public CodeSourceItem setCodeRepoAccessToken(String codeRepoAccessToken) {
        this.codeRepoAccessToken = codeRepoAccessToken;
        return this;
    }
    public String getCodeRepoAccessToken() {
        return this.codeRepoAccessToken;
    }

    public CodeSourceItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CodeSourceItem setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public CodeSourceItem setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

}
