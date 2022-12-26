// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoDetailListResponseBody extends TeaModel {
    @NameInMap("ImageRepoResponses")
    public java.util.List<DescribeImageRepoDetailListResponseBodyImageRepoResponses> imageRepoResponses;

    @NameInMap("PageInfo")
    public DescribeImageRepoDetailListResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageRepoDetailListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRepoDetailListResponseBody self = new DescribeImageRepoDetailListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageRepoDetailListResponseBody setImageRepoResponses(java.util.List<DescribeImageRepoDetailListResponseBodyImageRepoResponses> imageRepoResponses) {
        this.imageRepoResponses = imageRepoResponses;
        return this;
    }
    public java.util.List<DescribeImageRepoDetailListResponseBodyImageRepoResponses> getImageRepoResponses() {
        return this.imageRepoResponses;
    }

    public DescribeImageRepoDetailListResponseBody setPageInfo(DescribeImageRepoDetailListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeImageRepoDetailListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeImageRepoDetailListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageRepoDetailListResponseBodyImageRepoResponses extends TeaModel {
        @NameInMap("AlarmCount")
        public Integer alarmCount;

        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("Endpoints")
        public String endpoints;

        @NameInMap("HcCount")
        public Integer hcCount;

        @NameInMap("HcStatus")
        public String hcStatus;

        @NameInMap("ImageCount")
        public Integer imageCount;

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

        @NameInMap("RiskStatus")
        public String riskStatus;

        @NameInMap("VulCount")
        public Integer vulCount;

        @NameInMap("VulStatus")
        public String vulStatus;

        public static DescribeImageRepoDetailListResponseBodyImageRepoResponses build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageRepoDetailListResponseBodyImageRepoResponses self = new DescribeImageRepoDetailListResponseBodyImageRepoResponses();
            return TeaModel.build(map, self);
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setAlarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setEndpoints(String endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public String getEndpoints() {
            return this.endpoints;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setHcCount(Integer hcCount) {
            this.hcCount = hcCount;
            return this;
        }
        public Integer getHcCount() {
            return this.hcCount;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setHcStatus(String hcStatus) {
            this.hcStatus = hcStatus;
            return this;
        }
        public String getHcStatus() {
            return this.hcStatus;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setImageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Integer getImageCount() {
            return this.imageCount;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setVulStatus(String vulStatus) {
            this.vulStatus = vulStatus;
            return this;
        }
        public String getVulStatus() {
            return this.vulStatus;
        }

    }

    public static class DescribeImageRepoDetailListResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageRepoDetailListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageRepoDetailListResponseBodyPageInfo self = new DescribeImageRepoDetailListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageRepoDetailListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageRepoDetailListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageRepoDetailListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageRepoDetailListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
