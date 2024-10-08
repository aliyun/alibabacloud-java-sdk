// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExecStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7F84EBCA-86F8-5AA0-BF74-A0276ECB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecStrategyResponseBody self = new ExecStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
