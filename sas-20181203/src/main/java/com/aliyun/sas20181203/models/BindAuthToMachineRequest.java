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
     * <li><strong>10</strong>: Value-added Service Edition.</li>
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
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <p>The UUIDs of the servers to bind.</p>
     * <blockquote>
     * <p><strong>Bind</strong> and <strong>UnBind</strong> cannot both be empty.</p>
     * </blockquote>
     */
    @NameInMap("Bind")
    public java.util.List<String> bind;

    /**
     * <p>Specifies whether to bind all assets. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Bind all assets.</li>
     * <li><strong>false</strong>: Do not bind all assets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BindAll")
    public Boolean bindAll;

    /**
     * <p>The search conditions for assets. This parameter is in JSON format. Note that the parameter values are case-sensitive.</p>
     * <blockquote>
     * <p>You can search for assets by instance ID, instance name, VPC ID, region, or public IP address. Call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;internetIp&quot;,&quot;value&quot;:&quot;1.2.XX.XX&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>Specifies whether this is a pre-binding operation. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No.</li>
     * <li><strong>1</strong>: Yes.</li>
     * </ul>
     * <blockquote>
     * <p>After pre-binding is enabled, the corresponding authorization quota is automatically bound to the specified servers after the purchase is completed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsPreBind")
    public Integer isPreBind;

    /**
     * <p>The logical relationship among multiple search conditions. Default value: <strong>OR</strong>. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The search conditions are evaluated with a logical OR.</li>
     * <li><strong>AND</strong>: The search conditions are evaluated with a logical AND.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The order version associated with the pre-binding. Valid values:</p>
     * <ul>
     * <li><strong>level7</strong>: Anti-virus Edition</li>
     * <li><strong>level3</strong>: Advanced Edition</li>
     * <li><strong>level2</strong>: Enterprise Edition</li>
     * <li><strong>level8</strong>: Ultimate Edition</li>
     * <li><strong>level10</strong>: Value-added service only.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>level2</p>
     */
    @NameInMap("NtmVersion")
    public String ntmVersion;

    /**
     * <p>The order ID associated with the pre-binding.</p>
     * 
     * <strong>example:</strong>
     * <p>233016**0482</p>
     */
    @NameInMap("PreBindOrderId")
    public Long preBindOrderId;

    /**
     * <p>The ID of the member accounts in the resource folder (Alibaba Cloud account).</p>
     * <blockquote>
     * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16670360956*****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The UUIDs of the servers to unbind.</p>
     * <blockquote>
     * <p><strong>Bind</strong> and <strong>UnBind</strong> cannot both be empty.</p>
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

    public BindAuthToMachineRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
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
