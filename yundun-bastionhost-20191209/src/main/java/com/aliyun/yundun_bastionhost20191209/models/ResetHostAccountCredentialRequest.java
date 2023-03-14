// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ResetHostAccountCredentialRequest extends TeaModel {
    /**
     * <p>The type of the logon credential that you want to delete. Valid values:</p>
     * <br>
     * <p>*   **Password**: You want to delete the password.</p>
     * <p>*   **PrivateKey**: You want to delete the SSH private key.</p>
     */
    @NameInMap("CredentialType")
    public String credentialType;

    /**
     * <p>The ID of the host account for which the logon credential is to be deleted.</p>
     * <br>
     * <p>>  You can call the [ListHostAccounts](~~204372~~) operation to query the ID of the host account.</p>
     */
    @NameInMap("HostAccountId")
    public String hostAccountId;

    /**
     * <p>The ID of the Bastionhost instance where you want to delete the logon credential for the host account.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the Bastionhost instance where you want to delete the logon credential for the host account.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
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
