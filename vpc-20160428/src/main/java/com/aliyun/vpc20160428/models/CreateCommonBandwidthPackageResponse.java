// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateCommonBandwidthPackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    public static CreateCommonBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCommonBandwidthPackageResponse self = new CreateCommonBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

}
