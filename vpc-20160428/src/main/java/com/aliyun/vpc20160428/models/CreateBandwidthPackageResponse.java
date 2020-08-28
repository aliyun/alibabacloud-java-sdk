// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBandwidthPackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    public static CreateBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBandwidthPackageResponse self = new CreateBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

}
