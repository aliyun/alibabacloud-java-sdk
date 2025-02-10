// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertsResponseBody extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5BE01CD7-5A50-472D-AC14-CA181C5C03BE</p>
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
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The timestamp generated when the SSL client certificate was created. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1492747187000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The timestamp generated when the SSL client certificate expires. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1494966335000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The name of the SSL client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>cert1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID of the SSL client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the SSL client certificate belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the SSL client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-bp1n8wcf134yl0osr****</p>
         */
        @NameInMap("SslVpnClientCertId")
        public String sslVpnClientCertId;

        /**
         * <p>The ID of the SSL server.</p>
         * 
         * <strong>example:</strong>
         * <p>vss-bp18q7hzj6largv4v****</p>
         */
        @NameInMap("SslVpnServerId")
        public String sslVpnServerId;

        /**
         * <p>The status of the SSL client certificate. Valid values:</p>
         * <ul>
         * <li><strong>expiring-soon</strong>: The certificate expires in one week.</li>
         * <li><strong>normal</strong></li>
         * <li><strong>expired</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
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
