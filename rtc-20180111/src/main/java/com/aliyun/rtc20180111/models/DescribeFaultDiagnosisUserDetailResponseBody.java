// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisUserDetailResponseBody extends TeaModel {
    @NameInMap("CallInfo")
    public DescribeFaultDiagnosisUserDetailResponseBodyCallInfo callInfo;

    @NameInMap("FactorList")
    public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorList> factorList;

    @NameInMap("FaultMetricData")
    public DescribeFaultDiagnosisUserDetailResponseBodyFaultMetricData faultMetricData;

    @NameInMap("NetworkOperators")
    public java.util.List<String> networkOperators;

    @NameInMap("RequestId")
    public String requestId;

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
         */
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CallStatus")
        public String callStatus;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("CreatedTs")
        public Long createdTs;

        @NameInMap("DestroyedTs")
        public Long destroyedTs;

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
        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventType")
        public String eventType;

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
        @NameInMap("EventList")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItemsEventList> eventList;

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
        @NameInMap("EventDataItems")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatasEventDataItems> eventDataItems;

        @NameInMap("Role")
        public String role;

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
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        @NameInMap("X")
        public String x;

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
        @NameInMap("Nodes")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedMetricDatasNodes> nodes;

        @NameInMap("Role")
        public String role;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("FactorId")
        public String factorId;

        @NameInMap("FaultSource")
        public String faultSource;

        @NameInMap("RelatedEventDatas")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyFactorListRelatedEventDatas> relatedEventDatas;

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
        @NameInMap("X")
        public String x;

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
        @NameInMap("JoinTs")
        public Long joinTs;

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
        @NameInMap("CreatedTs")
        public Long createdTs;

        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Location")
        public String location;

        @NameInMap("Network")
        public String network;

        @NameInMap("OnlineDuration")
        public Long onlineDuration;

        @NameInMap("OnlinePeriods")
        public java.util.List<DescribeFaultDiagnosisUserDetailResponseBodyUserDetailOnlinePeriods> onlinePeriods;

        @NameInMap("Os")
        public String os;

        @NameInMap("SdkVersion")
        public String sdkVersion;

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
