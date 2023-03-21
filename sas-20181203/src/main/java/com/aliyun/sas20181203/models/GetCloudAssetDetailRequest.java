// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetDetailRequest extends TeaModel {
    @NameInMap("AssetSubType")
    public Integer assetSubType;

    @NameInMap("AssetType")
    public Integer assetType;

    @NameInMap("CloudAssetInstances")
    public java.util.List<GetCloudAssetDetailRequestCloudAssetInstances> cloudAssetInstances;

    @NameInMap("Vendor")
    public Integer vendor;

    public static GetCloudAssetDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetDetailRequest self = new GetCloudAssetDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetDetailRequest setAssetSubType(Integer assetSubType) {
        this.assetSubType = assetSubType;
        return this;
    }
    public Integer getAssetSubType() {
        return this.assetSubType;
    }

    public GetCloudAssetDetailRequest setAssetType(Integer assetType) {
        this.assetType = assetType;
        return this;
    }
    public Integer getAssetType() {
        return this.assetType;
    }

    public GetCloudAssetDetailRequest setCloudAssetInstances(java.util.List<GetCloudAssetDetailRequestCloudAssetInstances> cloudAssetInstances) {
        this.cloudAssetInstances = cloudAssetInstances;
        return this;
    }
    public java.util.List<GetCloudAssetDetailRequestCloudAssetInstances> getCloudAssetInstances() {
        return this.cloudAssetInstances;
    }

    public GetCloudAssetDetailRequest setVendor(Integer vendor) {
        this.vendor = vendor;
        return this;
    }
    public Integer getVendor() {
        return this.vendor;
    }

    public static class GetCloudAssetDetailRequestCloudAssetInstances extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        public static GetCloudAssetDetailRequestCloudAssetInstances build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetDetailRequestCloudAssetInstances self = new GetCloudAssetDetailRequestCloudAssetInstances();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetDetailRequestCloudAssetInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCloudAssetDetailRequestCloudAssetInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
