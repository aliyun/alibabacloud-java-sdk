// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the anomalous event.</p>
     */
    @NameInMap("Event")
    public DescribeEventDetailResponseBodyEvent event;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The values of data on the x-axis.</p>
         */
        @NameInMap("X")
        public java.util.List<String> x;

        /**
         * <p>The values of data on the y-axis.</p>
         */
        @NameInMap("Y")
        public java.util.List<String> y;

        public static DescribeEventDetailResponseBodyEventDetailChartData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventDetailResponseBodyEventDetailChartData self = new DescribeEventDetailResponseBodyEventDetailChartData();
            return TeaModel.build(map, self);
        }

        public DescribeEventDetailResponseBodyEventDetailChartData setX(java.util.List<String> x) {
            this.x = x;
            return this;
        }
        public java.util.List<String> getX() {
            return this.x;
        }

        public DescribeEventDetailResponseBodyEventDetailChartData setY(java.util.List<String> y) {
            this.y = y;
            return this;
        }
        public java.util.List<String> getY() {
            return this.y;
        }

    }

    public static class DescribeEventDetailResponseBodyEventDetailChart extends TeaModel {
        /**
         * <p>The data in the baseline behavior profile of the anomalous event.</p>
         */
        @NameInMap("Data")
        public DescribeEventDetailResponseBodyEventDetailChartData data;

        /**
         * <p>The name of the baseline behavior chart of the anomalous event.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The type of the chart. Valid values:</p>
         * <br>
         * <p>*   **1**: column chart</p>
         * <p>*   **2**: line chart</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The descriptive label of data on the x-axis.</p>
         */
        @NameInMap("XLabel")
        public String XLabel;

        /**
         * <p>The descriptive label of data on the y-axis.</p>
         */
        @NameInMap("YLabel")
        public String YLabel;

        public static DescribeEventDetailResponseBodyEventDetailChart build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventDetailResponseBodyEventDetailChart self = new DescribeEventDetailResponseBodyEventDetailChart();
            return TeaModel.build(map, self);
        }

        public DescribeEventDetailResponseBodyEventDetailChart setData(DescribeEventDetailResponseBodyEventDetailChartData data) {
            this.data = data;
            return this;
        }
        public DescribeEventDetailResponseBodyEventDetailChartData getData() {
            return this.data;
        }

        public DescribeEventDetailResponseBodyEventDetailChart setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeEventDetailResponseBodyEventDetailChart setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    }

    public static class DescribeEventDetailResponseBodyEventDetailContent extends TeaModel {
        /**
         * <p>The title of the content in the anomalous event.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The description of the content in the anomalous event.</p>
         */
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
        /**
         * <p>The source title.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The source description.</p>
         */
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
        /**
         * <p>An array that consists of the baseline behavior chart of the anomalous event.</p>
         */
        @NameInMap("Chart")
        public java.util.List<DescribeEventDetailResponseBodyEventDetailChart> chart;

        /**
         * <p>An array that consists of the content in the anomalous event.</p>
         */
        @NameInMap("Content")
        public java.util.List<DescribeEventDetailResponseBodyEventDetailContent> content;

        /**
         * <p>An array that consists of the source from which the information of the anomalous event is recorded.</p>
         */
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
        /**
         * <p>The account that is used to handle the anomalous event.</p>
         */
        @NameInMap("CurrentValue")
        public String currentValue;

        /**
         * <p>The point in time when the account was locked. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("DisableTime")
        public Long disableTime;

        /**
         * <p>The point in time when the account was unlocked. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("EnableTime")
        public Long enableTime;

        /**
         * <p>The handling method.</p>
         */
        @NameInMap("HandlerName")
        public String handlerName;

        /**
         * <p>The type of the handling method.</p>
         */
        @NameInMap("HandlerType")
        public String handlerType;

        /**
         * <p>The duration for which the handling operation takes effect. If you leave this parameter empty, the handling operation is permanently valid. Unit: minutes.</p>
         */
        @NameInMap("HandlerValue")
        public Integer handlerValue;

        /**
         * <p>The ID of the handling record.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The status of the account that triggered the anomalous event. Valid values:</p>
         * <br>
         * <p>*   **0**: locked</p>
         * <p>*   **1**: unlocked</p>
         * <p>*   **-1**: failed to unlock the account</p>
         * <p>*   **-2**: failed to enable the account</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeEventDetailResponseBodyEventHandleInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventDetailResponseBodyEventHandleInfoList self = new DescribeEventDetailResponseBodyEventHandleInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeEventDetailResponseBodyEventHandleInfoList setCurrentValue(String currentValue) {
            this.currentValue = currentValue;
            return this;
        }
        public String getCurrentValue() {
            return this.currentValue;
        }

        public DescribeEventDetailResponseBodyEventHandleInfoList setDisableTime(Long disableTime) {
            this.disableTime = disableTime;
            return this;
        }
        public Long getDisableTime() {
            return this.disableTime;
        }

        public DescribeEventDetailResponseBodyEventHandleInfoList setEnableTime(Long enableTime) {
            this.enableTime = enableTime;
            return this;
        }
        public Long getEnableTime() {
            return this.enableTime;
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

        public DescribeEventDetailResponseBodyEventHandleInfoList setHandlerValue(Integer handlerValue) {
            this.handlerValue = handlerValue;
            return this;
        }
        public Integer getHandlerValue() {
            return this.handlerValue;
        }

        public DescribeEventDetailResponseBodyEventHandleInfoList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventDetailResponseBodyEventHandleInfoList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class DescribeEventDetailResponseBodyEvent extends TeaModel {
        /**
         * <p>The time when the alert for the anomalous event was generated. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("AlertTime")
        public Long alertTime;

        /**
         * <p>Indicates whether the handling result of the anomalous event is used to enhance the detection of anomalous events. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         * <br>
         * <p>> If you enhance the detection of anomalous events, the detection accuracy and the rate of triggering alerts for anomalous events are improved.</p>
         */
        @NameInMap("Backed")
        public Boolean backed;

        /**
         * <p>The instance name of the service in which the anomalous event was detected.</p>
         */
        @NameInMap("DataInstance")
        public String dataInstance;

        /**
         * <p>The display name of the account that is used to handle the anomalous event.</p>
         */
        @NameInMap("DealDisplayName")
        public String dealDisplayName;

        /**
         * <p>The username of the account that is used to handle the anomalous event.</p>
         */
        @NameInMap("DealLoginName")
        public String dealLoginName;

        /**
         * <p>The reason why the anomalous event is handled.</p>
         */
        @NameInMap("DealReason")
        public String dealReason;

        /**
         * <p>The time when the anomalous event was handled. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("DealTime")
        public Long dealTime;

        /**
         * <p>The ID of the account that is used to handle the anomalous event.</p>
         */
        @NameInMap("DealUserId")
        public Long dealUserId;

        /**
         * <p>The content in the details of the anomalous event.</p>
         */
        @NameInMap("Detail")
        public DescribeEventDetailResponseBodyEventDetail detail;

        /**
         * <p>The display name of the account that triggered the anomalous event.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The time when the anomalous event occurred. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("EventTime")
        public Long eventTime;

        /**
         * <p>An array that consists of the handling records of the anomalous event.</p>
         */
        @NameInMap("HandleInfoList")
        public java.util.List<DescribeEventDetailResponseBodyEventHandleInfoList> handleInfoList;

        /**
         * <p>The unique ID of the anomalous event.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The details of the alert logs.</p>
         */
        @NameInMap("LogDetail")
        public String logDetail;

        /**
         * <p>The username of the account that triggered the anomalous event.</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        /**
         * <p>The name of the service in which the anomalous event was detected. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The handling status for the anomalous event. Valid values:</p>
         * <br>
         * <p>*   **0**: unhandled</p>
         * <p>*   **1**: confirmed</p>
         * <p>*   **2**: marked as false positive</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The name of the handling status for the anomalous event.</p>
         */
        @NameInMap("StatusName")
        public String statusName;

        /**
         * <p>The code of the anomalous event subtype.</p>
         */
        @NameInMap("SubTypeCode")
        public String subTypeCode;

        /**
         * <p>The name of the anomalous event subtype.</p>
         */
        @NameInMap("SubTypeName")
        public String subTypeName;

        /**
         * <p>The code of the anomalous event type.</p>
         */
        @NameInMap("TypeCode")
        public String typeCode;

        /**
         * <p>The name of the anomalous event type. Valid values:</p>
         * <br>
         * <p>*   **01**: anomalous permission usage</p>
         * <p>*   **02**: anomalous data flow</p>
         * <p>*   **03**: anomalous data operation</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        /**
         * <p>The ID of the account that triggered the anomalous event.</p>
         */
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
