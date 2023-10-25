// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRulesResponseBody self = new DeleteRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
