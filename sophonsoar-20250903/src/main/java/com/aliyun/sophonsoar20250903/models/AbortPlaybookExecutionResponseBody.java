// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class AbortPlaybookExecutionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0727DAC8-<strong><strong>-51EC-</strong></strong>-14999C62B502</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static AbortPlaybookExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbortPlaybookExecutionResponseBody self = new AbortPlaybookExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public AbortPlaybookExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AbortPlaybookExecutionResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
