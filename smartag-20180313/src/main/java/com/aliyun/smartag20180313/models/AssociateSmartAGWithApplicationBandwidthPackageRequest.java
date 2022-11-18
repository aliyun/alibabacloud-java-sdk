// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AssociateSmartAGWithApplicationBandwidthPackageRequest extends TeaModel {
    @NameInMap("ApplicationBandwidthPackageId")
    public String applicationBandwidthPackageId;

    @NameInMap("AssociateConfigs")
    public java.util.List<AssociateSmartAGWithApplicationBandwidthPackageRequestAssociateConfigs> associateConfigs;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

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
        @NameInMap("Bandwidth")
        public Integer bandwidth;

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
