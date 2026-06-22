// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallBackupClientRequest extends TeaModel {
    /**
     * <p>The version of the mitigation policies. Valid values:</p>
     * <ul>
     * <li><strong>1.0.0</strong>: The version of the mitigation policies is 1.0.0.</li>
     * <li><strong>2.0.0</strong>: The version of the mitigation policies is 2.0.0.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    /**
     * <p>The UUID of the server on which you want to install the anti-ransomware client.</p>
     * <blockquote>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain this value. UuidList and Uuid cannot both be empty.</p>
     * </blockquote>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>inet-617eddab-7df4-4a51-b217-a3f59194****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The list of UUIDs of the servers that you want to protect.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;, &quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;]</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static InstallBackupClientRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallBackupClientRequest self = new InstallBackupClientRequest();
        return TeaModel.build(map, self);
    }

    public InstallBackupClientRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public InstallBackupClientRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public InstallBackupClientRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
