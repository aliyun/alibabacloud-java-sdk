// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CreateAssociatedResourceRulesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>33BD6957-D7B0-500C-ADA1-300414EDCE89</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAssociatedResourceRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAssociatedResourceRulesResponseBody self = new CreateAssociatedResourceRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAssociatedResourceRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
