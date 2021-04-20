// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetAiotStorageInfoResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("AiotStorageInfo")
    public GetAiotStorageInfoResponseBodyAiotStorageInfo aiotStorageInfo;

    public static GetAiotStorageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiotStorageInfoResponseBody self = new GetAiotStorageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiotStorageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public GetAiotStorageInfoResponseBody setAiotStorageInfo(GetAiotStorageInfoResponseBodyAiotStorageInfo aiotStorageInfo) {
        this.aiotStorageInfo = aiotStorageInfo;
        return this;
    }
    public GetAiotStorageInfoResponseBodyAiotStorageInfo getAiotStorageInfo() {
        return this.aiotStorageInfo;
    }

    public static class GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq extends TeaModel {
        @NameInMap("MqType")
        public String mqType;

        @NameInMap("AlarmTopic")
        public String alarmTopic;

        @NameInMap("EventTopic")
        public String eventTopic;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Version")
        public String version;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Brokers")
        public java.util.List<String> brokers;

        @NameInMap("RamArnRole")
        public String ramArnRole;

        public static GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq build(java.util.Map<String, ?> map) throws Exception {
            GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq self = new GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq();
            return TeaModel.build(map, self);
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq setMqType(String mqType) {
            this.mqType = mqType;
            return this;
        }
        public String getMqType() {
            return this.mqType;
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

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq setBrokers(java.util.List<String> brokers) {
            this.brokers = brokers;
            return this;
        }
        public java.util.List<String> getBrokers() {
            return this.brokers;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmMq setRamArnRole(String ramArnRole) {
            this.ramArnRole = ramArnRole;
            return this;
        }
        public String getRamArnRole() {
            return this.ramArnRole;
        }

    }

    public static class GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage extends TeaModel {
        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Path")
        public String path;

        @NameInMap("RamArnRole")
        public String ramArnRole;

        public static GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage build(java.util.Map<String, ?> map) throws Exception {
            GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage self = new GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage();
            return TeaModel.build(map, self);
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetAiotStorageInfoResponseBodyAiotStorageInfoEventAlarmPictureStorage setRamArnRole(String ramArnRole) {
            this.ramArnRole = ramArnRole;
            return this;
        }
        public String getRamArnRole() {
            return this.ramArnRole;
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
