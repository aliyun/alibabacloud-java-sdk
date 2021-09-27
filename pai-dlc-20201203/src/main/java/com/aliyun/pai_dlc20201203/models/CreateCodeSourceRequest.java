// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateCodeSourceRequest extends TeaModel {
    // 代码源配置名称
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

    // 代码本地挂载目录，默认挂载到/root/code/下
    @NameInMap("MountPath")
    public String mountPath;

    // 用户名
    @NameInMap("CodeRepoUserName")
    public String codeRepoUserName;

    // 密码
    @NameInMap("CodeRepoAccessToken")
    public String codeRepoAccessToken;

    public static CreateCodeSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeSourceRequest self = new CreateCodeSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateCodeSourceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateCodeSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCodeSourceRequest setCodeRepo(String codeRepo) {
        this.codeRepo = codeRepo;
        return this;
    }
    public String getCodeRepo() {
        return this.codeRepo;
    }

    public CreateCodeSourceRequest setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
        return this;
    }
    public String getCodeBranch() {
        return this.codeBranch;
    }

    public CreateCodeSourceRequest setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public CreateCodeSourceRequest setCodeRepoUserName(String codeRepoUserName) {
        this.codeRepoUserName = codeRepoUserName;
        return this;
    }
    public String getCodeRepoUserName() {
        return this.codeRepoUserName;
    }

    public CreateCodeSourceRequest setCodeRepoAccessToken(String codeRepoAccessToken) {
        this.codeRepoAccessToken = codeRepoAccessToken;
        return this;
    }
    public String getCodeRepoAccessToken() {
        return this.codeRepoAccessToken;
    }

}
