// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CodeSourceItem extends TeaModel {
    /**
     * <p>The branch of the code repository. If you configure this parameter when you call the CreateJob API operation, the branch is overwritten.</p>
     * 
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("CodeBranch")
    public String codeBranch;

    /**
     * <p>The commit ID. If you configure this parameter when you call the CreateJob API operation, the commit is overwritten.</p>
     * 
     * <strong>example:</strong>
     * <p>44da109b59f8596152987eaa8f3b2487bb72ea63</p>
     */
    @NameInMap("CodeCommit")
    public String codeCommit;

    /**
     * <p>The URL of the code repository.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://code.aliyun.com/pai-dlc/examples.git">https://code.aliyun.com/pai-dlc/examples.git</a></p>
     */
    @NameInMap("CodeRepo")
    public String codeRepo;

    /**
     * <p>The access token used to access the code repository.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("CodeRepoAccessToken")
    public String codeRepoAccessToken;

    /**
     * <p>The username used to access the private code repository.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("CodeRepoUserName")
    public String codeRepoUserName;

    /**
     * <p>The ID of the code source.</p>
     * 
     * <strong>example:</strong>
     * <p>code-20210111103721-********</p>
     */
    @NameInMap("CodeSourceId")
    public String codeSourceId;

    /**
     * <p>The description of the code source.</p>
     * 
     * <strong>example:</strong>
     * <p>code source of dlc examples</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the code source.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCodeSourceName1</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The time when the code source was created. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-18T12:52:15Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the code source was modified. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-18T12:52:15Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    /**
     * <p>The UID of the Alibaba Cloud user who creates the code source.</p>
     * 
     * <strong>example:</strong>
     * <p>115729017166****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CodeSourceItem build(java.util.Map<String, ?> map) throws Exception {
        CodeSourceItem self = new CodeSourceItem();
        return TeaModel.build(map, self);
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

    public CodeSourceItem setCodeRepo(String codeRepo) {
        this.codeRepo = codeRepo;
        return this;
    }
    public String getCodeRepo() {
        return this.codeRepo;
    }

    public CodeSourceItem setCodeRepoAccessToken(String codeRepoAccessToken) {
        this.codeRepoAccessToken = codeRepoAccessToken;
        return this;
    }
    public String getCodeRepoAccessToken() {
        return this.codeRepoAccessToken;
    }

    public CodeSourceItem setCodeRepoUserName(String codeRepoUserName) {
        this.codeRepoUserName = codeRepoUserName;
        return this;
    }
    public String getCodeRepoUserName() {
        return this.codeRepoUserName;
    }

    public CodeSourceItem setCodeSourceId(String codeSourceId) {
        this.codeSourceId = codeSourceId;
        return this;
    }
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    public CodeSourceItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CodeSourceItem setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
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

    public CodeSourceItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
