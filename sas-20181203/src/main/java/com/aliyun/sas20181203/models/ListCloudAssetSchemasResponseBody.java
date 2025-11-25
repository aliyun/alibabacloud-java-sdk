// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudAssetSchemasResponseBody extends TeaModel {
    /**
     * <p>List of asset structure definitions</p>
     */
    @NameInMap("CloudAssetSchemas")
    public java.util.List<ListCloudAssetSchemasResponseBodyCloudAssetSchemas> cloudAssetSchemas;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListCloudAssetSchemasResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Values: </p>
     * <ul>
     * <li><strong>true</strong>: The call was successful. </li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCloudAssetSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAssetSchemasResponseBody self = new ListCloudAssetSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudAssetSchemasResponseBody setCloudAssetSchemas(java.util.List<ListCloudAssetSchemasResponseBodyCloudAssetSchemas> cloudAssetSchemas) {
        this.cloudAssetSchemas = cloudAssetSchemas;
        return this;
    }
    public java.util.List<ListCloudAssetSchemasResponseBodyCloudAssetSchemas> getCloudAssetSchemas() {
        return this.cloudAssetSchemas;
    }

    public ListCloudAssetSchemasResponseBody setPageInfo(ListCloudAssetSchemasResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCloudAssetSchemasResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCloudAssetSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudAssetSchemasResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCloudAssetSchemasResponseBodyCloudAssetSchemas extends TeaModel {
        /**
         * <p>Subtype of the cloud product.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The type of the cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Elastic Compute Service (ECS).</li>
         * <li><strong>1</strong>: Server Load Balancer (SLB).</li>
         * <li><strong>3</strong>: ApsaraDB RDS.</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB.</li>
         * <li><strong>5</strong>: ApsaraDB for Redis.</li>
         * <li><strong>6</strong>: Container Registry.</li>
         * <li><strong>8</strong>: Container Service for Kubernetes.</li>
         * <li><strong>9</strong>: Virtual Private Cloud (VPC).</li>
         * <li><strong>11</strong>: ActionTrail.</li>
         * <li><strong>12</strong>: Alibaba Cloud CDN (CDN).</li>
         * <li><strong>13</strong>: Certificate Management Service.</li>
         * <li><strong>14</strong>: Apsara Devops.</li>
         * <li><strong>15</strong>: Resource Access Management (RAM).</li>
         * <li><strong>16</strong>: Anti-DDoS.</li>
         * <li><strong>17</strong>: Web Application Firewall (WAF).</li>
         * <li><strong>18</strong>: Object Storage Service (OSS).</li>
         * <li><strong>19</strong>: PolarDB.</li>
         * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL.</li>
         * <li><strong>21</strong>: Microservices Engine (MSE).</li>
         * <li><strong>22</strong>: File Storage NAS (NAS).</li>
         * <li><strong>23</strong>: Data Security Center (DSC).</li>
         * <li><strong>24</strong>: Elastic IP Address (EIP).</li>
         * <li><strong>25</strong>: Identity as a Service (IDaaS)-Employee Identity and Access Management (EIAM).</li>
         * <li><strong>26</strong>: PolarDB-X.</li>
         * <li><strong>27</strong>: Elasticsearch.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>Asset structure definition name</p>
         * 
         * <strong>example:</strong>
         * <p>ACS_ECS_Disk</p>
         */
        @NameInMap("DataName")
        public String dataName;

        /**
         * <p>Current asset structure definition text.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;associatedData\&quot;:[{\&quot;assetSubType\&quot;:100,\&quot;assetType\&quot;:0,\&quot;dataName\&quot;:\&quot;ACS_ECS_Instance\&quot;,\&quot;properties\&quot;:[{\&quot;name\&quot;:\&quot;InstanceId\&quot;,\&quot;path\&quot;:\&quot;InstanceId\&quot;}],\&quot;vendor\&quot;:0}],\&quot;description\&quot;:\&quot;The ID of the instance to which the disk is attached.\&quot;,\&quot;example\&quot;:\&quot;i-bp67acfmxazb4q****\&quot;,\&quot;name\&quot;:\&quot;InstanceId\&quot;,\&quot;type\&quot;:\&quot;STRING\&quot;,\&quot;withAssociatedData\&quot;:true},{\&quot;description\&quot;:\&quot;Disk name\&quot;,\&quot;example\&quot;:\&quot;testDiskName\&quot;,\&quot;name\&quot;:\&quot;DiskName\&quot;,\&quot;type\&quot;:\&quot;STRING\&quot;},{\&quot;description\&quot;:\&quot;Only encrypted disks\&quot;,\&quot;example\&quot;:\&quot;false\&quot;,\&quot;name\&quot;:\&quot;Encrypted\&quot;,\&quot;type\&quot;:\&quot;BOOLEAN\&quot;},{\&quot;description\&quot;:\&quot;Disk status\&quot;,\&quot;example\&quot;:\&quot;In_use\&quot;,\&quot;name\&quot;:\&quot;Status\&quot;,\&quot;type\&quot;:\&quot;STRING\&quot;},{\&quot;description\&quot;:\&quot;Disk category\&quot;,\&quot;example\&quot;:\&quot;cloud_ssd\&quot;,\&quot;name\&quot;:\&quot;Category\&quot;,\&quot;type\&quot;:\&quot;STRING\&quot;},{\&quot;description\&quot;:\&quot;Disk type\&quot;,\&quot;example\&quot;:\&quot;system\&quot;,\&quot;name\&quot;:\&quot;Type\&quot;,\&quot;type\&quot;:\&quot;STRING\&quot;},{\&quot;description\&quot;:\&quot;Specifies whether to set an automatic snapshot policy for the disk.\&quot;,\&quot;example\&quot;:\&quot;false\&quot;,\&quot;name\&quot;:\&quot;EnableAutomatedSnapshotPolicy\&quot;,\&quot;type\&quot;:\&quot;BOOLEAN\&quot;},{\&quot;description\&quot;:\&quot;The ID of the automatic snapshot policy.\&quot;,\&quot;example\&quot;:\&quot;sp-bp67acfmxazb4p****\&quot;,\&quot;name\&quot;:\&quot;AutoSnapshotPolicyId\&quot;,\&quot;type\&quot;:\&quot;STRING\&quot;},{\&quot;description\&quot;:\&quot;Disk, local disk, or elastic ephemeral disk ID\&quot;,\&quot;example\&quot;:\&quot;d-bp18um4r4f2fve24****\&quot;,\&quot;name\&quot;:\&quot;DiskId\&quot;,\&quot;type\&quot;:\&quot;STRING\&quot;}]</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>The source of the server. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: an asset provided by Alibaba Cloud.</li>
         * <li><strong>1</strong>: a third-party cloud server</li>
         * <li><strong>2</strong>: a server in a data center</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
         * <li><strong>8</strong>: a lightweight asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static ListCloudAssetSchemasResponseBodyCloudAssetSchemas build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAssetSchemasResponseBodyCloudAssetSchemas self = new ListCloudAssetSchemasResponseBodyCloudAssetSchemas();
            return TeaModel.build(map, self);
        }

        public ListCloudAssetSchemasResponseBodyCloudAssetSchemas setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public ListCloudAssetSchemasResponseBodyCloudAssetSchemas setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public ListCloudAssetSchemasResponseBodyCloudAssetSchemas setDataName(String dataName) {
            this.dataName = dataName;
            return this;
        }
        public String getDataName() {
            return this.dataName;
        }

        public ListCloudAssetSchemasResponseBodyCloudAssetSchemas setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ListCloudAssetSchemasResponseBodyCloudAssetSchemas setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

    public static class ListCloudAssetSchemasResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>54</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCloudAssetSchemasResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAssetSchemasResponseBodyPageInfo self = new ListCloudAssetSchemasResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCloudAssetSchemasResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListCloudAssetSchemasResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCloudAssetSchemasResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCloudAssetSchemasResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
