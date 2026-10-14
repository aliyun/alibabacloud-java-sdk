// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataAssetAccountsResponseBody extends TeaModel {
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
    public java.util.List<ListDataAssetAccountsResponseBodyItems> items;

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
     * <p>The total number of records that match the current query or statistical scope.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDataAssetAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataAssetAccountsResponseBody self = new ListDataAssetAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataAssetAccountsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDataAssetAccountsResponseBody setItems(java.util.List<ListDataAssetAccountsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListDataAssetAccountsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListDataAssetAccountsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataAssetAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataAssetAccountsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataAssetAccountsResponseBodyItems extends TeaModel {
        /**
         * <p>The database account name.</p>
         * 
         * <strong>example:</strong>
         * <p>app_reader</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The Alibaba Cloud account ID to which the asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The column encryption access permissions. Valid values:</p>
         * <ul>
         * <li>fullAccess: plaintext access.</li>
         * <li>restrictedAccess: restricted access.</li>
         * <li>noneAccess: decryption prohibited. noneAccess applies only to ApsaraDB RDS for MySQL instances whose current effective key pattern is client_key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fullAccess</p>
         */
        @NameInMap("AuthRole")
        public String authRole;

        /**
         * <p>The current effective column encryption key mode. Valid values:</p>
         * <ul>
         * <li>client_key: local master key.</li>
         * <li>kms_key: KMS key.</li>
         * </ul>
         * <p>This field is not returned if no column encryption configuration is in effect.</p>
         * 
         * <strong>example:</strong>
         * <p>client_key</p>
         */
        @NameInMap("EncryptionKeyMode")
        public String encryptionKeyMode;

        /**
         * <p>The database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The expiration time of the plaintext access permissions. The value is a UNIX timestamp in milliseconds since 1970-01-01 00:00:00 UTC. This field is not returned if no expiration time is set.</p>
         * 
         * <strong>example:</strong>
         * <p>2145953410000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The database account identifier. This value is used as AccountId when configuring permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The database instance identity.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1abcdefgh****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The cloud product code.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The cloud product type identifier. Valid values:</p>
         * <ul>
         * <li>5: RDS.</li>
         * <li>8: POLARDB.</li>
         * <li>27: PolarDBX2.</li>
         * </ul>
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
         * <p>China North 3 (Zhangjiakou)</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        public static ListDataAssetAccountsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListDataAssetAccountsResponseBodyItems self = new ListDataAssetAccountsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListDataAssetAccountsResponseBodyItems setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListDataAssetAccountsResponseBodyItems setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListDataAssetAccountsResponseBodyItems setAuthRole(String authRole) {
            this.authRole = authRole;
            return this;
        }
        public String getAuthRole() {
            return this.authRole;
        }

        public ListDataAssetAccountsResponseBodyItems setEncryptionKeyMode(String encryptionKeyMode) {
            this.encryptionKeyMode = encryptionKeyMode;
            return this;
        }
        public String getEncryptionKeyMode() {
            return this.encryptionKeyMode;
        }

        public ListDataAssetAccountsResponseBodyItems setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public ListDataAssetAccountsResponseBodyItems setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListDataAssetAccountsResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataAssetAccountsResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDataAssetAccountsResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListDataAssetAccountsResponseBodyItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public ListDataAssetAccountsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDataAssetAccountsResponseBodyItems setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
