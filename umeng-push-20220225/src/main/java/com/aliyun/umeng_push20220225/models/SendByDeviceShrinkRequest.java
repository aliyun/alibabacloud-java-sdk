// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByDeviceShrinkRequest extends TeaModel {
    @NameInMap("AndroidPayload")
    public String androidPayloadShrink;

    @NameInMap("AndroidShortPayload")
    public String androidShortPayloadShrink;

    @NameInMap("ChannelProperties")
    public String channelPropertiesShrink;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ArdNyIzFCH2K3szXA8arpu0Y7ywOdA67mCSumtpnMnmf</p>
     */
    @NameInMap("DeviceTokens")
    public String deviceTokens;

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

    public static SendByDeviceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendByDeviceShrinkRequest self = new SendByDeviceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendByDeviceShrinkRequest setAndroidPayloadShrink(String androidPayloadShrink) {
        this.androidPayloadShrink = androidPayloadShrink;
        return this;
    }
    public String getAndroidPayloadShrink() {
        return this.androidPayloadShrink;
    }

    public SendByDeviceShrinkRequest setAndroidShortPayloadShrink(String androidShortPayloadShrink) {
        this.androidShortPayloadShrink = androidShortPayloadShrink;
        return this;
    }
    public String getAndroidShortPayloadShrink() {
        return this.androidShortPayloadShrink;
    }

    public SendByDeviceShrinkRequest setChannelPropertiesShrink(String channelPropertiesShrink) {
        this.channelPropertiesShrink = channelPropertiesShrink;
        return this;
    }
    public String getChannelPropertiesShrink() {
        return this.channelPropertiesShrink;
    }

    public SendByDeviceShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SendByDeviceShrinkRequest setDeviceTokens(String deviceTokens) {
        this.deviceTokens = deviceTokens;
        return this;
    }
    public String getDeviceTokens() {
        return this.deviceTokens;
    }

    public SendByDeviceShrinkRequest setIosPayloadShrink(String iosPayloadShrink) {
        this.iosPayloadShrink = iosPayloadShrink;
        return this;
    }
    public String getIosPayloadShrink() {
        return this.iosPayloadShrink;
    }

    public SendByDeviceShrinkRequest setPolicyShrink(String policyShrink) {
        this.policyShrink = policyShrink;
        return this;
    }
    public String getPolicyShrink() {
        return this.policyShrink;
    }

    public SendByDeviceShrinkRequest setProductionMode(Boolean productionMode) {
        this.productionMode = productionMode;
        return this;
    }
    public Boolean getProductionMode() {
        return this.productionMode;
    }

    public SendByDeviceShrinkRequest setReceiptType(Integer receiptType) {
        this.receiptType = receiptType;
        return this;
    }
    public Integer getReceiptType() {
        return this.receiptType;
    }

    public SendByDeviceShrinkRequest setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
        return this;
    }
    public String getReceiptUrl() {
        return this.receiptUrl;
    }

    public SendByDeviceShrinkRequest setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

    public SendByDeviceShrinkRequest setCallbackParams(String callbackParams) {
        this.callbackParams = callbackParams;
        return this;
    }
    public String getCallbackParams() {
        return this.callbackParams;
    }

}
