// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorFilterRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EgressRules")
    public java.util.List<CreateTrafficMirrorFilterRequestEgressRules> egressRules;

    @NameInMap("IngressRules")
    public java.util.List<CreateTrafficMirrorFilterRequestIngressRules> ingressRules;

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

    @NameInMap("TrafficMirrorFilterDescription")
    public String trafficMirrorFilterDescription;

    @NameInMap("TrafficMirrorFilterName")
    public String trafficMirrorFilterName;

    public static CreateTrafficMirrorFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMirrorFilterRequest self = new CreateTrafficMirrorFilterRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMirrorFilterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTrafficMirrorFilterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTrafficMirrorFilterRequest setEgressRules(java.util.List<CreateTrafficMirrorFilterRequestEgressRules> egressRules) {
        this.egressRules = egressRules;
        return this;
    }
    public java.util.List<CreateTrafficMirrorFilterRequestEgressRules> getEgressRules() {
        return this.egressRules;
    }

    public CreateTrafficMirrorFilterRequest setIngressRules(java.util.List<CreateTrafficMirrorFilterRequestIngressRules> ingressRules) {
        this.ingressRules = ingressRules;
        return this;
    }
    public java.util.List<CreateTrafficMirrorFilterRequestIngressRules> getIngressRules() {
        return this.ingressRules;
    }

    public CreateTrafficMirrorFilterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTrafficMirrorFilterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTrafficMirrorFilterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTrafficMirrorFilterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTrafficMirrorFilterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTrafficMirrorFilterRequest setTrafficMirrorFilterDescription(String trafficMirrorFilterDescription) {
        this.trafficMirrorFilterDescription = trafficMirrorFilterDescription;
        return this;
    }
    public String getTrafficMirrorFilterDescription() {
        return this.trafficMirrorFilterDescription;
    }

    public CreateTrafficMirrorFilterRequest setTrafficMirrorFilterName(String trafficMirrorFilterName) {
        this.trafficMirrorFilterName = trafficMirrorFilterName;
        return this;
    }
    public String getTrafficMirrorFilterName() {
        return this.trafficMirrorFilterName;
    }

    public static class CreateTrafficMirrorFilterRequestEgressRules extends TeaModel {
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

        public static CreateTrafficMirrorFilterRequestEgressRules build(java.util.Map<String, ?> map) throws Exception {
            CreateTrafficMirrorFilterRequestEgressRules self = new CreateTrafficMirrorFilterRequestEgressRules();
            return TeaModel.build(map, self);
        }

        public CreateTrafficMirrorFilterRequestEgressRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateTrafficMirrorFilterRequestEgressRules setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public CreateTrafficMirrorFilterRequestEgressRules setDestinationPortRange(String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }
        public String getDestinationPortRange() {
            return this.destinationPortRange;
        }

        public CreateTrafficMirrorFilterRequestEgressRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateTrafficMirrorFilterRequestEgressRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateTrafficMirrorFilterRequestEgressRules setSourceCidrBlock(String sourceCidrBlock) {
            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }
        public String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        public CreateTrafficMirrorFilterRequestEgressRules setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

    public static class CreateTrafficMirrorFilterRequestIngressRules extends TeaModel {
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

        public static CreateTrafficMirrorFilterRequestIngressRules build(java.util.Map<String, ?> map) throws Exception {
            CreateTrafficMirrorFilterRequestIngressRules self = new CreateTrafficMirrorFilterRequestIngressRules();
            return TeaModel.build(map, self);
        }

        public CreateTrafficMirrorFilterRequestIngressRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateTrafficMirrorFilterRequestIngressRules setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public CreateTrafficMirrorFilterRequestIngressRules setDestinationPortRange(String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }
        public String getDestinationPortRange() {
            return this.destinationPortRange;
        }

        public CreateTrafficMirrorFilterRequestIngressRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateTrafficMirrorFilterRequestIngressRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateTrafficMirrorFilterRequestIngressRules setSourceCidrBlock(String sourceCidrBlock) {
            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }
        public String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        public CreateTrafficMirrorFilterRequestIngressRules setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

}
