// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class Pbc extends TeaModel {
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

    @NameInMap("forkCount")
    public Integer forkCount;

    @NameInMap("id")
    public Long id;

    @NameInMap("industry")
    public String industry;

    @NameInMap("name")
    public String name;

    @NameInMap("quoteCount")
    public Integer quoteCount;

    @NameInMap("type")
    public String type;

    public static Pbc build(java.util.Map<String, ?> map) throws Exception {
        Pbc self = new Pbc();
        return TeaModel.build(map, self);
    }

    public Pbc setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public Pbc setCompany(String company) {
        this.company = company;
        return this;
    }
    public String getCompany() {
        return this.company;
    }

    public Pbc setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public Pbc setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Pbc setDeveloperId(String developerId) {
        this.developerId = developerId;
        return this;
    }
    public String getDeveloperId() {
        return this.developerId;
    }

    public Pbc setForkCount(Integer forkCount) {
        this.forkCount = forkCount;
        return this;
    }
    public Integer getForkCount() {
        return this.forkCount;
    }

    public Pbc setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Pbc setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public Pbc setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Pbc setQuoteCount(Integer quoteCount) {
        this.quoteCount = quoteCount;
        return this;
    }
    public Integer getQuoteCount() {
        return this.quoteCount;
    }

    public Pbc setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
