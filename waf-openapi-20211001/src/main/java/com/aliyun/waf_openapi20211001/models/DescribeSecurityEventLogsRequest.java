// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventLogsRequest extends TeaModel {
    /**
     * <p>The query filter conditions. Multiple filter conditions are connected by the logical AND operator.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public DescribeSecurityEventLogsRequestFilter filter;

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
     * <p>The page number to return during paging in a paged query. Default value: <strong>1</strong>, which indicates the first page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page for paging in a paged query. Maximum value: <strong>100</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
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
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeSecurityEventLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventLogsRequest self = new DescribeSecurityEventLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventLogsRequest setFilter(DescribeSecurityEventLogsRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public DescribeSecurityEventLogsRequestFilter getFilter() {
        return this.filter;
    }

    public DescribeSecurityEventLogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSecurityEventLogsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSecurityEventLogsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSecurityEventLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSecurityEventLogsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static class DescribeSecurityEventLogsRequestFilterConditions extends TeaModel {
        /**
         * <p>The name of the field on which the filter operation is performed. This operation supports all fields.</p>
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
         * <p>The filter values.</p>
         * 
         * <strong>example:</strong>
         * <p>test.waf-top</p>
         */
        @NameInMap("Values")
        public Object values;

        public static DescribeSecurityEventLogsRequestFilterConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventLogsRequestFilterConditions self = new DescribeSecurityEventLogsRequestFilterConditions();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventLogsRequestFilterConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSecurityEventLogsRequestFilterConditions setOpValue(String opValue) {
            this.opValue = opValue;
            return this;
        }
        public String getOpValue() {
            return this.opValue;
        }

        public DescribeSecurityEventLogsRequestFilterConditions setValues(Object values) {
            this.values = values;
            return this;
        }
        public Object getValues() {
            return this.values;
        }

    }

    public static class DescribeSecurityEventLogsRequestFilterDateRange extends TeaModel {
        /**
         * <p>The end time of the query. The end time is represented by a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888600</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <p>The start time of the query. The data query range cannot exceed the past 30 days. The start time is represented by a UNIX timestamp in seconds.</p>
         * <blockquote>
         * <h2>The start time must be later than the current time minus 30 days.</h2>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888000</p>
         */
        @NameInMap("StartDate")
        public Long startDate;

        public static DescribeSecurityEventLogsRequestFilterDateRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventLogsRequestFilterDateRange self = new DescribeSecurityEventLogsRequestFilterDateRange();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventLogsRequestFilterDateRange setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeSecurityEventLogsRequestFilterDateRange setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeSecurityEventLogsRequestFilter extends TeaModel {
        /**
         * <p>The list of filter conditions. Each node describes a filter condition.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeSecurityEventLogsRequestFilterConditions> conditions;

        /**
         * <p>The time range for the query.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DateRange")
        public DescribeSecurityEventLogsRequestFilterDateRange dateRange;

        public static DescribeSecurityEventLogsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventLogsRequestFilter self = new DescribeSecurityEventLogsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventLogsRequestFilter setConditions(java.util.List<DescribeSecurityEventLogsRequestFilterConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeSecurityEventLogsRequestFilterConditions> getConditions() {
            return this.conditions;
        }

        public DescribeSecurityEventLogsRequestFilter setDateRange(DescribeSecurityEventLogsRequestFilterDateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        public DescribeSecurityEventLogsRequestFilterDateRange getDateRange() {
            return this.dateRange;
        }

    }

}
