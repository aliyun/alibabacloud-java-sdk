// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorFilterRulesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EgressRules")
    public java.util.List<CreateTrafficMirrorFilterRulesRequestEgressRules> egressRules;

    @NameInMap("IngressRules")
    public java.util.List<CreateTrafficMirrorFilterRulesRequestIngressRules> ingressRules;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TrafficMirrorFilterId")
    public String trafficMirrorFilterId;

    public static CreateTrafficMirrorFilterRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMirrorFilterRulesRequest self = new CreateTrafficMirrorFilterRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMirrorFilterRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTrafficMirrorFilterRulesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTrafficMirrorFilterRulesRequest setEgressRules(java.util.List<CreateTrafficMirrorFilterRulesRequestEgressRules> egressRules) {
        this.egressRules = egressRules;
        return this;
    }
    public java.util.List<CreateTrafficMirrorFilterRulesRequestEgressRules> getEgressRules() {
        return this.egressRules;
    }

    public CreateTrafficMirrorFilterRulesRequest setIngressRules(java.util.List<CreateTrafficMirrorFilterRulesRequestIngressRules> ingressRules) {
        this.ingressRules = ingressRules;
        return this;
    }
    public java.util.List<CreateTrafficMirrorFilterRulesRequestIngressRules> getIngressRules() {
        return this.ingressRules;
    }

    public CreateTrafficMirrorFilterRulesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTrafficMirrorFilterRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTrafficMirrorFilterRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTrafficMirrorFilterRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTrafficMirrorFilterRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTrafficMirrorFilterRulesRequest setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    public static class CreateTrafficMirrorFilterRulesRequestEgressRules extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("DestinationPortRange")
        public String destinationPortRange;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SourceCidrBlock")
        public String sourceCidrBlock;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static CreateTrafficMirrorFilterRulesRequestEgressRules build(java.util.Map<String, ?> map) throws Exception {
            CreateTrafficMirrorFilterRulesRequestEgressRules self = new CreateTrafficMirrorFilterRulesRequestEgressRules();
            return TeaModel.build(map, self);
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setDestinationPortRange(String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }
        public String getDestinationPortRange() {
            return this.destinationPortRange;
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setSourceCidrBlock(String sourceCidrBlock) {
            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }
        public String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

    public static class CreateTrafficMirrorFilterRulesRequestIngressRules extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("DestinationPortRange")
        public String destinationPortRange;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SourceCidrBlock")
        public String sourceCidrBlock;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static CreateTrafficMirrorFilterRulesRequestIngressRules build(java.util.Map<String, ?> map) throws Exception {
            CreateTrafficMirrorFilterRulesRequestIngressRules self = new CreateTrafficMirrorFilterRulesRequestIngressRules();
            return TeaModel.build(map, self);
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setDestinationPortRange(String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }
        public String getDestinationPortRange() {
            return this.destinationPortRange;
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setSourceCidrBlock(String sourceCidrBlock) {
            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }
        public String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

}
