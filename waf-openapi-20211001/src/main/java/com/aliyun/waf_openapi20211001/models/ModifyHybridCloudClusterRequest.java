// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudClusterRequest extends TeaModel {
    /**
     * <p>The network access mode of the hybrid cloud cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>internet</strong>: access over the Internet.</p>
     * </li>
     * <li><p><strong>vpc</strong>: access over a leased line through a virtual private cloud (VPC).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("AccessMode")
    public String accessMode;

    /**
     * <p>The region in which the leased line resides. This parameter is required when AccessMode is set to vpc. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: Hangzhou.</p>
     * </li>
     * <li><p><strong>cn-beijing</strong>: Beijing.</p>
     * </li>
     * <li><p><strong>cn-shanghai</strong>: Shanghai.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("AccessRegion")
    public String accessRegion;

    /**
     * <p>The name of the hybrid cloud cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-example-***</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The list of HTTP ports supported by the hybrid cloud cluster. Separate multiple ports with commas (,). Format: <strong>port1,port2,port3</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80,8080</p>
     */
    @NameInMap("HttpPorts")
    public String httpPorts;

    /**
     * <p>The list of HTTPS ports supported by the hybrid cloud cluster. Separate multiple ports with commas (,). Format: <strong>port1,port2,port3</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>443,8443</p>
     */
    @NameInMap("HttpsPorts")
    public String httpsPorts;

    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-mp9153****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The log fields that are excluded from the response.</p>
     * 
     * <strong>example:</strong>
     * <p>log_example</p>
     */
    @NameInMap("LogFieldsNotReturned")
    public String logFieldsNotReturned;

    /**
     * <p>The maximum number of protection nodes that can be added to the hybrid cloud cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProtectionServerCount")
    public Integer protectionServerCount;

    /**
     * <p>Indicates whether the proxy gateway is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: The proxy gateway is enabled.</p>
     * </li>
     * <li><p><strong>off</strong>: The proxy gateway is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("ProxyStatus")
    public String proxyStatus;

    /**
     * <p>The type of the hybrid cloud cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>cname</strong>: a reverse proxy cluster.</p>
     * </li>
     * <li><p><strong>service</strong>: a service cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>service</p>
     */
    @NameInMap("ProxyType")
    public String proxyType;

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
     * <p>The remarks of the hybrid cloud cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>remarkExample</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the Alibaba Cloud resource group to which the WAF instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The rule configuration in JSON format. This includes settings such as the circuit breaker, request body length limit, and timeout.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;enable&quot;: true,
     *       &quot;param&quot;: {
     *             &quot;breaker&quot;: {
     *                   &quot;duration&quot;: 1,
     *                   &quot;failed&quot;: 1,
     *                   &quot;recent_failed&quot;: 1
     *             },
     *             &quot;disable_protect&quot;: false,
     *             &quot;max_request_body_len&quot;: 1,
     *             &quot;timeout&quot;: 1
     *       }
     * }</p>
     */
    @NameInMap("RuleConfig")
    public String ruleConfig;

    /**
     * <p>Indicates whether the rule is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: The rule is enabled.</p>
     * </li>
     * <li><p><strong>off</strong>: The rule is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("RuleStatus")
    public String ruleStatus;

    /**
     * <p>The rule type. Valid values:</p>
     * <ul>
     * <li><strong>bypass</strong>: WAF bypasses security checks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bypass</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static ModifyHybridCloudClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudClusterRequest self = new ModifyHybridCloudClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudClusterRequest setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

    public ModifyHybridCloudClusterRequest setAccessRegion(String accessRegion) {
        this.accessRegion = accessRegion;
        return this;
    }
    public String getAccessRegion() {
        return this.accessRegion;
    }

    public ModifyHybridCloudClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ModifyHybridCloudClusterRequest setHttpPorts(String httpPorts) {
        this.httpPorts = httpPorts;
        return this;
    }
    public String getHttpPorts() {
        return this.httpPorts;
    }

    public ModifyHybridCloudClusterRequest setHttpsPorts(String httpsPorts) {
        this.httpsPorts = httpsPorts;
        return this;
    }
    public String getHttpsPorts() {
        return this.httpsPorts;
    }

    public ModifyHybridCloudClusterRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyHybridCloudClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHybridCloudClusterRequest setLogFieldsNotReturned(String logFieldsNotReturned) {
        this.logFieldsNotReturned = logFieldsNotReturned;
        return this;
    }
    public String getLogFieldsNotReturned() {
        return this.logFieldsNotReturned;
    }

    public ModifyHybridCloudClusterRequest setProtectionServerCount(Integer protectionServerCount) {
        this.protectionServerCount = protectionServerCount;
        return this;
    }
    public Integer getProtectionServerCount() {
        return this.protectionServerCount;
    }

    public ModifyHybridCloudClusterRequest setProxyStatus(String proxyStatus) {
        this.proxyStatus = proxyStatus;
        return this;
    }
    public String getProxyStatus() {
        return this.proxyStatus;
    }

    public ModifyHybridCloudClusterRequest setProxyType(String proxyType) {
        this.proxyType = proxyType;
        return this;
    }
    public String getProxyType() {
        return this.proxyType;
    }

    public ModifyHybridCloudClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHybridCloudClusterRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModifyHybridCloudClusterRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyHybridCloudClusterRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public ModifyHybridCloudClusterRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    public ModifyHybridCloudClusterRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
