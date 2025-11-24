// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateSwimLaneGroupRequest extends TeaModel {
    /**
     * <p>The name of the baseline lane in the lane group if the lane group is in permissive mode. This parameter is valid only for a lane group in permissive mode.</p>
     * 
     * <strong>example:</strong>
     * <p>s1</p>
     */
    @NameInMap("FallbackTarget")
    public String fallbackTarget;

    /**
     * <p>The name of the lane group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The policy used to route requests among multiple lanes in a lane group. Valid values:</p>
     * <ul>
     * <li>weighted: a weight-based request routing policy. Requests are matched based on uniform rules and then routed to different lanes in a lane group at a specified ratio.</li>
     * <li>rule-based: a rule-based request routing policy. Each lane is configured with request routing rules. Only requests that match the request routing rules of a specific lane are routed to the lane.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>weighted</p>
     */
    @NameInMap("IngressRoutingStrategy")
    public String ingressRoutingStrategy;

    @NameInMap("ServiceLevelFallbackTarget")
    public String serviceLevelFallbackTarget;

    /**
     * <p>The Service Mesh (ASM) instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>A list of services associated with the lane group.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mocka&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockb&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockc&quot;]</p>
     */
    @NameInMap("ServicesList")
    public String servicesList;

    /**
     * <p>The weight-based request routing rules for a lane group. You can specify this parameter only when the IngressRoutingStrategy parameter is set to weighted.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Domains&quot;:[&quot;*&quot;],&quot;MatchRequests&quot;:[{&quot;URI&quot;:{&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;/mock&quot;},&quot;Headers&quot;:[{&quot;Name&quot;:&quot;test&quot;,&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;yes&quot;}]}]}</p>
     */
    @NameInMap("WeightedIngressRule")
    public String weightedIngressRule;

    public static UpdateSwimLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimLaneGroupRequest self = new UpdateSwimLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSwimLaneGroupRequest setFallbackTarget(String fallbackTarget) {
        this.fallbackTarget = fallbackTarget;
        return this;
    }
    public String getFallbackTarget() {
        return this.fallbackTarget;
    }

    public UpdateSwimLaneGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateSwimLaneGroupRequest setIngressRoutingStrategy(String ingressRoutingStrategy) {
        this.ingressRoutingStrategy = ingressRoutingStrategy;
        return this;
    }
    public String getIngressRoutingStrategy() {
        return this.ingressRoutingStrategy;
    }

    public UpdateSwimLaneGroupRequest setServiceLevelFallbackTarget(String serviceLevelFallbackTarget) {
        this.serviceLevelFallbackTarget = serviceLevelFallbackTarget;
        return this;
    }
    public String getServiceLevelFallbackTarget() {
        return this.serviceLevelFallbackTarget;
    }

    public UpdateSwimLaneGroupRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateSwimLaneGroupRequest setServicesList(String servicesList) {
        this.servicesList = servicesList;
        return this;
    }
    public String getServicesList() {
        return this.servicesList;
    }

    public UpdateSwimLaneGroupRequest setWeightedIngressRule(String weightedIngressRule) {
        this.weightedIngressRule = weightedIngressRule;
        return this;
    }
    public String getWeightedIngressRule() {
        return this.weightedIngressRule;
    }

}
