// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ProcessSoarStrategyTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>79CFF74D-E967-5407-8A78-EE03B925****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ProcessSoarStrategyTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProcessSoarStrategyTaskResponseBody self = new ProcessSoarStrategyTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ProcessSoarStrategyTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
