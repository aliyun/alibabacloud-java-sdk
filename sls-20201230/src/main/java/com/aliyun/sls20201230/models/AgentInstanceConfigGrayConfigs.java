// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AgentInstanceConfigGrayConfigs extends TeaModel {
    @NameInMap("condition")
    public String condition;

    @NameInMap("content")
    public String content;

    public static AgentInstanceConfigGrayConfigs build(java.util.Map<String, ?> map) throws Exception {
        AgentInstanceConfigGrayConfigs self = new AgentInstanceConfigGrayConfigs();
        return TeaModel.build(map, self);
    }

    public AgentInstanceConfigGrayConfigs setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public AgentInstanceConfigGrayConfigs setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
