// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeveloperInfoUpdateCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>121321412341</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@alibaba.com">xxx@alibaba.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("enterpriseId")
    public Long enterpriseId;

    /**
     * <strong>example:</strong>
     * <p>尚仁</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>15113456789</p>
     */
    @NameInMap("phone")
    public String phone;

    public static DeveloperInfoUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        DeveloperInfoUpdateCmd self = new DeveloperInfoUpdateCmd();
        return TeaModel.build(map, self);
    }

    public DeveloperInfoUpdateCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeveloperInfoUpdateCmd setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public DeveloperInfoUpdateCmd setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public DeveloperInfoUpdateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeveloperInfoUpdateCmd setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
