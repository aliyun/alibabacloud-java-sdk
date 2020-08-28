// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ConvertBandwidthPackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ConvertInstanceId")
    @Validation(required = true)
    public String convertInstanceId;

    public static ConvertBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertBandwidthPackageResponse self = new ConvertBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

}
