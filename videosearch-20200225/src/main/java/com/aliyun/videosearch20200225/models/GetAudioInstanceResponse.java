// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class GetAudioInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetAudioInstanceResponseData data;

    public static GetAudioInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAudioInstanceResponse self = new GetAudioInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetAudioInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAudioInstanceResponse setData(GetAudioInstanceResponseData data) {
        this.data = data;
        return this;
    }
    public GetAudioInstanceResponseData getData() {
        return this.data;
    }

    public static class GetAudioInstanceResponseData extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("InstanceStatus")
        @Validation(required = true)
        public Integer instanceStatus;

        @NameInMap("AudioNumber")
        @Validation(required = true)
        public Integer audioNumber;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public Long expireTime;

        @NameInMap("ConcurrencyNumber")
        @Validation(required = true)
        public Integer concurrencyNumber;

        @NameInMap("MaxAudioCapacity")
        @Validation(required = true)
        public String maxAudioCapacity;

        @NameInMap("CurrentAudioCapacity")
        @Validation(required = true)
        public String currentAudioCapacity;

        @NameInMap("AudioInfoUpdateTime")
        @Validation(required = true)
        public Long audioInfoUpdateTime;

        @NameInMap("BundlingType")
        @Validation(required = true)
        public String bundlingType;

        public static GetAudioInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetAudioInstanceResponseData self = new GetAudioInstanceResponseData();
            return TeaModel.build(map, self);
        }

        public GetAudioInstanceResponseData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAudioInstanceResponseData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetAudioInstanceResponseData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetAudioInstanceResponseData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAudioInstanceResponseData setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public GetAudioInstanceResponseData setAudioNumber(Integer audioNumber) {
            this.audioNumber = audioNumber;
            return this;
        }
        public Integer getAudioNumber() {
            return this.audioNumber;
        }

        public GetAudioInstanceResponseData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetAudioInstanceResponseData setConcurrencyNumber(Integer concurrencyNumber) {
            this.concurrencyNumber = concurrencyNumber;
            return this;
        }
        public Integer getConcurrencyNumber() {
            return this.concurrencyNumber;
        }

        public GetAudioInstanceResponseData setMaxAudioCapacity(String maxAudioCapacity) {
            this.maxAudioCapacity = maxAudioCapacity;
            return this;
        }
        public String getMaxAudioCapacity() {
            return this.maxAudioCapacity;
        }

        public GetAudioInstanceResponseData setCurrentAudioCapacity(String currentAudioCapacity) {
            this.currentAudioCapacity = currentAudioCapacity;
            return this;
        }
        public String getCurrentAudioCapacity() {
            return this.currentAudioCapacity;
        }

        public GetAudioInstanceResponseData setAudioInfoUpdateTime(Long audioInfoUpdateTime) {
            this.audioInfoUpdateTime = audioInfoUpdateTime;
            return this;
        }
        public Long getAudioInfoUpdateTime() {
            return this.audioInfoUpdateTime;
        }

        public GetAudioInstanceResponseData setBundlingType(String bundlingType) {
            this.bundlingType = bundlingType;
            return this;
        }
        public String getBundlingType() {
            return this.bundlingType;
        }

    }

}
