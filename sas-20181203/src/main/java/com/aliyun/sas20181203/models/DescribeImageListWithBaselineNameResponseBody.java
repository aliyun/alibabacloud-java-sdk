// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListWithBaselineNameResponseBody extends TeaModel {
    @NameInMap("ImageInfos")
    public java.util.List<DescribeImageListWithBaselineNameResponseBodyImageInfos> imageInfos;

    @NameInMap("PageInfo")
    public DescribeImageListWithBaselineNameResponseBodyPageInfo pageInfo;

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
        @NameInMap("Digest")
        public String digest;

        @NameInMap("HighRiskImage")
        public Integer highRiskImage;

        @NameInMap("ImageCreate")
        public Long imageCreate;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageSize")
        public Integer imageSize;

        @NameInMap("ImageUpdate")
        public Long imageUpdate;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LowRiskImage")
        public Integer lowRiskImage;

        @NameInMap("MiddleRiskImage")
        public Integer middleRiskImage;

        @NameInMap("NoRiskImage")
        public Integer noRiskImage;

        @NameInMap("RegionId")
        public String regionId;

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

        @NameInMap("Tag")
        public String tag;

        @NameInMap("TotalItemCount")
        public Integer totalItemCount;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeImageListWithBaselineNameResponseBodyImageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageListWithBaselineNameResponseBodyImageInfos self = new DescribeImageListWithBaselineNameResponseBodyImageInfos();
            return TeaModel.build(map, self);
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

        public DescribeImageListWithBaselineNameResponseBodyImageInfos setNoRiskImage(Integer noRiskImage) {
            this.noRiskImage = noRiskImage;
            return this;
        }
        public Integer getNoRiskImage() {
            return this.noRiskImage;
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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
