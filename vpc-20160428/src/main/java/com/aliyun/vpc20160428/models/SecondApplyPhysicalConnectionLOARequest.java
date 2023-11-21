// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class SecondApplyPhysicalConnectionLOARequest extends TeaModel {
    /**
     * <p>The bandwidth of the Express Connect circuit. Unit: Mbit/s.</p>
     * <br>
     * <p>Valid values: **2** to **10240**.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the customer company that requires the Express Connect circuit.</p>
     */
    @NameInMap("CompanyName")
    public String companyName;

    /**
     * <p>The time when construction started. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
     */
    @NameInMap("ConstructionTime")
    public String constructionTime;

    /**
     * <p>The ID of the Express Connect circuit.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of Express Connect circuit. Valid values:</p>
     * <br>
     * <p>*   **MSTP**</p>
     * <p>*   **MPLSVPN**</p>
     * <p>*   **FIBRE**</p>
     * <p>*   **Other**</p>
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
    public java.util.List<SecondApplyPhysicalConnectionLOARequestPMInfo> PMInfo;

    /**
     * <p>The geographic location where the Express Connect circuit is deployed.</p>
     */
    @NameInMap("PeerLocation")
    public String peerLocation;

    /**
     * <p>The region where the Express Connect circuit is deployed. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The construction company.</p>
     */
    @NameInMap("Si")
    public String si;

    public static SecondApplyPhysicalConnectionLOARequest build(java.util.Map<String, ?> map) throws Exception {
        SecondApplyPhysicalConnectionLOARequest self = new SecondApplyPhysicalConnectionLOARequest();
        return TeaModel.build(map, self);
    }

    public SecondApplyPhysicalConnectionLOARequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public SecondApplyPhysicalConnectionLOARequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SecondApplyPhysicalConnectionLOARequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public SecondApplyPhysicalConnectionLOARequest setConstructionTime(String constructionTime) {
        this.constructionTime = constructionTime;
        return this;
    }
    public String getConstructionTime() {
        return this.constructionTime;
    }

    public SecondApplyPhysicalConnectionLOARequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SecondApplyPhysicalConnectionLOARequest setLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
    public String getLineType() {
        return this.lineType;
    }

    public SecondApplyPhysicalConnectionLOARequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SecondApplyPhysicalConnectionLOARequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SecondApplyPhysicalConnectionLOARequest setPMInfo(java.util.List<SecondApplyPhysicalConnectionLOARequestPMInfo> PMInfo) {
        this.PMInfo = PMInfo;
        return this;
    }
    public java.util.List<SecondApplyPhysicalConnectionLOARequestPMInfo> getPMInfo() {
        return this.PMInfo;
    }

    public SecondApplyPhysicalConnectionLOARequest setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }
    public String getPeerLocation() {
        return this.peerLocation;
    }

    public SecondApplyPhysicalConnectionLOARequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SecondApplyPhysicalConnectionLOARequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SecondApplyPhysicalConnectionLOARequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SecondApplyPhysicalConnectionLOARequest setSi(String si) {
        this.si = si;
        return this;
    }
    public String getSi() {
        return this.si;
    }

    public static class SecondApplyPhysicalConnectionLOARequestPMInfo extends TeaModel {
        /**
         * <p>The ID number of the construction engineer. You can specify the ID number of an ID card or an international passport.</p>
         * <br>
         * <p>You can configure information for up to 16 construction engineers.</p>
         */
        @NameInMap("PMCertificateNo")
        public String PMCertificateNo;

        /**
         * <p>The type of the identity document of the construction engineer. Valid values:</p>
         * <br>
         * <p>*   **IDCard**</p>
         * <p>*   **Passport**</p>
         */
        @NameInMap("PMCertificateType")
        public String PMCertificateType;

        /**
         * <p>The contact information about the construction engineer.</p>
         */
        @NameInMap("PMContactInfo")
        public String PMContactInfo;

        /**
         * <p>The gender of the construction engineer.</p>
         */
        @NameInMap("PMGender")
        public String PMGender;

        /**
         * <p>The name of the construction engineer.</p>
         */
        @NameInMap("PMName")
        public String PMName;

        public static SecondApplyPhysicalConnectionLOARequestPMInfo build(java.util.Map<String, ?> map) throws Exception {
            SecondApplyPhysicalConnectionLOARequestPMInfo self = new SecondApplyPhysicalConnectionLOARequestPMInfo();
            return TeaModel.build(map, self);
        }

        public SecondApplyPhysicalConnectionLOARequestPMInfo setPMCertificateNo(String PMCertificateNo) {
            this.PMCertificateNo = PMCertificateNo;
            return this;
        }
        public String getPMCertificateNo() {
            return this.PMCertificateNo;
        }

        public SecondApplyPhysicalConnectionLOARequestPMInfo setPMCertificateType(String PMCertificateType) {
            this.PMCertificateType = PMCertificateType;
            return this;
        }
        public String getPMCertificateType() {
            return this.PMCertificateType;
        }

        public SecondApplyPhysicalConnectionLOARequestPMInfo setPMContactInfo(String PMContactInfo) {
            this.PMContactInfo = PMContactInfo;
            return this;
        }
        public String getPMContactInfo() {
            return this.PMContactInfo;
        }

        public SecondApplyPhysicalConnectionLOARequestPMInfo setPMGender(String PMGender) {
            this.PMGender = PMGender;
            return this;
        }
        public String getPMGender() {
            return this.PMGender;
        }

        public SecondApplyPhysicalConnectionLOARequestPMInfo setPMName(String PMName) {
            this.PMName = PMName;
            return this;
        }
        public String getPMName() {
            return this.PMName;
        }

    }

}
