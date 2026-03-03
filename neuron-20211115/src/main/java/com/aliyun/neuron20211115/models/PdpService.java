// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpService extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>121321412341</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <p>This parameter is required.</p>
     * 
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
     * <p>1</p>
     */
    @NameInMap("enterpriseId")
    public Long enterpriseId;

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
     * <strong>example:</strong>
     * <p>2022-2-22 11:11:2</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2022-2-22 11:11:2</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p><a href="https://cd.aone.alibaba-inc.com/ec/pipelines/44156?spm=a2o8d.aone_cd_assets_pages_pipeline_index.0.0.68b81c05WLmX79&name=%E3%80%90%E6%B5%8B%E8%AF%95%E3%80%91neuron-developer%E6%9D%AD%E5%B7%9E">https://cd.aone.alibaba-inc.com/ec/pipelines/44156?spm=a2o8d.aone_cd_assets_pages_pipeline_index.0.0.68b81c05WLmX79&amp;name=%E3%80%90%E6%B5%8B%E8%AF%95%E3%80%91neuron-developer%E6%9D%AD%E5%B7%9E</a></p>
     */
    @NameInMap("jumpUrl")
    public String jumpUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>employee</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>INNER</p>
     */
    @NameInMap("orgType")
    public String orgType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SDK</p>
     */
    @NameInMap("type")
    public String type;

    public static PdpService build(java.util.Map<String, ?> map) throws Exception {
        PdpService self = new PdpService();
        return TeaModel.build(map, self);
    }

    public PdpService setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PdpService setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PdpService setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
        return this;
    }
    public String getCodeBranch() {
        return this.codeBranch;
    }

    public PdpService setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PdpService setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public PdpService setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public PdpService setGitRepo(String gitRepo) {
        this.gitRepo = gitRepo;
        return this;
    }
    public String getGitRepo() {
        return this.gitRepo;
    }

    public PdpService setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PdpService setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public PdpService setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PdpService setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
        return this;
    }
    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public PdpService setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PdpService setOrgType(String orgType) {
        this.orgType = orgType;
        return this;
    }
    public String getOrgType() {
        return this.orgType;
    }

    public PdpService setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public PdpService setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpService setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PdpService setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
