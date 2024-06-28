// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateFailoverTestJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C44F62BE-9CE7-4277-B117-69243F3988BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFailoverTestJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFailoverTestJobResponseBody self = new UpdateFailoverTestJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFailoverTestJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
