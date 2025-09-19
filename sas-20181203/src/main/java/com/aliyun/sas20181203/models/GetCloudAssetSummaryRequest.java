// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetSummaryRequest extends TeaModel {
    @NameInMap("CloudAssetTypes")
    public java.util.List<GetCloudAssetSummaryRequestCloudAssetTypes> cloudAssetTypes;

    /**
     * <p>The asset type by service provider.</p>
     */
    @NameInMap("Vendors")
    public java.util.List<Integer> vendors;

    public static GetCloudAssetSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetSummaryRequest self = new GetCloudAssetSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetSummaryRequest setCloudAssetTypes(java.util.List<GetCloudAssetSummaryRequestCloudAssetTypes> cloudAssetTypes) {
        this.cloudAssetTypes = cloudAssetTypes;
        return this;
    }
    public java.util.List<GetCloudAssetSummaryRequestCloudAssetTypes> getCloudAssetTypes() {
        return this.cloudAssetTypes;
    }

    public GetCloudAssetSummaryRequest setVendors(java.util.List<Integer> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<Integer> getVendors() {
        return this.vendors;
    }

    public static class GetCloudAssetSummaryRequestCloudAssetTypes extends TeaModel {
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        @NameInMap("AssetType")
        public Integer assetType;

        @NameInMap("Vendor")
        public Integer vendor;

        public static GetCloudAssetSummaryRequestCloudAssetTypes build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetSummaryRequestCloudAssetTypes self = new GetCloudAssetSummaryRequestCloudAssetTypes();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetSummaryRequestCloudAssetTypes setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public GetCloudAssetSummaryRequestCloudAssetTypes setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public GetCloudAssetSummaryRequestCloudAssetTypes setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
