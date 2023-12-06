// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudAssetInstancesRequest extends TeaModel {
    /**
     * <p>The details of the cloud asset.</p>
     */
    @NameInMap("CloudAssetTypes")
    public java.util.List<ListCloudAssetInstancesRequestCloudAssetTypes> cloudAssetTypes;

    /**
     * <p>The search conditions for assets. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **name**: the name of the search condition.</p>
     * <br>
     * <p>*   **value**: the value of the search condition.</p>
     * <br>
     * <p>*   **logicalExp**: the logical relation for multiple search conditions. Valid values:</p>
     * <br>
     * <p>    *   **OR**: The search conditions use a logical **OR**.</p>
     * <p>    *   **AND**: The search conditions use a logical **AND**.</p>
     * <br>
     * <p>> You can call the [GetCloudAssetCriteria](~~GetCloudAssetCriteria~~) operation to query supported search conditions.</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The logical relation for multiple search conditions. Valid values:</p>
     * <br>
     * <p>*   **OR**: The search conditions use a logical **OR**.</p>
     * <p>*   **AND**: The search conditions use a logical **AND**.</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListCloudAssetInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAssetInstancesRequest self = new ListCloudAssetInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudAssetInstancesRequest setCloudAssetTypes(java.util.List<ListCloudAssetInstancesRequestCloudAssetTypes> cloudAssetTypes) {
        this.cloudAssetTypes = cloudAssetTypes;
        return this;
    }
    public java.util.List<ListCloudAssetInstancesRequestCloudAssetTypes> getCloudAssetTypes() {
        return this.cloudAssetTypes;
    }

    public ListCloudAssetInstancesRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public ListCloudAssetInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCloudAssetInstancesRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public ListCloudAssetInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudAssetInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ListCloudAssetInstancesRequestCloudAssetTypes extends TeaModel {
        /**
         * <p>The subtype of the cloud asset.</p>
         * <br>
         * <p>You can call the [GetCloudAssetCriteria](~~GetCloudAssetCriteria~~) operation to query the subtype of the cloud asset.</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The type of the cloud asset.</p>
         * <br>
         * <p>You can call the [GetCloudAssetCriteria](~~GetCloudAssetCriteria~~) operation to query the cloud asset type.</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The server type. Valid values:</p>
         * <br>
         * <p>*   **0**: a cloud asset provided by Alibaba Cloud</p>
         * <p>*   **1**: a cloud asset outside Alibaba Cloud</p>
         * <p>*   **2**: a cloud asset in a data center</p>
         * <p>*   **3**, **4**, **5**, and **7**: a cloud asset provided by a third-party service provider</p>
         * <p>*   **8**: a lightweight cloud asset</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static ListCloudAssetInstancesRequestCloudAssetTypes build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAssetInstancesRequestCloudAssetTypes self = new ListCloudAssetInstancesRequestCloudAssetTypes();
            return TeaModel.build(map, self);
        }

        public ListCloudAssetInstancesRequestCloudAssetTypes setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public ListCloudAssetInstancesRequestCloudAssetTypes setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public ListCloudAssetInstancesRequestCloudAssetTypes setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
