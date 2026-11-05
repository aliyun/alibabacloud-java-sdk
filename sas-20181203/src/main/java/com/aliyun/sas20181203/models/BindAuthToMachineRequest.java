// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindAuthToMachineRequest extends TeaModel {
    /**
     * <p>The authorization version of the asset. Valid values:</p>
     * <ul>
     * <li><strong>6</strong>: Anti-virus Edition</li>
     * <li><strong>5</strong>: Advanced Edition</li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>7</strong>: Ultimate Edition</li>
     * <li><strong>10</strong>: Value-added Service Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("AuthVersion")
    public Integer authVersion;

    /**
     * <p>Specifies whether to enable automatic binding. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled</li>
     * <li><strong>1</strong>: Enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <p>The set of UUIDs to be bound.</p>
     * <blockquote>
     * <p><strong>Bind</strong> and <strong>UnBind</strong> cannot be empty at the same time.</p>
     * </blockquote>
     */
    @NameInMap("Bind")
    public java.util.List<String> bind;

    /**
     * <p>Specifies whether to bind all assets. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes</li>
     * <li><strong>false</strong>: No</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BindAll")
    public Boolean bindAll;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You must use different tokens for different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Sets the conditions for searching assets. This parameter is in JSON format. Pay attention to the case sensitivity when you specify this parameter.</p>
     * <blockquote>
     * <p>You can search for assets by using conditions such as the instance ID, instance name, VPC ID, region, and public IP address of the asset. You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;internetIp&quot;,&quot;value&quot;:&quot;1.2.XX.XX&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>Specifies whether to only precheck the request. true: only prechecks the request and does not perform the actual operation. false: performs the request normally. Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether the operation is a pre-binding operation. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No</li>
     * <li><strong>1</strong>: Yes</li>
     * </ul>
     * <blockquote>
     * <p>After pre-binding is enabled, the system automatically binds the corresponding number of licenses of the specified version to the specified servers after the purchase is completed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsPreBind")
    public Integer isPreBind;

    /**
     * <p>Specifies the logical relationship among multiple search conditions. Default value: <strong>OR</strong>. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: Specifies the <strong>OR</strong> logical relationship among multiple conditions.</li>
     * <li><strong>AND</strong>: Specifies the <strong>AND</strong> logical relationship among multiple conditions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The version of the order associated with the pre-binding operation. Valid values:</p>
     * <ul>
     * <li><strong>level7</strong>: Anti-virus Edition</li>
     * <li><strong>level3</strong>: Advanced Edition</li>
     * <li><strong>level2</strong>: Enterprise Edition</li>
     * <li><strong>level8</strong>: Ultimate Edition</li>
     * <li><strong>level10</strong>: Value-added services only</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>level2</p>
     */
    @NameInMap("NtmVersion")
    public String ntmVersion;

    /**
     * <p>The ID of the order associated with the pre-binding operation.</p>
     * 
     * <strong>example:</strong>
     * <p>233016**0482</p>
     */
    @NameInMap("PreBindOrderId")
    public Long preBindOrderId;

    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the member accounts in the resource folder. The ID is an Alibaba Cloud account ID.</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16670360956*****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The set of UUIDs to be unbound.</p>
     * <blockquote>
     * <p><strong>Bind</strong> and <strong>UnBind</strong> cannot be empty at the same time.</p>
     * </blockquote>
     */
    @NameInMap("UnBind")
    public java.util.List<String> unBind;

    public static BindAuthToMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAuthToMachineRequest self = new BindAuthToMachineRequest();
        return TeaModel.build(map, self);
    }

    public BindAuthToMachineRequest setAuthVersion(Integer authVersion) {
        this.authVersion = authVersion;
        return this;
    }
    public Integer getAuthVersion() {
        return this.authVersion;
    }

    public BindAuthToMachineRequest setAutoBind(Integer autoBind) {
        this.autoBind = autoBind;
        return this;
    }
    public Integer getAutoBind() {
        return this.autoBind;
    }

    public BindAuthToMachineRequest setBind(java.util.List<String> bind) {
        this.bind = bind;
        return this;
    }
    public java.util.List<String> getBind() {
        return this.bind;
    }

    public BindAuthToMachineRequest setBindAll(Boolean bindAll) {
        this.bindAll = bindAll;
        return this;
    }
    public Boolean getBindAll() {
        return this.bindAll;
    }

    public BindAuthToMachineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public BindAuthToMachineRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public BindAuthToMachineRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public BindAuthToMachineRequest setIsPreBind(Integer isPreBind) {
        this.isPreBind = isPreBind;
        return this;
    }
    public Integer getIsPreBind() {
        return this.isPreBind;
    }

    public BindAuthToMachineRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public BindAuthToMachineRequest setNtmVersion(String ntmVersion) {
        this.ntmVersion = ntmVersion;
        return this;
    }
    public String getNtmVersion() {
        return this.ntmVersion;
    }

    public BindAuthToMachineRequest setPreBindOrderId(Long preBindOrderId) {
        this.preBindOrderId = preBindOrderId;
        return this;
    }
    public Long getPreBindOrderId() {
        return this.preBindOrderId;
    }

    public BindAuthToMachineRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public BindAuthToMachineRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public BindAuthToMachineRequest setUnBind(java.util.List<String> unBind) {
        this.unBind = unBind;
        return this;
    }
    public java.util.List<String> getUnBind() {
        return this.unBind;
    }

}
