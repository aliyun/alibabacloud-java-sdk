// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByAliasShrinkRequest extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("AliasType")
    public String aliasType;

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

    @NameInMap("ProductionMode")
    public Boolean productionMode;

    @NameInMap("ReceiptType")
    public Integer receiptType;

    @NameInMap("ReceiptUrl")
    public String receiptUrl;

    @NameInMap("ThirdPartyId")
    public String thirdPartyId;

    public static SendByAliasShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendByAliasShrinkRequest self = new SendByAliasShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendByAliasShrinkRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public SendByAliasShrinkRequest setAliasType(String aliasType) {
        this.aliasType = aliasType;
        return this;
    }
    public String getAliasType() {
        return this.aliasType;
    }

    public SendByAliasShrinkRequest setAndroidPayloadShrink(String androidPayloadShrink) {
        this.androidPayloadShrink = androidPayloadShrink;
        return this;
    }
    public String getAndroidPayloadShrink() {
        return this.androidPayloadShrink;
    }

    public SendByAliasShrinkRequest setChannelPropertiesShrink(String channelPropertiesShrink) {
        this.channelPropertiesShrink = channelPropertiesShrink;
        return this;
    }
    public String getChannelPropertiesShrink() {
        return this.channelPropertiesShrink;
    }

    public SendByAliasShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SendByAliasShrinkRequest setIosPayloadShrink(String iosPayloadShrink) {
        this.iosPayloadShrink = iosPayloadShrink;
        return this;
    }
    public String getIosPayloadShrink() {
        return this.iosPayloadShrink;
    }

    public SendByAliasShrinkRequest setPolicyShrink(String policyShrink) {
        this.policyShrink = policyShrink;
        return this;
    }
    public String getPolicyShrink() {
        return this.policyShrink;
    }

    public SendByAliasShrinkRequest setProductionMode(Boolean productionMode) {
        this.productionMode = productionMode;
        return this;
    }
    public Boolean getProductionMode() {
        return this.productionMode;
    }

    public SendByAliasShrinkRequest setReceiptType(Integer receiptType) {
        this.receiptType = receiptType;
        return this;
    }
    public Integer getReceiptType() {
        return this.receiptType;
    }

    public SendByAliasShrinkRequest setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
        return this;
    }
    public String getReceiptUrl() {
        return this.receiptUrl;
    }

    public SendByAliasShrinkRequest setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

}
