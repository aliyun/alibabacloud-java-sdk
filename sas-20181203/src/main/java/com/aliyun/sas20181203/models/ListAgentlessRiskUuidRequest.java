// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRiskUuidRequest extends TeaModel {
    /**
     * <p>The page number of the current page for paging in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp1g6wxdwps7s9dz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ca_cpm_****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The public IP address of the asset to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The private IP address of the asset to query.</p>
     * 
     * <strong>example:</strong>
     * <p>172.26.XX.XX</p>
     */
    @NameInMap("IntranetIp")
    public String intranetIp;

    /**
     * <p>The language of the report. Valid values:</p>
     * <ul>
     * <li><code>zh</code>: Chinese.</li>
     * <li><code>en</code>: English.</li>
     * </ul>
     * <p>If this parameter is not specified or is left empty, a Chinese report is returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>oracle-win-001****</p>
     */
    @NameInMap("MachineName")
    public String machineName;

    /**
     * <p>The maximum number of entries to return on each page for paging in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether a risk exists. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: A risk exists.</li>
     * <li><strong>false</strong>: No risk exists.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Risk")
    public Boolean risk;

    /**
     * <p>The name of the scan target.</p>
     * 
     * <strong>example:</strong>
     * <p>source-test-obj-0****</p>
     */
    @NameInMap("TargetName")
    public String targetName;

    /**
     * <p>The object type of the scan target. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: server snapshot</li>
     * <li><strong>2</strong>: server image</li>
     * <li><strong>3</strong>: user snapshot</li>
     * <li><strong>4</strong>: custom image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TargetType")
    public Integer targetType;

    public static ListAgentlessRiskUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessRiskUuidRequest self = new ListAgentlessRiskUuidRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentlessRiskUuidRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAgentlessRiskUuidRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAgentlessRiskUuidRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListAgentlessRiskUuidRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ListAgentlessRiskUuidRequest setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public ListAgentlessRiskUuidRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListAgentlessRiskUuidRequest setMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }
    public String getMachineName() {
        return this.machineName;
    }

    public ListAgentlessRiskUuidRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentlessRiskUuidRequest setRisk(Boolean risk) {
        this.risk = risk;
        return this;
    }
    public Boolean getRisk() {
        return this.risk;
    }

    public ListAgentlessRiskUuidRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public ListAgentlessRiskUuidRequest setTargetType(Integer targetType) {
        this.targetType = targetType;
        return this;
    }
    public Integer getTargetType() {
        return this.targetType;
    }

}
