// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertsResponseBody extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the SSL client certificates.</p>
     */
    @NameInMap("SslVpnClientCertKeys")
    public DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeys sslVpnClientCertKeys;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSslVpnClientCertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnClientCertsResponseBody self = new DescribeSslVpnClientCertsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSslVpnClientCertsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSslVpnClientCertsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSslVpnClientCertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSslVpnClientCertsResponseBody setSslVpnClientCertKeys(DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeys sslVpnClientCertKeys) {
        this.sslVpnClientCertKeys = sslVpnClientCertKeys;
        return this;
    }
    public DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeys getSslVpnClientCertKeys() {
        return this.sslVpnClientCertKeys;
    }

    public DescribeSslVpnClientCertsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey extends TeaModel {
        /**
         * <p>The timestamp that indicates when the SSL client certificate was created. Unit: millisecond.</p>
         * <br>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The timestamp that indicates when the SSL client certificate expires. Unit: millisecond.</p>
         * <br>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The name of the SSL client certificate.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region where the SSL client certificate is created.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the SSL client certificate belongs.</p>
         * <br>
         * <p>You can call the [ListResourceGroups](https://help.aliyun.com/document_detail/158855.html) operation to query the resource group information.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the SSL client certificate.</p>
         */
        @NameInMap("SslVpnClientCertId")
        public String sslVpnClientCertId;

        /**
         * <p>The ID of the SSL server.</p>
         */
        @NameInMap("SslVpnServerId")
        public String sslVpnServerId;

        /**
         * <p>The status of the SSL client certificate. Valid values:</p>
         * <br>
         * <p>*   **expiring-soon**</p>
         * <p>*   **normal**</p>
         * <p>*   **expired**</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey self = new DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey();
            return TeaModel.build(map, self);
        }

        public DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey setSslVpnClientCertId(String sslVpnClientCertId) {
            this.sslVpnClientCertId = sslVpnClientCertId;
            return this;
        }
        public String getSslVpnClientCertId() {
            return this.sslVpnClientCertId;
        }

        public DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey setSslVpnServerId(String sslVpnServerId) {
            this.sslVpnServerId = sslVpnServerId;
            return this;
        }
        public String getSslVpnServerId() {
            return this.sslVpnServerId;
        }

        public DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeys extends TeaModel {
        @NameInMap("SslVpnClientCertKey")
        public java.util.List<DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey> sslVpnClientCertKey;

        public static DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeys self = new DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeys();
            return TeaModel.build(map, self);
        }

        public DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeys setSslVpnClientCertKey(java.util.List<DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey> sslVpnClientCertKey) {
            this.sslVpnClientCertKey = sslVpnClientCertKey;
            return this;
        }
        public java.util.List<DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeysSslVpnClientCertKey> getSslVpnClientCertKey() {
            return this.sslVpnClientCertKey;
        }

    }

}
