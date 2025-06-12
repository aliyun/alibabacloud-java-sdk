// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AddUserToGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1B968853-B423-63A6-FE1F-45E81BC2AD61</p>
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
