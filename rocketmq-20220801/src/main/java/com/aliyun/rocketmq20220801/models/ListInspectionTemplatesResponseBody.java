// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInspectionTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<ListInspectionTemplatesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListInspectionTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionTemplatesResponseBody self = new ListInspectionTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInspectionTemplatesResponseBody setData(java.util.List<ListInspectionTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInspectionTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListInspectionTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInspectionTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInspectionTemplatesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListInspectionTemplatesResponseBodyDataConfigurationParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;1h&quot;</p>
         */
        @NameInMap("default")
        public Object _default;

        /**
         * <strong>example:</strong>
         * <p>[&quot;all&quot;,&quot;active&quot;]</p>
         */
        @NameInMap("enum")
        public java.util.List<String> _enum;

        /**
         * <strong>example:</strong>
         * <p>duration</p>
         */
        @NameInMap("format")
        public String format;

        /**
         * <strong>example:</strong>
         * <p>lookback</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>3888000</p>
         */
        @NameInMap("maxLookbackSeconds")
        public Long maxLookbackSeconds;

        /**
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("maximum")
        public Double maximum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minimum")
        public Double minimum;

        /**
         * <strong>example:</strong>
         * <p>回看时间</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>seconds</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("wholeDays")
        public Boolean wholeDays;

        public static ListInspectionTemplatesResponseBodyDataConfigurationParameters build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionTemplatesResponseBodyDataConfigurationParameters self = new ListInspectionTemplatesResponseBodyDataConfigurationParameters();
            return TeaModel.build(map, self);
        }

        public ListInspectionTemplatesResponseBodyDataConfigurationParameters set_default(Object _default) {
            this._default = _default;
            return this;
        }
        public Object get_default() {
            return this._default;
        }

        public ListInspectionTemplatesResponseBodyDataConfigurationParameters set_enum(java.util.List<String> _enum) {
            this._enum = _enum;
            return this;
        }
        public java.util.List<String> get_enum() {
            return this._enum;
        }

        public ListInspectionTemplatesResponseBodyDataConfigurationParameters setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListInspectionTemplatesResponseBodyDataConfigurationParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInspectionTemplatesResponseBodyDataConfigurationParameters setMaxLookbackSeconds(Long maxLookbackSeconds) {
            this.maxLookbackSeconds = maxLookbackSeconds;
            return this;
        }
        public Long getMaxLookbackSeconds() {
            return this.maxLookbackSeconds;
        }

        public ListInspectionTemplatesResponseBodyDataConfigurationParameters setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public ListInspectionTemplatesResponseBodyDataConfigurationParameters setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public ListInspectionTemplatesResponseBodyDataConfigurationParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInspectionTemplatesResponseBodyDataConfigurationParameters setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListInspectionTemplatesResponseBodyDataConfigurationParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListInspectionTemplatesResponseBodyDataConfigurationParameters setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ListInspectionTemplatesResponseBodyDataConfigurationParameters setWholeDays(Boolean wholeDays) {
            this.wholeDays = wholeDays;
            return this;
        }
        public Boolean getWholeDays() {
            return this.wholeDays;
        }

    }

    public static class ListInspectionTemplatesResponseBodyDataConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("parameters")
        public java.util.List<ListInspectionTemplatesResponseBodyDataConfigurationParameters> parameters;

        public static ListInspectionTemplatesResponseBodyDataConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionTemplatesResponseBodyDataConfiguration self = new ListInspectionTemplatesResponseBodyDataConfiguration();
            return TeaModel.build(map, self);
        }

        public ListInspectionTemplatesResponseBodyDataConfiguration setParameters(java.util.List<ListInspectionTemplatesResponseBodyDataConfigurationParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<ListInspectionTemplatesResponseBodyDataConfigurationParameters> getParameters() {
            return this.parameters;
        }

    }

    public static class ListInspectionTemplatesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;timeWindow&quot;:{&quot;defaultLookback&quot;:&quot;1h&quot;,&quot;maxLookbackSeconds&quot;:3888000},&quot;thresholds&quot;:[]}</p>
         */
        @NameInMap("configuration")
        public ListInspectionTemplatesResponseBodyDataConfiguration configuration;

        /**
         * <strong>example:</strong>
         * <p>检查消息堆积和消费健康度</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>队列健康巡检</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("params")
        public Object params;

        /**
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("scopeType")
        public String scopeType;

        /**
         * <strong>example:</strong>
         * <p>queue-health</p>
         */
        @NameInMap("templateCode")
        public String templateCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public String version;

        public static ListInspectionTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionTemplatesResponseBodyData self = new ListInspectionTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInspectionTemplatesResponseBodyData setConfiguration(ListInspectionTemplatesResponseBodyDataConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public ListInspectionTemplatesResponseBodyDataConfiguration getConfiguration() {
            return this.configuration;
        }

        public ListInspectionTemplatesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInspectionTemplatesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInspectionTemplatesResponseBodyData setParams(Object params) {
            this.params = params;
            return this;
        }
        public Object getParams() {
            return this.params;
        }

        public ListInspectionTemplatesResponseBodyData setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public ListInspectionTemplatesResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListInspectionTemplatesResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
