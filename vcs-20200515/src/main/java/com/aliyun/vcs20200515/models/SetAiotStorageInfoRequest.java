// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SetAiotStorageInfoRequest extends TeaModel {
    @NameInMap("EventAlarmMq")
    public SetAiotStorageInfoRequestEventAlarmMq eventAlarmMq;

    @NameInMap("EventAlarmPictureStorage")
    public SetAiotStorageInfoRequestEventAlarmPictureStorage eventAlarmPictureStorage;

    public static SetAiotStorageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAiotStorageInfoRequest self = new SetAiotStorageInfoRequest();
        return TeaModel.build(map, self);
    }

    public SetAiotStorageInfoRequest setEventAlarmMq(SetAiotStorageInfoRequestEventAlarmMq eventAlarmMq) {
        this.eventAlarmMq = eventAlarmMq;
        return this;
    }
    public SetAiotStorageInfoRequestEventAlarmMq getEventAlarmMq() {
        return this.eventAlarmMq;
    }

    public SetAiotStorageInfoRequest setEventAlarmPictureStorage(SetAiotStorageInfoRequestEventAlarmPictureStorage eventAlarmPictureStorage) {
        this.eventAlarmPictureStorage = eventAlarmPictureStorage;
        return this;
    }
    public SetAiotStorageInfoRequestEventAlarmPictureStorage getEventAlarmPictureStorage() {
        return this.eventAlarmPictureStorage;
    }

    public static class SetAiotStorageInfoRequestEventAlarmMq extends TeaModel {
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

        public static SetAiotStorageInfoRequestEventAlarmMq build(java.util.Map<String, ?> map) throws Exception {
            SetAiotStorageInfoRequestEventAlarmMq self = new SetAiotStorageInfoRequestEventAlarmMq();
            return TeaModel.build(map, self);
        }

        public SetAiotStorageInfoRequestEventAlarmMq setAlarmTopic(String alarmTopic) {
            this.alarmTopic = alarmTopic;
            return this;
        }
        public String getAlarmTopic() {
            return this.alarmTopic;
        }

        public SetAiotStorageInfoRequestEventAlarmMq setEventTopic(String eventTopic) {
            this.eventTopic = eventTopic;
            return this;
        }
        public String getEventTopic() {
            return this.eventTopic;
        }

        public SetAiotStorageInfoRequestEventAlarmMq setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SetAiotStorageInfoRequestEventAlarmMq setMqType(String mqType) {
            this.mqType = mqType;
            return this;
        }
        public String getMqType() {
            return this.mqType;
        }

        public SetAiotStorageInfoRequestEventAlarmMq setRamArnRole(String ramArnRole) {
            this.ramArnRole = ramArnRole;
            return this;
        }
        public String getRamArnRole() {
            return this.ramArnRole;
        }

        public SetAiotStorageInfoRequestEventAlarmMq setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class SetAiotStorageInfoRequestEventAlarmPictureStorage extends TeaModel {
        /**
         * <p>Bucket</p>
         */
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

        public static SetAiotStorageInfoRequestEventAlarmPictureStorage build(java.util.Map<String, ?> map) throws Exception {
            SetAiotStorageInfoRequestEventAlarmPictureStorage self = new SetAiotStorageInfoRequestEventAlarmPictureStorage();
            return TeaModel.build(map, self);
        }

        public SetAiotStorageInfoRequestEventAlarmPictureStorage setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SetAiotStorageInfoRequestEventAlarmPictureStorage setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public SetAiotStorageInfoRequestEventAlarmPictureStorage setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public SetAiotStorageInfoRequestEventAlarmPictureStorage setProxy(String proxy) {
            this.proxy = proxy;
            return this;
        }
        public String getProxy() {
            return this.proxy;
        }

        public SetAiotStorageInfoRequestEventAlarmPictureStorage setRamArnRole(String ramArnRole) {
            this.ramArnRole = ramArnRole;
            return this;
        }
        public String getRamArnRole() {
            return this.ramArnRole;
        }

        public SetAiotStorageInfoRequestEventAlarmPictureStorage setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
