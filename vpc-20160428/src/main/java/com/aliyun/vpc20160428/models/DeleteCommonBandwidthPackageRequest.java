// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteCommonBandwidthPackageRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Force")
    public String force;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    public static DeleteCommonBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommonBandwidthPackageRequest self = new DeleteCommonBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

}
