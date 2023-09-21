// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetSummaryResponseBody extends TeaModel {
    @NameInMap("GroupedFields")
    public GetCloudAssetSummaryResponseBodyGroupedFields groupedFields;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCloudAssetSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetSummaryResponseBody self = new GetCloudAssetSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetSummaryResponseBody setGroupedFields(GetCloudAssetSummaryResponseBodyGroupedFields groupedFields) {
        this.groupedFields = groupedFields;
        return this;
    }
    public GetCloudAssetSummaryResponseBodyGroupedFields getGroupedFields() {
        return this.groupedFields;
    }

    public GetCloudAssetSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas extends TeaModel {
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        @NameInMap("AssetType")
        public Integer assetType;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("InstanceRiskCount")
        public Integer instanceRiskCount;

        @NameInMap("Vendor")
        public Integer vendor;

        public static GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas self = new GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setInstanceRiskCount(Integer instanceRiskCount) {
            this.instanceRiskCount = instanceRiskCount;
            return this;
        }
        public Integer getInstanceRiskCount() {
            return this.instanceRiskCount;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

    public static class GetCloudAssetSummaryResponseBodyGroupedFields extends TeaModel {
        @NameInMap("CloudAssetSummaryMetas")
        public java.util.List<GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas> cloudAssetSummaryMetas;

        @NameInMap("InstanceCountTotal")
        public Integer instanceCountTotal;

        @NameInMap("InstanceRiskCountTotal")
        public Integer instanceRiskCountTotal;

        public static GetCloudAssetSummaryResponseBodyGroupedFields build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetSummaryResponseBodyGroupedFields self = new GetCloudAssetSummaryResponseBodyGroupedFields();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetSummaryResponseBodyGroupedFields setCloudAssetSummaryMetas(java.util.List<GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas> cloudAssetSummaryMetas) {
            this.cloudAssetSummaryMetas = cloudAssetSummaryMetas;
            return this;
        }
        public java.util.List<GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas> getCloudAssetSummaryMetas() {
            return this.cloudAssetSummaryMetas;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFields setInstanceCountTotal(Integer instanceCountTotal) {
            this.instanceCountTotal = instanceCountTotal;
            return this;
        }
        public Integer getInstanceCountTotal() {
            return this.instanceCountTotal;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFields setInstanceRiskCountTotal(Integer instanceRiskCountTotal) {
            this.instanceRiskCountTotal = instanceRiskCountTotal;
            return this;
        }
        public Integer getInstanceRiskCountTotal() {
            return this.instanceRiskCountTotal;
        }

    }

}
