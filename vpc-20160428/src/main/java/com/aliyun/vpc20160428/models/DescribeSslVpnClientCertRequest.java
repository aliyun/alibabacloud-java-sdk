// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SslVpnClientCertId")
    @Validation(required = true)
    public String sslVpnClientCertId;

    public static DescribeSslVpnClientCertRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnClientCertRequest self = new DescribeSslVpnClientCertRequest();
        return TeaModel.build(map, self);
    }

}
