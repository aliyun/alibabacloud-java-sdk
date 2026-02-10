// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudAssetInstancesRequest extends TeaModel {
    /**
     * <p>Query data list based on keywords.</p>
     */
    @NameInMap("CloudAssetQueryData")
    public java.util.List<ListCloudAssetInstancesRequestCloudAssetQueryData> cloudAssetQueryData;

    /**
     * <p>The details of the cloud asset.</p>
     */
    @NameInMap("CloudAssetTypes")
    public java.util.List<ListCloudAssetInstancesRequestCloudAssetTypes> cloudAssetTypes;

    /**
     * <p>The search conditions for assets. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>name</strong>: the name of the search condition.</p>
     * </li>
     * <li><p><strong>value</strong>: the value of the search condition.</p>
     * </li>
     * <li><p><strong>logicalExp</strong>: the logical relation for multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The search conditions use a logical <strong>OR</strong>.</li>
     * <li><strong>AND</strong>: The search conditions use a logical <strong>AND</strong>.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can call the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation to query supported search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;internetIp\&quot;,\&quot;value\&quot;:\&quot;192.168\&quot;,\&quot;logicalExp\&quot;:\&quot;OR\&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The logical relation for multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The search conditions use a logical <strong>OR</strong>.</li>
     * <li><strong>AND</strong>: The search conditions use a logical <strong>AND</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListCloudAssetInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAssetInstancesRequest self = new ListCloudAssetInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudAssetInstancesRequest setCloudAssetQueryData(java.util.List<ListCloudAssetInstancesRequestCloudAssetQueryData> cloudAssetQueryData) {
        this.cloudAssetQueryData = cloudAssetQueryData;
        return this;
    }
    public java.util.List<ListCloudAssetInstancesRequestCloudAssetQueryData> getCloudAssetQueryData() {
        return this.cloudAssetQueryData;
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

    public static class ListCloudAssetInstancesRequestCloudAssetQueryData extends TeaModel {
        /**
         * <p>Query content.</p>
         * 
         * <strong>example:</strong>
         * <p>163.8.8.9</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>Query operator, currently only supports: INCLUDE.</p>
         * 
         * <strong>example:</strong>
         * <p>INCLUDE</p>
         */
        @NameInMap("Operator")
        public String operator;

        public static ListCloudAssetInstancesRequestCloudAssetQueryData build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAssetInstancesRequestCloudAssetQueryData self = new ListCloudAssetInstancesRequestCloudAssetQueryData();
            return TeaModel.build(map, self);
        }

        public ListCloudAssetInstancesRequestCloudAssetQueryData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListCloudAssetInstancesRequestCloudAssetQueryData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class ListCloudAssetInstancesRequestCloudAssetTypes extends TeaModel {
        /**
         * <p>The subtype of the cloud asset.</p>
         * <p>You can call the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation to query the subtype of the cloud asset.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The type of the cloud asset.</p>
         * <p>You can call the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation to query the cloud asset type.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The server type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: a cloud asset provided by Alibaba Cloud</li>
         * <li><strong>1</strong>: a cloud asset outside Alibaba Cloud</li>
         * <li><strong>2</strong>: a cloud asset in a data center</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: a cloud asset provided by a third-party service provider</li>
         * <li><strong>8</strong>: a lightweight cloud asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
