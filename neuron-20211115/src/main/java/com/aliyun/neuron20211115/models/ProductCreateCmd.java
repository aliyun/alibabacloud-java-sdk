// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ProductCreateCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    /**
     * <strong>example:</strong>
     * <p>多端商城</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>yunmall</p>
     */
    @NameInMap("name")
    public String name;

    public static ProductCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        ProductCreateCmd self = new ProductCreateCmd();
        return TeaModel.build(map, self);
    }

    public ProductCreateCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ProductCreateCmd setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ProductCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public ProductCreateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ProductCreateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
