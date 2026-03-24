// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventTopNMetricRequest extends TeaModel {
    /**
     * <p>The filter conditions for the query. A logical AND operator is used between multiple filter conditions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public DescribeSecurityEventTopNMetricRequestFilter filter;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries to return. The entries are sorted in descending order. Maximum value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>Specifies the content of the returned data. Different metrics correspond to different data content. This operation supports the following metrics:</p>
     * <blockquote>
     * <p>For the definition of an attack request, see the Description section of this topic. The following descriptions use this definition.</p>
     * </blockquote>
     * <ul>
     * <li><p>real_client_ip: Aggregates the source IP addresses of attack requests, sorts them in descending order, and returns the top N results.</p>
     * </li>
     * <li><p>http_user_agent: Aggregates the User-Agent headers of attack requests, sorts them in descending order, and returns the top N results.</p>
     * </li>
     * <li><p>matched_host: Aggregates the protected objects that are hit by attack requests, sorts them in descending order, and returns the top N results.</p>
     * </li>
     * <li><p>remote_region_id: Aggregates the countries of origin for the source IP addresses of attack requests, sorts them in descending order, and returns the top N results.</p>
     * </li>
     * <li><p>request_path: Aggregates the URLs of attack requests, excluding query strings, sorts them in descending order, and returns the top N results.</p>
     * </li>
     * <li><p>block_defense_scene: Aggregates the final protection modules that handled blocked requests, sorts them in descending order, and returns the top N results. Blocked requests are requests whose action is not Monitor.</p>
     * </li>
     * <li><p>defense_scene: Aggregates all protection modules that are hit by attack requests, sorts them in descending order, and returns the top N results.</p>
     * </li>
     * <li><p>defense_scene_rule_id: Queries the top rule IDs of hit rules that are not in Monitor mode and their corresponding protection modules. This query returns statistics only for rules that are not in Monitor mode. The data is returned in the following format:<br>
     * <code>{ &quot;Attribute&quot;: &quot;waf_base&quot;, &quot;Value&quot;: 140, &quot;Name&quot;: &quot;111034&quot; }</code><br></p>
     * </li>
     * <li><p>defense_scene_with_rule_id: Returns the top N rule IDs based on the number of hits and their corresponding protection modules. The rule ID and module are connected by a hyphen (-). This query includes rules in both Monitor and Block modes. The data is returned in the following format:<br>
     * <code>{ &quot;Attribute&quot;: &quot;&quot;, &quot;Value&quot;: 1, &quot;Name&quot;: &quot;120075-waf_base&quot; }</code><br></p>
     * </li>
     * <li><p>defense_scene_top_rule_id: Queries the top rules that are hit in a specific protection module. Specify a filter condition in the Conditions field of the Filter parameter. For example, to query the top rules that are hit in the custom access control list (ACL) module, set the Conditions field as follows:<br>
     * <code>{ &quot;Key&quot;: &quot;defense_scene_map&quot;, &quot;OpValue&quot;: &quot;contain&quot;, &quot;Values&quot;: &quot;custom_acl&quot; }</code><br></p>
     * </li>
     * <li><p>defense_scene_rule_type: Queries the top rule types that are hit in the core web protection module. Only the core web protection module supports this query because it is the only module that has rule subtypes. Specify a filter condition in the Conditions field of the Filter parameter as follows:<br>
     * <code>{ &quot;Key&quot;: &quot;defense_scene&quot;, &quot;OpValue&quot;: &quot;eq&quot;, &quot;Values&quot;: &quot;waf_base&quot; }</code><br></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>real_client_ip</p>
     */
    @NameInMap("Metric")
    public String metric;

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
     * <p>The ID of the resource group.</p>
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
         * <p>The field to filter by. This operation supports all fields.</p>
         * 
         * <strong>example:</strong>
         * <p>matched_host</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("OpValue")
        public String opValue;

        /**
         * <p>The filter value.</p>
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
         * <p>The start of the time range to query. The value is a UNIX timestamp. Unit: seconds. You can query data within the last 30 days.</p>
         * <blockquote>
         * <h2>The start time must be within the last 30 days.</h2>
         * </blockquote>
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
         * <p>A list of filter conditions. Each object in the array represents a filter condition.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeSecurityEventTopNMetricRequestFilterConditions> conditions;

        /**
         * <p>The time range to query.</p>
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
