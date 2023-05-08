// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class SubmitIntentionRequest extends TeaModel {
    @NameInMap("Area")
    public String area;

    /**
     * <p>BizType</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("CommodityType")
    public String commodityType;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Token")
    public String token;

    @NameInMap("Vcode")
    public String vcode;

    public static SubmitIntentionRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIntentionRequest self = new SubmitIntentionRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIntentionRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public SubmitIntentionRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SubmitIntentionRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public SubmitIntentionRequest setCommodityType(String commodityType) {
        this.commodityType = commodityType;
        return this;
    }
    public String getCommodityType() {
        return this.commodityType;
    }

    public SubmitIntentionRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SubmitIntentionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitIntentionRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public SubmitIntentionRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public SubmitIntentionRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SubmitIntentionRequest setVcode(String vcode) {
        this.vcode = vcode;
        return this;
    }
    public String getVcode() {
        return this.vcode;
    }

}
