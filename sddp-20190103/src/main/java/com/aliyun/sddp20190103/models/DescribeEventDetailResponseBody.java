// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the anomalous activity.</p>
     */
    @NameInMap("Event")
    public DescribeEventDetailResponseBodyEvent event;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>69FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
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
         * <p>The values of the data items on the x-axis.</p>
         * 
         * <strong>example:</strong>
         * <p>[test1,test2,...]</p>
         */
        @NameInMap("X")
        public java.util.List<String> x;

        /**
         * <p>The values of the data items on the y-axis.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2,3,...]</p>
         */
        @NameInMap("Y")
        public java.util.List<String> y;

        /**
         * <p>The values of the data items on the z-axis.</p>
         */
        @NameInMap("Z")
        public java.util.List<String> z;

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

        public DescribeEventDetailResponseBodyEventDetailChartData setZ(java.util.List<String> z) {
            this.z = z;
            return this;
        }
        public java.util.List<String> getZ() {
            return this.z;
        }

    }

    public static class DescribeEventDetailResponseBodyEventDetailChart extends TeaModel {
        /**
         * <p>The type of the chart. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: column chart.</p>
         * </li>
         * <li><p><strong>2</strong>: line chart.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when NewAlarm is set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChatType")
        public Integer chatType;

        /**
         * <p>The data items of the baseline behavior profile for the anomalous activity.</p>
         */
        @NameInMap("Data")
        public DescribeEventDetailResponseBodyEventDetailChartData data;

        /**
         * <p>The name of the baseline behavior profile for the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>Baseline behavior chart</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The title of the chart.</p>
         * <blockquote>
         * <p>This parameter is returned only when NewAlarm is set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>misskingm</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the chart. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: column chart.</p>
         * </li>
         * <li><p><strong>2</strong>: line chart.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The label of the x-axis.</p>
         * 
         * <strong>example:</strong>
         * <p>Number of days</p>
         */
        @NameInMap("XLabel")
        public String XLabel;

        /**
         * <p>The label of the y-axis.</p>
         * 
         * <strong>example:</strong>
         * <p>Value</p>
         */
        @NameInMap("YLabel")
        public String YLabel;

        /**
         * <p>The label of the z-axis.</p>
         * <blockquote>
         * <p>This parameter is returned only when NewAlarm is set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>chart description</p>
         */
        @NameInMap("ZLabel")
        public String ZLabel;

        public static DescribeEventDetailResponseBodyEventDetailChart build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventDetailResponseBodyEventDetailChart self = new DescribeEventDetailResponseBodyEventDetailChart();
            return TeaModel.build(map, self);
        }

        public DescribeEventDetailResponseBodyEventDetailChart setChatType(Integer chatType) {
            this.chatType = chatType;
            return this;
        }
        public Integer getChatType() {
            return this.chatType;
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

        public DescribeEventDetailResponseBodyEventDetailChart setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

        public DescribeEventDetailResponseBodyEventDetailChart setZLabel(String ZLabel) {
            this.ZLabel = ZLabel;
            return this;
        }
        public String getZLabel() {
            return this.ZLabel;
        }

    }

    public static class DescribeEventDetailResponseBodyEventDetailContent extends TeaModel {
        /**
         * <p>The title of the anomalous activity content.</p>
         * 
         * <strong>example:</strong>
         * <p>Anomaly description</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The name of the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>daliaoyuncom</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description of the anomalous activity content.</p>
         * 
         * <strong>example:</strong>
         * <p>The account was used to access OSS from an unusual terminal whose IP address is 1.2.3.4 from 00:06:45 on September 9, 2019 to 00:57:37 on September 9, 2019.</p>
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

        public DescribeEventDetailResponseBodyEventDetailContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
         * <p>The title of the source of the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>Risk</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The description of the source of the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>Based on the record of authentication by using an unusual terminal, an attacker may have obtained the access permission of the account, or an employee accessed data from a personal terminal.</p>
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
         * <p>The baseline behavior profile for the anomalous activity.</p>
         */
        @NameInMap("Chart")
        public java.util.List<DescribeEventDetailResponseBodyEventDetailChart> chart;

        /**
         * <p>The content of the anomalous activity.</p>
         */
        @NameInMap("Content")
        public java.util.List<DescribeEventDetailResponseBodyEventDetailContent> content;

        /**
         * <p>The information about the source of the anomalous activity.</p>
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
         * <p>Specifies the account that handled the event.</p>
         * 
         * <strong>example:</strong>
         * <p>sddp-test2</p>
         */
        @NameInMap("CurrentValue")
        public String currentValue;

        /**
         * <p>The time when the handling action was disabled. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1611139155000</p>
         */
        @NameInMap("DisableTime")
        public Long disableTime;

        /**
         * <p>The time when the handling action was enabled. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1611139155000</p>
         */
        @NameInMap("EnableTime")
        public Long enableTime;

        /**
         * <p>The handling method.</p>
         * 
         * <strong>example:</strong>
         * <p>Remove from the whitelist</p>
         */
        @NameInMap("HandlerName")
        public String handlerName;

        /**
         * <p>The handling type.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_security_ip</p>
         */
        @NameInMap("HandlerType")
        public String handlerType;

        /**
         * <p>The duration of the handling action. Unit: minutes. If this parameter is empty, the handling action is permanent.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HandlerValue")
        public Integer handlerValue;

        /**
         * <p>The handling ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The status of the handling action. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: disabled.</p>
         * </li>
         * <li><p><strong>1</strong>: enabled.</p>
         * </li>
         * <li><p><strong>-1</strong>: disabling failed.</p>
         * </li>
         * <li><p><strong>-2</strong>: enabling failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The time when the alert for the anomalous activity was triggered. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1545829129000</p>
         */
        @NameInMap("AlertTime")
        public Long alertTime;

        /**
         * <p>Indicates whether the detection of the anomalous activity is enhanced. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Enhancing the detection of anomalous activities improves detection accuracy and the alert reporting rate.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Backed")
        public Boolean backed;

        /**
         * <p>The name of the asset instance in which the anomalous activity occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>in-222***</p>
         */
        @NameInMap("DataInstance")
        public String dataInstance;

        /**
         * <p>The display name of the account that handled the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>yundunsr</p>
         */
        @NameInMap("DealDisplayName")
        public String dealDisplayName;

        /**
         * <p>The logon name of the account that handled the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>det1111</p>
         */
        @NameInMap("DealLoginName")
        public String dealLoginName;

        /**
         * <p>The reason for handling the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>Anomaly confirmed</p>
         */
        @NameInMap("DealReason")
        public String dealReason;

        /**
         * <p>The time when the anomalous activity was handled. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1611139155000</p>
         */
        @NameInMap("DealTime")
        public Long dealTime;

        /**
         * <p>The ID of the account that handled the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>229157443385014***</p>
         */
        @NameInMap("DealUserId")
        public Long dealUserId;

        /**
         * <p>The specific content of the anomalous activity details.</p>
         */
        @NameInMap("Detail")
        public DescribeEventDetailResponseBodyEventDetail detail;

        /**
         * <p>The display name of the account that performed the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>yundunsr</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The time when the anomalous activity occurred. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1545829129000</p>
         */
        @NameInMap("EventTime")
        public Long eventTime;

        /**
         * <p>The handling history.</p>
         */
        @NameInMap("HandleInfoList")
        public java.util.List<DescribeEventDetailResponseBodyEventHandleInfoList> handleInfoList;

        /**
         * <p>The unique ID of the anomalous activity that is recorded in Data Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>52234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The details of the alert log.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;client_ip&quot;: [&quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;, &quot;106.11.XX.XX&quot;], &quot;start_time&quot;: &quot;2020-05-10 00:00:01&quot;, &quot;instance&quot;: [&quot;omniscience-data&quot;, &quot;punish-beaver-data&quot;], &quot;end_time&quot;: &quot;2020-05-10 00:21:22&quot;, &quot;client_ua&quot;: [&quot;Java/1.8.0_152&quot;, &quot;Java/1.8.0_92&quot;, &quot;aliyun-sdk-java/2.0.0&quot;, &quot;aliyun-sdk-java/2.8.0(Linux/4.9.151-015.ali3000.alios7.x86_64/amd64;1.8.0_152)&quot;], &quot;user_name&quot;: 1512222261295262}</p>
         */
        @NameInMap("LogDetail")
        public String logDetail;

        /**
         * <p>The name of the account that performed the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>det1111</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        /**
         * <p>Indicates whether the alert is of the new version. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NewAlarm")
        public Boolean newAlarm;

        /**
         * <p>The name of the product in which the anomalous activity is detected. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The processing status of the anomalous activity. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: unhandled.</p>
         * </li>
         * <li><p><strong>1</strong>: confirmed.</p>
         * </li>
         * <li><p><strong>2</strong>: dismissed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The name of the processing status of the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("StatusName")
        public String statusName;

        /**
         * <p>The code of the anomalous activity subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>020008</p>
         */
        @NameInMap("SubTypeCode")
        public String subTypeCode;

        /**
         * <p>The name of the anomalous activity subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>Anomalous volume of downloaded data</p>
         */
        @NameInMap("SubTypeName")
        public String subTypeName;

        /**
         * <p>The code of the anomalous activity type.</p>
         * 
         * <strong>example:</strong>
         * <p>02</p>
         */
        @NameInMap("TypeCode")
        public String typeCode;

        /**
         * <p>The name of the anomalous activity type. Valid values:</p>
         * <ul>
         * <li><p><strong>01</strong>: anomalous permission access.</p>
         * </li>
         * <li><p><strong>02</strong>: anomalous data flow.</p>
         * </li>
         * <li><p><strong>03</strong>: anomalous data operation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Anomalous data flow</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        /**
         * <p>The ID of the account that performed the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>229157443385014***</p>
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

        public DescribeEventDetailResponseBodyEvent setNewAlarm(Boolean newAlarm) {
            this.newAlarm = newAlarm;
            return this;
        }
        public Boolean getNewAlarm() {
            return this.newAlarm;
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
