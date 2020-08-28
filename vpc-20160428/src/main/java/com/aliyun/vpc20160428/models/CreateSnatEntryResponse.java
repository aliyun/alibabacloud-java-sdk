// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSnatEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SnatEntryId")
    @Validation(required = true)
    public String snatEntryId;

    public static CreateSnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSnatEntryResponse self = new CreateSnatEntryResponse();
        return TeaModel.build(map, self);
    }

}
