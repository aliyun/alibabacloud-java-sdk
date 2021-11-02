// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventTypesResponseBody extends TeaModel {
    @NameInMap("EventTypeList")
    public java.util.List<DescribeEventTypesResponseBodyEventTypeList> eventTypeList;

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
        @NameInMap("AdaptedProduct")
        public String adaptedProduct;

        @NameInMap("Code")
        public String code;

        @NameInMap("ConfigCode")
        public String configCode;

        @NameInMap("ConfigContentType")
        public Integer configContentType;

        @NameInMap("ConfigDescription")
        public String configDescription;

        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("EventHitCount")
        public Integer eventHitCount;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

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
