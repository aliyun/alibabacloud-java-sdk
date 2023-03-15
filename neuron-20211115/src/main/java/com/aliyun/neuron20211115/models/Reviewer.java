// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class Reviewer extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    public static Reviewer build(java.util.Map<String, ?> map) throws Exception {
        Reviewer self = new Reviewer();
        return TeaModel.build(map, self);
    }

    public Reviewer setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public Reviewer setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public Reviewer setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Reviewer setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
