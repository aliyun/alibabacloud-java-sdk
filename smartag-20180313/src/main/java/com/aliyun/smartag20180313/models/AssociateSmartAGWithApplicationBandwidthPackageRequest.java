// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AssociateSmartAGWithApplicationBandwidthPackageRequest extends TeaModel {
    /**
     * <p>The instance ID of the bandwidth plan for application acceleration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abwp-7963l7iqnquyj3****</p>
     */
    @NameInMap("ApplicationBandwidthPackageId")
    public String applicationBandwidthPackageId;

    /**
     * <p>The list of Smart Access Gateway instances to be associated.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AssociateConfigs")
    public java.util.List<AssociateSmartAGWithApplicationBandwidthPackageRequestAssociateConfigs> associateConfigs;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run on the association request. The dry run includes permission and instance status checks. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Sends a normal request and associates the bandwidth plan for application acceleration with the Smart Access Gateway instance after the request passes the check.</li>
     * <li><strong>true</strong>: Sends a check request and performs only the check without associating the bandwidth plan for application acceleration with the Smart Access Gateway instance. The check items include whether required parameters are specified and whether the request format is valid. If the request fails the check, an error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the region to which the bandwidth plan for application acceleration belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AssociateSmartAGWithApplicationBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateSmartAGWithApplicationBandwidthPackageRequest self = new AssociateSmartAGWithApplicationBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public AssociateSmartAGWithApplicationBandwidthPackageRequest setApplicationBandwidthPackageId(String applicationBandwidthPackageId) {
        this.applicationBandwidthPackageId = applicationBandwidthPackageId;
        return this;
    }
    public String getApplicationBandwidthPackageId() {
        return this.applicationBandwidthPackageId;
    }

    public AssociateSmartAGWithApplicationBandwidthPackageRequest setAssociateConfigs(java.util.List<AssociateSmartAGWithApplicationBandwidthPackageRequestAssociateConfigs> associateConfigs) {
        this.associateConfigs = associateConfigs;
        return this;
    }
    public java.util.List<AssociateSmartAGWithApplicationBandwidthPackageRequestAssociateConfigs> getAssociateConfigs() {
        return this.associateConfigs;
    }

    public AssociateSmartAGWithApplicationBandwidthPackageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateSmartAGWithApplicationBandwidthPackageRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AssociateSmartAGWithApplicationBandwidthPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class AssociateSmartAGWithApplicationBandwidthPackageRequestAssociateConfigs extends TeaModel {
        /**
         * <p>The peak bandwidth for application acceleration of the Smart Access Gateway instance. Unit: Mbit/s.</p>
         * <blockquote>
         * <p>The peak bandwidth for application acceleration of each Smart Access Gateway instance cannot exceed the peak bandwidth of the associated bandwidth plan for application acceleration.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The Smart Access Gateway instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-gf5serujbhrn2j****</p>
         */
        @NameInMap("SmartAGId")
        public String smartAGId;

        public static AssociateSmartAGWithApplicationBandwidthPackageRequestAssociateConfigs build(java.util.Map<String, ?> map) throws Exception {
            AssociateSmartAGWithApplicationBandwidthPackageRequestAssociateConfigs self = new AssociateSmartAGWithApplicationBandwidthPackageRequestAssociateConfigs();
            return TeaModel.build(map, self);
        }

        public AssociateSmartAGWithApplicationBandwidthPackageRequestAssociateConfigs setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public AssociateSmartAGWithApplicationBandwidthPackageRequestAssociateConfigs setSmartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }
        public String getSmartAGId() {
            return this.smartAGId;
        }

    }

}
