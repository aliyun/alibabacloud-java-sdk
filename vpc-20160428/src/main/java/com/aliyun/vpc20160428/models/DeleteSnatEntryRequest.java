// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteSnatEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SnatTableId")
    @Validation(required = true)
    public String snatTableId;

    @NameInMap("SnatEntryId")
    @Validation(required = true)
    public String snatEntryId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteSnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnatEntryRequest self = new DeleteSnatEntryRequest();
        return TeaModel.build(map, self);
    }

}
