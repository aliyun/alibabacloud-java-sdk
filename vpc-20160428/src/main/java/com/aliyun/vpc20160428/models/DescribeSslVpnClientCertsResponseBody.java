// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SslVpnClientCertKeys")
    public DescribeSslVpnClientCertsResponseBodySslVpnClientCertKeys sslVpnClientCertKeys;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SslVpnClientCertId")
        public String sslVpnClientCertId;

        @NameInMap("SslVpnServerId")
        public String sslVpnServerId;

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
