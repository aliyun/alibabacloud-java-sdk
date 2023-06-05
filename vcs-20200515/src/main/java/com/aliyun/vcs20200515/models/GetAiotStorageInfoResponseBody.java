// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetAiotStorageInfoResponseBody extends TeaModel {
    @NameInMap("AiotStorageInfo")
    public GetAiotStorageInfoResponseBodyAiotStorageInfo aiotStorageInfo;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAiotStorageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiotStorageInfoResponseBody self = new GetAiotStorageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiotStorageInfoResponseBody setAiotStorageInfo(GetAiotStorageInfoResponseBodyAiotStorageInfo aiotStorageInfo) {
        this.aiotStorageInfo = aiotStorageInfo;
        return this;
    }
    public GetAiotStorageInfoResponseBodyAiotStorageInfo getAiotStorageInfo() {
        return this.aiotStorageInfo;
    }

    public GetAiotStorageInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAiotStorageInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAiotStorageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq extends TeaModel {
        @NameInMap("AlarmTopic")
        public String alarmTopic;

        @NameInMap("EventTopic")
        public String eventTopic;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MqType")
        public String mqType;

        @NameInMap("RamArnRole")
        public String ramArnRole;

        @NameInMap("RegionId")
        public String regionId;

        public static GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq build(java.util.Map<String, ?> map) throws Exception {
            GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq self = new GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq();
            return TeaModel.build(map, self);
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq setAlarmTopic(String alarmTopic) {
            this.alarmTopic = alarmTopic;
            return this;
        }
        public String getAlarmTopic() {
            return this.alarmTopic;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq setEventTopic(String eventTopic) {
            this.eventTopic = eventTopic;
            return this;
        }
        public String getEventTopic() {
            return this.eventTopic;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq setMqType(String mqType) {
            this.mqType = mqType;
            return this;
        }
        public String getMqType() {
            return this.mqType;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq setRamArnRole(String ramArnRole) {
            this.ramArnRole = ramArnRole;
            return this;
        }
        public String getRamArnRole() {
            return this.ramArnRole;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Path")
        public String path;

        @NameInMap("Proxy")
        public String proxy;

        @NameInMap("RamArnRole")
        public String ramArnRole;

        @NameInMap("StorageType")
        public String storageType;

        public static GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage build(java.util.Map<String, ?> map) throws Exception {
            GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage self = new GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage();
            return TeaModel.build(map, self);
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage setProxy(String proxy) {
            this.proxy = proxy;
            return this;
        }
        public String getProxy() {
            return this.proxy;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage setRamArnRole(String ramArnRole) {
            this.ramArnRole = ramArnRole;
            return this;
        }
        public String getRamArnRole() {
            return this.ramArnRole;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class GetAiotStorageInfoResponseBodyAiotStorageInfo extends TeaModel {
        @NameInMap("EventAlarmMq")
        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq eventAlarmMq;

        @NameInMap("EventAlarmPictureStorage")
        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage eventAlarmPictureStorage;

        public static GetAiotStorageInfoResponseBodyAiotStorageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAiotStorageInfoResponseBodyAiotStorageInfo self = new GetAiotStorageInfoResponseBodyAiotStorageInfo();
            return TeaModel.build(map, self);
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfo setEventAlarmMq(GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq eventAlarmMq) {
            this.eventAlarmMq = eventAlarmMq;
            return this;
        }
        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq getEventAlarmMq() {
            return this.eventAlarmMq;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfo setEventAlarmPictureStorage(GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage eventAlarmPictureStorage) {
            this.eventAlarmPictureStorage = eventAlarmPictureStorage;
            return this;
        }
        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage getEventAlarmPictureStorage() {
            return this.eventAlarmPictureStorage;
        }

    }

}
