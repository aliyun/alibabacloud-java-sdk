// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventTypesResponseBody extends TeaModel {
    /**
     * <p>The list of anomalous activity types.</p>
     * <blockquote>
     * <p>If ParentTypeId is empty, the parent anomalous activity types are returned. If ParentTypeId is not empty, the child anomalous activity types are returned.</p>
     * </blockquote>
     */
    @NameInMap("EventTypeList")
    public java.util.List<DescribeEventTypesResponseBodyEventTypeList> eventTypeList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEventTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventTypesResponseBody self = new DescribeEventTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventTypesResponseBody setEventTypeList(java.util.List<DescribeEventTypesResponseBodyEventTypeList> eventTypeList) {
        this.eventTypeList = eventTypeList;
        return this;
    }
    public java.util.List<DescribeEventTypesResponseBodyEventTypeList> getEventTypeList() {
        return this.eventTypeList;
    }

    public DescribeEventTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEventTypesResponseBodyEventTypeListSubTypeList extends TeaModel {
        /**
         * <p>The products to which the rule applies, including MaxCompute, OSS, AnalyticDB for MySQL, Tablestore, and ApsaraDB RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("AdaptedProduct")
        public String adaptedProduct;

        /**
         * <p>The code of the child anomalous activity type.</p>
         * 
         * <strong>example:</strong>
         * <p>020008</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The configuration code.</p>
         * 
         * <strong>example:</strong>
         * <p>0100**</p>
         */
        @NameInMap("ConfigCode")
        public String configCode;

        /**
         * <p>The format of the rule item. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: numeric (such as a threshold).</p>
         * </li>
         * <li><p><strong>1</strong>: text (such as an IP address).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConfigContentType")
        public Integer configContentType;

        /**
         * <p>The configuration description.</p>
         * 
         * <strong>example:</strong>
         * <p>Permission idle period exceeds threshold: current threshold is defined as 7 natural days</p>
         */
        @NameInMap("ConfigDescription")
        public String configDescription;

        /**
         * <p>The configuration value.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <p>The description of the child anomalous activity type.</p>
         * 
         * <strong>example:</strong>
         * <p>Configuration error - MaxCompute sensitive project not protected，****</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of times the rule is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EventHitCount")
        public Integer eventHitCount;

        /**
         * <p>The unique ID of the child anomalous activity type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the child anomalous activity type.</p>
         * 
         * <strong>example:</strong>
         * <p>Configuration error - MaxCompute sensitive project not protected</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The detection feature of Data Security Center (DSC) for the child anomalous activity type. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: enabled.</p>
         * </li>
         * <li><p><strong>0</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeEventTypesResponseBodyEventTypeListSubTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventTypesResponseBodyEventTypeListSubTypeList self = new DescribeEventTypesResponseBodyEventTypeListSubTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeEventTypesResponseBodyEventTypeListSubTypeList setAdaptedProduct(String adaptedProduct) {
            this.adaptedProduct = adaptedProduct;
            return this;
        }
        public String getAdaptedProduct() {
            return this.adaptedProduct;
        }

        public DescribeEventTypesResponseBodyEventTypeListSubTypeList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventTypesResponseBodyEventTypeListSubTypeList setConfigCode(String configCode) {
            this.configCode = configCode;
            return this;
        }
        public String getConfigCode() {
            return this.configCode;
        }

        public DescribeEventTypesResponseBodyEventTypeListSubTypeList setConfigContentType(Integer configContentType) {
            this.configContentType = configContentType;
            return this;
        }
        public Integer getConfigContentType() {
            return this.configContentType;
        }

        public DescribeEventTypesResponseBodyEventTypeListSubTypeList setConfigDescription(String configDescription) {
            this.configDescription = configDescription;
            return this;
        }
        public String getConfigDescription() {
            return this.configDescription;
        }

        public DescribeEventTypesResponseBodyEventTypeListSubTypeList setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public DescribeEventTypesResponseBodyEventTypeListSubTypeList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventTypesResponseBodyEventTypeListSubTypeList setEventHitCount(Integer eventHitCount) {
            this.eventHitCount = eventHitCount;
            return this;
        }
        public Integer getEventHitCount() {
            return this.eventHitCount;
        }

        public DescribeEventTypesResponseBodyEventTypeListSubTypeList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventTypesResponseBodyEventTypeListSubTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventTypesResponseBodyEventTypeListSubTypeList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class DescribeEventTypesResponseBodyEventTypeList extends TeaModel {
        /**
         * <p>The code of the parent anomalous activity type.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The description of the parent anomalous activity type.</p>
         * 
         * <strong>example:</strong>
         * <p>Permission usage anomaly, ****</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the parent anomalous activity type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the parent anomalous activity type.</p>
         * 
         * <strong>example:</strong>
         * <p>Permission usage anomaly</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of child anomalous activity types.</p>
         */
        @NameInMap("SubTypeList")
        public java.util.List<DescribeEventTypesResponseBodyEventTypeListSubTypeList> subTypeList;

        public static DescribeEventTypesResponseBodyEventTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventTypesResponseBodyEventTypeList self = new DescribeEventTypesResponseBodyEventTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeEventTypesResponseBodyEventTypeList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventTypesResponseBodyEventTypeList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventTypesResponseBodyEventTypeList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventTypesResponseBodyEventTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventTypesResponseBodyEventTypeList setSubTypeList(java.util.List<DescribeEventTypesResponseBodyEventTypeListSubTypeList> subTypeList) {
            this.subTypeList = subTypeList;
            return this;
        }
        public java.util.List<DescribeEventTypesResponseBodyEventTypeListSubTypeList> getSubTypeList() {
            return this.subTypeList;
        }

    }

}
