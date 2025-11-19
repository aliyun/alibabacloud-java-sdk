// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class GetProductListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("ConfigVersion")
    public String configVersion;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetProductListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductListRequest self = new GetProductListRequest();
        return TeaModel.build(map, self);
    }

    public GetProductListRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public GetProductListRequest setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }
    public String getConfigVersion() {
        return this.configVersion;
    }

    public GetProductListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetProductListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetProductListRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetProductListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
