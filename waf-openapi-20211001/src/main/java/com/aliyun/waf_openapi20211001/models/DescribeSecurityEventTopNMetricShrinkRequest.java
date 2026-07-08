// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventTopNMetricShrinkRequest extends TeaModel {
    /**
     * <p>The query filter conditions. Multiple filter conditions are evaluated using a logical AND.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public String filterShrink;

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
     * <p>The number of data entries to return after the statistics are sorted in descending order. Maximum value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>Specifies the type of data to return. Different Metric values correspond to different data content. The following Metric values are supported by this API operation:</p>
     * <blockquote>
     * <p>The definition of &quot;attack request&quot; is described in the API operation description. The following descriptions reference this concept.</p>
     * </blockquote>
     * <ul>
     * <li>real_client_ip: performs aggregation and sorting of the source IP addresses of attack requests in descending order, and returns the top N entries.</li>
     * <li>http_user_agent: performs aggregation and sorting of the User-Agent values of attack requests in descending order, and returns the top N entries.</li>
     * <li>matched_host: performs aggregation and sorting of the protected objects hit by attack requests in descending order, and returns the top N entries.</li>
     * <li>remote_region_id: performs aggregation and sorting of the countries to which the source IP addresses of attack requests belong in descending order, and returns the top N entries.</li>
     * <li>request_path: performs aggregation and sorting of the URLs (excluding query strings) of attack requests in descending order, and returns the top N entries.</li>
     * <li>block_defense_scene: performs aggregation and sorting of the final action modules of blocked requests (whose action is not &quot;monitor&quot;) in descending order, and returns the top N entries.</li>
     * <li>defense_scene: performs aggregation and sorting of all protection modules hit by attack requests in descending order, and returns the top N entries.</li>
     * <li>defense_scene_rule_id: queries the top rule IDs of hit non-monitor rules and the protection modules to which the rules belong. This query returns statistics only for non-monitor mode rules. The returned data format is as follows:<br>
     *  <code>{ &quot;Attribute&quot;: &quot;waf_base&quot;, &quot;Value&quot;: 140, &quot;Name&quot;: &quot;111034&quot; }</code></li>
     * <li>defense_scene_with_rule_id: returns the top N rule IDs ranked by the number of hit requests and the protection modules to which the rules belong, connected by &quot;-&quot;. This query does not distinguish between rule actions and includes both monitor rules and block rules. The returned format is as follows:<br>
     *  <code>{ &quot;Attribute&quot;: &quot;&quot;,  &quot;Value&quot;: 1,  &quot;Name&quot;: &quot;120075-waf_base&quot; }</code></li>
     * <li>defense_scene_top_rule_id: queries the top rule hits of a specific protection module. Specify filter conditions in the Conditions field of Filter. For example, to query the top rule hits of the &quot;custom ACL&quot; module, set the Conditions field as follows:<br>
     *  <code>{ &quot;Key&quot;: &quot;defense_scene_map&quot;, &quot;OpValue&quot;: &quot;contain&quot;, &quot;Values&quot;: &quot;custom_acl&quot; }</code></li>
     * <li>defense_scene_rule_type: queries the top hit rule types of the web core protection module. Only the web core protection module supports this query because only web core protection has rule child classes. Specify filter conditions in the Conditions field of Filter. The format is as follows:<br>
     * <code>    { &quot;Key&quot;: &quot;defense_scene&quot;, &quot;OpValue&quot;: &quot;eq&quot;, &quot;Values&quot;: &quot;waf_base&quot; }</code></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>real_client_ip</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: the Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Alibaba Cloud resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeSecurityEventTopNMetricShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventTopNMetricShrinkRequest self = new DescribeSecurityEventTopNMetricShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventTopNMetricShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public DescribeSecurityEventTopNMetricShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSecurityEventTopNMetricShrinkRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeSecurityEventTopNMetricShrinkRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeSecurityEventTopNMetricShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSecurityEventTopNMetricShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
