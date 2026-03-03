// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpServiceUpdateCmd extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>员工管理</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("codeBranch")
    public String codeBranch;

    /**
     * <strong>example:</strong>
     * <p>员工管理</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>SDK</p>
     */
    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:git@gitlab.alibaba-inc.com">git@gitlab.alibaba-inc.com</a>:neuron/manager-developer.git</p>
     */
    @NameInMap("gitRepo")
    public String gitRepo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p><a href="https://aone.alibaba-inc.com/appcenter/app/onlinetask/SUBMIT_RESOURCE_APPLY?appId=195041">https://aone.alibaba-inc.com/appcenter/app/onlinetask/SUBMIT_RESOURCE_APPLY?appId=195041</a></p>
     */
    @NameInMap("jumpUrl")
    public String jumpUrl;

    public static PdpServiceUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        PdpServiceUpdateCmd self = new PdpServiceUpdateCmd();
        return TeaModel.build(map, self);
    }

    public PdpServiceUpdateCmd setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PdpServiceUpdateCmd setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
        return this;
    }
    public String getCodeBranch() {
        return this.codeBranch;
    }

    public PdpServiceUpdateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PdpServiceUpdateCmd setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public PdpServiceUpdateCmd setGitRepo(String gitRepo) {
        this.gitRepo = gitRepo;
        return this;
    }
    public String getGitRepo() {
        return this.gitRepo;
    }

    public PdpServiceUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PdpServiceUpdateCmd setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
        return this;
    }
    public String getJumpUrl() {
        return this.jumpUrl;
    }

}
