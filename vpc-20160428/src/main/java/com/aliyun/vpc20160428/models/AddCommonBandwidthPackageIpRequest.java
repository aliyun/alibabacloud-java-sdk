// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddCommonBandwidthPackageIpRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    @NameInMap("IpInstanceId")
    @Validation(required = true)
    public String ipInstanceId;

    @NameInMap("IpType")
    public String ipType;

    public static AddCommonBandwidthPackageIpRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCommonBandwidthPackageIpRequest self = new AddCommonBandwidthPackageIpRequest();
        return TeaModel.build(map, self);
    }

}
