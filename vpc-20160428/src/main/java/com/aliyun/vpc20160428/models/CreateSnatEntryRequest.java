// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSnatEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SnatTableId")
    @Validation(required = true)
    public String snatTableId;

    @NameInMap("SourceVSwitchId")
    public String sourceVSwitchId;

    @NameInMap("SourceCIDR")
    public String sourceCIDR;

    @NameInMap("SnatIp")
    @Validation(required = true)
    public String snatIp;

    @NameInMap("SnatEntryName")
    public String snatEntryName;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateSnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSnatEntryRequest self = new CreateSnatEntryRequest();
        return TeaModel.build(map, self);
    }

}
