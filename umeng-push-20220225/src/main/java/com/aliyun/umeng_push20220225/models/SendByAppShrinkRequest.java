// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByAppShrinkRequest extends TeaModel {
    @NameInMap("AndroidPayload")
    public String androidPayloadShrink;

    @NameInMap("ChannelProperties")
    public String channelPropertiesShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("IosPayload")
    public String iosPayloadShrink;

    @NameInMap("Policy")
    public String policyShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ProductionMode")
    public Boolean productionMode;

    @NameInMap("ReceiptType")
    public Integer receiptType;

    /**
     * <strong>example:</strong>
     * <p><a href="https://msg.umeng.com/upush/receipt">https://msg.umeng.com/upush/receipt</a></p>
     */
    @NameInMap("ReceiptUrl")
    public String receiptUrl;

    @NameInMap("ThirdPartyId")
    public String thirdPartyId;

    @NameInMap("callbackParams")
    public String callbackParams;

    public static SendByAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendByAppShrinkRequest self = new SendByAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendByAppShrinkRequest setAndroidPayloadShrink(String androidPayloadShrink) {
        this.androidPayloadShrink = androidPayloadShrink;
        return this;
    }
    public String getAndroidPayloadShrink() {
        return this.androidPayloadShrink;
    }

    public SendByAppShrinkRequest setChannelPropertiesShrink(String channelPropertiesShrink) {
        this.channelPropertiesShrink = channelPropertiesShrink;
        return this;
    }
    public String getChannelPropertiesShrink() {
        return this.channelPropertiesShrink;
    }

    public SendByAppShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SendByAppShrinkRequest setIosPayloadShrink(String iosPayloadShrink) {
        this.iosPayloadShrink = iosPayloadShrink;
        return this;
    }
    public String getIosPayloadShrink() {
        return this.iosPayloadShrink;
    }

    public SendByAppShrinkRequest setPolicyShrink(String policyShrink) {
        this.policyShrink = policyShrink;
        return this;
    }
    public String getPolicyShrink() {
        return this.policyShrink;
    }

    public SendByAppShrinkRequest setProductionMode(Boolean productionMode) {
        this.productionMode = productionMode;
        return this;
    }
    public Boolean getProductionMode() {
        return this.productionMode;
    }

    public SendByAppShrinkRequest setReceiptType(Integer receiptType) {
        this.receiptType = receiptType;
        return this;
    }
    public Integer getReceiptType() {
        return this.receiptType;
    }

    public SendByAppShrinkRequest setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
        return this;
    }
    public String getReceiptUrl() {
        return this.receiptUrl;
    }

    public SendByAppShrinkRequest setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

    public SendByAppShrinkRequest setCallbackParams(String callbackParams) {
        this.callbackParams = callbackParams;
        return this;
    }
    public String getCallbackParams() {
        return this.callbackParams;
    }

}
