// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ResetHostAccountCredentialRequest extends TeaModel {
    /**
     * <p>The type of logon credential to clear. Valid values:</p>
     * <ul>
     * <li><p><strong>Password</strong>: The password.</p>
     * </li>
     * <li><p><strong>PrivateKey</strong>: The SSH private key.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Password</p>
     */
    @NameInMap("CredentialType")
    public String credentialType;

    /**
     * <p>The ID of the host account. The logon credential of this account will be cleared.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/204372.html">ListHostAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostAccountId")
    public String hostAccountId;

    /**
     * <p>The ID of the Bastionhost instance. The instance contains the host account.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-rp640dg****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For information about region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
