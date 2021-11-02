// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageInstancesResponseBody extends TeaModel {
    @NameInMap("ImageInstanceList")
    public java.util.List<DescribeImageInstancesResponseBodyImageInstanceList> imageInstanceList;

    @NameInMap("PageInfo")
    public DescribeImageInstancesResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInstancesResponseBody self = new DescribeImageInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageInstancesResponseBody setImageInstanceList(java.util.List<DescribeImageInstancesResponseBodyImageInstanceList> imageInstanceList) {
        this.imageInstanceList = imageInstanceList;
        return this;
    }
    public java.util.List<DescribeImageInstancesResponseBodyImageInstanceList> getImageInstanceList() {
        return this.imageInstanceList;
    }

    public DescribeImageInstancesResponseBody setPageInfo(DescribeImageInstancesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeImageInstancesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeImageInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageInstancesResponseBodyImageInstanceList extends TeaModel {
        @NameInMap("AlarmCount")
        public Integer alarmCount;

        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("Digest")
        public String digest;

        @NameInMap("Endpoints")
        public String endpoints;

        @NameInMap("HcCount")
        public Integer hcCount;

        @NameInMap("HcStatus")
        public String hcStatus;

        @NameInMap("ImageCreate")
        public String imageCreate;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageSize")
        public String imageSize;

        @NameInMap("ImageUpdate")
        public String imageUpdate;

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

        @NameInMap("ScaProgress")
        public Integer scaProgress;

        @NameInMap("ScaResult")
        public String scaResult;

        @NameInMap("ScaStatus")
        public String scaStatus;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("VulCount")
        public Integer vulCount;

        @NameInMap("VulStatus")
        public String vulStatus;

        public static DescribeImageInstancesResponseBodyImageInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInstancesResponseBodyImageInstanceList self = new DescribeImageInstancesResponseBodyImageInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setAlarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setEndpoints(String endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public String getEndpoints() {
            return this.endpoints;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setHcCount(Integer hcCount) {
            this.hcCount = hcCount;
            return this;
        }
        public Integer getHcCount() {
            return this.hcCount;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setHcStatus(String hcStatus) {
            this.hcStatus = hcStatus;
            return this;
        }
        public String getHcStatus() {
            return this.hcStatus;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setImageCreate(String imageCreate) {
            this.imageCreate = imageCreate;
            return this;
        }
        public String getImageCreate() {
            return this.imageCreate;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setImageSize(String imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public String getImageSize() {
            return this.imageSize;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setImageUpdate(String imageUpdate) {
            this.imageUpdate = imageUpdate;
            return this;
        }
        public String getImageUpdate() {
            return this.imageUpdate;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setScaProgress(Integer scaProgress) {
            this.scaProgress = scaProgress;
            return this;
        }
        public Integer getScaProgress() {
            return this.scaProgress;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setScaResult(String scaResult) {
            this.scaResult = scaResult;
            return this;
        }
        public String getScaResult() {
            return this.scaResult;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setScaStatus(String scaStatus) {
            this.scaStatus = scaStatus;
            return this;
        }
        public String getScaStatus() {
            return this.scaStatus;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

        public DescribeImageInstancesResponseBodyImageInstanceList setVulStatus(String vulStatus) {
            this.vulStatus = vulStatus;
            return this;
        }
        public String getVulStatus() {
            return this.vulStatus;
        }

    }

    public static class DescribeImageInstancesResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageInstancesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInstancesResponseBodyPageInfo self = new DescribeImageInstancesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageInstancesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageInstancesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageInstancesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageInstancesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
