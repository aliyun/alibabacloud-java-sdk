// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindAuthToMachineRequest extends TeaModel {
    /**
     * <p>The edition of Security Center that is authorized to scan the asset. Valid values:</p>
     * <ul>
     * <li><strong>6</strong>: Anti-virus</li>
     * <li><strong>5</strong>: Advanced</li>
     * <li><strong>3</strong>: Enterprise</li>
     * <li><strong>7</strong>: Ultimate</li>
     * <li><strong>10</strong>: Value-added Plan</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("AuthVersion")
    public Integer authVersion;

    /**
     * <p>Specifies whether to automatically bind servers to Security Center. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <p>The UUIDs of the servers that you want to bind to Security Center.</p>
     * <blockquote>
     * <p> You must specify at least one of the <strong>Bind</strong> and <strong>UnBind</strong> parameters.</p>
     * </blockquote>
     */
    @NameInMap("Bind")
    public java.util.List<String> bind;

    /**
     * <p>Specifies whether to bind all servers to Security Center. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BindAll")
    public Boolean bindAll;

    /**
     * <p>The search conditions that are used to filter servers. The value of this parameter is in the JSON format and is case-sensitive.</p>
     * <blockquote>
     * <p> A search condition can be an instance ID, instance name, virtual private cloud (VPC) ID, region, or public IP address. You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;internetIp&quot;,&quot;value&quot;:&quot;1.2.XX.XX&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>Specifies whether to specify servers for protection when you purchase Security Center. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * <blockquote>
     * <p> If you specify servers, the servers are automatically added to Security Center for protection after the purchase order is complete.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsPreBind")
    public Integer isPreBind;

    /**
     * <p>The logical relationship that you want to use to evaluate multiple search conditions. Default value: <strong>OR</strong>. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong></li>
     * <li><strong>AND</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The edition of Security Center that you purchase in the order. Valid values:</p>
     * <ul>
     * <li><strong>level7</strong>: Anti-virus</li>
     * <li><strong>level3</strong>: Advanced</li>
     * <li><strong>level2</strong>: Enterprise</li>
     * <li><strong>level8</strong>: Ultimate</li>
     * <li><strong>level10</strong>: Value-added Plan</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>level2</p>
     */
    @NameInMap("NtmVersion")
    public String ntmVersion;

    /**
     * <p>The ID of the order in which Security Center is purchased and servers are specified for protection.</p>
     * 
     * <strong>example:</strong>
     * <p>233016**0482</p>
     */
    @NameInMap("PreBindOrderId")
    public Long preBindOrderId;

    /**
     * <p>The UUIDs of the servers that you want to unbind from Security Center.</p>
     * <blockquote>
     * <p> You must specify at least one of the <strong>Bind</strong> and <strong>UnBind</strong> parameters.</p>
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

    public BindAuthToMachineRequest setUnBind(java.util.List<String> unBind) {
        this.unBind = unBind;
        return this;
    }
    public java.util.List<String> getUnBind() {
        return this.unBind;
    }

}
