// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AgentInstanceConfigGrayConfigs extends TeaModel {
    /**
     * <p>The matching rule.</p>
     * 
     * <strong>example:</strong>
     * <p>appVersion=&quot;1.0.0&quot;</p>
     */
    @NameInMap("condition")
    public String condition;

    /**
     * <p>The content of the canary release configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enable&quot;:true}</p>
     */
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
