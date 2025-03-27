// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventTopNMetricRequest extends TeaModel {
    /**
     * <p>The filter parameters for the query. Multiple parameters are evaluated by using a logical AND.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public DescribeSecurityEventTopNMetricRequestFilter filter;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/140857.html">DescribeInstanceInfo</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of data entries that can be returned. Data entries are sorted in descending order before they are returned. Maximum value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>The metric whose top N data entries you want to return. The following metrics are supported:</p>
     * <blockquote>
     * <p> For more information about attack requests, see the &quot;Usage notes&quot; section of this topic.</p>
     * </blockquote>
     * <ul>
     * <li>real_client_ip: The system aggregates the source IP addresses of attack requests to collect statistics, sorts the statistical results in descending order, and returns top N data entries.</li>
     * <li>http_user_agent: The system aggregates the User-Agent header field of attack requests to collect statistics, sorts the statistical results in descending order, and returns top N data entries.</li>
     * <li>matched_host: The system aggregates the protected objects that are matched by attack requests to collect statistics, sorts the statistical results in descending order, and returns top N data entries.</li>
     * <li>remote_region_id: The system aggregates the countries to which the source IP addresses of attack requests belong to collect statistics, sorts the statistical results in descending order, and returns top N data entries.</li>
     * <li>request_path: The system aggregates the URLs of attack requests to collect statistics, sorts the statistical results in descending order, and returns top N data entries. The URLs exclude query strings.</li>
     * <li>block_defense_scene: The system aggregates the protection modules that block attack requests to collect statistics, sorts the statistical results in descending order, and returns top N data entries. The requests match protection rules whose actions are not set to Monitor.</li>
     * <li>defense_scene: The system aggregates the protection modules that are matched by attack requests to collect statistics, sorts the statistical results in descending order, and returns top N data entries.</li>
     * <li>defense_scene_rule_id: The system returns the IDs of top N protection rules that are matched by attack requests and also the related protection modules. Only protection rules whose actions are not set to Monitor are counted. The system returns the value in the following format:\
     * <code>{ &quot;Attribute&quot;: &quot;waf_base&quot;, &quot;Value&quot;: 140, &quot;Name&quot;: &quot;111034&quot; }</code></li>
     * <li>defense_scene_with_rule_id: The system returns the IDs of top N protection rules that are matched by attack requests and also the related protection modules. The IDs and protection modules are connected by using hyphens (-). Protection rules whose actions are set to Monitor and Block are counted. The system returns the value in the following format:\
     * <code>{ &quot;Attribute&quot;: &quot;&quot;, &quot;Value&quot;: 1, &quot;Name&quot;: &quot;120075-waf_base&quot; }</code></li>
     * <li>defense_scene_top_rule_id: The system returns top N matched protection rules of a specific protection module. You can specify Conditions in Filter to configure filter conditions. For example, you can use the following condition to query top N matched protection rules of the custom rule module:\
     * <code>{ &quot;Key&quot;: &quot;defense_scene_map&quot;, &quot;OpValue&quot;: &quot;contain&quot;, &quot;Values&quot;: &quot;custom_acl&quot; }</code></li>
     * <li>defense_scene_rule_type: The system returns top N matched protection rules of the core web protection module. This metric is supported only by the core web protection module because only this module supports subtypes of protection rules. You must specify Conditions in Filter to configure filter conditions. Example:\
     * <code>{ &quot;Key&quot;: &quot;defense_scene&quot;, &quot;OpValue&quot;: &quot;eq&quot;, &quot;Values&quot;: &quot;waf_base&quot; }</code></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>real_client_ip</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The region ID of the WAF instance. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: The Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: Outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
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

    public static DescribeSecurityEventTopNMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventTopNMetricRequest self = new DescribeSecurityEventTopNMetricRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventTopNMetricRequest setFilter(DescribeSecurityEventTopNMetricRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public DescribeSecurityEventTopNMetricRequestFilter getFilter() {
        return this.filter;
    }

    public DescribeSecurityEventTopNMetricRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSecurityEventTopNMetricRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeSecurityEventTopNMetricRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeSecurityEventTopNMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSecurityEventTopNMetricRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static class DescribeSecurityEventTopNMetricRequestFilterConditions extends TeaModel {
        /**
         * <p>The field name. This operation supports all fields.</p>
         * 
         * <strong>example:</strong>
         * <p>matched_host</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter operator.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("OpValue")
        public String opValue;

        /**
         * <p>The field content.</p>
         * 
         * <strong>example:</strong>
         * <p>test.waf-top</p>
         */
        @NameInMap("Values")
        public Object values;

        public static DescribeSecurityEventTopNMetricRequestFilterConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventTopNMetricRequestFilterConditions self = new DescribeSecurityEventTopNMetricRequestFilterConditions();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventTopNMetricRequestFilterConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSecurityEventTopNMetricRequestFilterConditions setOpValue(String opValue) {
            this.opValue = opValue;
            return this;
        }
        public String getOpValue() {
            return this.opValue;
        }

        public DescribeSecurityEventTopNMetricRequestFilterConditions setValues(Object values) {
            this.values = values;
            return this;
        }
        public Object getValues() {
            return this.values;
        }

    }

    public static class DescribeSecurityEventTopNMetricRequestFilterDateRange extends TeaModel {
        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888600</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888000</p>
         */
        @NameInMap("StartDate")
        public Long startDate;

        public static DescribeSecurityEventTopNMetricRequestFilterDateRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventTopNMetricRequestFilterDateRange self = new DescribeSecurityEventTopNMetricRequestFilterDateRange();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventTopNMetricRequestFilterDateRange setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeSecurityEventTopNMetricRequestFilterDateRange setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeSecurityEventTopNMetricRequestFilter extends TeaModel {
        /**
         * <p>The filter conditions. Multiple conditions are evaluated by using a logical AND.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeSecurityEventTopNMetricRequestFilterConditions> conditions;

        /**
         * <p>The time range for the query.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DateRange")
        public DescribeSecurityEventTopNMetricRequestFilterDateRange dateRange;

        public static DescribeSecurityEventTopNMetricRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventTopNMetricRequestFilter self = new DescribeSecurityEventTopNMetricRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventTopNMetricRequestFilter setConditions(java.util.List<DescribeSecurityEventTopNMetricRequestFilterConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeSecurityEventTopNMetricRequestFilterConditions> getConditions() {
            return this.conditions;
        }

        public DescribeSecurityEventTopNMetricRequestFilter setDateRange(DescribeSecurityEventTopNMetricRequestFilterDateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        public DescribeSecurityEventTopNMetricRequestFilterDateRange getDateRange() {
            return this.dateRange;
        }

    }

}
