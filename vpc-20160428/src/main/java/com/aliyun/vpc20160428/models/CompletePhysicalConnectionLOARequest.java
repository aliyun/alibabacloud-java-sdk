// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CompletePhysicalConnectionLOARequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>The client generates the value. Ensure that the value is unique among different requests.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-230e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether the construction is completed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Construction is completed.</li>
     * <li><strong>false</strong>: Line O&amp;M.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FinishWork")
    public Boolean finishWork;

    /**
     * <p>The instance ID of the Express Connect circuit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp10tvlhnwkw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The line code of the carrier.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa111****</p>
     */
    @NameInMap("LineCode")
    public String lineCode;

    /**
     * <p>The cable label in the data center building.</p>
     * 
     * <strong>example:</strong>
     * <p>bbb222****</p>
     */
    @NameInMap("LineLabel")
    public String lineLabel;

    /**
     * <p>The O&amp;M contact information of the line carrier.</p>
     * 
     * <strong>example:</strong>
     * <p>1388888****</p>
     */
    @NameInMap("LineSPContactInfo")
    public String lineSPContactInfo;

    /**
     * <p>The carrier. Valid values:</p>
     * <ul>
     * <li><strong>中国电信</strong>.</li>
     * <li><strong>中国联通</strong>.</li>
     * <li><strong>中国移动</strong>.</li>
     * <li><strong>中国其他</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>中国其他</p>
     */
    @NameInMap("LineServiceProvider")
    public String lineServiceProvider;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CompletePhysicalConnectionLOARequest build(java.util.Map<String, ?> map) throws Exception {
        CompletePhysicalConnectionLOARequest self = new CompletePhysicalConnectionLOARequest();
        return TeaModel.build(map, self);
    }

    public CompletePhysicalConnectionLOARequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CompletePhysicalConnectionLOARequest setFinishWork(Boolean finishWork) {
        this.finishWork = finishWork;
        return this;
    }
    public Boolean getFinishWork() {
        return this.finishWork;
    }

    public CompletePhysicalConnectionLOARequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CompletePhysicalConnectionLOARequest setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

    public CompletePhysicalConnectionLOARequest setLineLabel(String lineLabel) {
        this.lineLabel = lineLabel;
        return this;
    }
    public String getLineLabel() {
        return this.lineLabel;
    }

    public CompletePhysicalConnectionLOARequest setLineSPContactInfo(String lineSPContactInfo) {
        this.lineSPContactInfo = lineSPContactInfo;
        return this;
    }
    public String getLineSPContactInfo() {
        return this.lineSPContactInfo;
    }

    public CompletePhysicalConnectionLOARequest setLineServiceProvider(String lineServiceProvider) {
        this.lineServiceProvider = lineServiceProvider;
        return this;
    }
    public String getLineServiceProvider() {
        return this.lineServiceProvider;
    }

    public CompletePhysicalConnectionLOARequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CompletePhysicalConnectionLOARequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CompletePhysicalConnectionLOARequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CompletePhysicalConnectionLOARequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CompletePhysicalConnectionLOARequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
