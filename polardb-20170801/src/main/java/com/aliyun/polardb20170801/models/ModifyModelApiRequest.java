// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyModelApiRequest extends TeaModel {
    /**
     * <p>The gateway instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>The model API ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mi-xxxxx</p>
     */
    @NameInMap("ModelApiId")
    public String modelApiId;

    /**
     * <p>The model category. Valid values:</p>
     * <ul>
     * <li><p><code>text</code></p>
     * </li>
     * <li><p><code>embedding</code></p>
     * </li>
     * <li><p><code>rerank</code></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ModelCategory")
    public String modelCategory;

    /**
     * <p>The API path prefix.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("PathPrefix")
    public String pathPrefix;

    /**
     * <p>The protocol. Valid values:</p>
     * <ul>
     * <li><p><code>openai</code></p>
     * </li>
     * <li><p><code>anthropic</code></p>
     * </li>
     * <li><p><code>Model Studio</code></p>
     * </li>
     * <li><p><code>vllm</code></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The number of input units.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordInput")
    public String recordInput;

    /**
     * <p>The number of output units.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordOutput")
    public String recordOutput;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>A JSON array of routing rules, provided as a string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;RuleName&quot;: &quot;string&quot;,
     *     &quot;FallbackMode&quot;: &quot;failover&quot;,
     *     &quot;MatchModelListJson&quot;: &quot;[]&quot;,
     *     &quot;providerBalancerAlgorithm&quot;: &quot;round-robin&quot;,
     *     &quot;Providers&quot;: [
     *       {
     *         &quot;ModelServiceName&quot;: &quot;string&quot;,
     *         &quot;Weight&quot;: &quot;0&quot;,
     *         &quot;model_protocol&quot;: &quot;vllm&quot;
     *         &quot;ModelList&quot;: &quot;[]&quot;
     *       }
     *     ],
     *     &quot;FallbackProviders&quot;: [
     *       {
     *         &quot;ModelServiceName&quot;: &quot;string&quot;,
     *         &quot;model_protocol&quot;: &quot;anthropic&quot;,
     *         &quot;Weight&quot;: &quot;10&quot;,
     *         &quot;ModelList&quot;: &quot;[]&quot;
     *       }
     *     ]
     *   }
     * ]</p>
     */
    @NameInMap("RouteRules")
    public String routeRules;

    public static ModifyModelApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyModelApiRequest self = new ModifyModelApiRequest();
        return TeaModel.build(map, self);
    }

    public ModifyModelApiRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public ModifyModelApiRequest setModelApiId(String modelApiId) {
        this.modelApiId = modelApiId;
        return this;
    }
    public String getModelApiId() {
        return this.modelApiId;
    }

    public ModifyModelApiRequest setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory;
        return this;
    }
    public String getModelCategory() {
        return this.modelCategory;
    }

    public ModifyModelApiRequest setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    public ModifyModelApiRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ModifyModelApiRequest setRecordInput(String recordInput) {
        this.recordInput = recordInput;
        return this;
    }
    public String getRecordInput() {
        return this.recordInput;
    }

    public ModifyModelApiRequest setRecordOutput(String recordOutput) {
        this.recordOutput = recordOutput;
        return this;
    }
    public String getRecordOutput() {
        return this.recordOutput;
    }

    public ModifyModelApiRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyModelApiRequest setRouteRules(String routeRules) {
        this.routeRules = routeRules;
        return this;
    }
    public String getRouteRules() {
        return this.routeRules;
    }

}
