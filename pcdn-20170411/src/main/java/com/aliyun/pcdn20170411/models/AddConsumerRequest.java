// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class AddConsumerRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("BusinessType")
    @Validation(required = true)
    public String businessType;

    @NameInMap("Company")
    @Validation(required = true)
    public String company;

    @NameInMap("Site")
    @Validation(required = true)
    public String site;

    @NameInMap("Requirement")
    @Validation(required = true)
    public String requirement;

    @NameInMap("Mobile")
    @Validation(required = true)
    public String mobile;

    @NameInMap("Ca")
    public String ca;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Email")
    public String email;

    @NameInMap("BandwidthRequirement")
    public String bandwidthRequirement;

    public static AddConsumerRequest build(java.util.Map<String, ?> map) throws Exception {
        AddConsumerRequest self = new AddConsumerRequest();
        return TeaModel.build(map, self);
    }

    public AddConsumerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddConsumerRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AddConsumerRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public AddConsumerRequest setCompany(String company) {
        this.company = company;
        return this;
    }
    public String getCompany() {
        return this.company;
    }

    public AddConsumerRequest setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

    public AddConsumerRequest setRequirement(String requirement) {
        this.requirement = requirement;
        return this;
    }
    public String getRequirement() {
        return this.requirement;
    }

    public AddConsumerRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public AddConsumerRequest setCa(String ca) {
        this.ca = ca;
        return this;
    }
    public String getCa() {
        return this.ca;
    }

    public AddConsumerRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AddConsumerRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public AddConsumerRequest setBandwidthRequirement(String bandwidthRequirement) {
        this.bandwidthRequirement = bandwidthRequirement;
        return this;
    }
    public String getBandwidthRequirement() {
        return this.bandwidthRequirement;
    }

}
