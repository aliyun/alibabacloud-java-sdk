// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateCommonBandwidthPackageRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Zone")
    public String zone;

    @NameInMap("ISP")
    public String ISP;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public Integer bandwidth;

    @NameInMap("Ratio")
    public Integer ratio;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    public static CreateCommonBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommonBandwidthPackageRequest self = new CreateCommonBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

}
