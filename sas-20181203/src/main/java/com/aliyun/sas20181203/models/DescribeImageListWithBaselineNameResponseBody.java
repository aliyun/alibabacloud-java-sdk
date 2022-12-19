// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListWithBaselineNameResponseBody extends TeaModel {
    // An array that consists of the images returned.
    @NameInMap("ImageInfos")
    public java.util.List<DescribeImageListWithBaselineNameResponseBodyImageInfos> imageInfos;

    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeImageListWithBaselineNameResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageListWithBaselineNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListWithBaselineNameResponseBody self = new DescribeImageListWithBaselineNameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageListWithBaselineNameResponseBody setImageInfos(java.util.List<DescribeImageListWithBaselineNameResponseBodyImageInfos> imageInfos) {
        this.imageInfos = imageInfos;
        return this;
    }
    public java.util.List<DescribeImageListWithBaselineNameResponseBodyImageInfos> getImageInfos() {
        return this.imageInfos;
    }

    public DescribeImageListWithBaselineNameResponseBody setPageInfo(DescribeImageListWithBaselineNameResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeImageListWithBaselineNameResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeImageListWithBaselineNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageListWithBaselineNameResponseBodyImageInfos extends TeaModel {
        // The ID of the cluster.
        @NameInMap("ClusterId")
        public String clusterId;

        // The name of the cluster.
        @NameInMap("ClusterName")
        public String clusterName;

        // The ID of the container.
        @NameInMap("ContainerId")
        public String containerId;

        // The SHA-256 value of the image digest.
        @NameInMap("Digest")
        public String digest;

        // The number of images on which **high** baseline risks are detected.
        @NameInMap("HighRiskImage")
        public Integer highRiskImage;

        // The name of the image.
        @NameInMap("Image")
        public String image;

        // The timestamp when the image was created. Unit: milliseconds.
        @NameInMap("ImageCreate")
        public Long imageCreate;

        // The ID of the image.
        @NameInMap("ImageId")
        public String imageId;

        // The size of the image.
        @NameInMap("ImageSize")
        public Integer imageSize;

        // The timestamp when the image was updated. Unit: milliseconds.
        @NameInMap("ImageUpdate")
        public Long imageUpdate;

        // The ID of the image instance.
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("LastScanTime")
        public Long lastScanTime;

        // The number of images on which **low** baseline risks are detected.
        @NameInMap("LowRiskImage")
        public Integer lowRiskImage;

        // The number of images on which **medium** baseline risks are detected.
        @NameInMap("MiddleRiskImage")
        public Integer middleRiskImage;

        // The namespace.
        @NameInMap("Namespace")
        public String namespace;

        // The number of images that do not have baseline risks.
        @NameInMap("NoRiskImage")
        public Integer noRiskImage;

        // The pod.
        @NameInMap("Pod")
        public String pod;

        // The region ID of the image instance.
        @NameInMap("RegionId")
        public String regionId;

        // The ID of the image repository.
        @NameInMap("RepoId")
        public String repoId;

        // The name of the image repository.
        @NameInMap("RepoName")
        public String repoName;

        // The namespace to which the image repository belongs.
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        // The type of the image repository.
        @NameInMap("RepoType")
        public String repoType;

        // Indicates whether the image is at risk. Valid values:
        // 
        // *   **YES**
        // *   **NO**
        @NameInMap("RiskStatus")
        public String riskStatus;

        // The version of the image.
        @NameInMap("Tag")
        public String tag;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("TargetType")
        public String targetType;

        // The total number of risk items that are detected on the image by using the baseline.
        @NameInMap("TotalItemCount")
        public Integer totalItemCount;

        // The UUID of the image.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeImageListWithBaselineNameResponseBodyImageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageListWithBaselineNameResponseBodyImageInfos self = new DescribeImageListWithBaselineNameResponseBodyImageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setHighRiskImage(Integer highRiskImage) {
            this.highRiskImage = highRiskImage;
            return this;
        }
        public Integer getHighRiskImage() {
            return this.highRiskImage;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setImageCreate(Long imageCreate) {
            this.imageCreate = imageCreate;
            return this;
        }
        public Long getImageCreate() {
            return this.imageCreate;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setImageSize(Integer imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Integer getImageSize() {
            return this.imageSize;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setImageUpdate(Long imageUpdate) {
            this.imageUpdate = imageUpdate;
            return this;
        }
        public Long getImageUpdate() {
            return this.imageUpdate;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setLowRiskImage(Integer lowRiskImage) {
            this.lowRiskImage = lowRiskImage;
            return this;
        }
        public Integer getLowRiskImage() {
            return this.lowRiskImage;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setMiddleRiskImage(Integer middleRiskImage) {
            this.middleRiskImage = middleRiskImage;
            return this;
        }
        public Integer getMiddleRiskImage() {
            return this.middleRiskImage;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setNoRiskImage(Integer noRiskImage) {
            this.noRiskImage = noRiskImage;
            return this;
        }
        public Integer getNoRiskImage() {
            return this.noRiskImage;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setTotalItemCount(Integer totalItemCount) {
            this.totalItemCount = totalItemCount;
            return this;
        }
        public Integer getTotalItemCount() {
            return this.totalItemCount;
        }

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeImageListWithBaselineNameResponseBodyPageInfo extends TeaModel {
        // The number of the images returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page. Default value: **1**.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page. Default value: **10**.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of images on which baseline risks are detected.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageListWithBaselineNameResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageListWithBaselineNameResponseBodyPageInfo self = new DescribeImageListWithBaselineNameResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageListWithBaselineNameResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageListWithBaselineNameResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageListWithBaselineNameResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageListWithBaselineNameResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
