// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallBackupClientRequest extends TeaModel {
    /**
     * <p>The version of the anti-ransomware policy. Valid values:</p>
     * <ul>
     * <li><strong>1.0.0</strong></li>
     * <li><strong>2.0.0</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    /**
     * <p>The UUID of the server on which you want to install the anti-ransomware agent.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers. You must specify at least one of the UuidList and Uuid parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>inet-617eddab-7df4-4a51-b217-a3f59194****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The UUIDs of servers on which you want to install the anti-ransomware agent.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
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
