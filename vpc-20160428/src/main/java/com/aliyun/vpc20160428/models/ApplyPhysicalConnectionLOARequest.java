// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ApplyPhysicalConnectionLOARequest extends TeaModel {
    /**
     * <p>The bandwidth of the Express Connect circuit. Unit: Mbit/s.</p>
     * <p>Valid values: <strong>2</strong> to <strong>10240</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the customer company that requires the Express Connect circuit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>company</p>
     */
    @NameInMap("CompanyName")
    public String companyName;

    /**
     * <p>The time when construction started. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-28T16:00:00Z</p>
     */
    @NameInMap("ConstructionTime")
    public String constructionTime;

    /**
     * <p>The ID of the Express Connect circuit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1qrb3044eqi****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the Express Connect circuit. Valid values:</p>
     * <ul>
     * <li><strong>MSTP</strong>: MSTP line</li>
     * <li><strong>MPLSVPN</strong>: MPLSVPN line</li>
     * <li><strong>FIBRE</strong>: fiber line</li>
     * <li><strong>Other</strong>: other types</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FIBRE</p>
     */
    @NameInMap("LineType")
    public String lineType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The information about the construction engineer.</p>
     */
    @NameInMap("PMInfo")
    public java.util.List<ApplyPhysicalConnectionLOARequestPMInfo> PMInfo;

    /**
     * <p>The geographic location where the Express Connect circuit is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("PeerLocation")
    public String peerLocation;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The construction company.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>company</p>
     */
    @NameInMap("Si")
    public String si;

    public static ApplyPhysicalConnectionLOARequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyPhysicalConnectionLOARequest self = new ApplyPhysicalConnectionLOARequest();
        return TeaModel.build(map, self);
    }

    public ApplyPhysicalConnectionLOARequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public ApplyPhysicalConnectionLOARequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ApplyPhysicalConnectionLOARequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public ApplyPhysicalConnectionLOARequest setConstructionTime(String constructionTime) {
        this.constructionTime = constructionTime;
        return this;
    }
    public String getConstructionTime() {
        return this.constructionTime;
    }

    public ApplyPhysicalConnectionLOARequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApplyPhysicalConnectionLOARequest setLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
    public String getLineType() {
        return this.lineType;
    }

    public ApplyPhysicalConnectionLOARequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ApplyPhysicalConnectionLOARequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ApplyPhysicalConnectionLOARequest setPMInfo(java.util.List<ApplyPhysicalConnectionLOARequestPMInfo> PMInfo) {
        this.PMInfo = PMInfo;
        return this;
    }
    public java.util.List<ApplyPhysicalConnectionLOARequestPMInfo> getPMInfo() {
        return this.PMInfo;
    }

    public ApplyPhysicalConnectionLOARequest setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }
    public String getPeerLocation() {
        return this.peerLocation;
    }

    public ApplyPhysicalConnectionLOARequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ApplyPhysicalConnectionLOARequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ApplyPhysicalConnectionLOARequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ApplyPhysicalConnectionLOARequest setSi(String si) {
        this.si = si;
        return this;
    }
    public String getSi() {
        return this.si;
    }

    public static class ApplyPhysicalConnectionLOARequestPMInfo extends TeaModel {
        /**
         * <p>The ID number of the construction engineer. You can specify the ID number of an ID card or an international passport.</p>
         * <p>You can configure information for up to 16 construction engineers.</p>
         * 
         * <strong>example:</strong>
         * <p>5****************9</p>
         */
        @NameInMap("PMCertificateNo")
        public String PMCertificateNo;

        /**
         * <p>The type of the identity document of the construction engineer. Valid values:</p>
         * <ul>
         * <li><strong>IDCard</strong></li>
         * <li><strong>Passport</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IDCard</p>
         */
        @NameInMap("PMCertificateType")
        public String PMCertificateType;

        /**
         * <p>The contact information about the construction engineer.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("PMContactInfo")
        public String PMContactInfo;

        /**
         * <p>The gender of the construction engineer.</p>
         * 
         * <strong>example:</strong>
         * <p>Male</p>
         */
        @NameInMap("PMGender")
        public String PMGender;

        /**
         * <p>The name of the construction engineer.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhangsan</p>
         */
        @NameInMap("PMName")
        public String PMName;

        public static ApplyPhysicalConnectionLOARequestPMInfo build(java.util.Map<String, ?> map) throws Exception {
            ApplyPhysicalConnectionLOARequestPMInfo self = new ApplyPhysicalConnectionLOARequestPMInfo();
            return TeaModel.build(map, self);
        }

        public ApplyPhysicalConnectionLOARequestPMInfo setPMCertificateNo(String PMCertificateNo) {
            this.PMCertificateNo = PMCertificateNo;
            return this;
        }
        public String getPMCertificateNo() {
            return this.PMCertificateNo;
        }

        public ApplyPhysicalConnectionLOARequestPMInfo setPMCertificateType(String PMCertificateType) {
            this.PMCertificateType = PMCertificateType;
            return this;
        }
        public String getPMCertificateType() {
            return this.PMCertificateType;
        }

        public ApplyPhysicalConnectionLOARequestPMInfo setPMContactInfo(String PMContactInfo) {
            this.PMContactInfo = PMContactInfo;
            return this;
        }
        public String getPMContactInfo() {
            return this.PMContactInfo;
        }

        public ApplyPhysicalConnectionLOARequestPMInfo setPMGender(String PMGender) {
            this.PMGender = PMGender;
            return this;
        }
        public String getPMGender() {
            return this.PMGender;
        }

        public ApplyPhysicalConnectionLOARequestPMInfo setPMName(String PMName) {
            this.PMName = PMName;
            return this;
        }
        public String getPMName() {
            return this.PMName;
        }

    }

}
