// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageInfoListResponseBody extends TeaModel {
    @NameInMap("ImageInfos")
    public java.util.List<DescribeImageInfoListResponseBodyImageInfos> imageInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInfoListResponseBody self = new DescribeImageInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageInfoListResponseBody setImageInfos(java.util.List<DescribeImageInfoListResponseBodyImageInfos> imageInfos) {
        this.imageInfos = imageInfos;
        return this;
    }
    public java.util.List<DescribeImageInfoListResponseBodyImageInfos> getImageInfos() {
        return this.imageInfos;
    }

    public DescribeImageInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageInfoListResponseBodyImageInfos extends TeaModel {
        @NameInMap("AlarmCount")
        public Integer alarmCount;

        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("Digest")
        public String digest;

        @NameInMap("Endpoints")
        public String endpoints;

        @NameInMap("ImageCreate")
        public Long imageCreate;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageSize")
        public Long imageSize;

        @NameInMap("ImageUpdate")
        public Long imageUpdate;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegistryType")
        public String registryType;

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoNamespace")
        public String repoNamespace;

        @NameInMap("RepoType")
        public String repoType;

        @NameInMap("RiskStatus")
        public String riskStatus;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("TagImmutable")
        public Integer tagImmutable;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("VulCount")
        public Integer vulCount;

        @NameInMap("VulStatus")
        public String vulStatus;

        public static DescribeImageInfoListResponseBodyImageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInfoListResponseBodyImageInfos self = new DescribeImageInfoListResponseBodyImageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeImageInfoListResponseBodyImageInfos setAlarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        public DescribeImageInfoListResponseBodyImageInfos setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public DescribeImageInfoListResponseBodyImageInfos setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public DescribeImageInfoListResponseBodyImageInfos setEndpoints(String endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public String getEndpoints() {
            return this.endpoints;
        }

        public DescribeImageInfoListResponseBodyImageInfos setImageCreate(Long imageCreate) {
            this.imageCreate = imageCreate;
            return this;
        }
        public Long getImageCreate() {
            return this.imageCreate;
        }

        public DescribeImageInfoListResponseBodyImageInfos setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageInfoListResponseBodyImageInfos setImageSize(Long imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Long getImageSize() {
            return this.imageSize;
        }

        public DescribeImageInfoListResponseBodyImageInfos setImageUpdate(Long imageUpdate) {
            this.imageUpdate = imageUpdate;
            return this;
        }
        public Long getImageUpdate() {
            return this.imageUpdate;
        }

        public DescribeImageInfoListResponseBodyImageInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeImageInfoListResponseBodyImageInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeImageInfoListResponseBodyImageInfos setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public DescribeImageInfoListResponseBodyImageInfos setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public DescribeImageInfoListResponseBodyImageInfos setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeImageInfoListResponseBodyImageInfos setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public DescribeImageInfoListResponseBodyImageInfos setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public DescribeImageInfoListResponseBodyImageInfos setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public DescribeImageInfoListResponseBodyImageInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImageInfoListResponseBodyImageInfos setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeImageInfoListResponseBodyImageInfos setTagImmutable(Integer tagImmutable) {
            this.tagImmutable = tagImmutable;
            return this;
        }
        public Integer getTagImmutable() {
            return this.tagImmutable;
        }

        public DescribeImageInfoListResponseBodyImageInfos setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeImageInfoListResponseBodyImageInfos setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

        public DescribeImageInfoListResponseBodyImageInfos setVulStatus(String vulStatus) {
            this.vulStatus = vulStatus;
            return this;
        }
        public String getVulStatus() {
            return this.vulStatus;
        }

    }

}
