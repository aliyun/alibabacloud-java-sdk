// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcCreateCmd extends TeaModel {
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

    @NameInMap("industry")
    public String industry;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    public static PbcCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        PbcCreateCmd self = new PbcCreateCmd();
        return TeaModel.build(map, self);
    }

    public PbcCreateCmd setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PbcCreateCmd setCompany(String company) {
        this.company = company;
        return this;
    }
    public String getCompany() {
        return this.company;
    }

    public PbcCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PbcCreateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PbcCreateCmd setDeveloperId(String developerId) {
        this.developerId = developerId;
        return this;
    }
    public String getDeveloperId() {
        return this.developerId;
    }

    public PbcCreateCmd setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public PbcCreateCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public PbcCreateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PbcCreateCmd setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
