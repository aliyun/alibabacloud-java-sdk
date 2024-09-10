// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportWarningRequest extends TeaModel {
    /**
     * <p>Specifies whether the baseline risks are handled. Valid values:</p>
     * <ul>
     * <li><strong>Y</strong>: yes</li>
     * <li><strong>N</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The type of the export task. Set the value to <strong>hc_check_warning</strong>, which indicates tasks to export baseline check results.</p>
     * 
     * <strong>example:</strong>
     * <p>hc_check_warning</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>The ID of the server group.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of server groups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>13007754</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The export method of the results for the weak password baseline check. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: exports the check results after it is masked.</li>
     * <li><strong>1</strong>: exports the check results in plaintext.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsCleartextPwd")
    public Integer isCleartextPwd;

    /**
     * <p>Specifies whether the baseline check results are aggregated and exported. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsSummaryExport")
    public Integer isSummaryExport;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the risk item in the baseline check results. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>123,124</p>
     */
    @NameInMap("RiskIds")
    public String riskIds;

    /**
     * <p>The severity of the baseline check item. Separate multiple severities with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>high</strong></li>
     * <li><strong>medium</strong></li>
     * <li><strong>low</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high,medium</p>
     */
    @NameInMap("RiskLevels")
    public String riskLevels;

    /**
     * <p>The name of the baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud Standard - Windows 2016/2019  Security Baseline</p>
     */
    @NameInMap("RiskName")
    public String riskName;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The status of the check item in the baseline check results. Separate multiple statuses with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>3</strong>: passed</li>
     * <li><strong>1</strong>: failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1,3</p>
     */
    @NameInMap("StatusList")
    public String statusList;

    /**
     * <p>The ID of the baseline check policy.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>The subtypes of the baselines based on which baseline checks are performed. Separate multiple subtypes with commas (,).</p>
     * <blockquote>
     * <p>You must set the value of this parameter to the value of the <strong>TypeName</strong> parameter that is contained in the <strong>SubTypes</strong> parameter. You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to obtain the value of the TypeName parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hc_middleware_ack_master</p>
     */
    @NameInMap("SubTypeNames")
    public String subTypeNames;

    /**
     * <p>The type of the baseline based on which baseline checks are performed.</p>
     * <blockquote>
     * <p>You must set the value of this parameter to the value of the <strong>TypeName</strong> parameter that is returned by calling the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation. If both the <strong>TypeName</strong> and <strong>TypeNames</strong> parameters are specified, only the <strong>TypeName</strong> parameter takes effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hc_container</p>
     */
    @NameInMap("TypeName")
    public String typeName;

    /**
     * <p>The types of the baselines based on which baseline checks are performed. Separate multiple types with commas (,).</p>
     * <blockquote>
     * <p>You must set the value of this parameter to the value of the <strong>TypeName</strong> parameter that is returned by calling the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation. If both the <strong>TypeName</strong> and <strong>TypeNames</strong> parameters are specified, only the <strong>TypeName</strong> parameter takes effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hc_container,cis</p>
     */
    @NameInMap("TypeNames")
    public String typeNames;

    /**
     * <p>The UUID of the server whose baseline check results you want to export. Separate multiple UUIDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>inet-7c676676-06fa-442e-90fb-b802e****,inet-7c676676-06fa-442e-90fb-b****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static ExportWarningRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportWarningRequest self = new ExportWarningRequest();
        return TeaModel.build(map, self);
    }

    public ExportWarningRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public ExportWarningRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public ExportWarningRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ExportWarningRequest setIsCleartextPwd(Integer isCleartextPwd) {
        this.isCleartextPwd = isCleartextPwd;
        return this;
    }
    public Integer getIsCleartextPwd() {
        return this.isCleartextPwd;
    }

    public ExportWarningRequest setIsSummaryExport(Integer isSummaryExport) {
        this.isSummaryExport = isSummaryExport;
        return this;
    }
    public Integer getIsSummaryExport() {
        return this.isSummaryExport;
    }

    public ExportWarningRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExportWarningRequest setRiskIds(String riskIds) {
        this.riskIds = riskIds;
        return this;
    }
    public String getRiskIds() {
        return this.riskIds;
    }

    public ExportWarningRequest setRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }
    public String getRiskLevels() {
        return this.riskLevels;
    }

    public ExportWarningRequest setRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }
    public String getRiskName() {
        return this.riskName;
    }

    public ExportWarningRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ExportWarningRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public ExportWarningRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

    public ExportWarningRequest setSubTypeNames(String subTypeNames) {
        this.subTypeNames = subTypeNames;
        return this;
    }
    public String getSubTypeNames() {
        return this.subTypeNames;
    }

    public ExportWarningRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public ExportWarningRequest setTypeNames(String typeNames) {
        this.typeNames = typeNames;
        return this;
    }
    public String getTypeNames() {
        return this.typeNames;
    }

    public ExportWarningRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
