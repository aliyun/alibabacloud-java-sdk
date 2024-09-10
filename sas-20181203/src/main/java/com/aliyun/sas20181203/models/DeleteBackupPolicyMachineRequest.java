// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBackupPolicyMachineRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to query the IDs of anti-ransomware policies.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The version of the anti-ransomware policy. Valid values:</p>
     * <ul>
     * <li><strong>1.0.0</strong></li>
     * <li><strong>2.0.0</strong></li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to query the versions of anti-ransomware policies.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    /**
     * <p>The UUID of the server to which the anti-ransomware policy is applied.</p>
     * <blockquote>
     * <p>You must specify at least one of the <code>UuidList</code> and <code>Uuid</code> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>083036e9-8411-4a9d-83af-9acbd****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The UUIDs of the servers to which the anti-ransomware policy is applied.</p>
     * <blockquote>
     * <p>You must specify at least one of the <code>UuidList</code> and <code>Uuid</code> parameters.</p>
     * </blockquote>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static DeleteBackupPolicyMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupPolicyMachineRequest self = new DeleteBackupPolicyMachineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupPolicyMachineRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public DeleteBackupPolicyMachineRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public DeleteBackupPolicyMachineRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DeleteBackupPolicyMachineRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
