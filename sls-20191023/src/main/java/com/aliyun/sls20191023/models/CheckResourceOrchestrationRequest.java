// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class CheckResourceOrchestrationRequest extends TeaModel {
    @NameInMap("AssetsId")
    public String assetsId;

    @NameInMap("Language")
    public String language;

    @NameInMap("OperationPolicy")
    public String operationPolicy;

    public static CheckResourceOrchestrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceOrchestrationRequest self = new CheckResourceOrchestrationRequest();
        return TeaModel.build(map, self);
    }

    public CheckResourceOrchestrationRequest setAssetsId(String assetsId) {
        this.assetsId = assetsId;
        return this;
    }
    public String getAssetsId() {
        return this.assetsId;
    }

    public CheckResourceOrchestrationRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CheckResourceOrchestrationRequest setOperationPolicy(String operationPolicy) {
        this.operationPolicy = operationPolicy;
        return this;
    }
    public String getOperationPolicy() {
        return this.operationPolicy;
    }

}
