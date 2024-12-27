// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByAliasRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Alias")
    public String alias;

    @NameInMap("AliasType")
    public String aliasType;

    @NameInMap("AndroidPayload")
    public AndroidPayload androidPayload;

    @NameInMap("AndroidShortPayload")
    public AndroidShortPayload androidShortPayload;

    @NameInMap("ChannelProperties")
    public ChannelProperties channelProperties;

    @NameInMap("Description")
    public String description;

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

    public static SendByAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        SendByAliasRequest self = new SendByAliasRequest();
        return TeaModel.build(map, self);
    }

    public SendByAliasRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public SendByAliasRequest setAliasType(String aliasType) {
        this.aliasType = aliasType;
        return this;
    }
    public String getAliasType() {
        return this.aliasType;
    }

    public SendByAliasRequest setAndroidPayload(AndroidPayload androidPayload) {
        this.androidPayload = androidPayload;
        return this;
    }
    public AndroidPayload getAndroidPayload() {
        return this.androidPayload;
    }

    public SendByAliasRequest setAndroidShortPayload(AndroidShortPayload androidShortPayload) {
        this.androidShortPayload = androidShortPayload;
        return this;
    }
    public AndroidShortPayload getAndroidShortPayload() {
        return this.androidShortPayload;
    }

    public SendByAliasRequest setChannelProperties(ChannelProperties channelProperties) {
        this.channelProperties = channelProperties;
        return this;
    }
    public ChannelProperties getChannelProperties() {
        return this.channelProperties;
    }

    public SendByAliasRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SendByAliasRequest setHarmonyPayload(HarmonyPayload harmonyPayload) {
        this.harmonyPayload = harmonyPayload;
        return this;
    }
    public HarmonyPayload getHarmonyPayload() {
        return this.harmonyPayload;
    }

    public SendByAliasRequest setIosPayload(IosPayload iosPayload) {
        this.iosPayload = iosPayload;
        return this;
    }
    public IosPayload getIosPayload() {
        return this.iosPayload;
    }

    public SendByAliasRequest setPolicy(Policy policy) {
        this.policy = policy;
        return this;
    }
    public Policy getPolicy() {
        return this.policy;
    }

    public SendByAliasRequest setProductionMode(Boolean productionMode) {
        this.productionMode = productionMode;
        return this;
    }
    public Boolean getProductionMode() {
        return this.productionMode;
    }

    public SendByAliasRequest setReceiptType(Integer receiptType) {
        this.receiptType = receiptType;
        return this;
    }
    public Integer getReceiptType() {
        return this.receiptType;
    }

    public SendByAliasRequest setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
        return this;
    }
    public String getReceiptUrl() {
        return this.receiptUrl;
    }

    public SendByAliasRequest setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

    public SendByAliasRequest setCallbackParams(String callbackParams) {
        this.callbackParams = callbackParams;
        return this;
    }
    public String getCallbackParams() {
        return this.callbackParams;
    }

}
