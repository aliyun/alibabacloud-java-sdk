// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListWithBaselineNameResponseBody extends TeaModel {
    /**
     * <p>The information about the images.</p>
     */
    @NameInMap("ImageInfos")
    public java.util.List<DescribeImageListWithBaselineNameResponseBodyImageInfos> imageInfos;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageListWithBaselineNameResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5B8C2156-2DB9-5A42-99E7-F2ED5AE9EA1F</p>
     */
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
        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c08d5fc1a329a4b88950a253d082f1****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>docker-law</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The ID of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>04d20e98c8e2c93b7b864372084320a15a58c8671e53c972ce3a71d9c163****</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The SHA-256 value of the image digest.</p>
         * 
         * <strong>example:</strong>
         * <p>2e6daffce524ffeae66cccaa90c8fc47de912346dcec295c27395b6d66db6423</p>
         */
        @NameInMap("Digest")
        public String digest;

        /**
         * <p>The timestamp generated when the first scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649814050000</p>
         */
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        /**
         * <p>The number of images on which <strong>high</strong> baseline risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HighRiskImage")
        public Integer highRiskImage;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-wulanchabu.aliyuncs.com/sas_test/huxin-test-001:nuxeo6-conta****</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The timestamp when the image was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1636962328000</p>
         */
        @NameInMap("ImageCreate")
        public Long imageCreate;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>cddb5fd33b34a1fabb358d0a19497cdfe362fe624821cb250947af0ea5cc****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The size of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>157408623</p>
         */
        @NameInMap("ImageSize")
        public Integer imageSize;

        /**
         * <p>The timestamp when the image was updated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1636974116000</p>
         */
        @NameInMap("ImageUpdate")
        public Long imageUpdate;

        /**
         * <p>The ID of the image instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-a595qp31knh9****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>pre.mongo-196</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>47.96.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The timestamp when the last baseline check was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649814050000</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The number of images on which <strong>low</strong> baseline risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LowRiskImage")
        public Integer lowRiskImage;

        /**
         * <p>The number of images on which <strong>medium</strong> baseline risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MiddleRiskImage")
        public Integer middleRiskImage;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-002</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The number of images that do not have baseline risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NoRiskImage")
        public Integer noRiskImage;

        /**
         * <p>The pod.</p>
         * 
         * <strong>example:</strong>
         * <p>22222-7xsqq</p>
         */
        @NameInMap("Pod")
        public String pod;

        /**
         * <p>The region ID of the image instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-1lt6q7167yh6****</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>scanner</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The namespace to which the image repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>libssh2</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <p>The type of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("RepoType")
        public String repoType;

        /**
         * <p>Indicates whether the image is at risk. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong></li>
         * <li><strong>NO</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("RiskStatus")
        public String riskStatus;

        /**
         * <p>The version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The ID of the asset on which the baseline check is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp17m0pc0xprzbwo****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the asset on which the baseline check is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>spod</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the asset on which the baseline check is performed. Valid values:</p>
         * <ul>
         * <li>ECS_IMAGE</li>
         * <li>ECS_SNAPSHOT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_IMAGE</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The total number of risk items that are detected on the image by using the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalItemCount")
        public Integer totalItemCount;

        /**
         * <p>The UUID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>f58681174f944623345379e23b7b****</p>
         */
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

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setFirstScanTime(Long firstScanTime) {
            this.firstScanTime = firstScanTime;
            return this;
        }
        public Long getFirstScanTime() {
            return this.firstScanTime;
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
        /**
         * <p>The number of the images returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of images on which baseline risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
