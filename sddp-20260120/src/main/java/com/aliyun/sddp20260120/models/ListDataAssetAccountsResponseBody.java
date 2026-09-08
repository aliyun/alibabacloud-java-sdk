// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataAssetAccountsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<ListDataAssetAccountsResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("AuthRole")
        public String authRole;

        /**
         * <strong>example:</strong>
         * <p>client_key</p>
         */
        @NameInMap("EncryptionKeyMode")
        public String encryptionKeyMode;

        @NameInMap("EngineType")
        public String engineType;

        /**
         * <strong>example:</strong>
         * <p>2145953410000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductId")
        public Long productId;

        @NameInMap("RegionId")
        public String regionId;

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
