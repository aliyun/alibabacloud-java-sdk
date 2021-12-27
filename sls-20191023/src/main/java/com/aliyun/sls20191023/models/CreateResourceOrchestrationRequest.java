// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class CreateResourceOrchestrationRequest extends TeaModel {
    @NameInMap("AssetsId")
    public String assetsId;

    @NameInMap("Language")
    public String language;

    @NameInMap("OperationPolicy")
    public String operationPolicy;

    @NameInMap("Tokens")
    public String tokens;

    public static CreateResourceOrchestrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceOrchestrationRequest self = new CreateResourceOrchestrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceOrchestrationRequest setAssetsId(String assetsId) {
        this.assetsId = assetsId;
        return this;
    }
    public String getAssetsId() {
        return this.assetsId;
    }

    public CreateResourceOrchestrationRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateResourceOrchestrationRequest setOperationPolicy(String operationPolicy) {
        this.operationPolicy = operationPolicy;
        return this;
    }
    public String getOperationPolicy() {
        return this.operationPolicy;
    }

    public CreateResourceOrchestrationRequest setTokens(String tokens) {
        this.tokens = tokens;
        return this;
    }
    public String getTokens() {
        return this.tokens;
    }

}
