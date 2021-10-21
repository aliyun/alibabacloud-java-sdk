// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class InsertTradeIntentionUserRequest extends TeaModel {
    @NameInMap("RegisterNumber")
    public String registerNumber;

    @NameInMap("Classification")
    public String classification;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Vcode")
    public String vcode;

    @NameInMap("PartnerCode")
    public String partnerCode;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("Token")
    public String token;

    @NameInMap("Ua")
    public String ua;

    public static InsertTradeIntentionUserRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertTradeIntentionUserRequest self = new InsertTradeIntentionUserRequest();
        return TeaModel.build(map, self);
    }

    public InsertTradeIntentionUserRequest setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
        return this;
    }
    public String getRegisterNumber() {
        return this.registerNumber;
    }

    public InsertTradeIntentionUserRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public InsertTradeIntentionUserRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public InsertTradeIntentionUserRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public InsertTradeIntentionUserRequest setVcode(String vcode) {
        this.vcode = vcode;
        return this;
    }
    public String getVcode() {
        return this.vcode;
    }

    public InsertTradeIntentionUserRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public InsertTradeIntentionUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public InsertTradeIntentionUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public InsertTradeIntentionUserRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public InsertTradeIntentionUserRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public InsertTradeIntentionUserRequest setUa(String ua) {
        this.ua = ua;
        return this;
    }
    public String getUa() {
        return this.ua;
    }

}
