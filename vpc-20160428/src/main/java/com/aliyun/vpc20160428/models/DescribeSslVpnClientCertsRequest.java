// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SslVpnServerId")
    public String sslVpnServerId;

    @NameInMap("SslVpnClientCertId")
    public String sslVpnClientCertId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeSslVpnClientCertsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnClientCertsRequest self = new DescribeSslVpnClientCertsRequest();
        return TeaModel.build(map, self);
    }

}
