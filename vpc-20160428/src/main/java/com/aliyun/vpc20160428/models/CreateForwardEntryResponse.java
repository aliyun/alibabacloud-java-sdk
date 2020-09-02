// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateForwardEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ForwardEntryId")
    @Validation(required = true)
    public String forwardEntryId;

    public static CreateForwardEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardEntryResponse self = new CreateForwardEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateForwardEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateForwardEntryResponse setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

}
