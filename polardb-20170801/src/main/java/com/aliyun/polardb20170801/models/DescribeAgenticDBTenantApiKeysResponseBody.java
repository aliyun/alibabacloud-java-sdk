// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBTenantApiKeysResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeAgenticDBTenantApiKeysResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>C3D4E5F6-A7B8-9012-CDEF-123456789012</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAgenticDBTenantApiKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBTenantApiKeysResponseBody self = new DescribeAgenticDBTenantApiKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBTenantApiKeysResponseBody setItems(java.util.List<DescribeAgenticDBTenantApiKeysResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAgenticDBTenantApiKeysResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAgenticDBTenantApiKeysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAgenticDBTenantApiKeysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAgenticDBTenantApiKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAgenticDBTenantApiKeysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAgenticDBTenantApiKeysResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ak-71304e39c7e841a1</p>
         */
        @NameInMap("ApiKeyId")
        public String apiKeyId;

        /**
         * <strong>example:</strong>
         * <p>pagc_key_cGFnYy1icDFhMmIz****</p>
         */
        @NameInMap("ApiKeyMasked")
        public String apiKeyMasked;

        /**
         * <strong>example:</strong>
         * <p>2026-06-10T10:30:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>MCP server token</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2027-01-01T00:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>t-4b83e0da66674951</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>my-saas-app</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        public static DescribeAgenticDBTenantApiKeysResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticDBTenantApiKeysResponseBodyItems self = new DescribeAgenticDBTenantApiKeysResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticDBTenantApiKeysResponseBodyItems setApiKeyId(String apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }
        public String getApiKeyId() {
            return this.apiKeyId;
        }

        public DescribeAgenticDBTenantApiKeysResponseBodyItems setApiKeyMasked(String apiKeyMasked) {
            this.apiKeyMasked = apiKeyMasked;
            return this;
        }
        public String getApiKeyMasked() {
            return this.apiKeyMasked;
        }

        public DescribeAgenticDBTenantApiKeysResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAgenticDBTenantApiKeysResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAgenticDBTenantApiKeysResponseBodyItems setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeAgenticDBTenantApiKeysResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAgenticDBTenantApiKeysResponseBodyItems setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeAgenticDBTenantApiKeysResponseBodyItems setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
