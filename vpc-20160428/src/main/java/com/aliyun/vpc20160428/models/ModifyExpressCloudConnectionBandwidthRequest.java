// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressCloudConnectionBandwidthRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Bandwidth")
    public String bandwidth;

    @NameInMap("EccId")
    @Validation(required = true)
    public String eccId;

    public static ModifyExpressCloudConnectionBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressCloudConnectionBandwidthRequest self = new ModifyExpressCloudConnectionBandwidthRequest();
        return TeaModel.build(map, self);
    }

}
