// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ProductInfo extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("id")
    public Long id;

    @NameInMap("isAuthorized")
    public Boolean isAuthorized;

    @NameInMap("name")
    public String name;

    public static ProductInfo build(java.util.Map<String, ?> map) throws Exception {
        ProductInfo self = new ProductInfo();
        return TeaModel.build(map, self);
    }

    public ProductInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ProductInfo setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public ProductInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ProductInfo setIsAuthorized(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
        return this;
    }
    public Boolean getIsAuthorized() {
        return this.isAuthorized;
    }

    public ProductInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
