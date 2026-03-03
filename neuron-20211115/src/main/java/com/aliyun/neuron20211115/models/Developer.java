// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class Developer extends TeaModel {
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
     * <p>121321412341</p>
     */
    @NameInMap("codeupAccountId")
    public String codeupAccountId;

    /**
     * <p>This parameter is required.</p>
     * 
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>尚仁</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15113456789</p>
     */
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
