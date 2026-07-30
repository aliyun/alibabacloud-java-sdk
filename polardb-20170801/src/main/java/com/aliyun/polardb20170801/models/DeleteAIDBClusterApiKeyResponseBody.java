// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAIDBClusterApiKeyResponseBody extends TeaModel {
    /**
     * <p>The API key of the model service.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>068F730C-9130-596E-B696-5B4388C840DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAIDBClusterApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIDBClusterApiKeyResponseBody self = new DeleteAIDBClusterApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAIDBClusterApiKeyResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DeleteAIDBClusterApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
