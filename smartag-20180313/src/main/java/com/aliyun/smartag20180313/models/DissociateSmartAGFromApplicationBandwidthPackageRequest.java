// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DissociateSmartAGFromApplicationBandwidthPackageRequest extends TeaModel {
    @NameInMap("ApplicationBandwidthPackageId")
    public String applicationBandwidthPackageId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("SmartAGIdList")
    public java.util.List<String> smartAGIdList;

    public static DissociateSmartAGFromApplicationBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateSmartAGFromApplicationBandwidthPackageRequest self = new DissociateSmartAGFromApplicationBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public DissociateSmartAGFromApplicationBandwidthPackageRequest setApplicationBandwidthPackageId(String applicationBandwidthPackageId) {
        this.applicationBandwidthPackageId = applicationBandwidthPackageId;
        return this;
    }
    public String getApplicationBandwidthPackageId() {
        return this.applicationBandwidthPackageId;
    }

    public DissociateSmartAGFromApplicationBandwidthPackageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DissociateSmartAGFromApplicationBandwidthPackageRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DissociateSmartAGFromApplicationBandwidthPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DissociateSmartAGFromApplicationBandwidthPackageRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DissociateSmartAGFromApplicationBandwidthPackageRequest setSmartAGIdList(java.util.List<String> smartAGIdList) {
        this.smartAGIdList = smartAGIdList;
        return this;
    }
    public java.util.List<String> getSmartAGIdList() {
        return this.smartAGIdList;
    }

}
