// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataMaskingInstancesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of records returned by the current query.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListDataMaskingInstancesResponseBodyItems> items;

    /**
     * <p>The number of records per page for the current query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID. You can use this ID to locate the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that match the current statistics or query scope.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDataMaskingInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataMaskingInstancesResponseBody self = new ListDataMaskingInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataMaskingInstancesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDataMaskingInstancesResponseBody setItems(java.util.List<ListDataMaskingInstancesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListDataMaskingInstancesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListDataMaskingInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataMaskingInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataMaskingInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataMaskingInstancesResponseBodyItems extends TeaModel {
        /**
         * <p>The column encryption algorithm used by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>AES_256_GCM</p>
         */
        @NameInMap("EncryptionAlgorithm")
        public String encryptionAlgorithm;

        /**
         * <p>The ID of the KMS key used by the instance. This field may not be returned for local key scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-12345678****</p>
         */
        @NameInMap("EncryptionKeyId")
        public String encryptionKeyId;

        /**
         * <p>The database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The number of database accounts that have fullAccess plaintext access permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FullAccessAccountCount")
        public Integer fullAccessAccountCount;

        /**
         * <p>The instance identity of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1abcdefgh****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The code of the cloud product.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the cloud product type. Valid values: 5 (RDS), 8 (POLARDB), and 27 (PolarDBX2).</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProductId")
        public Long productId;

        /**
         * <p>The region ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The region name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Zhangjiakou)</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        public static ListDataMaskingInstancesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListDataMaskingInstancesResponseBodyItems self = new ListDataMaskingInstancesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListDataMaskingInstancesResponseBodyItems setEncryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }
        public String getEncryptionAlgorithm() {
            return this.encryptionAlgorithm;
        }

        public ListDataMaskingInstancesResponseBodyItems setEncryptionKeyId(String encryptionKeyId) {
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }
        public String getEncryptionKeyId() {
            return this.encryptionKeyId;
        }

        public ListDataMaskingInstancesResponseBodyItems setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public ListDataMaskingInstancesResponseBodyItems setFullAccessAccountCount(Integer fullAccessAccountCount) {
            this.fullAccessAccountCount = fullAccessAccountCount;
            return this;
        }
        public Integer getFullAccessAccountCount() {
            return this.fullAccessAccountCount;
        }

        public ListDataMaskingInstancesResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDataMaskingInstancesResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListDataMaskingInstancesResponseBodyItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public ListDataMaskingInstancesResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDataMaskingInstancesResponseBodyItems setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
