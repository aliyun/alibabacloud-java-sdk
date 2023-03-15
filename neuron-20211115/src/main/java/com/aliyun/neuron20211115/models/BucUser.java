// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class BucUser extends TeaModel {
    @NameInMap("account")
    public String account;

    @NameInMap("empId")
    public String empId;

    @NameInMap("empType")
    public String empType;

    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("name")
    public String name;

    @NameInMap("nickName")
    public String nickName;

    @NameInMap("personalPhotoUrl")
    public String personalPhotoUrl;

    @NameInMap("requestId")
    public String requestId;

    public static BucUser build(java.util.Map<String, ?> map) throws Exception {
        BucUser self = new BucUser();
        return TeaModel.build(map, self);
    }

    public BucUser setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public BucUser setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public BucUser setEmpType(String empType) {
        this.empType = empType;
        return this;
    }
    public String getEmpType() {
        return this.empType;
    }

    public BucUser setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public BucUser setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BucUser setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public BucUser setPersonalPhotoUrl(String personalPhotoUrl) {
        this.personalPhotoUrl = personalPhotoUrl;
        return this;
    }
    public String getPersonalPhotoUrl() {
        return this.personalPhotoUrl;
    }

    public BucUser setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
