// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("CaCert")
    @Validation(required = true)
    public String caCert;

    @NameInMap("ClientCert")
    @Validation(required = true)
    public String clientCert;

    @NameInMap("ClientKey")
    @Validation(required = true)
    public String clientKey;

    @NameInMap("ClientConfig")
    @Validation(required = true)
    public String clientConfig;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public Long createTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static DescribeSslVpnClientCertResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnClientCertResponse self = new DescribeSslVpnClientCertResponse();
        return TeaModel.build(map, self);
    }

}
