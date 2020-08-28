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

    }

    public static class DescribeSslVpnClientCertsResponseSslVpnClientCertKeys extends TeaModel {
        @NameInMap("SslVpnClientCertKey")
        @Validation(required = true)
        public java.util.List<DescribeSslVpnClientCertsResponseSslVpnClientCertKeysSslVpnClientCertKey> sslVpnClientCertKey;

        public static DescribeSslVpnClientCertsResponseSslVpnClientCertKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeSslVpnClientCertsResponseSslVpnClientCertKeys self = new DescribeSslVpnClientCertsResponseSslVpnClientCertKeys();
            return TeaModel.build(map, self);
        }

    }

}
