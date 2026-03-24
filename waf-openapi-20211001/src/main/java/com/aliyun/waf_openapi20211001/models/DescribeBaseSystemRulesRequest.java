// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBaseSystemRulesRequest extends TeaModel {
    /**
     * <p>The type of attack that the system protection rule detects. Valid values:</p>
     * <ul>
     * <li><p><strong>sqli</strong>: SQL injection.</p>
     * </li>
     * <li><p><strong>xss</strong>: cross-site scripting (XSS).</p>
     * </li>
     * <li><p><strong>cmdi</strong>: OS command injection.</p>
     * </li>
     * <li><p><strong>expression_injection</strong>: expression injection.</p>
     * </li>
     * <li><p><strong>java_deserialization</strong>: Java deserialization.</p>
     * </li>
     * <li><p><strong>dot_net_deserialization</strong>: .NET deserialization.</p>
     * </li>
     * <li><p><strong>php_deserialization</strong>: PHP deserialization.</p>
     * </li>
     * <li><p><strong>code_exec</strong>: code execution.</p>
     * </li>
     * <li><p><strong>ssrf</strong>: server-side request forgery (SSRF).</p>
     * </li>
     * <li><p><strong>path_traversal</strong>: path traversal.</p>
     * </li>
     * <li><p><strong>arbitrary_file_uploading</strong>: arbitrary file upload.</p>
     * </li>
     * <li><p><strong>webshell</strong>: webshell.</p>
     * </li>
     * <li><p><strong>rfilei</strong>: remote file inclusion (RFI).</p>
     * </li>
     * <li><p><strong>lfilei</strong>: local file inclusion (LFI).</p>
     * </li>
     * <li><p><strong>protocol_violation</strong>: protocol violation.</p>
     * </li>
     * <li><p><strong>scanner_behavior</strong>: scanner behavior.</p>
     * </li>
     * <li><p><strong>logic_flaw</strong>: logic flaw.</p>
     * </li>
     * <li><p><strong>arbitrary_file_reading</strong>: arbitrary file read.</p>
     * </li>
     * <li><p><strong>arbitrary_file_download</strong>: arbitrary file download.</p>
     * </li>
     * <li><p><strong>xxe</strong>: external entity injection.</p>
     * </li>
     * <li><p><strong>csrf</strong>: cross-site request forgery (CSRF).</p>
     * </li>
     * <li><p><strong>crlf</strong>: CRLF injection.</p>
     * </li>
     * <li><p><strong>other</strong>: other.</p>
     * </li>
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
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of your WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
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
     * <p>The risk level of the system protection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>super_strict</strong>: Very Strict.</p>
     * </li>
     * <li><p><strong>strict</strong>: Strict.</p>
     * </li>
     * <li><p><strong>medium</strong>: Medium.</p>
     * </li>
     * <li><p><strong>loose</strong>: Loose.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>loose</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The action of the system protection rule. Valid values:</p>
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
     * <p>The name of the system protection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>systemRuleTest</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The status of the system protection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: disabled.</p>
     * </li>
     * <li><p><strong>0</strong>: enabled.</p>
     * </li>
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
     * <li><p>Specify this parameter to query the system protection rules in a specific WAF protection template.</p>
     * </li>
     * <li><p>If you leave this parameter empty, the default configurations of the system protection rules are queried.</p>
     * </li>
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
