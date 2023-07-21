// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorFilterRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must ensure that the value is unique among all requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed. This is the default value.</p>
     */
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

    /**
     * <p>The ID of the region to which the mirrored traffic belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list. For more information about regions that support traffic mirroring, see [Overview of traffic mirroring](~~207513~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the mirrored traffic belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<CreateTrafficMirrorFilterRequestTag> tag;

    /**
     * <p>The description of the filter.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("TrafficMirrorFilterDescription")
    public String trafficMirrorFilterDescription;

    /**
     * <p>The name of the filter.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length, and cannot start with `http://` or `https://`.</p>
     */
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

    public CreateTrafficMirrorFilterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public CreateTrafficMirrorFilterRequest setTag(java.util.List<CreateTrafficMirrorFilterRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTrafficMirrorFilterRequestTag> getTag() {
        return this.tag;
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
        /**
         * <p>The action of the outbound rule. Valid values:</p>
         * <br>
         * <p>*   **accept**: collects network traffic.</p>
         * <p>*   **drop**: does not collect network traffic.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The destination CIDR block of the outbound traffic.</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The destination port range of the outbound traffic. Valid values for a port: **1** to **65535**. Separate the first port and the last port with a forward slash (/). Examples: **1/200** and **80/80**. You cannot set this parameter to only **-1/-1**. The value -1/-1 specifies all ports.</p>
         * <br>
         * <p>>  If you set **EgressRules.N.Protocol** to **ALL** or **ICMP**, you do not need to set this parameter. In this case, all ports are available.</p>
         */
        @NameInMap("DestinationPortRange")
        public String destinationPortRange;

        /**
         * <p>The priority of the outbound rule. A smaller value indicates a higher priority.</p>
         * <br>
         * <p>The maximum value of **N** is **10**. You can configure up to 10 outbound rules for a filter.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol that is used by the outbound traffic to be mirrored. Valid values:</p>
         * <br>
         * <p>*   **ALL**: all protocols</p>
         * <p>*   **ICMP**: ICMP</p>
         * <p>*   **TCP**: TCP</p>
         * <p>*   **UDP**: UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of the outbound traffic.</p>
         */
        @NameInMap("SourceCidrBlock")
        public String sourceCidrBlock;

        /**
         * <p>The source port range of the outbound traffic. Valid values for a port: **1** to **65535**. Separate the first port and the last port with a forward slash (/). Examples: **1/200** and **80/80**. You cannot set this parameter to only **-1/-1**. The value -1/-1 specifies all ports.</p>
         * <br>
         * <p>>  If you set **EgressRules.N.Protocol** to **ALL** or **ICMP**, you do not need to set this parameter. In this case, all ports are available.</p>
         */
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
        /**
         * <p>The action of the inbound rule. Valid values:</p>
         * <br>
         * <p>*   **accept**: collects network traffic.</p>
         * <p>*   **drop**: does not collect network traffic.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The destination CIDR block of the inbound traffic.</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The destination port range of the inbound traffic. Valid values for a port: **1** to **65535**. Separate the first port and the last port with a forward slash (/). Examples: **1/200** and **80/80**.</p>
         * <br>
         * <p>>  If you set **IngressRules.N.Protocol** to **ALL** or **ICMP**, you do not need to set this parameter. In this case, all ports are available.</p>
         */
        @NameInMap("DestinationPortRange")
        public String destinationPortRange;

        /**
         * <p>The priority of the inbound rule. A smaller value indicates a higher priority.</p>
         * <br>
         * <p>The maximum value of **N** is **10**. You can configure up to 10 inbound rules for a filter.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol that is used by the inbound traffic to be mirrored. Valid values:</p>
         * <br>
         * <p>*   **ALL**: all protocols</p>
         * <p>*   **ICMP**: ICMP</p>
         * <p>*   **TCP**: TCP</p>
         * <p>*   **UDP**: UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of the inbound traffic.</p>
         */
        @NameInMap("SourceCidrBlock")
        public String sourceCidrBlock;

        /**
         * <p>The source port range of the inbound traffic. Valid values for a port: **1** to **65535**. Separate the first port and the last port with a forward slash (/). Examples: **1/200** and **80/80**.</p>
         * <br>
         * <p>>  If you set **IngressRules.N.Protocol** to **ALL** or **ICMP**, you do not need to set this parameter. In this case, all ports are available.</p>
         */
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

    public static class CreateTrafficMirrorFilterRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateTrafficMirrorFilterRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTrafficMirrorFilterRequestTag self = new CreateTrafficMirrorFilterRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTrafficMirrorFilterRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTrafficMirrorFilterRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
