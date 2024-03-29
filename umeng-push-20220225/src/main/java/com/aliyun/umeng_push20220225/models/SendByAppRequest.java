// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByAppRequest extends TeaModel {
    @NameInMap("AndroidPayload")
    public AndroidPayload androidPayload;

    @NameInMap("ChannelProperties")
    public ChannelProperties channelProperties;

    @NameInMap("Description")
    public String description;

    @NameInMap("IosPayload")
    public IosPayload iosPayload;

    @NameInMap("Policy")
    public Policy policy;

    @NameInMap("ProductionMode")
    public Boolean productionMode;

    @NameInMap("ReceiptType")
    public Integer receiptType;

    @NameInMap("ReceiptUrl")
    public String receiptUrl;

    @NameInMap("ThirdPartyId")
    public String thirdPartyId;

    public static SendByAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SendByAppRequest self = new SendByAppRequest();
        return TeaModel.build(map, self);
    }

    public SendByAppRequest setAndroidPayload(AndroidPayload androidPayload) {
        this.androidPayload = androidPayload;
        return this;
    }
    public AndroidPayload getAndroidPayload() {
        return this.androidPayload;
    }

    public SendByAppRequest setChannelProperties(ChannelProperties channelProperties) {
        this.channelProperties = channelProperties;
        return this;
    }
    public ChannelProperties getChannelProperties() {
        return this.channelProperties;
    }

    public SendByAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SendByAppRequest setIosPayload(IosPayload iosPayload) {
        this.iosPayload = iosPayload;
        return this;
    }
    public IosPayload getIosPayload() {
        return this.iosPayload;
    }

    public SendByAppRequest setPolicy(Policy policy) {
        this.policy = policy;
        return this;
    }
    public Policy getPolicy() {
        return this.policy;
    }

    public SendByAppRequest setProductionMode(Boolean productionMode) {
        this.productionMode = productionMode;
        return this;
    }
    public Boolean getProductionMode() {
        return this.productionMode;
    }

    public SendByAppRequest setReceiptType(Integer receiptType) {
        this.receiptType = receiptType;
        return this;
    }
    public Integer getReceiptType() {
        return this.receiptType;
    }

    public SendByAppRequest setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
        return this;
    }
    public String getReceiptUrl() {
        return this.receiptUrl;
    }

    public SendByAppRequest setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

}
