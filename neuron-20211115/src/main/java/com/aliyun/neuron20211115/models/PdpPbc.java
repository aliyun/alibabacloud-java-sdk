// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpPbc extends TeaModel {
    @NameInMap("alias")
    public String alias;

    @NameInMap("company")
    public String company;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("description")
    public String description;

    @NameInMap("developerId")
    public String developerId;

    @NameInMap("gitGroup")
    public String gitGroup;

    @NameInMap("gitGroupInfo")
    public String gitGroupInfo;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("type")
    public String type;

    public static PdpPbc build(java.util.Map<String, ?> map) throws Exception {
        PdpPbc self = new PdpPbc();
        return TeaModel.build(map, self);
    }

    public PdpPbc setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PdpPbc setCompany(String company) {
        this.company = company;
        return this;
    }
    public String getCompany() {
        return this.company;
    }

    public PdpPbc setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PdpPbc setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PdpPbc setDeveloperId(String developerId) {
        this.developerId = developerId;
        return this;
    }
    public String getDeveloperId() {
        return this.developerId;
    }

    public PdpPbc setGitGroup(String gitGroup) {
        this.gitGroup = gitGroup;
        return this;
    }
    public String getGitGroup() {
        return this.gitGroup;
    }

    public PdpPbc setGitGroupInfo(String gitGroupInfo) {
        this.gitGroupInfo = gitGroupInfo;
        return this;
    }
    public String getGitGroupInfo() {
        return this.gitGroupInfo;
    }

    public PdpPbc setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PdpPbc setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PdpPbc setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PdpPbc setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpPbc setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
