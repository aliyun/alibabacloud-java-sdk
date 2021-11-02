// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreateProxyBrandUserRequest extends TeaModel {
    @NameInMap("BrandUserNick")
    public String brandUserNick;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Company")
    public String company;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("ContactPhone")
    public String contactPhone;

    @NameInMap("Industry")
    public String industry;

    @NameInMap("ProxyUserId")
    public Long proxyUserId;

    public static CreateProxyBrandUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProxyBrandUserRequest self = new CreateProxyBrandUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateProxyBrandUserRequest setBrandUserNick(String brandUserNick) {
        this.brandUserNick = brandUserNick;
        return this;
    }
    public String getBrandUserNick() {
        return this.brandUserNick;
    }

    public CreateProxyBrandUserRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreateProxyBrandUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProxyBrandUserRequest setCompany(String company) {
        this.company = company;
        return this;
    }
    public String getCompany() {
        return this.company;
    }

    public CreateProxyBrandUserRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateProxyBrandUserRequest setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public CreateProxyBrandUserRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public CreateProxyBrandUserRequest setProxyUserId(Long proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

}
