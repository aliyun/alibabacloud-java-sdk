// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipSegmentAddressRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Bandwidth")
    public String bandwidth;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EipMask")
    @Validation(required = true)
    public String eipMask;

    @NameInMap("Netmode")
    public String netmode;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static AllocateEipSegmentAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipSegmentAddressRequest self = new AllocateEipSegmentAddressRequest();
        return TeaModel.build(map, self);
    }

}
