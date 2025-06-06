// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByFilterRequest extends TeaModel {
    @NameInMap("AndroidPayload")
    public AndroidPayload androidPayload;

    @NameInMap("AndroidShortPayload")
    public AndroidShortPayload androidShortPayload;

    @NameInMap("ChannelProperties")
    public ChannelProperties channelProperties;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>&quot;where&quot;:{&quot;and&quot;:[{&quot;or&quot;:[{&quot;app_version&quot;:&quot;&gt;=1.0&quot;}]}]}</p>
     */
    @NameInMap("Filter")
    public String filter;

    @NameInMap("HarmonyPayload")
    public HarmonyPayload harmonyPayload;

    @NameInMap("IosPayload")
    public IosPayload iosPayload;

    @NameInMap("Policy")
    public Policy policy;

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

    public static SendByFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        SendByFilterRequest self = new SendByFilterRequest();
        return TeaModel.build(map, self);
    }

    public SendByFilterRequest setAndroidPayload(AndroidPayload androidPayload) {
        this.androidPayload = androidPayload;
        return this;
    }
    public AndroidPayload getAndroidPayload() {
        return this.androidPayload;
    }

    public SendByFilterRequest setAndroidShortPayload(AndroidShortPayload androidShortPayload) {
        this.androidShortPayload = androidShortPayload;
        return this;
    }
    public AndroidShortPayload getAndroidShortPayload() {
        return this.androidShortPayload;
    }

    public SendByFilterRequest setChannelProperties(ChannelProperties channelProperties) {
        this.channelProperties = channelProperties;
        return this;
    }
    public ChannelProperties getChannelProperties() {
        return this.channelProperties;
    }

    public SendByFilterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SendByFilterRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public SendByFilterRequest setHarmonyPayload(HarmonyPayload harmonyPayload) {
        this.harmonyPayload = harmonyPayload;
        return this;
    }
    public HarmonyPayload getHarmonyPayload() {
        return this.harmonyPayload;
    }

    public SendByFilterRequest setIosPayload(IosPayload iosPayload) {
        this.iosPayload = iosPayload;
        return this;
    }
    public IosPayload getIosPayload() {
        return this.iosPayload;
    }

    public SendByFilterRequest setPolicy(Policy policy) {
        this.policy = policy;
        return this;
    }
    public Policy getPolicy() {
        return this.policy;
    }

    public SendByFilterRequest setProductionMode(Boolean productionMode) {
        this.productionMode = productionMode;
        return this;
    }
    public Boolean getProductionMode() {
        return this.productionMode;
    }

    public SendByFilterRequest setReceiptType(Integer receiptType) {
        this.receiptType = receiptType;
        return this;
    }
    public Integer getReceiptType() {
        return this.receiptType;
    }

    public SendByFilterRequest setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
        return this;
    }
    public String getReceiptUrl() {
        return this.receiptUrl;
    }

    public SendByFilterRequest setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

    public SendByFilterRequest setCallbackParams(String callbackParams) {
        this.callbackParams = callbackParams;
        return this;
    }
    public String getCallbackParams() {
        return this.callbackParams;
    }

}
