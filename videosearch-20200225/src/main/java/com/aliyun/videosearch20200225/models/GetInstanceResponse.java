// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class GetInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetInstanceResponseData data;

    public static GetInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponse self = new GetInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponse setData(GetInstanceResponseData data) {
        this.data = data;
        return this;
    }
    public GetInstanceResponseData getData() {
        return this.data;
    }

    public static class GetInstanceResponseData extends TeaModel {
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

        @NameInMap("VideoNumber")
        @Validation(required = true)
        public Integer videoNumber;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public Long expireTime;

        @NameInMap("ConcurrencyNumber")
        @Validation(required = true)
        public Integer concurrencyNumber;

        @NameInMap("MaxVideoCapacity")
        @Validation(required = true)
        public String maxVideoCapacity;

        @NameInMap("CurrentVideoCapacity")
        @Validation(required = true)
        public String currentVideoCapacity;

        @NameInMap("VideoInfoUpdateTime")
        @Validation(required = true)
        public Long videoInfoUpdateTime;

        @NameInMap("BundlingType")
        @Validation(required = true)
        public String bundlingType;

        public static GetInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseData self = new GetInstanceResponseData();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetInstanceResponseData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetInstanceResponseData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceResponseData setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public GetInstanceResponseData setVideoNumber(Integer videoNumber) {
            this.videoNumber = videoNumber;
            return this;
        }
        public Integer getVideoNumber() {
            return this.videoNumber;
        }

        public GetInstanceResponseData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetInstanceResponseData setConcurrencyNumber(Integer concurrencyNumber) {
            this.concurrencyNumber = concurrencyNumber;
            return this;
        }
        public Integer getConcurrencyNumber() {
            return this.concurrencyNumber;
        }

        public GetInstanceResponseData setMaxVideoCapacity(String maxVideoCapacity) {
            this.maxVideoCapacity = maxVideoCapacity;
            return this;
        }
        public String getMaxVideoCapacity() {
            return this.maxVideoCapacity;
        }

        public GetInstanceResponseData setCurrentVideoCapacity(String currentVideoCapacity) {
            this.currentVideoCapacity = currentVideoCapacity;
            return this;
        }
        public String getCurrentVideoCapacity() {
            return this.currentVideoCapacity;
        }

        public GetInstanceResponseData setVideoInfoUpdateTime(Long videoInfoUpdateTime) {
            this.videoInfoUpdateTime = videoInfoUpdateTime;
            return this;
        }
        public Long getVideoInfoUpdateTime() {
            return this.videoInfoUpdateTime;
        }

        public GetInstanceResponseData setBundlingType(String bundlingType) {
            this.bundlingType = bundlingType;
            return this;
        }
        public String getBundlingType() {
            return this.bundlingType;
        }

    }

}
