// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ValidateHcWarningsResponseBody extends TeaModel {
    /**
     * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>722C4F88-7867-4E7B-8ADE-7451053</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ValidateHcWarningsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateHcWarningsResponseBody self = new ValidateHcWarningsResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateHcWarningsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
