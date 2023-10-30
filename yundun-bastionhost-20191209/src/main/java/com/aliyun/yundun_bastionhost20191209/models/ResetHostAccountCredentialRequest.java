// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ResetHostAccountCredentialRequest extends TeaModel {
    /**
     * <p>ResetHostAccountCredential</p>
     */
    @NameInMap("CredentialType")
    public String credentialType;

    /**
     * <p>WB662865</p>
     */
    @NameInMap("HostAccountId")
    public String hostAccountId;

    /**
     * <p>Deletes the logon credential of a specified host account of a specified Bastionhost instance. The logon credential can be the password or SSH private key.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>ResetHostAccountCredential</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ResetHostAccountCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetHostAccountCredentialRequest self = new ResetHostAccountCredentialRequest();
        return TeaModel.build(map, self);
    }

    public ResetHostAccountCredentialRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public ResetHostAccountCredentialRequest setHostAccountId(String hostAccountId) {
        this.hostAccountId = hostAccountId;
        return this;
    }
    public String getHostAccountId() {
        return this.hostAccountId;
    }

    public ResetHostAccountCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResetHostAccountCredentialRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
