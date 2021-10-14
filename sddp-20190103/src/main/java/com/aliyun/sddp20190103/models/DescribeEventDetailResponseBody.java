// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventDetailResponseBody extends TeaModel {
    @NameInMap("Event")
    public DescribeEventDetailResponseBodyEvent event;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventDetailResponseBody self = new DescribeEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventDetailResponseBody setEvent(DescribeEventDetailResponseBodyEvent event) {
        this.event = event;
        return this;
    }
    public DescribeEventDetailResponseBodyEvent getEvent() {
        return this.event;
    }

    public DescribeEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEventDetailResponseBodyEventDetailChartData extends TeaModel {
        @NameInMap("Y")
        public String y;

        @NameInMap("X")
        public String x;

        public static DescribeEventDetailResponseBodyEventDetailChartData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventDetailResponseBodyEventDetailChartData self = new DescribeEventDetailResponseBodyEventDetailChartData();
            return TeaModel.build(map, self);
        }

        public DescribeEventDetailResponseBodyEventDetailChartData setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

        public DescribeEventDetailResponseBodyEventDetailChartData setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

    }

    public static class DescribeEventDetailResponseBodyEventDetailChart extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Label")
        public String label;

        @NameInMap("XLabel")
        public String XLabel;

        @NameInMap("YLabel")
        public String YLabel;

        @NameInMap("Data")
        public DescribeEventDetailResponseBodyEventDetailChartData data;

        public static DescribeEventDetailResponseBodyEventDetailChart build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventDetailResponseBodyEventDetailChart self = new DescribeEventDetailResponseBodyEventDetailChart();
            return TeaModel.build(map, self);
        }

        public DescribeEventDetailResponseBodyEventDetailChart setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEventDetailResponseBodyEventDetailChart setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeEventDetailResponseBodyEventDetailChart setXLabel(String XLabel) {
            this.XLabel = XLabel;
            return this;
        }
        public String getXLabel() {
            return this.XLabel;
        }

        public DescribeEventDetailResponseBodyEventDetailChart setYLabel(String YLabel) {
            this.YLabel = YLabel;
            return this;
        }
        public String getYLabel() {
            return this.YLabel;
        }

        public DescribeEventDetailResponseBodyEventDetailChart setData(DescribeEventDetailResponseBodyEventDetailChartData data) {
            this.data = data;
            return this;
        }
        public DescribeEventDetailResponseBodyEventDetailChartData getData() {
            return this.data;
        }

    }

    public static class DescribeEventDetailResponseBodyEventDetailContent extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Value")
        public String value;

        public static DescribeEventDetailResponseBodyEventDetailContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventDetailResponseBodyEventDetailContent self = new DescribeEventDetailResponseBodyEventDetailContent();
            return TeaModel.build(map, self);
        }

        public DescribeEventDetailResponseBodyEventDetailContent setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeEventDetailResponseBodyEventDetailContent setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEventDetailResponseBodyEventDetailResourceInfo extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Value")
        public String value;

        public static DescribeEventDetailResponseBodyEventDetailResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventDetailResponseBodyEventDetailResourceInfo self = new DescribeEventDetailResponseBodyEventDetailResourceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEventDetailResponseBodyEventDetailResourceInfo setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeEventDetailResponseBodyEventDetailResourceInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEventDetailResponseBodyEventDetail extends TeaModel {
        @NameInMap("Chart")
        public java.util.List<DescribeEventDetailResponseBodyEventDetailChart> chart;

        @NameInMap("Content")
        public java.util.List<DescribeEventDetailResponseBodyEventDetailContent> content;

        @NameInMap("ResourceInfo")
        public java.util.List<DescribeEventDetailResponseBodyEventDetailResourceInfo> resourceInfo;

        public static DescribeEventDetailResponseBodyEventDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventDetailResponseBodyEventDetail self = new DescribeEventDetailResponseBodyEventDetail();
            return TeaModel.build(map, self);
        }

        public DescribeEventDetailResponseBodyEventDetail setChart(java.util.List<DescribeEventDetailResponseBodyEventDetailChart> chart) {
            this.chart = chart;
            return this;
        }
        public java.util.List<DescribeEventDetailResponseBodyEventDetailChart> getChart() {
            return this.chart;
        }

        public DescribeEventDetailResponseBodyEventDetail setContent(java.util.List<DescribeEventDetailResponseBodyEventDetailContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<DescribeEventDetailResponseBodyEventDetailContent> getContent() {
            return this.content;
        }

        public DescribeEventDetailResponseBodyEventDetail setResourceInfo(java.util.List<DescribeEventDetailResponseBodyEventDetailResourceInfo> resourceInfo) {
            this.resourceInfo = resourceInfo;
            return this;
        }
        public java.util.List<DescribeEventDetailResponseBodyEventDetailResourceInfo> getResourceInfo() {
            return this.resourceInfo;
        }

    }

    public static class DescribeEventDetailResponseBodyEventHandleInfoList extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("EnableTime")
        public Long enableTime;

        @NameInMap("HandlerValue")
        public Integer handlerValue;

        @NameInMap("DisableTime")
        public Long disableTime;

        @NameInMap("HandlerName")
        public String handlerName;

        @NameInMap("HandlerType")
        public String handlerType;

        @NameInMap("CurrentValue")
        public String currentValue;

        @NameInMap("Id")
        public Long id;

        public static DescribeEventDetailResponseBodyEventHandleInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventDetailResponseBodyEventHandleInfoList self = new DescribeEventDetailResponseBodyEventHandleInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeEventDetailResponseBodyEventHandleInfoList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeEventDetailResponseBodyEventHandleInfoList setEnableTime(Long enableTime) {
            this.enableTime = enableTime;
            return this;
        }
        public Long getEnableTime() {
            return this.enableTime;
        }

        public DescribeEventDetailResponseBodyEventHandleInfoList setHandlerValue(Integer handlerValue) {
            this.handlerValue = handlerValue;
            return this;
        }
        public Integer getHandlerValue() {
            return this.handlerValue;
        }

        public DescribeEventDetailResponseBodyEventHandleInfoList setDisableTime(Long disableTime) {
            this.disableTime = disableTime;
            return this;
        }
        public Long getDisableTime() {
            return this.disableTime;
        }

        public DescribeEventDetailResponseBodyEventHandleInfoList setHandlerName(String handlerName) {
            this.handlerName = handlerName;
            return this;
        }
        public String getHandlerName() {
            return this.handlerName;
        }

        public DescribeEventDetailResponseBodyEventHandleInfoList setHandlerType(String handlerType) {
            this.handlerType = handlerType;
            return this;
        }
        public String getHandlerType() {
            return this.handlerType;
        }

        public DescribeEventDetailResponseBodyEventHandleInfoList setCurrentValue(String currentValue) {
            this.currentValue = currentValue;
            return this;
        }
        public String getCurrentValue() {
            return this.currentValue;
        }

        public DescribeEventDetailResponseBodyEventHandleInfoList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class DescribeEventDetailResponseBodyEvent extends TeaModel {
        @NameInMap("AlertTime")
        public Long alertTime;

        @NameInMap("Backed")
        public Boolean backed;

        @NameInMap("DataInstance")
        public String dataInstance;

        @NameInMap("DealDisplayName")
        public String dealDisplayName;

        @NameInMap("DealLoginName")
        public String dealLoginName;

        @NameInMap("DealReason")
        public String dealReason;

        @NameInMap("DealTime")
        public Long dealTime;

        @NameInMap("DealUserId")
        public Long dealUserId;

        @NameInMap("Detail")
        public DescribeEventDetailResponseBodyEventDetail detail;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("EventTime")
        public Long eventTime;

        @NameInMap("HandleInfoList")
        public java.util.List<DescribeEventDetailResponseBodyEventHandleInfoList> handleInfoList;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LogDetail")
        public String logDetail;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("SubTypeCode")
        public String subTypeCode;

        @NameInMap("SubTypeName")
        public String subTypeName;

        @NameInMap("TypeCode")
        public String typeCode;

        @NameInMap("TypeName")
        public String typeName;

        @NameInMap("UserId")
        public Long userId;

        public static DescribeEventDetailResponseBodyEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventDetailResponseBodyEvent self = new DescribeEventDetailResponseBodyEvent();
            return TeaModel.build(map, self);
        }

        public DescribeEventDetailResponseBodyEvent setAlertTime(Long alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public Long getAlertTime() {
            return this.alertTime;
        }

        public DescribeEventDetailResponseBodyEvent setBacked(Boolean backed) {
            this.backed = backed;
            return this;
        }
        public Boolean getBacked() {
            return this.backed;
        }

        public DescribeEventDetailResponseBodyEvent setDataInstance(String dataInstance) {
            this.dataInstance = dataInstance;
            return this;
        }
        public String getDataInstance() {
            return this.dataInstance;
        }

        public DescribeEventDetailResponseBodyEvent setDealDisplayName(String dealDisplayName) {
            this.dealDisplayName = dealDisplayName;
            return this;
        }
        public String getDealDisplayName() {
            return this.dealDisplayName;
        }

        public DescribeEventDetailResponseBodyEvent setDealLoginName(String dealLoginName) {
            this.dealLoginName = dealLoginName;
            return this;
        }
        public String getDealLoginName() {
            return this.dealLoginName;
        }

        public DescribeEventDetailResponseBodyEvent setDealReason(String dealReason) {
            this.dealReason = dealReason;
            return this;
        }
        public String getDealReason() {
            return this.dealReason;
        }

        public DescribeEventDetailResponseBodyEvent setDealTime(Long dealTime) {
            this.dealTime = dealTime;
            return this;
        }
        public Long getDealTime() {
            return this.dealTime;
        }

        public DescribeEventDetailResponseBodyEvent setDealUserId(Long dealUserId) {
            this.dealUserId = dealUserId;
            return this;
        }
        public Long getDealUserId() {
            return this.dealUserId;
        }

        public DescribeEventDetailResponseBodyEvent setDetail(DescribeEventDetailResponseBodyEventDetail detail) {
            this.detail = detail;
            return this;
        }
        public DescribeEventDetailResponseBodyEventDetail getDetail() {
            return this.detail;
        }

        public DescribeEventDetailResponseBodyEvent setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeEventDetailResponseBodyEvent setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public DescribeEventDetailResponseBodyEvent setHandleInfoList(java.util.List<DescribeEventDetailResponseBodyEventHandleInfoList> handleInfoList) {
            this.handleInfoList = handleInfoList;
            return this;
        }
        public java.util.List<DescribeEventDetailResponseBodyEventHandleInfoList> getHandleInfoList() {
            return this.handleInfoList;
        }

        public DescribeEventDetailResponseBodyEvent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventDetailResponseBodyEvent setLogDetail(String logDetail) {
            this.logDetail = logDetail;
            return this;
        }
        public String getLogDetail() {
            return this.logDetail;
        }

        public DescribeEventDetailResponseBodyEvent setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public DescribeEventDetailResponseBodyEvent setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeEventDetailResponseBodyEvent setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeEventDetailResponseBodyEvent setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public DescribeEventDetailResponseBodyEvent setSubTypeCode(String subTypeCode) {
            this.subTypeCode = subTypeCode;
            return this;
        }
        public String getSubTypeCode() {
            return this.subTypeCode;
        }

        public DescribeEventDetailResponseBodyEvent setSubTypeName(String subTypeName) {
            this.subTypeName = subTypeName;
            return this;
        }
        public String getSubTypeName() {
            return this.subTypeName;
        }

        public DescribeEventDetailResponseBodyEvent setTypeCode(String typeCode) {
            this.typeCode = typeCode;
            return this;
        }
        public String getTypeCode() {
            return this.typeCode;
        }

        public DescribeEventDetailResponseBodyEvent setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public DescribeEventDetailResponseBodyEvent setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
