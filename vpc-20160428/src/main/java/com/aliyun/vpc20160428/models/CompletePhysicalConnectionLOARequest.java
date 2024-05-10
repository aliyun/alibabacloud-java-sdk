// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CompletePhysicalConnectionLOARequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically uses **RequestId** as **ClientToken**. **RequestId** of each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether the construction is completed. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("FinishWork")
    public Boolean finishWork;

    /**
     * <p>The ID of the Express Connect circuit.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The circuit code provided by the connectivity provider.</p>
     */
    @NameInMap("LineCode")
    public String lineCode;

    /**
     * <p>The label of the cable in the data center.</p>
     */
    @NameInMap("LineLabel")
    public String lineLabel;

    /**
     * <p>The contact information about line O\\&M.</p>
     */
    @NameInMap("LineSPContactInfo")
    public String lineSPContactInfo;

    /**
     * <p>The ISP. Valid values:</p>
     * <br>
     * <p>*   **China Telecom**</p>
     * <p>*   **China Unicom**</p>
     * <p>*   **China Mobile**</p>
     * <p>*   **Other ISPs in China**</p>
     */
    @NameInMap("LineServiceProvider")
    public String lineServiceProvider;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
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
