// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetCriteriaRequest extends TeaModel {
    @NameInMap("CloudAssetTypes")
    public java.util.List<GetCloudAssetCriteriaRequestCloudAssetTypes> cloudAssetTypes;

    @NameInMap("Value")
    public String value;

    public static GetCloudAssetCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetCriteriaRequest self = new GetCloudAssetCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetCriteriaRequest setCloudAssetTypes(java.util.List<GetCloudAssetCriteriaRequestCloudAssetTypes> cloudAssetTypes) {
        this.cloudAssetTypes = cloudAssetTypes;
        return this;
    }
    public java.util.List<GetCloudAssetCriteriaRequestCloudAssetTypes> getCloudAssetTypes() {
        return this.cloudAssetTypes;
    }

    public GetCloudAssetCriteriaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public static class GetCloudAssetCriteriaRequestCloudAssetTypes extends TeaModel {
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        @NameInMap("AssetType")
        public Integer assetType;

        public static GetCloudAssetCriteriaRequestCloudAssetTypes build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetCriteriaRequestCloudAssetTypes self = new GetCloudAssetCriteriaRequestCloudAssetTypes();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetCriteriaRequestCloudAssetTypes setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public GetCloudAssetCriteriaRequestCloudAssetTypes setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

    }

}
