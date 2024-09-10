// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBinarySecurityPolicyRequest extends TeaModel {
    /**
     * <p>The information about the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;ClusterId\&quot;:\&quot;cc12429dbb8f644f690b0623fb52b4737\&quot;,\&quot;Namespaces\&quot;:[\&quot;default\&quot;]},{\&quot;ClusterId\&quot;:\&quot;c9f5b93a8da8f4341b774d79fdbcedb3c\&quot;,\&quot;Namespaces\&quot;:[\&quot;default\&quot;]}]</p>
     */
    @NameInMap("Clusters")
    public String clusters;

    /**
     * <p>The name of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>mv-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The content of the policy. Specify a value in the JSON format. You can specify the following keys:</p>
     * <ul>
     * <li><strong>policyMode</strong>: the type of the policy. Default value: requireAttestor.</li>
     * <li><strong>requiredAttestors</strong>: the required witnesses.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;PolicyMode\&quot;:\&quot;requireAttestor\&quot;,\&quot;RequiredAttestors\&quot;:[\&quot;test-xcs-04-12-heyuan\&quot;]}</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>remark test</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>59.82.XXX.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The status of the policy. Valid values:</p>
     * <ul>
     * <li><strong>enable</strong></li>
     * <li><strong>disable</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateBinarySecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBinarySecurityPolicyRequest self = new CreateBinarySecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateBinarySecurityPolicyRequest setClusters(String clusters) {
        this.clusters = clusters;
        return this;
    }
    public String getClusters() {
        return this.clusters;
    }

    public CreateBinarySecurityPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBinarySecurityPolicyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CreateBinarySecurityPolicyRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateBinarySecurityPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateBinarySecurityPolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateBinarySecurityPolicyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
