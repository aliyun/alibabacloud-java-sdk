// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListKspmInstancesRequest extends TeaModel {
    /**
     * <p>List of Kubernetes asset type information.</p>
     */
    @NameInMap("CloudAssetTypes")
    public java.util.List<ListKspmInstancesRequestCloudAssetTypes> cloudAssetTypes;

    /**
     * <p>Set the conditions for searching assets. This parameter is in JSON format, and case sensitivity should be noted when entering parameters. It includes the following fields:</p>
     * <ul>
     * <li><strong>name</strong>: Search item</li>
     * <li><strong>value</strong>: Value of the search item</li>
     * <li><strong>logicalExp</strong>: The relationship between search items when multiple conditions are used. Values:<ul>
     * <li><strong>OR</strong>: Indicates an <strong>or</strong> relationship between multiple conditions.</li>
     * <li><strong>AND</strong>: Indicates an <strong>and</strong> relationship between multiple conditions.<blockquote>
     * <p>Supports using region, instance name, instance ID, alarm status, risk status, and tag search conditions.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;vulStatus&quot;,&quot;value&quot;:&quot;YES&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>Set which page to start displaying the query results from. The default value is 1, indicating that the display starts from the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Set the logical relationship that takes effect between multiple search conditions. Values:</p>
     * <ul>
     * <li><strong>OR</strong>: Indicates an <strong>or</strong> relationship between multiple search conditions.</li>
     * <li><strong>AND</strong>: Indicates an <strong>and</strong> relationship between multiple search conditions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The maximum number of data entries displayed per page during pagination. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the instance is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListKspmInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKspmInstancesRequest self = new ListKspmInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListKspmInstancesRequest setCloudAssetTypes(java.util.List<ListKspmInstancesRequestCloudAssetTypes> cloudAssetTypes) {
        this.cloudAssetTypes = cloudAssetTypes;
        return this;
    }
    public java.util.List<ListKspmInstancesRequestCloudAssetTypes> getCloudAssetTypes() {
        return this.cloudAssetTypes;
    }

    public ListKspmInstancesRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public ListKspmInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListKspmInstancesRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public ListKspmInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKspmInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ListKspmInstancesRequestCloudAssetTypes extends TeaModel {
        /**
         * <p>Subtype of the product.
         * Asset type-subtype. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Workload<ul>
         * <li><strong>0</strong>: Pod</li>
         * <li><strong>1</strong>: DaemonSet</li>
         * <li><strong>2</strong>: StatefulSet</li>
         * </ul>
         * </li>
         * <li><strong>1</strong>: Service<ul>
         * <li><strong>0</strong>: Service</li>
         * </ul>
         * </li>
         * <li><strong>2</strong>: Namespace<ul>
         * <li><strong>0</strong>: Namespace</li>
         * </ul>
         * </li>
         * <li><strong>3</strong>: Authorization<ul>
         * <li><strong>0</strong>: Role</li>
         * <li><strong>1</strong>: ClusterRole</li>
         * <li><strong>2</strong>: ClusterRoleBinding</li>
         * <li><strong>3</strong>: RoleBinding</li>
         * <li><strong>4</strong>: ServiceAccount</li>
         * </ul>
         * </li>
         * <li><strong>4</strong>: Storage<ul>
         * <li><strong>0</strong>: PersistentVolume</li>
         * <li><strong>1</strong>: PersistentVolumeClaim</li>
         * <li><strong>2</strong>: StorageClass</li>
         * </ul>
         * </li>
         * <li><strong>5</strong>: Container<ul>
         * <li><strong>0</strong>: Image</li>
         * </ul>
         * </li>
         * <li><strong>6</strong>: Network<ul>
         * <li><strong>0</strong>: Route</li>
         * <li><strong>0</strong>: Ingress</li>
         * </ul>
         * </li>
         * <li><strong>7</strong>: Configuration<ul>
         * <li><strong>0</strong>: ConfigMap</li>
         * </ul>
         * </li>
         * <li><strong>8</strong>: Policies<ul>
         * <li><strong>0</strong>: LimitRanges</li>
         * <li><strong>1</strong>: ResourceQuota</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>Type of the asset. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Workload</li>
         * <li><strong>1</strong>: Service</li>
         * <li><strong>2</strong>: Namespace</li>
         * <li><strong>3</strong>: Authorization</li>
         * <li><strong>4</strong>: Storage</li>
         * <li><strong>5</strong>: Container</li>
         * <li><strong>6</strong>: Network</li>
         * <li><strong>7</strong>: Configuration</li>
         * <li><strong>8</strong>: Policies</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>Vendor of the asset. The fixed value is <strong>200</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static ListKspmInstancesRequestCloudAssetTypes build(java.util.Map<String, ?> map) throws Exception {
            ListKspmInstancesRequestCloudAssetTypes self = new ListKspmInstancesRequestCloudAssetTypes();
            return TeaModel.build(map, self);
        }

        public ListKspmInstancesRequestCloudAssetTypes setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public ListKspmInstancesRequestCloudAssetTypes setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public ListKspmInstancesRequestCloudAssetTypes setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
