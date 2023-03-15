// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateScratchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scenario.</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    public static UpdateTemplateScratchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateScratchResponseBody self = new UpdateTemplateScratchResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateScratchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTemplateScratchResponseBody setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

}
