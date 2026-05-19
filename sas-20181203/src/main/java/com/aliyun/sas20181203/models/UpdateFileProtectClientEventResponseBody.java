// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectClientEventResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>69BFFCDE-37D6-5A49-A8BC-BB03AC83****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFileProtectClientEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectClientEventResponseBody self = new UpdateFileProtectClientEventResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectClientEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
