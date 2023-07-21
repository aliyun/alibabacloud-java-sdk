// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFullNatEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the FULLNAT entry.</p>
     */
    @NameInMap("FullNatEntryId")
    public String fullNatEntryId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFullNatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFullNatEntryResponseBody self = new CreateFullNatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFullNatEntryResponseBody setFullNatEntryId(String fullNatEntryId) {
        this.fullNatEntryId = fullNatEntryId;
        return this;
    }
    public String getFullNatEntryId() {
        return this.fullNatEntryId;
    }

    public CreateFullNatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
