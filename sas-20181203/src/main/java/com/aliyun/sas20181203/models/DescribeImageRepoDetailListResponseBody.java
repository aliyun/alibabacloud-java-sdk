// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoDetailListResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the image repository is at risk. Valid values:</p>
     * <br>
     * <p>*   **YES**</p>
     * <p>*   **NO**</p>
     */
    @NameInMap("ImageRepoResponses")
    public java.util.List<DescribeImageRepoDetailListResponseBodyImageRepoResponses> imageRepoResponses;

    /**
     * <p>The total number of image repositories.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageRepoDetailListResponseBodyPageInfo pageInfo;

    /**
     * <p>The number of entries returned per page.</p>
     */
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
        /**
         * <p>The number of images.</p>
         */
        @NameInMap("AlarmCount")
        public Integer alarmCount;

        /**
         * <p>The region ID of the image.</p>
         */
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        /**
         * <p>Indicates whether alerts are generated for the image repository. Valid values:</p>
         * <br>
         * <p>*   **YES**</p>
         * <p>*   **NO**</p>
         */
        @NameInMap("Endpoints")
        public String endpoints;

        /**
         * <p>The number of alerts that are generated for the image repository.</p>
         */
        @NameInMap("HcCount")
        public Integer hcCount;

        /**
         * <p>The namespace to which the image repository belongs.</p>
         */
        @NameInMap("HcStatus")
        public String hcStatus;

        @NameInMap("ImageCount")
        public Integer imageCount;

        /**
         * <p>The number of baseline risk items on the image repository.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of vulnerabilities detected on the image repository.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the image repository.</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>Indicates whether baseline risk items are detected on the image repository. Valid values:</p>
         * <br>
         * <p>*   **NO**</p>
         * <p>*   **YES**</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <p>The type of the image repository. Valid values:</p>
         * <br>
         * <p>*   **acr**</p>
         * <p>*   **harbor**</p>
         * <p>*   **quay**</p>
         * <p>*   **CI/CD**</p>
         */
        @NameInMap("RiskStatus")
        public String riskStatus;

        /**
         * <p>The name of the image repository.</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        /**
         * <p>The ID of the image.</p>
         */
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
        /**
         * <p>The address of the image repository.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>An array that consists of the information about image repositories.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The information about the image repository.</p>
         */
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
