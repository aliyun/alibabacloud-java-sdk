// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetDhcpOptionsSetRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DhcpOptionsSetId")
    @Validation(required = true)
    public String dhcpOptionsSetId;

    public static GetDhcpOptionsSetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDhcpOptionsSetRequest self = new GetDhcpOptionsSetRequest();
        return TeaModel.build(map, self);
    }

}
