// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInstanceMultiVIPResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>52D901ED-E0A5-42FB-B9DB-39C295C3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstanceMultiVIPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceMultiVIPResponseBody self = new CreateInstanceMultiVIPResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceMultiVIPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
