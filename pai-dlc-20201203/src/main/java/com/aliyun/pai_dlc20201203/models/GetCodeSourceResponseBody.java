// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetCodeSourceResponseBody extends TeaModel {
    // 代码仓库分支
    @NameInMap("CodeBranch")
    public String codeBranch;

    // 代码Commit
    @NameInMap("CodeCommit")
    public String codeCommit;

    // 代码仓库地址
    @NameInMap("CodeRepo")
    public String codeRepo;

    // 访问代码仓库的token
    @NameInMap("CodeRepoAccessToken")
    public String codeRepoAccessToken;

    // 代码仓库的用户名
    @NameInMap("CodeRepoUserName")
    public String codeRepoUserName;

    // 代码源配置ID
    @NameInMap("CodeSourceId")
    public String codeSourceId;

    // 详细描述
    @NameInMap("Description")
    public String description;

    // 代码源配置名字
    @NameInMap("DisplayName")
    public String displayName;

    // 创建时间
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 修改时间
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    // 代码本地挂载目录，默认挂载到/root/code/下
    @NameInMap("MountPath")
    public String mountPath;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 代码配置源的创建者ID
    @NameInMap("UserId")
    public String userId;

    public static GetCodeSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCodeSourceResponseBody self = new GetCodeSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCodeSourceResponseBody setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
        return this;
    }
    public String getCodeBranch() {
        return this.codeBranch;
    }

    public GetCodeSourceResponseBody setCodeCommit(String codeCommit) {
        this.codeCommit = codeCommit;
        return this;
    }
    public String getCodeCommit() {
        return this.codeCommit;
    }

    public GetCodeSourceResponseBody setCodeRepo(String codeRepo) {
        this.codeRepo = codeRepo;
        return this;
    }
    public String getCodeRepo() {
        return this.codeRepo;
    }

    public GetCodeSourceResponseBody setCodeRepoAccessToken(String codeRepoAccessToken) {
        this.codeRepoAccessToken = codeRepoAccessToken;
        return this;
    }
    public String getCodeRepoAccessToken() {
        return this.codeRepoAccessToken;
    }

    public GetCodeSourceResponseBody setCodeRepoUserName(String codeRepoUserName) {
        this.codeRepoUserName = codeRepoUserName;
        return this;
    }
    public String getCodeRepoUserName() {
        return this.codeRepoUserName;
    }

    public GetCodeSourceResponseBody setCodeSourceId(String codeSourceId) {
        this.codeSourceId = codeSourceId;
        return this;
    }
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    public GetCodeSourceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetCodeSourceResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetCodeSourceResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetCodeSourceResponseBody setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public GetCodeSourceResponseBody setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public GetCodeSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCodeSourceResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
