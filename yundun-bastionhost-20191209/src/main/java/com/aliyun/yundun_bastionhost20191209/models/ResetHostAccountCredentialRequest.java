// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ResetHostAccountCredentialRequest extends TeaModel {
    /**
     * <p>The type of the logon credential to purge. Valid values:</p>
     * <ul>
     * <li><strong>Password</strong>: password</li>
     * <li><strong>PrivateKey</strong>: SSH private key</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Password</p>
     */
    @NameInMap("CredentialType")
    public String credentialType;

    /**
     * <p>The ID of the host account whose logon credentials you want to purge.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/204372.html">ListHostAccounts</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostAccountId")
    public String hostAccountId;

    /**
     * <p>The instance ID of the Bastionhost instance to which the host account whose logon credentials you want to purge belongs.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-rp640dg****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the Bastionhost instance to which the host account whose logon credentials you want to purge belongs.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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

    public ResetHostAccountCredentialRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ResetHostAccountCredentialRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
