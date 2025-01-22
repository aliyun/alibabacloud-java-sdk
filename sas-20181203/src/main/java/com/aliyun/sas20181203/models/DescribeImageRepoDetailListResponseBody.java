// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoDetailListResponseBody extends TeaModel {
    /**
     * <p>The information about image repositories.</p>
     */
    @NameInMap("ImageRepoResponses")
    public java.util.List<DescribeImageRepoDetailListResponseBodyImageRepoResponses> imageRepoResponses;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageRepoDetailListResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
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
         * <p>The number of alerts that are generated for the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlarmCount")
        public Integer alarmCount;

        /**
         * <p>Indicates whether alerts are generated for the image repository. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong></li>
         * <li><strong>NO</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        /**
         * <p>The address of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;domains&quot;: [
         *                   &quot;<strong><strong>.cn-shenzhen.cr.aliyuncs.com&quot;
         *             ],
         *             &quot;type&quot;: &quot;internet&quot;
         *       },
         *       {
         *             &quot;domains&quot;: [
         *                   &quot;</strong></strong>.cn-shenzhen.cr.aliyuncs.com&quot;
         *             ],
         *             &quot;type&quot;: &quot;intranet&quot;
         *       },
         *       {
         *             &quot;domains&quot;: [
         *                   &quot;****.cn-shenzhen.cr.aliyuncs.com&quot;
         *             ],
         *             &quot;type&quot;: &quot;vpc&quot;
         *       }
         * ]</p>
         */
        @NameInMap("Endpoints")
        public String endpoints;

        /**
         * <p>The number of the images on which risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HasRiskImageCount")
        public Integer hasRiskImageCount;

        /**
         * <p>The number of baseline risk items on the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HcCount")
        public Integer hcCount;

        /**
         * <p>Indicates whether baseline risk items are detected on the image repository. Valid values:</p>
         * <ul>
         * <li><strong>NO</strong></li>
         * <li><strong>YES</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("HcStatus")
        public String hcStatus;

        /**
         * <p>The number of images.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ImageCount")
        public Integer imageCount;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6fsg6xlmorug5****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of the image repository. Valid values:</p>
         * <ul>
         * <li><strong>acr</strong></li>
         * <li><strong>harbor</strong></li>
         * <li><strong>quay</strong></li>
         * <li><strong>CI/CD</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acr</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>The ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-2chlzf47w2rk****</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>zeus</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The namespace to which the image repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test-dev</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <p>Indicates whether the image repository is at risk. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong></li>
         * <li><strong>NO</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("RiskStatus")
        public String riskStatus;

        /**
         * <p>The number of vulnerabilities detected on the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        /**
         * <p>Indicates whether vulnerabilities are detected on the image repository. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong></li>
         * <li><strong>NO</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
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

        public DescribeImageRepoDetailListResponseBodyImageRepoResponses setHasRiskImageCount(Integer hasRiskImageCount) {
            this.hasRiskImageCount = hasRiskImageCount;
            return this;
        }
        public Integer getHasRiskImageCount() {
            return this.hasRiskImageCount;
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
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of image repositories.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
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
