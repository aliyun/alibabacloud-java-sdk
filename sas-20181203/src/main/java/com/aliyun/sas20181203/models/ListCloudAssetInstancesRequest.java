// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudAssetInstancesRequest extends TeaModel {
    /**
     * <p>The data list queried by keyword.</p>
     */
    @NameInMap("CloudAssetQueryData")
    public java.util.List<ListCloudAssetInstancesRequestCloudAssetQueryData> cloudAssetQueryData;

    /**
     * <p>The list of cloud asset instance types.</p>
     */
    @NameInMap("CloudAssetTypes")
    public java.util.List<ListCloudAssetInstancesRequestCloudAssetTypes> cloudAssetTypes;

    /**
     * <p>The search conditions for assets. This parameter is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>name</strong>: The search item.</li>
     * <li><strong>value</strong>: The value of the search item.</li>
     * <li><strong>logicalExp</strong>: The logical relationship between multiple search item values. Valid values:<ul>
     * <li><strong>OR</strong>: The search item values are evaluated using the OR operator.</li>
     * <li><strong>AND</strong>: The search item values are evaluated using the AND operator.<blockquote>
     * <p>You can call the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation to query the supported search conditions.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;internetIp\&quot;,\&quot;value\&quot;:\&quot;192.168\&quot;,\&quot;logicalExp\&quot;:\&quot;OR\&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The page number of the current page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether to return sale-related data. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Returns sale-related data.</li>
     * <li><strong>false</strong>: Does not return sale-related data.</li>
     * </ul>
     */
    @NameInMap("IsSaleData")
    public Boolean isSaleData;

    /**
     * <p>The logical relationship between multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The search conditions are evaluated using the OR operator.</li>
     * <li><strong>AND</strong>: The search conditions are evaluated using the AND operator.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The maximum number of entries per page. Maximum value: 100. Default value: 20.</p>
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

    /**
     * <p>The ID of the Alibaba Cloud account of the resource folder member accounts.</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

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

    public ListCloudAssetInstancesRequest setIsSaleData(Boolean isSaleData) {
        this.isSaleData = isSaleData;
        return this;
    }
    public Boolean getIsSaleData() {
        return this.isSaleData;
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

    public ListCloudAssetInstancesRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public static class ListCloudAssetInstancesRequestCloudAssetQueryData extends TeaModel {
        /**
         * <p>The query content.</p>
         * 
         * <strong>example:</strong>
         * <p>163.8.8.9</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The query operator. Currently, only INCLUDE is supported.</p>
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
         * <p>The subtype of the cloud service.</p>
         * <blockquote>
         * <p>For specific meanings, refer to the AssetSubType parameter in the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The type of the cloud asset.</p>
         * <blockquote>
         * <p>For specific meanings, refer to the AssetType parameter in the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The server vendor. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud asset</li>
         * <li><strong>1</strong>: Non-cloud asset</li>
         * <li><strong>2</strong>: IDC asset</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: Third-party cloud asset</li>
         * <li><strong>8</strong>: Lightweight asset</li>
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
