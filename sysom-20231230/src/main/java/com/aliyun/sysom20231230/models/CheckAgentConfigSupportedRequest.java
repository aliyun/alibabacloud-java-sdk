// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CheckAgentConfigSupportedRequest extends TeaModel {
    /**
     * <p>The ID of the component to update. You can obtain the component ID from the ListAgents operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The configuration dimension to check, such as cluster or node.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("checkType")
    public String checkType;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c726e7497b7d246d09d8644ed62effacc</p>
     */
    @NameInMap("clusters")
    public String clusters;

    /**
     * <p>The ID of the component configuration to install.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4d5ecf02-3d01-11f0-8c90-00163e1029a</p>
     */
    @NameInMap("configId")
    public String configId;

    /**
     * <p>The configuration content.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;: \&quot;BABA\&quot;, \&quot;changeRate\&quot;: \&quot;-1.434%\&quot;, \&quot;exchange\&quot;: \&quot;NYSE\&quot;, \&quot;price\&quot;: \&quot;112.690\&quot;, \&quot;changePrice\&quot;: \&quot;-$1.640\&quot;, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;date\&quot;: \&quot;2026-06-11T20:01 EDT\&quot;}</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The list of instances. Separate multiple instance IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp10ktsji8vsbd8gco5i,i-bp1163pp7k7njfggvuqp,i-bp12ytprghv6rwzfgypm</p>
     */
    @NameInMap("instances")
    public String instances;

    public static CheckAgentConfigSupportedRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAgentConfigSupportedRequest self = new CheckAgentConfigSupportedRequest();
        return TeaModel.build(map, self);
    }

    public CheckAgentConfigSupportedRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CheckAgentConfigSupportedRequest setCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }
    public String getCheckType() {
        return this.checkType;
    }

    public CheckAgentConfigSupportedRequest setClusters(String clusters) {
        this.clusters = clusters;
        return this;
    }
    public String getClusters() {
        return this.clusters;
    }

    public CheckAgentConfigSupportedRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public CheckAgentConfigSupportedRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CheckAgentConfigSupportedRequest setInstances(String instances) {
        this.instances = instances;
        return this;
    }
    public String getInstances() {
        return this.instances;
    }

}
