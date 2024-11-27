// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateOperationTicketRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApproveComment")
    public String approveComment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("AssetAccountName")
    public String assetAccountName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AssetId")
    public String assetId;

    /**
     * <strong>example:</strong>
     * <p>1679393152</p>
     */
    @NameInMap("EffectEndTime")
    public Long effectEndTime;

    /**
     * <strong>example:</strong>
     * <p>1685600242</p>
     */
    @NameInMap("EffectStartTime")
    public Long effectStartTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsOneTimeEffect")
    public Boolean isOneTimeEffect;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SSH</p>
     */
    @NameInMap("ProtocolName")
    public String protocolName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateOperationTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOperationTicketRequest self = new CreateOperationTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateOperationTicketRequest setApproveComment(String approveComment) {
        this.approveComment = approveComment;
        return this;
    }
    public String getApproveComment() {
        return this.approveComment;
    }

    public CreateOperationTicketRequest setAssetAccountName(String assetAccountName) {
        this.assetAccountName = assetAccountName;
        return this;
    }
    public String getAssetAccountName() {
        return this.assetAccountName;
    }

    public CreateOperationTicketRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public CreateOperationTicketRequest setEffectEndTime(Long effectEndTime) {
        this.effectEndTime = effectEndTime;
        return this;
    }
    public Long getEffectEndTime() {
        return this.effectEndTime;
    }

    public CreateOperationTicketRequest setEffectStartTime(Long effectStartTime) {
        this.effectStartTime = effectStartTime;
        return this;
    }
    public Long getEffectStartTime() {
        return this.effectStartTime;
    }

    public CreateOperationTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOperationTicketRequest setIsOneTimeEffect(Boolean isOneTimeEffect) {
        this.isOneTimeEffect = isOneTimeEffect;
        return this;
    }
    public Boolean getIsOneTimeEffect() {
        return this.isOneTimeEffect;
    }

    public CreateOperationTicketRequest setProtocolName(String protocolName) {
        this.protocolName = protocolName;
        return this;
    }
    public String getProtocolName() {
        return this.protocolName;
    }

    public CreateOperationTicketRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
