// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateHybridCloudClusterRequest extends TeaModel {
    /**
     * <p>The network access mode. Valid values:</p>
     * <ul>
     * <li><strong>internet</strong>: Internet access.</li>
     * <li><strong>vpc</strong>: Private network access over Express Connect.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("AccessMode")
    public String accessMode;

    /**
     * <p>The region for Express Connect access. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Hangzhou.</li>
     * <li><strong>cn-beiijng</strong>: Beijing.</li>
     * <li><strong>cn-shanghai</strong>: Shanghai.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AccessRegion")
    public String accessRegion;

    /**
     * <p>The name of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The list of available ports for the HTTP protocol. The value is a string. If multiple ports are specified, use the <strong>port1,port2,port3</strong> format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80,8080</p>
     */
    @NameInMap("HttpPorts")
    public String httpPorts;

    /**
     * <p>The list of available ports for the HTTPS protocol. The value is a string. If multiple ports are specified, use the <strong>port1,port2,port3</strong> format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>443,8443</p>
     */
    @NameInMap("HttpsPorts")
    public String httpsPorts;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <blockquote>
     * <p><strong>[Deprecated]</strong> This parameter is deprecated and no longer returns meaningful data.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>deprecated</p>
     */
    @NameInMap("LogFieldsNotReturned")
    @Deprecated
    public String logFieldsNotReturned;

    /**
     * <p>The number of protection nodes that can be added to the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProtectionServerCount")
    public Integer protectionServerCount;

    /**
     * <p>The proxy gateway mode. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enabled.</li>
     * <li><strong>off</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("ProxyStatus")
    public String proxyStatus;

    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li><strong>cname</strong>: Reverse proxy cluster.</li>
     * <li><strong>service</strong>: Service cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cname</p>
     */
    @NameInMap("ProxyType")
    public String proxyType;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: The Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: Outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The remark.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The rule configuration.</p>
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
     * <p>The manual bypass status. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enabled.</li>
     * <li><strong>off</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleStatus")
    public String ruleStatus;

    /**
     * <p>The rule type. Valid values:</p>
     * <ul>
     * <li><strong>bypass</strong>: Skips security checks and directly allows traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bypass</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static CreateHybridCloudClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridCloudClusterRequest self = new CreateHybridCloudClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateHybridCloudClusterRequest setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

    public CreateHybridCloudClusterRequest setAccessRegion(String accessRegion) {
        this.accessRegion = accessRegion;
        return this;
    }
    public String getAccessRegion() {
        return this.accessRegion;
    }

    public CreateHybridCloudClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateHybridCloudClusterRequest setHttpPorts(String httpPorts) {
        this.httpPorts = httpPorts;
        return this;
    }
    public String getHttpPorts() {
        return this.httpPorts;
    }

    public CreateHybridCloudClusterRequest setHttpsPorts(String httpsPorts) {
        this.httpsPorts = httpsPorts;
        return this;
    }
    public String getHttpsPorts() {
        return this.httpsPorts;
    }

    public CreateHybridCloudClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    @Deprecated
    public CreateHybridCloudClusterRequest setLogFieldsNotReturned(String logFieldsNotReturned) {
        this.logFieldsNotReturned = logFieldsNotReturned;
        return this;
    }
    public String getLogFieldsNotReturned() {
        return this.logFieldsNotReturned;
    }

    public CreateHybridCloudClusterRequest setProtectionServerCount(Integer protectionServerCount) {
        this.protectionServerCount = protectionServerCount;
        return this;
    }
    public Integer getProtectionServerCount() {
        return this.protectionServerCount;
    }

    public CreateHybridCloudClusterRequest setProxyStatus(String proxyStatus) {
        this.proxyStatus = proxyStatus;
        return this;
    }
    public String getProxyStatus() {
        return this.proxyStatus;
    }

    public CreateHybridCloudClusterRequest setProxyType(String proxyType) {
        this.proxyType = proxyType;
        return this;
    }
    public String getProxyType() {
        return this.proxyType;
    }

    public CreateHybridCloudClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHybridCloudClusterRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateHybridCloudClusterRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateHybridCloudClusterRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public CreateHybridCloudClusterRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    public CreateHybridCloudClusterRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
