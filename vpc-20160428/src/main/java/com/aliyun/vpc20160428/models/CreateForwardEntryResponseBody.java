// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateForwardEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the DNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>fwd-119smw5tkasdf****</p>
     */
    @NameInMap("ForwardEntryId")
    public String forwardEntryId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A4AEE536-A97A-40EB-9EBE-53A6948A6928</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateForwardEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardEntryResponseBody self = new CreateForwardEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateForwardEntryResponseBody setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    public CreateForwardEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
