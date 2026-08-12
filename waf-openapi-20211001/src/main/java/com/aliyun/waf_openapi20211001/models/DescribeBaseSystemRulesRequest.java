// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBaseSystemRulesRequest extends TeaModel {
    /**
     * <p>The detection module. Valid values:</p>
     * <ul>
     * <li><strong>sqli</strong>: SQL injection.</li>
     * <li><strong>xss</strong>: cross-site scripting (XSS).</li>
     * <li><strong>cmdi</strong>: OS command injection.</li>
     * <li><strong>expression_injection</strong>: expression injection.</li>
     * <li><strong>java_deserialization</strong>: Java deserialization.</li>
     * <li><strong>dot_net_deserialization</strong>: .NET deserialization.</li>
     * <li><strong>php_deserialization</strong>: PHP deserialization.</li>
     * <li><strong>code_exec</strong>: code execution.</li>
     * <li><strong>ssrf</strong>: server-side request forgery (SSRF).</li>
     * <li><strong>path_traversal</strong>: path traversal.</li>
     * <li><strong>arbitrary_file_uploading</strong>: arbitrary file upload.</li>
     * <li><strong>webshell</strong>: webshell.</li>
     * <li><strong>rfilei</strong>: remote file inclusion (RFI).</li>
     * <li><strong>lfilei</strong>: local file inclusion (LFI).</li>
     * <li><strong>protocol_violation</strong>: protocol violation.</li>
     * <li><strong>scanner_behavior</strong>: scanner behavior.</li>
     * <li><strong>logic_flaw</strong>: business logic bug.</li>
     * <li><strong>arbitrary_file_reading</strong>: arbitrary file read.</li>
     * <li><strong>arbitrary_file_download</strong>: arbitrary file download.</li>
     * <li><strong>xxe</strong>: XML external entity injection.</li>
     * <li><strong>csrf</strong>: cross-site request forgery.</li>
     * <li><strong>crlf</strong>: CRLF injection.</li>
     * <li><strong>other</strong>: other.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sqli</p>
     */
    @NameInMap("DetectType")
    public String detectType;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the returned rules. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number to return in a paged query. Default value: <strong>1</strong>, which indicates the first page. This parameter is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Default value: 100. This parameter is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The risk level. Valid values:</p>
     * <ul>
     * <li><p><strong>super_strict</strong>: super strict.</p>
     * </li>
     * <li><p><strong>strict</strong>: strict.</p>
     * </li>
     * <li><p><strong>medium</strong>: medium.</p>
     * </li>
     * <li><p><strong>loose</strong>: loose.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>loose</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The rule action. Valid values:</p>
     * <ul>
     * <li><p><strong>block</strong>: Block.</p>
     * </li>
     * <li><p><strong>monitor</strong>: Monitor.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>block</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>The ID of the system protection rule to query.</p>
     * 
     * <strong>example:</strong>
     * <p>113089</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The list of system protection rule IDs to query.</p>
     */
    @NameInMap("RuleIds")
    public java.util.List<Long> ruleIds;

    /**
     * <p>The name of the system protection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>systemRuleTest</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule status. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: disabled.</li>
     * <li><strong>0</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleStatus")
    public Integer ruleStatus;

    /**
     * <p>The ID of the protection template.</p>
     * <blockquote>
     * <ul>
     * <li>You can set this parameter to query the system protection rules in a specific Web core protection rule template. Settings apply to the specified template.</li>
     * <li>If this parameter is left empty, the default configurations of system protection rules are queried.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>24354</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeBaseSystemRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBaseSystemRulesRequest self = new DescribeBaseSystemRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBaseSystemRulesRequest setDetectType(String detectType) {
        this.detectType = detectType;
        return this;
    }
    public String getDetectType() {
        return this.detectType;
    }

    public DescribeBaseSystemRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeBaseSystemRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeBaseSystemRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBaseSystemRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBaseSystemRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeBaseSystemRulesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeBaseSystemRulesRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeBaseSystemRulesRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public DescribeBaseSystemRulesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DescribeBaseSystemRulesRequest setRuleIds(java.util.List<Long> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public java.util.List<Long> getRuleIds() {
        return this.ruleIds;
    }

    public DescribeBaseSystemRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeBaseSystemRulesRequest setRuleStatus(Integer ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public Integer getRuleStatus() {
        return this.ruleStatus;
    }

    public DescribeBaseSystemRulesRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
