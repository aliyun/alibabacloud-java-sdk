// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteApplicationGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9E011F98-4EE5-5E3A-8FA3-D38F2C531C1F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApplicationGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationGroupResponseBody self = new DeleteApplicationGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
