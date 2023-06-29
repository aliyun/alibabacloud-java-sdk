// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventTypesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the types of anomalous events.</p>
     * <br>
     * <p>> If you leave the ParentTypeId parameter empty, anomalous event types are returned. If you set the ParentTypeId parameter, anomalous event subtypes under the specified anomalous event type are returned.</p>
     */
    @NameInMap("EventTypeList")
    public java.util.List<DescribeEventTypesResponseBodyEventTypeList> eventTypeList;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The service to which the anomalous event detection rule applies. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.</p>
         */
        @NameInMap("AdaptedProduct")
        public String adaptedProduct;

        /**
         * <p>The code of the anomalous event subtype.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The code of the configuration.</p>
         */
        @NameInMap("ConfigCode")
        public String configCode;

        /**
         * <p>The content format of anomalous event detection rule. Valid values:</p>
         * <br>
         * <p>*   **0**: numeric values such as thresholds</p>
         * <p>*   **1**: text such as IP addresses</p>
         */
        @NameInMap("ConfigContentType")
        public Integer configContentType;

        /**
         * <p>The description of the configuration.</p>
         */
        @NameInMap("ConfigDescription")
        public String configDescription;

        /**
         * <p>The value of the configuration.</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <p>The description of the anomalous event subtype.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of times that the anomalous event hits the anomalous event detection rule.</p>
         */
        @NameInMap("EventHitCount")
        public Integer eventHitCount;

        /**
         * <p>The ID of the anomalous event subtype.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the anomalous event subtype.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether detection is enabled for the anomalous event subtype. Valid values:</p>
         * <br>
         * <p>*   **1**: yes</p>
         * <p>*   **0**: no</p>
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
         * <p>The code of the anomalous event type.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The description of the anomalous event type.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the anomalous event type.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the anomalous event type.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>An array that consists of anomalous event subtypes.</p>
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
