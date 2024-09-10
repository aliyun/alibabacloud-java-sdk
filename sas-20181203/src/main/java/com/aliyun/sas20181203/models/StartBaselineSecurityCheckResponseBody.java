// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartBaselineSecurityCheckResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>48D2E9A9-A1B0-4295-B727-0995757C47E9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartBaselineSecurityCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartBaselineSecurityCheckResponseBody self = new StartBaselineSecurityCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public StartBaselineSecurityCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
