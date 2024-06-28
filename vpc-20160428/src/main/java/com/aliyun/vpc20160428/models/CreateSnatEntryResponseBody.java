// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSnatEntryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2315DEB7-5E92-423A-91F7-4C1EC9AD97C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the SNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>snat-kmd6nv8fy****</p>
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
