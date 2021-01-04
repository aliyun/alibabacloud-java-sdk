// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class TriggerExecutionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Content")
    public String content;

    @NameInMap("ClientToken")
    public String clientToken;

    public static TriggerExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerExecutionRequest self = new TriggerExecutionRequest();
        return TeaModel.build(map, self);
    }

    public TriggerExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TriggerExecutionRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public TriggerExecutionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TriggerExecutionRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public TriggerExecutionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
