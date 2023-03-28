// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSnatEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the SNAT entry.</p>
     */
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    public static CreateSnatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSnatEntryResponseBody self = new CreateSnatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSnatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSnatEntryResponseBody setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

}
