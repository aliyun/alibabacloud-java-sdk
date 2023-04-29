// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAffectedMaliciousFileImagesResponseBody extends TeaModel {
    /**
     * <p>The region ID of the image repository.</p>
     */
    @NameInMap("AffectedMaliciousFileImagesResponse")
    public java.util.List<DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse> affectedMaliciousFileImagesResponse;

    /**
     * <p>The ID of the container image.</p>
     */
    @NameInMap("PageInfo")
    public DescribeAffectedMaliciousFileImagesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the container image.</p>
     * <br>
     * <p>>  You can call the [ListRepository](~~145293~~) operation to query the IDs of container images from the value of the **InstanceId** response parameter.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAffectedMaliciousFileImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAffectedMaliciousFileImagesResponseBody self = new DescribeAffectedMaliciousFileImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAffectedMaliciousFileImagesResponseBody setAffectedMaliciousFileImagesResponse(java.util.List<DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse> affectedMaliciousFileImagesResponse) {
        this.affectedMaliciousFileImagesResponse = affectedMaliciousFileImagesResponse;
        return this;
    }
    public java.util.List<DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse> getAffectedMaliciousFileImagesResponse() {
        return this.affectedMaliciousFileImagesResponse;
    }

    public DescribeAffectedMaliciousFileImagesResponseBody setPageInfo(DescribeAffectedMaliciousFileImagesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeAffectedMaliciousFileImagesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeAffectedMaliciousFileImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("Digest")
        public String digest;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The number of entries returned per page. Default value: **20**.</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The ID of the container.</p>
         */
        @NameInMap("FirstScanTimestamp")
        public Long firstScanTimestamp;

        @NameInMap("HighLight")
        public String highLight;

        @NameInMap("Image")
        public String image;

        /**
         * <p>The namespace to which the image repository belongs.</p>
         * <br>
         * <p>>  Fuzzy match is supported.</p>
         */
        @NameInMap("ImageUuid")
        public String imageUuid;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>Queries the details of malicious image samples.</p>
         */
        @NameInMap("LatestScanTimestamp")
        public Long latestScanTimestamp;

        /**
         * <p>The ID of the image repository.</p>
         * <br>
         * <p>>  You can call the [ListRepository](~~145293~~) operation to query the IDs of image repositories from the value of the **RepoId** response parameter.</p>
         */
        @NameInMap("LatestVerifyTimestamp")
        public Long latestVerifyTimestamp;

        /**
         * <p>The pod.</p>
         */
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Level")
        public String level;

        /**
         * <p>The pod.</p>
         */
        @NameInMap("MaliciousMd5")
        public String maliciousMd5;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Pod")
        public String pod;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The timestamp of the last verification.</p>
         */
        @NameInMap("RepoInstanceId")
        public String repoInstanceId;

        /**
         * <p>DescribeAffectedMaliciousFileImages</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("RepoRegionId")
        public String repoRegionId;

        /**
         * <p>The name of the image repository.</p>
         * <br>
         * <p>>  Fuzzy match is supported.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The UUID of the image.</p>
         */
        @NameInMap("Tag")
        public String tag;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse self = new DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse();
            return TeaModel.build(map, self);
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setFirstScanTimestamp(Long firstScanTimestamp) {
            this.firstScanTimestamp = firstScanTimestamp;
            return this;
        }
        public Long getFirstScanTimestamp() {
            return this.firstScanTimestamp;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setHighLight(String highLight) {
            this.highLight = highLight;
            return this;
        }
        public String getHighLight() {
            return this.highLight;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setImageUuid(String imageUuid) {
            this.imageUuid = imageUuid;
            return this;
        }
        public String getImageUuid() {
            return this.imageUuid;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setLatestScanTimestamp(Long latestScanTimestamp) {
            this.latestScanTimestamp = latestScanTimestamp;
            return this;
        }
        public Long getLatestScanTimestamp() {
            return this.latestScanTimestamp;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setLatestVerifyTimestamp(Long latestVerifyTimestamp) {
            this.latestVerifyTimestamp = latestVerifyTimestamp;
            return this;
        }
        public Long getLatestVerifyTimestamp() {
            return this.latestVerifyTimestamp;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setMaliciousMd5(String maliciousMd5) {
            this.maliciousMd5 = maliciousMd5;
            return this;
        }
        public String getMaliciousMd5() {
            return this.maliciousMd5;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setRepoInstanceId(String repoInstanceId) {
            this.repoInstanceId = repoInstanceId;
            return this;
        }
        public String getRepoInstanceId() {
            return this.repoInstanceId;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setRepoRegionId(String repoRegionId) {
            this.repoRegionId = repoRegionId;
            return this;
        }
        public String getRepoRegionId() {
            return this.repoRegionId;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeAffectedMaliciousFileImagesResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The URL to download the malicious image sample.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The image digest.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The tag that is added to the image.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The types of the assets that you want to scan.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAffectedMaliciousFileImagesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAffectedMaliciousFileImagesResponseBodyPageInfo self = new DescribeAffectedMaliciousFileImagesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
