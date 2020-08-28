// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySnatEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SnatTableId")
    @Validation(required = true)
    public String snatTableId;

    @NameInMap("SnatEntryId")
    @Validation(required = true)
    public String snatEntryId;

    @NameInMap("SnatIp")
    public String snatIp;

    @NameInMap("SnatEntryName")
    public String snatEntryName;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifySnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySnatEntryRequest self = new ModifySnatEntryRequest();
        return TeaModel.build(map, self);
    }

}
