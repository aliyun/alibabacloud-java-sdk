// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackageSpecRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public String bandwidth;

    public static ModifyCommonBandwidthPackageSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackageSpecRequest self = new ModifyCommonBandwidthPackageSpecRequest();
        return TeaModel.build(map, self);
    }

}
