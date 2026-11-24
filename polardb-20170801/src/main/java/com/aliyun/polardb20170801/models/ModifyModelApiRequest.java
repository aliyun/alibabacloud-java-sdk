// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyModelApiRequest extends TeaModel {
    /**
     * <p>The gateway retry configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;failover&quot;: {
     *         &quot;enabled&quot;: true,
     *         &quot;max_provider_retries&quot;: 2,
     *         &quot;max_failover_providers&quot;: 1,
     *         &quot;retryable_status_codes&quot;: [429, 500, 502, 503, 504],
     *         &quot;retry_delay&quot;: 0.5
     *     }
     * }</p>
     */
    @NameInMap("Config")
    public String config;

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
     * <p>The ID of the model API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mi-xxxxx</p>
     */
    @NameInMap("ModelApiId")
    public String modelApiId;

    /**
     * <p>The category. Valid values:</p>
     * <ul>
     * <li><strong>text</strong></li>
     * <li><strong>embedding</strong></li>
     * <li><strong>rerank</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ModelCategory")
    public String modelCategory;

    /**
     * <p>The model name mappings, specified as a JSON array string. Each element is in the format of {&quot;Source&quot;:&quot;client model name&quot;,&quot;Target&quot;:&quot;upstream model name&quot;}. If you do not specify this parameter, the current mappings are retained. If you specify &quot;[]&quot;, the mappings are cleared. The Source field is matched in a case-insensitive manner and must be unique.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Source&quot;:&quot;client-model-a&quot;,&quot;Target&quot;:&quot;upstream-model-a&quot;},{&quot;Source&quot;:&quot;client-model-b&quot;,&quot;Target&quot;:&quot;upstream-model-b&quot;}]</p>
     */
    @NameInMap("ModelMappings")
    public String modelMappings;

    /**
     * <p>The intelligent routing candidate list, specified as a JSON object string in the format of {&quot;AllowedModels&quot;:[&quot;candidate model name&quot;]}. If you do not specify this parameter, the current list is retained. If you specify this parameter, the existing list is fully replaced with the new list. You cannot use an empty list to disable the feature. Saving candidates does not enable the feature. You must call EnableModelRouting first.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AllowedModels&quot;:[&quot;deepseek-v4-pro&quot;,&quot;glm-5.3&quot;,&quot;glm-5.3-flash&quot;]}</p>
     */
    @NameInMap("ModelRouting")
    public String modelRouting;

    /**
     * <p>The name of the model API. This parameter is modifiable. If you do not specify this parameter, the original name is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>jev-chat-api</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The API path prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("PathPrefix")
    public String pathPrefix;

    /**
     * <p>The protocol. Valid values:</p>
     * <ul>
     * <li><strong>openai</strong></li>
     * <li><strong>anthropic</strong></li>
     * <li><strong>bailian</strong></li>
     * <li><strong>vllm</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The number of input tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordInput")
    public String recordInput;

    /**
     * <p>The number of output tokens.</p>
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
     * <p>The list of routing rules, specified as a JSON array string. Usage note: Correct the value of FallbackMode in the RouteRules parameter example by replacing it with a valid value or removing the field, and add the list of valid values and their descriptions for the FallbackMode subfield in the description of RouteRules.</p>
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

    public ModifyModelApiRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
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

    public ModifyModelApiRequest setModelMappings(String modelMappings) {
        this.modelMappings = modelMappings;
        return this;
    }
    public String getModelMappings() {
        return this.modelMappings;
    }

    public ModifyModelApiRequest setModelRouting(String modelRouting) {
        this.modelRouting = modelRouting;
        return this;
    }
    public String getModelRouting() {
        return this.modelRouting;
    }

    public ModifyModelApiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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
