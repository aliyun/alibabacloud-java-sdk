// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SettledCreateCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("application")
    public String application;

    @NameInMap("developerName")
    public String developerName;

    @NameInMap("email")
    public String email;

    @NameInMap("enterpriseName")
    public String enterpriseName;

    @NameInMap("phone")
    public String phone;

    @NameInMap("usage")
    public String usage;

    public static SettledCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        SettledCreateCmd self = new SettledCreateCmd();
        return TeaModel.build(map, self);
    }

    public SettledCreateCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SettledCreateCmd setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public SettledCreateCmd setDeveloperName(String developerName) {
        this.developerName = developerName;
        return this;
    }
    public String getDeveloperName() {
        return this.developerName;
    }

    public SettledCreateCmd setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SettledCreateCmd setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public SettledCreateCmd setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public SettledCreateCmd setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
