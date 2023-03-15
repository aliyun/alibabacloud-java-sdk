// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class BucEnterprise extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("codeupEnterpriseId")
    public String codeupEnterpriseId;

    @NameInMap("codeupNamespaceId")
    public Long codeupNamespaceId;

    @NameInMap("description")
    public String description;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    public static BucEnterprise build(java.util.Map<String, ?> map) throws Exception {
        BucEnterprise self = new BucEnterprise();
        return TeaModel.build(map, self);
    }

    public BucEnterprise setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public BucEnterprise setCodeupEnterpriseId(String codeupEnterpriseId) {
        this.codeupEnterpriseId = codeupEnterpriseId;
        return this;
    }
    public String getCodeupEnterpriseId() {
        return this.codeupEnterpriseId;
    }

    public BucEnterprise setCodeupNamespaceId(Long codeupNamespaceId) {
        this.codeupNamespaceId = codeupNamespaceId;
        return this;
    }
    public Long getCodeupNamespaceId() {
        return this.codeupNamespaceId;
    }

    public BucEnterprise setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BucEnterprise setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public BucEnterprise setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BucEnterprise setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
