// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnSslServerLogsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpnSslServerId")
    @Validation(required = true)
    public String vpnSslServerId;

    @NameInMap("SslVpnClientCertId")
    public String sslVpnClientCertId;

    @NameInMap("From")
    public Integer from;

    @NameInMap("To")
    public Integer to;

    @NameInMap("MinutePeriod")
    public Integer minutePeriod;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeVpnSslServerLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnSslServerLogsRequest self = new DescribeVpnSslServerLogsRequest();
        return TeaModel.build(map, self);
    }

}
