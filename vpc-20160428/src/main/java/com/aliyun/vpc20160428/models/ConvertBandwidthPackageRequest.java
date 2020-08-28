// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ConvertBandwidthPackageRequest extends TeaModel {
    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ConvertBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertBandwidthPackageRequest self = new ConvertBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

}
