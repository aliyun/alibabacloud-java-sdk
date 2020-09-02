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

    public CreateSnatEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSnatEntryResponse setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

}
