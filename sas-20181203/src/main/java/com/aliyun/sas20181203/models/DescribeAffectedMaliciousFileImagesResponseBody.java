// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAffectedMaliciousFileImagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribeAffectedMaliciousFileImagesResponseBodyPageInfo pageInfo;

    @NameInMap("AffectedMaliciousFileImagesResponse")
    public java.util.List<DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse> affectedMaliciousFileImagesResponse;

    public static DescribeAffectedMaliciousFileImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAffectedMaliciousFileImagesResponseBody self = new DescribeAffectedMaliciousFileImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAffectedMaliciousFileImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAffectedMaliciousFileImagesResponseBody setPageInfo(DescribeAffectedMaliciousFileImagesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeAffectedMaliciousFileImagesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeAffectedMaliciousFileImagesResponseBody setAffectedMaliciousFileImagesResponse(java.util.List<DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse> affectedMaliciousFileImagesResponse) {
        this.affectedMaliciousFileImagesResponse = affectedMaliciousFileImagesResponse;
        return this;
    }
    public java.util.List<DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse> getAffectedMaliciousFileImagesResponse() {
        return this.affectedMaliciousFileImagesResponse;
    }

    public static class DescribeAffectedMaliciousFileImagesResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribeAffectedMaliciousFileImagesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAffectedMaliciousFileImagesResponseBodyPageInfo self = new DescribeAffectedMaliciousFileImagesResponseBodyPageInfo();
            return TeaModel.build(map, self);
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

        public DescribeAffectedMaliciousFileImagesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Digest")
        public String digest;

        @NameInMap("LatestVerifyTimestamp")
        public Long latestVerifyTimestamp;

        @NameInMap("RepoInstanceId")
        public String repoInstanceId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("RepoRegionId")
        public String repoRegionId;

        @NameInMap("ImageUuid")
        public String imageUuid;

        @NameInMap("FirstScanTimestamp")
        public Long firstScanTimestamp;

        @NameInMap("MaliciousMd5")
        public String maliciousMd5;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("Layer")
        public String layer;

        @NameInMap("LatestScanTimestamp")
        public Long latestScanTimestamp;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("Level")
        public String level;

        public static DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse self = new DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse();
            return TeaModel.build(map, self);
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setLatestVerifyTimestamp(Long latestVerifyTimestamp) {
            this.latestVerifyTimestamp = latestVerifyTimestamp;
            return this;
        }
        public Long getLatestVerifyTimestamp() {
            return this.latestVerifyTimestamp;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setRepoInstanceId(String repoInstanceId) {
            this.repoInstanceId = repoInstanceId;
            return this;
        }
        public String getRepoInstanceId() {
            return this.repoInstanceId;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setRepoRegionId(String repoRegionId) {
            this.repoRegionId = repoRegionId;
            return this;
        }
        public String getRepoRegionId() {
            return this.repoRegionId;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setImageUuid(String imageUuid) {
            this.imageUuid = imageUuid;
            return this;
        }
        public String getImageUuid() {
            return this.imageUuid;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setFirstScanTimestamp(Long firstScanTimestamp) {
            this.firstScanTimestamp = firstScanTimestamp;
            return this;
        }
        public Long getFirstScanTimestamp() {
            return this.firstScanTimestamp;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setMaliciousMd5(String maliciousMd5) {
            this.maliciousMd5 = maliciousMd5;
            return this;
        }
        public String getMaliciousMd5() {
            return this.maliciousMd5;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setLatestScanTimestamp(Long latestScanTimestamp) {
            this.latestScanTimestamp = latestScanTimestamp;
            return this;
        }
        public Long getLatestScanTimestamp() {
            return this.latestScanTimestamp;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeAffectedMaliciousFileImagesResponseBodyAffectedMaliciousFileImagesResponse setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
