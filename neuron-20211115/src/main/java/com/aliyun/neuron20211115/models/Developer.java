// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class Developer extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("codeupAccountId")
    public String codeupAccountId;

    @NameInMap("email")
    public String email;

    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("name")
    public String name;

    @NameInMap("phone")
    public String phone;

    @NameInMap("requestId")
    public String requestId;

    public static Developer build(java.util.Map<String, ?> map) throws Exception {
        Developer self = new Developer();
        return TeaModel.build(map, self);
    }

    public Developer setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public Developer setCodeupAccountId(String codeupAccountId) {
        this.codeupAccountId = codeupAccountId;
        return this;
    }
    public String getCodeupAccountId() {
        return this.codeupAccountId;
    }

    public Developer setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public Developer setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public Developer setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Developer setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public Developer setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
