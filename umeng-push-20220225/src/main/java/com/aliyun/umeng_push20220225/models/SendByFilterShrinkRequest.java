// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByFilterShrinkRequest extends TeaModel {
    @NameInMap("AndroidPayload")
    public String androidPayloadShrink;

    @NameInMap("ChannelProperties")
    public String channelPropertiesShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("Filter")
    public String filter;

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

    public static SendByFilterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendByFilterShrinkRequest self = new SendByFilterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendByFilterShrinkRequest setAndroidPayloadShrink(String androidPayloadShrink) {
        this.androidPayloadShrink = androidPayloadShrink;
        return this;
    }
    public String getAndroidPayloadShrink() {
        return this.androidPayloadShrink;
    }

    public SendByFilterShrinkRequest setChannelPropertiesShrink(String channelPropertiesShrink) {
        this.channelPropertiesShrink = channelPropertiesShrink;
        return this;
    }
    public String getChannelPropertiesShrink() {
        return this.channelPropertiesShrink;
    }

    public SendByFilterShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SendByFilterShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public SendByFilterShrinkRequest setIosPayloadShrink(String iosPayloadShrink) {
        this.iosPayloadShrink = iosPayloadShrink;
        return this;
    }
    public String getIosPayloadShrink() {
        return this.iosPayloadShrink;
    }

    public SendByFilterShrinkRequest setPolicyShrink(String policyShrink) {
        this.policyShrink = policyShrink;
        return this;
    }
    public String getPolicyShrink() {
        return this.policyShrink;
    }

    public SendByFilterShrinkRequest setProductionMode(Boolean productionMode) {
        this.productionMode = productionMode;
        return this;
    }
    public Boolean getProductionMode() {
        return this.productionMode;
    }

    public SendByFilterShrinkRequest setReceiptType(Integer receiptType) {
        this.receiptType = receiptType;
        return this;
    }
    public Integer getReceiptType() {
        return this.receiptType;
    }

    public SendByFilterShrinkRequest setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
        return this;
    }
    public String getReceiptUrl() {
        return this.receiptUrl;
    }

    public SendByFilterShrinkRequest setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

}
