// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyBinarySecurityPolicyRequest extends TeaModel {
    /**
     * <p>Cluster information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Namespaces\&quot;:[\&quot;default\&quot;],\&quot;ClusterId\&quot;:\&quot;c9f5b93a8da8f4341b77***********\&quot;},{\&quot;Namespaces\&quot;:[\&quot;default\&quot;],\&quot;ClusterId\&quot;:\&quot;cc12429dbb8f644f690b0***********\&quot;}]</p>
     */
    @NameInMap("Clusters")
    public String clusters;

    /**
     * <p>Policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-policy-04-11</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Policy content. JSON format, Key values:</p>
     * <ul>
     * <li><strong>policyMode</strong>: Type of policy, default is requireAttestor.</li>
     * <li><strong>requiredAttestors</strong>: Required attestors.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;PolicyMode\&quot;:\&quot;requireAttestor\&quot;,\&quot;RequiredAttestors\&quot;:[\&quot;test-xcs-04-11-hhht\&quot;]}</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>Remark.</p>
     * 
     * <strong>example:</strong>
     * <p>Remark</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.3.4</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>Set to enable or disable the policy. Values:</p>
     * <ul>
     * <li><strong>enabled</strong>: Enable the protection policy.</li>
     * <li><strong>disabled</strong>: Disable the protection policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static ModifyBinarySecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBinarySecurityPolicyRequest self = new ModifyBinarySecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBinarySecurityPolicyRequest setClusters(String clusters) {
        this.clusters = clusters;
        return this;
    }
    public String getClusters() {
        return this.clusters;
    }

    public ModifyBinarySecurityPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyBinarySecurityPolicyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public ModifyBinarySecurityPolicyRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModifyBinarySecurityPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyBinarySecurityPolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyBinarySecurityPolicyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
