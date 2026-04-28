// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateModelApiRequest extends TeaModel {
    @NameInMap("ForceModel")
    public String forceModel;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ModelCategory")
    public String modelCategory;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("PathPrefix")
    public String pathPrefix;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordInput")
    public String recordInput;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordOutput")
    public String recordOutput;

    @NameInMap("RegionId")
    public String regionId;

    /**
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

    public static CreateModelApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelApiRequest self = new CreateModelApiRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelApiRequest setForceModel(String forceModel) {
        this.forceModel = forceModel;
        return this;
    }
    public String getForceModel() {
        return this.forceModel;
    }

    public CreateModelApiRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public CreateModelApiRequest setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory;
        return this;
    }
    public String getModelCategory() {
        return this.modelCategory;
    }

    public CreateModelApiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelApiRequest setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    public CreateModelApiRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateModelApiRequest setRecordInput(String recordInput) {
        this.recordInput = recordInput;
        return this;
    }
    public String getRecordInput() {
        return this.recordInput;
    }

    public CreateModelApiRequest setRecordOutput(String recordOutput) {
        this.recordOutput = recordOutput;
        return this;
    }
    public String getRecordOutput() {
        return this.recordOutput;
    }

    public CreateModelApiRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateModelApiRequest setRouteRules(String routeRules) {
        this.routeRules = routeRules;
        return this;
    }
    public String getRouteRules() {
        return this.routeRules;
    }

}
