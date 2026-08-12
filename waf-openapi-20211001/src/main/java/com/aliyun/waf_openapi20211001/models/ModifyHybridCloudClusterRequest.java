// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudClusterRequest extends TeaModel {
    /**
     * <p>The network access mode. Valid values:</p>
     * <ul>
     * <li><strong>internet</strong>: public network access.</li>
     * <li><strong>vpc</strong>: Express Connect private network access.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("AccessMode")
    public String accessMode;

    /**
     * <p>The Express Connect access region. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Hangzhou.</li>
     * <li><strong>cn-beiijng</strong>: Beijing.</li>
     * <li><strong>cn-shanghai</strong>: Shanghai.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("AccessRegion")
    public String accessRegion;

    /**
     * <p>The cluster name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-example-***</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The list of available ports for the HTTP protocol. The value is a string. If multiple ports are specified, they are returned in the format of <strong>port1,port2,port3</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80,8080</p>
     */
    @NameInMap("HttpPorts")
    public String httpPorts;

    /**
     * <p>The list of available ports for the HTTPS protocol. The value is a string. If multiple ports are specified, they are returned in the format of <strong>port1,port2,port3</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>443,8443</p>
     */
    @NameInMap("HttpsPorts")
    public String httpsPorts;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The WAF instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the current WAF instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-mp9153****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The log fields to be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>log_example</p>
     */
    @NameInMap("LogFieldsNotReturned")
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
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
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
     * <li><strong>cname</strong>: reverse proxy cluster.</li>
     * <li><strong>service</strong>: service-based cluster.</li>
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
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>remarkExample</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The Alibaba Cloud resource group ID.</p>
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
     * <p>The rule status. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("RuleStatus")
    public String ruleStatus;

    /**
     * <p>The rule type. Valid values:</p>
     * <p>bypass: bypasses security checks and directly allows the request.</p>
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
