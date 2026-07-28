// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVSwitchCidrReservationAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may vary for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-230e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and business restrictions. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the check succeeds, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the vSwitch.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The description of the reserved CIDR block for a vSwitch that you want to modify. If you do not specify this parameter, the description is empty. The default value is empty.</p>
     * <p>The description must be 2 to 256 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ReservationDescription</p>
     */
    @NameInMap("VSwitchCidrReservationDescription")
    public String vSwitchCidrReservationDescription;

    /**
     * <p>The instance ID of the reserved CIDR block for a vSwitch that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vcr-bp1m12saqteraw3rp****</p>
     */
    @NameInMap("VSwitchCidrReservationId")
    public String vSwitchCidrReservationId;

    /**
     * <p>The name of the reserved CIDR block for a vSwitch that you want to modify.</p>
     * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>ReservationName</p>
     */
    @NameInMap("VSwitchCidrReservationName")
    public String vSwitchCidrReservationName;

    public static ModifyVSwitchCidrReservationAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVSwitchCidrReservationAttributeRequest self = new ModifyVSwitchCidrReservationAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVSwitchCidrReservationAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setVSwitchCidrReservationDescription(String vSwitchCidrReservationDescription) {
        this.vSwitchCidrReservationDescription = vSwitchCidrReservationDescription;
        return this;
    }
    public String getVSwitchCidrReservationDescription() {
        return this.vSwitchCidrReservationDescription;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setVSwitchCidrReservationId(String vSwitchCidrReservationId) {
        this.vSwitchCidrReservationId = vSwitchCidrReservationId;
        return this;
    }
    public String getVSwitchCidrReservationId() {
        return this.vSwitchCidrReservationId;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setVSwitchCidrReservationName(String vSwitchCidrReservationName) {
        this.vSwitchCidrReservationName = vSwitchCidrReservationName;
        return this;
    }
    public String getVSwitchCidrReservationName() {
        return this.vSwitchCidrReservationName;
    }

}
