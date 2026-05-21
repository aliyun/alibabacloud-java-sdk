// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class CreateSavedQueryResponseBody extends TeaModel {
    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sq-GeAck****</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EFA806B9-7F36-55AB-8B7A-D680C2C5EE57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSavedQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSavedQueryResponseBody self = new CreateSavedQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSavedQueryResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public CreateSavedQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
