// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisUserDetailResponseBody extends TeaModel {
    /**
     * <p>Basic call information, returned when QueryCallUserInfo=false.</p>
     */
    @NameInMap("CallInfo")
    public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo callInfo;

    /**
     * <p>List of impact factors. An empty list indicates that the impact factors are unknown.</p>
     */
    @NameInMap("FactorList")
    public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorList> factorList;

    /**
     * <p>Abnormal metrics.</p>
     */
    @NameInMap("FaultMetricData")
    public DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData faultMetricData;

    /**
     * <p>List of Network carriers</p>
     */
    @NameInMap("NetworkOperators")
    public java.util.List<String> networkOperators;

    /**
     * <p>The Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>[responses_200_schema_properties_UserDetail_properties_CreatedTs_type]integer</p>
     */
    @NameInMap("UserDetail")
    public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail userDetail;

    public static DescribeFaultDiagnosisUserDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisUserDetailResponseBody self = new DescribeFaultDiagnosisUserDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisUserDetailResponseBody setCallInfo(DescribeFaultDiagnosisUserDetailResponseBodyCallInfo callInfo) {
        this.callInfo = callInfo;
        return this;
    }
    public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo getCallInfo() {
        return this.callInfo;
    }

    public DescribeFaultDiagnosisUserDetailResponseBody setFactorList(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorList> factorList) {
        this.factorList = factorList;
        return this;
    }
    public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorList> getFactorList() {
        return this.factorList;
    }

    public DescribeFaultDiagnosisUserDetailResponseBody setFaultMetricData(DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData faultMetricData) {
        this.faultMetricData = faultMetricData;
        return this;
    }
    public DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData getFaultMetricData() {
        return this.faultMetricData;
    }

    public DescribeFaultDiagnosisUserDetailResponseBody setNetworkOperators(java.util.List<String> networkOperators) {
        this.networkOperators = networkOperators;
        return this;
    }
    public java.util.List<String> getNetworkOperators() {
        return this.networkOperators;
    }

    public DescribeFaultDiagnosisUserDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaultDiagnosisUserDetailResponseBody setUserDetail(DescribeFaultDiagnosisUserDetailResponseBodyUserDetail userDetail) {
        this.userDetail = userDetail;
        return this;
    }
    public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail getUserDetail() {
        return this.userDetail;
    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyCallInfo extends TeaModel {
        /**
         * <p>App ID。</p>
         * 
         * <strong>example:</strong>
         * <p>0rbd****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Call status. Valid values:</p>
         * <ul>
         * <li><strong>IN</strong>: In progress.</li>
         * <li><strong>OUT</strong>: Ended.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("CallStatus")
        public String callStatus;

        /**
         * <p>Channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>311</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The time when the call was created, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1620957905</p>
         */
        @NameInMap("CreatedTs")
        public Long createdTs;

        /**
         * <p>The time when the call was released, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1620958150</p>
         */
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        /**
         * <p>Call duration in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Duration")
        public Long duration;

        public static DescribeFaultDiagnosisUserDetailResponseBodyCallInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyCallInfo self = new DescribeFaultDiagnosisUserDetailResponseBodyCallInfo();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo setCallStatus(String callStatus) {
            this.callStatus = callStatus;
            return this;
        }
        public String getCallStatus() {
            return this.callStatus;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList extends TeaModel {
        /**
         * <p>Event Name.</p>
         * 
         * <strong>example:</strong>
         * <p>开始发布</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>Event Type. Valid values:</p>
         * <ul>
         * <li><strong>USER</strong>: User event.</li>
         * <li><strong>SYSTEM</strong>: System event.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The time of the first management event occurrence, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("Ts")
        public Long ts;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList self = new DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems extends TeaModel {
        /**
         * <p>Event List.</p>
         */
        @NameInMap("EventList")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList> eventList;

        /**
         * <p>[responses_200_schema_properties_FaultMetricData_properties_Nodes_description]List of metric coordinate points.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("Ts")
        public Long ts;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems self = new DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems setEventList(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList> eventList) {
            this.eventList = eventList;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList> getEventList() {
            return this.eventList;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas extends TeaModel {
        /**
         * <p>List of event data.</p>
         */
        @NameInMap("EventDataItems")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems> eventDataItems;

        /**
         * <p>Source role. Valid values:</p>
         * <ul>
         * <li><strong>SENDER</strong>: Publisher (upstream).</li>
         * <li><strong>RECEIVER</strong>: Subscriber (downstream).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SENDER</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>0a497933****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas self = new DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas setEventDataItems(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems> eventDataItems) {
            this.eventDataItems = eventDataItems;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems> getEventDataItems() {
            return this.eventDataItems;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes extends TeaModel {
        /**
         * <p>[responses_200_schema_properties_FactorList_items_properties_RelatedEventDatas_items_properties_EventDataItems_items_properties_EventList_items_properties_Ts_title]The time of the first management event occurrence, represented as a UNIX timestamp in seconds.</p>
         */
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        /**
         * <p>[responses_200_schema_properties_FactorList_items_properties_FactorId_title]Factor ID: 1: Poor publisher-side Network; 2: Poor subscriber-side Network; 3: Poor publisher-side device Performance; 4: Publisher-side camera shutdown; 5: Publisher-side app moved to background Run</p>
         * 
         * <strong>example:</strong>
         * <p>1615892596</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <p>[responses_200_schema_properties_RequestId_title]The Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Y")
        public String y;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes self = new DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas extends TeaModel {
        /**
         * <p>[responses_200_schema_properties_FactorList_items_properties_RelatedEventDatas_items_properties_EventDataItems_items_properties_EventList_items_properties_EventName_type]string</p>
         */
        @NameInMap("Nodes")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes> nodes;

        /**
         * <p>Source role. Valid values:</p>
         * <ul>
         * <li><strong>SENDER</strong>: Publisher.</li>
         * <li><strong>RECEIVER</strong>: Subscriber.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SENDER</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Metric type, consistent with the metric types defined in the end-to-end metrics API.</p>
         * 
         * <strong>example:</strong>
         * <p>AUDIO_STUCK</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>User ID of the publisher from which the data originates.</p>
         * 
         * <strong>example:</strong>
         * <p>0a497933****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas self = new DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas setNodes(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes> getNodes() {
            return this.nodes;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFactorList extends TeaModel {
        /**
         * <p>The factor ID. For details, see the factor ID values below.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FactorId")
        public String factorId;

        /**
         * <p>Abnormal source: LOCAL indicates the local end; REMOTE indicates the remote end.</p>
         * 
         * <strong>example:</strong>
         * <p>LOCAL</p>
         */
        @NameInMap("FaultSource")
        public String faultSource;

        /**
         * <p>Associated management events, grouped by time. Coordinate data is returned when FaultType is AUDIO_STUCK, VIDEO_STUCK, VIDEO_VAGUE, or HIGH_DELAY.</p>
         */
        @NameInMap("RelatedEventDatas")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas> relatedEventDatas;

        /**
         * <p>Associated metrics and coordinate data, returned when FaultType is AUDIO_STUCK, VIDEO_STUCK, VIDEO_VAGUE, or HIGH_DELAY.</p>
         */
        @NameInMap("RelatedMetricDatas")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas> relatedMetricDatas;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFactorList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFactorList self = new DescribeFaultDiagnosisUserDetailResponseBodyFactorList();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorList setFactorId(String factorId) {
            this.factorId = factorId;
            return this;
        }
        public String getFactorId() {
            return this.factorId;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorList setFaultSource(String faultSource) {
            this.faultSource = faultSource;
            return this;
        }
        public String getFaultSource() {
            return this.faultSource;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorList setRelatedEventDatas(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas> relatedEventDatas) {
            this.relatedEventDatas = relatedEventDatas;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas> getRelatedEventDatas() {
            return this.relatedEventDatas;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFactorList setRelatedMetricDatas(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas> relatedMetricDatas) {
            this.relatedMetricDatas = relatedMetricDatas;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatas> getRelatedMetricDatas() {
            return this.relatedMetricDatas;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes extends TeaModel {
        /**
         * <p>指标趋势图中x轴横坐标，单位时间为1分钟。</p>
         * 
         * <strong>example:</strong>
         * <p>1620957900</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <p>指标趋势图中y轴纵坐标。</p>
         * 
         * <strong>example:</strong>
         * <p>0.4540</p>
         */
        @NameInMap("Y")
        public String y;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes self = new DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData extends TeaModel {
        /**
         * <p>List of metric coordinate points.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes> nodes;

        public static DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData self = new DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData setNodes(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricDataNodes> getNodes() {
            return this.nodes;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods extends TeaModel {
        /**
         * <p>Time of joining the call, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1620957919</p>
         */
        @NameInMap("JoinTs")
        public Long joinTs;

        /**
         * <p>Time of leaving the call, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1620958150</p>
         */
        @NameInMap("LeaveTs")
        public Long leaveTs;

        public static DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods self = new DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods setJoinTs(Long joinTs) {
            this.joinTs = joinTs;
            return this;
        }
        public Long getJoinTs() {
            return this.joinTs;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods setLeaveTs(Long leaveTs) {
            this.leaveTs = leaveTs;
            return this;
        }
        public Long getLeaveTs() {
            return this.leaveTs;
        }

    }

    public static class DescribeFaultDiagnosisUserDetailResponseBodyUserDetail extends TeaModel {
        /**
         * <p>Call creation time, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1620957919</p>
         */
        @NameInMap("CreatedTs")
        public Long createdTs;

        /**
         * <p>[responses_200_schema_properties_UserDetail_properties_OnlineDuration_type]integer</p>
         * 
         * <strong>example:</strong>
         * <p>1620958150</p>
         */
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        /**
         * <p>[responses_200_schema_properties_FactorList_title]List of impact factors. An empty value indicates that the impact factors are unknown.</p>
         * 
         * <strong>example:</strong>
         * <p>231</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>Geographic location information, such as: Beijing City - Beijing Municipality.</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省-杭州市</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>[responses_200_schema_properties_UserDetail_properties_OnlinePeriods_items_properties_JoinTs_title]Time of joining the call, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>4G</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>Online duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>231</p>
         */
        @NameInMap("OnlineDuration")
        public Long onlineDuration;

        /**
         * <p>Online period information.</p>
         */
        @NameInMap("OnlinePeriods")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods> onlinePeriods;

        /**
         * <p>[responses_200_schema_properties_UserDetail_properties_OnlinePeriods_type]array</p>
         * 
         * <strong>example:</strong>
         * <p>iOS</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>[responses_200_schema_properties_UserDetail_properties_Location_title]Geographic location information, such as: Beijing City - Beijing Municipality</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("SdkVersion")
        public String sdkVersion;

        /**
         * <p>[responses_200_schema_properties_UserDetail_properties_OnlinePeriods_items_properties_LeaveTs_title]Time of leaving the call, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0a497933****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeFaultDiagnosisUserDetailResponseBodyUserDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserDetailResponseBodyUserDetail self = new DescribeFaultDiagnosisUserDetailResponseBodyUserDetail();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setOnlineDuration(Long onlineDuration) {
            this.onlineDuration = onlineDuration;
            return this;
        }
        public Long getOnlineDuration() {
            return this.onlineDuration;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setOnlinePeriods(java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods> onlinePeriods) {
            this.onlinePeriods = onlinePeriods;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods> getOnlinePeriods() {
            return this.onlinePeriods;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribeFaultDiagnosisUserDetailResponseBodyUserDetail setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
