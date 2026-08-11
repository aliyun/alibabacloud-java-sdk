// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateOperationTicketRequest extends TeaModel {
    /**
     * <p>The remarks of the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Comment</p>
     */
    @NameInMap("ApproveComment")
    public String approveComment;

    /**
     * <p>The logon name of the asset account for which you want to request O&amp;M access.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("AssetAccountName")
    public String assetAccountName;

    /**
     * <p>The ID of the asset for which you want to request O&amp;M access.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758856.html">ListOperationDatabases</a> or <a href="https://help.aliyun.com/document_detail/2758857.html">ListOperationHosts</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AssetId")
    public String assetId;

    /**
     * <p>The end time of the validity period for the logon request. Unit: seconds. The value is a UNIX timestamp.</p>
     * <blockquote>
     * <p>The end time of the validity period must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1679393152</p>
     */
    @NameInMap("EffectEndTime")
    public Long effectEndTime;

    /**
     * <p>The start time of the validity period for the logon request. Unit: seconds. The value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1685600242</p>
     */
    @NameInMap("EffectStartTime")
    public Long effectStartTime;

    /**
     * <p>The instance ID of the bastion host.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of logon times allowed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Only one logon is allowed within the validity period.</li>
     * <li><strong>false</strong>: Unlimited logons are allowed within the validity period.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsOneTimeEffect")
    public Boolean isOneTimeEffect;

    /**
     * <p>The project ID.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the protocol for which you want to request O&amp;M access. Valid values:</p>
     * <ul>
     * <li>SSH</li>
     * <li>RDP</li>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>Oracle</li>
     * <li>SQLServer</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SSH</p>
     */
    @NameInMap("ProtocolName")
    public String protocolName;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
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

    public CreateOperationTicketRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
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
