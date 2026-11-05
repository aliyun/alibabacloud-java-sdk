// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallBackupClientRequest extends TeaModel {
    /**
     * <p>The version of the protection policy. You can call the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to query the version. Valid values:</p>
     * <ul>
     * <li><strong>1.0.0</strong>: The version of the protection policy is 1.0.0.</li>
     * <li><strong>2.0.0</strong>: The version of the protection policy is 2.0.0.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    /**
     * <p>The UUID of the server from which you want to uninstall the anti-ransomware client.</p>
     * <blockquote>
     * <p>UuidList.N and UUID cannot both be empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>D0D6E6E4-CB8C-4897-B852-46AEFDA0****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The list of UUIDs of the servers from which you want to uninstall the anti-ransomware client.</p>
     * <blockquote>
     * <p>UuidList and UUID cannot both be empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;D0D6E6E4-CB8C-4897-B852-46AEFDA0****&quot;, &quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;]</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static UninstallBackupClientRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallBackupClientRequest self = new UninstallBackupClientRequest();
        return TeaModel.build(map, self);
    }

    public UninstallBackupClientRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public UninstallBackupClientRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public UninstallBackupClientRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
