// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("SslVpnClientCertKeys")
    @Validation(required = true)
    public DescribeSslVpnClientCertsResponseSslVpnClientCertKeys sslVpnClientCertKeys;

    public static DescribeSslVpnClientCertsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnClientCertsResponse self = new DescribeSslVpnClientCertsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSslVpnClientCertsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSslVpnClientCertsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSslVpnClientCertsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSslVpnClientCertsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSslVpnClientCertsResponse setSslVpnClientCertKeys(DescribeSslVpnClientCertsResponseSslVpnClientCertKeys sslVpnClientCertKeys) {
        this.sslVpnClientCertKeys = sslVpnClientCertKeys;
        return this;
    }
    public DescribeSslVpnClientCertsResponseSslVpnClientCertKeys getSslVpnClientCertKeys() {
        return this.sslVpnClientCertKeys;
    }

    public static class DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("SslVpnClientCertId")
        @Validation(required = true)
        public String sslVpnClientCertId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("SslVpnServerId")
        @Validation(required = true)
        public String sslVpnServerId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey self = new DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey();
            return TeaModel.build(map, self);
        }

        public DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey setSslVpnClientCertId(String sslVpnClientCertId) {
            this.sslVpnClientCertId = sslVpnClientCertId;
            return this;
        }
        public String getSslVpnClientCertId() {
            return this.sslVpnClientCertId;
        }

        public DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey setSslVpnServerId(String sslVpnServerId) {
            this.sslVpnServerId = sslVpnServerId;
            return this;
        }
        public String getSslVpnServerId() {
            return this.sslVpnServerId;
        }

        public DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSslVpnClientCertsResponseSslVpnClientCertKeys extends TeaModel {
        @NameInMap("SslVpnClientCertKey")
        @Validation(required = true)
        public java.util.List<DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey> sslVpnClientCertKey;

        public static DescribeSslVpnClientCertsResponseSslVpnClientCertKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeSslVpnClientCertsResponseSslVpnClientCertKeys self = new DescribeSslVpnClientCertsResponseSslVpnClientCertKeys();
            return TeaModel.build(map, self);
        }

        public DescribeSslVpnClientCertsResponseSslVpnClientCertKeys setSslVpnClientCertKey(java.util.List<DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey> sslVpnClientCertKey) {
            this.sslVpnClientCertKey = sslVpnClientCertKey;
            return this;
        }
        public java.util.List<DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey> getSslVpnClientCertKey() {
            return this.sslVpnClientCertKey;
        }

    }

}
