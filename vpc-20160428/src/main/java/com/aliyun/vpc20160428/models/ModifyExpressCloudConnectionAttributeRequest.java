// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressCloudConnectionAttributeRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("EccId")
    @Validation(required = true)
    public String eccId;

    @NameInMap("BgpAs")
    public String bgpAs;

    @NameInMap("PeIp")
    public String peIp;

    @NameInMap("CeIp")
    public String ceIp;

    public static ModifyExpressCloudConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressCloudConnectionAttributeRequest self = new ModifyExpressCloudConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

}
