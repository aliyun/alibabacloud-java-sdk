// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AddUserToGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddUserToGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserToGroupResponseBody self = new AddUserToGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserToGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
