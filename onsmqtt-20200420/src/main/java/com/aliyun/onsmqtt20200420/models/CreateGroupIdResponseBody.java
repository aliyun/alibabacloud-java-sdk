// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class CreateGroupIdResponseBody extends TeaModel {
    /**
     * <p>The request ID. This parameter is a common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>2C7D722D-0F3D-4415-A9CD-A464D82C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupIdResponseBody self = new CreateGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
