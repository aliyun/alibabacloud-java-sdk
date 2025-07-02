// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamRequest extends TeaModel {
    /**
     * <p>The effective region that you want to add.</p>
     */
    @NameInMap("AddOperatingRegion")
    public java.util.List<String> addOperatingRegion;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The description of the IPAM.</p>
     * <p>It must be 2 to 256 characters in length and must start with a letter. It cannot start with <code>http://</code> or <code>https://</code>. The default value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("IpamDescription")
    public String ipamDescription;

    /**
     * <p>The ID of the IPAM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-ccxbnsbhew0d6t****</p>
     */
    @NameInMap("IpamId")
    public String ipamId;

    /**
     * <p>The name of the IPAM.</p>
     * <p>It must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IpamName")
    public String ipamName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the IPAM instance is hosted. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The effective region that you want to remove.</p>
     */
    @NameInMap("RemoveOperatingRegion")
    public java.util.List<String> removeOperatingRegion;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateIpamRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamRequest self = new UpdateIpamRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpamRequest setAddOperatingRegion(java.util.List<String> addOperatingRegion) {
        this.addOperatingRegion = addOperatingRegion;
        return this;
    }
    public java.util.List<String> getAddOperatingRegion() {
        return this.addOperatingRegion;
    }

    public UpdateIpamRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpamRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateIpamRequest setIpamDescription(String ipamDescription) {
        this.ipamDescription = ipamDescription;
        return this;
    }
    public String getIpamDescription() {
        return this.ipamDescription;
    }

    public UpdateIpamRequest setIpamId(String ipamId) {
        this.ipamId = ipamId;
        return this;
    }
    public String getIpamId() {
        return this.ipamId;
    }

    public UpdateIpamRequest setIpamName(String ipamName) {
        this.ipamName = ipamName;
        return this;
    }
    public String getIpamName() {
        return this.ipamName;
    }

    public UpdateIpamRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateIpamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateIpamRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateIpamRequest setRemoveOperatingRegion(java.util.List<String> removeOperatingRegion) {
        this.removeOperatingRegion = removeOperatingRegion;
        return this;
    }
    public java.util.List<String> getRemoveOperatingRegion() {
        return this.removeOperatingRegion;
    }

    public UpdateIpamRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateIpamRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
