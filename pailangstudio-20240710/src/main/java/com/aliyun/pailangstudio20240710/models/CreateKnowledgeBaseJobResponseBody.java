// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>kbjob-9mn******1z54</p>
     */
    @NameInMap("KnowledgeBaseJobId")
    public String knowledgeBaseJobId;

    /**
     * <strong>example:</strong>
     * <p>963BD7F9-0C02-5594-9550-BCC6DD43E3C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateKnowledgeBaseJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseJobResponseBody self = new CreateKnowledgeBaseJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseJobResponseBody setKnowledgeBaseJobId(String knowledgeBaseJobId) {
        this.knowledgeBaseJobId = knowledgeBaseJobId;
        return this;
    }
    public String getKnowledgeBaseJobId() {
        return this.knowledgeBaseJobId;
    }

    public CreateKnowledgeBaseJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
