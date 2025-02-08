// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The type of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SSD</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>(Deprecated) Specifies whether to enable disaster recovery for the instance.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>false</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableReplication")
    public Boolean disableReplication;

    /**
     * <p>The description of the instance. The instance description must be 3 to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>the test instance</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The name of the instance. Instance naming conventions:</p>
     * <ul>
     * <li>The name can contain only letters, digits, and hyphens (-).</li>
     * <li>The name must start with a letter.</li>
     * <li>The name cannot end with a hyphen (-).</li>
     * <li>The name is case-insensitive.</li>
     * <li>The name must be 3 to 16 characters in length.</li>
     * <li>The name cannot contain the following words: ali, ay, ots, taobao, and admin.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance-test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>(Deprecated) The network type of the instance. Valid values: NORMAL and VPC_CONSOLE. Default value: NORMAL.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The types of the source from which access is allowed. By default, the following source type is allowed:</p>
     * <p>TRUST_PROXY: console</p>
     */
    @NameInMap("NetworkSourceACL")
    public java.util.List<String> networkSourceACL;

    /**
     * <p>The types of the network from which access is allowed. By default, the following network types are allowed:</p>
     * <ul>
     * <li>INTERNET: Internet</li>
     * <li>VPC: virtual private cloud (VPC)</li>
     * <li>CLASSIC: classic network</li>
     * </ul>
     */
    @NameInMap("NetworkTypeACL")
    public java.util.List<String> networkTypeACL;

    /**
     * <p>The instance policy in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;Version&quot;: &quot;1&quot;,
     *     &quot;Statement&quot;: [
     *         {
     *             &quot;Action&quot;: [
     *                 &quot;ots:<em>&quot;
     *             ],
     *             &quot;Resource&quot;: [
     *                 &quot;acs:ots:</em>:13791xxxxxxxxxxx:instance/myinstance*&quot;
     *             ],
     *             &quot;Principal&quot;: [
     *                 &quot;*&quot;
     *             ],
     *             &quot;Effect&quot;: &quot;Allow&quot;,
     *             &quot;Condition&quot;: {
     *                 &quot;StringEquals&quot;: {
     *                     &quot;ots:TLSVersion&quot;: [
     *                         &quot;1.2&quot;
     *                     ]
     *                 },
     *                 &quot;IpAddress&quot;: {
     *                     &quot;acs:SourceIp&quot;: [
     *                         &quot;192.168.0.1&quot;,
     *                         &quot;198.51.100.1&quot;
     *                     ]
     *                 }
     *             }
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxh4em5jnbcd</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateInstanceRequestTags> tags;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateInstanceRequest setDisableReplication(Boolean disableReplication) {
        this.disableReplication = disableReplication;
        return this;
    }
    public Boolean getDisableReplication() {
        return this.disableReplication;
    }

    public CreateInstanceRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public CreateInstanceRequest setNetworkSourceACL(java.util.List<String> networkSourceACL) {
        this.networkSourceACL = networkSourceACL;
        return this;
    }
    public java.util.List<String> getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    public CreateInstanceRequest setNetworkTypeACL(java.util.List<String> networkTypeACL) {
        this.networkTypeACL = networkTypeACL;
        return this;
    }
    public java.util.List<String> getNetworkTypeACL() {
        return this.networkTypeACL;
    }

    public CreateInstanceRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceRequest setTags(java.util.List<CreateInstanceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateInstanceRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateInstanceRequestTags extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p_instance</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0woauavextilfqr61</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateInstanceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestTags self = new CreateInstanceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
