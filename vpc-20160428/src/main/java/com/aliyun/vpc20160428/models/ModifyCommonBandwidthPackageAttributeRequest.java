// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackageAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static ModifyCommonBandwidthPackageAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackageAttributeRequest self = new ModifyCommonBandwidthPackageAttributeRequest();
        return TeaModel.build(map, self);
    }

}
