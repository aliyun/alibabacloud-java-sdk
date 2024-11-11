// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByAliasFileIdRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PF835431668603208261</p>
     */
    @NameInMap("FileId")
    public String fileId;

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

    public static SendByAliasFileIdRequest build(java.util.Map<String, ?> map) throws Exception {
        SendByAliasFileIdRequest self = new SendByAliasFileIdRequest();
        return TeaModel.build(map, self);
    }

    public SendByAliasFileIdRequest setAliasType(String aliasType) {
        this.aliasType = aliasType;
        return this;
    }
    public String getAliasType() {
        return this.aliasType;
    }

    public SendByAliasFileIdRequest setAndroidPayload(AndroidPayload androidPayload) {
        this.androidPayload = androidPayload;
        return this;
    }
    public AndroidPayload getAndroidPayload() {
        return this.androidPayload;
    }

    public SendByAliasFileIdRequest setAndroidShortPayload(AndroidShortPayload androidShortPayload) {
        this.androidShortPayload = androidShortPayload;
        return this;
    }
    public AndroidShortPayload getAndroidShortPayload() {
        return this.androidShortPayload;
    }

    public SendByAliasFileIdRequest setChannelProperties(ChannelProperties channelProperties) {
        this.channelProperties = channelProperties;
        return this;
    }
    public ChannelProperties getChannelProperties() {
        return this.channelProperties;
    }

    public SendByAliasFileIdRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SendByAliasFileIdRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public SendByAliasFileIdRequest setIosPayload(IosPayload iosPayload) {
        this.iosPayload = iosPayload;
        return this;
    }
    public IosPayload getIosPayload() {
        return this.iosPayload;
    }

    public SendByAliasFileIdRequest setPolicy(Policy policy) {
        this.policy = policy;
        return this;
    }
    public Policy getPolicy() {
        return this.policy;
    }

    public SendByAliasFileIdRequest setProductionMode(Boolean productionMode) {
        this.productionMode = productionMode;
        return this;
    }
    public Boolean getProductionMode() {
        return this.productionMode;
    }

    public SendByAliasFileIdRequest setReceiptType(Integer receiptType) {
        this.receiptType = receiptType;
        return this;
    }
    public Integer getReceiptType() {
        return this.receiptType;
    }

    public SendByAliasFileIdRequest setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
        return this;
    }
    public String getReceiptUrl() {
        return this.receiptUrl;
    }

    public SendByAliasFileIdRequest setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

    public SendByAliasFileIdRequest setCallbackParams(String callbackParams) {
        this.callbackParams = callbackParams;
        return this;
    }
    public String getCallbackParams() {
        return this.callbackParams;
    }

}
