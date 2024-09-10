// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageInstancesResponseBody extends TeaModel {
    /**
     * <p>The information about the images.</p>
     */
    @NameInMap("ImageInstanceList")
    public java.util.List<DescribeImageInstancesResponseBodyImageInstanceList> imageInstanceList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageInstancesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>BE120DAB-F4E7-4C53-ADC3-A97578ABF384</p>
     */
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
        /**
         * <p>The number of alerts that are generated for the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlarmCount")
        public Integer alarmCount;

        /**
         * <p>Indicates whether alerts are generated for the image. Valid values:</p>
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
         * <p>Indicates whether the image was deployed. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The image was not deployed.</li>
         * <li><strong>1</strong>: The image was deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Deployed")
        public Integer deployed;

        /**
         * <p>The digest value of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>a5ccdd9b166b67e02954aa9b618fe19b7968bd56a15463d2ad7f2643ba5b****</p>
         */
        @NameInMap("Digest")
        public String digest;

        /**
         * <p>The address of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Endpoints")
        public String endpoints;

        /**
         * <p>The number of baseline risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HcCount")
        public Integer hcCount;

        /**
         * <p>Indicates whether baseline risks exist. Valid values:</p>
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
         * <p>The timestamp generated when the image was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1600069948849</p>
         */
        @NameInMap("ImageCreate")
        public String imageCreate;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>c20987f18b130f9d144c9828df630417e2a9523148930dc3963e9d0dab30****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The size of the image. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1604487690</p>
         */
        @NameInMap("ImageSize")
        public String imageSize;

        /**
         * <p>The timestamp generated when the image was updated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1600069948849</p>
         */
        @NameInMap("ImageUpdate")
        public String imageUpdate;

        /**
         * <p>The instance ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>39010****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1721363159000</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The region ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of the image. Valid values:</p>
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
         * <p>f2b86d20bf0855af6aa268ce90fd****</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-script-test</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The namespace to which the image repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <p>The type of the repository. Valid values:</p>
         * <ul>
         * <li><strong>private</strong></li>
         * <li><strong>public</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("RepoType")
        public String repoType;

        /**
         * <p>Indicates whether risks exist. Valid values:</p>
         * <ul>
         * <li><strong>NO</strong></li>
         * <li><strong>YES</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("RiskStatus")
        public String riskStatus;

        /**
         * <p>The scan progress of the image. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ScaProgress")
        public Integer scaProgress;

        /**
         * <p>The error code of the image scan result. Valid values:</p>
         * <ul>
         * <li><strong>TASK_NOT_EXISTS</strong>: The image scan task does not exist.</li>
         * <li><strong>TASK_NOT_SUPPORT_REGION</strong>: The image scan task cannot be performed in the current region.</li>
         * <li><strong>forbid_create_repeat_task</strong>: The image scan task already exists.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TASK_NOT_SUPPORT_REGION</p>
         */
        @NameInMap("ScaResult")
        public String scaResult;

        /**
         * <p>The scan status of the image. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The image scan task is pending startup.</li>
         * <li><strong>START</strong>: The image scan task is started.</li>
         * <li><strong>MESSAGE_SEND</strong>: The message about the image scan task is sent.</li>
         * <li><strong>START_RUN</strong>: The image analysis task is started.</li>
         * <li><strong>DOWNLOAD</strong>: The image scan result is downloaded.</li>
         * <li><strong>PRE_ANALYZER</strong>: The image pre-analysis is started.</li>
         * <li><strong>WEB_SHELL_ANALYZER</strong>: The WebShell analysis of the image is complete.</li>
         * <li><strong>CVE_ANALYZER</strong>: The Common Vulnerabilities and Exposures (CVE) analysis of the image is complete.</li>
         * <li><strong>BIN_ANALYZER</strong>: The binary analysis of the image is complete.</li>
         * <li><strong>OTHER_ANALYZER</strong>: The extended analysis of the image is complete.</li>
         * <li><strong>SUCCESS</strong>: The image scan task is complete.</li>
         * <li><strong>PRE_ANALYZER_SUCCESS</strong>: The image pre-analysis is complete.</li>
         * <li><strong>FAIL</strong>: The image scan task failed.</li>
         * <li><strong>TIMEOUT</strong>: The image scan task timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("ScaStatus")
        public String scaStatus;

        /**
         * <p>The status of the image. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_5.7</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>12f80307-60aa-4efa-863a-56d72fb****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The number of vulnerabilities in the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        /**
         * <p>Indicates whether vulnerabilities exist in the image. Valid values:</p>
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

        public DescribeImageInstancesResponseBodyImageInstanceList setDeployed(Integer deployed) {
            this.deployed = deployed;
            return this;
        }
        public Integer getDeployed() {
            return this.deployed;
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

        public DescribeImageInstancesResponseBodyImageInstanceList setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
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
        /**
         * <p>The number of images returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
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
