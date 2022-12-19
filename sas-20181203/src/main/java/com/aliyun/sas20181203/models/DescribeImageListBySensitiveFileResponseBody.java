// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListBySensitiveFileResponseBody extends TeaModel {
    // The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
    @NameInMap("Code")
    public String code;

    // The HTTP status code.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // An array that consists of the information about the images.
    @NameInMap("ImageInfos")
    public java.util.List<DescribeImageListBySensitiveFileResponseBodyImageInfos> imageInfos;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeImageListBySensitiveFileResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // - **true**: The request was successful.
    // - **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static DescribeImageListBySensitiveFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListBySensitiveFileResponseBody self = new DescribeImageListBySensitiveFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageListBySensitiveFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeImageListBySensitiveFileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeImageListBySensitiveFileResponseBody setImageInfos(java.util.List<DescribeImageListBySensitiveFileResponseBodyImageInfos> imageInfos) {
        this.imageInfos = imageInfos;
        return this;
    }
    public java.util.List<DescribeImageListBySensitiveFileResponseBodyImageInfos> getImageInfos() {
        return this.imageInfos;
    }

    public DescribeImageListBySensitiveFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeImageListBySensitiveFileResponseBody setPageInfo(DescribeImageListBySensitiveFileResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeImageListBySensitiveFileResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeImageListBySensitiveFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageListBySensitiveFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeImageListBySensitiveFileResponseBodyImageInfos extends TeaModel {
        // The image digest.
        @NameInMap("Digest")
        public String digest;

        // The UNIX timestamp of when the first scan was performed. Unit: milliseconds.
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        // The ID of the image instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The UNIX timestamp of when the last scan was performed. Unit: milliseconds.
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        // The region ID of the image instance.
        @NameInMap("RegionId")
        public String regionId;

        // The name of the image repository.
        @NameInMap("RepoName")
        public String repoName;

        // The namespace to which the image repository belongs.
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        // The risk level. Valid values:
        // - **high**
        // - **medium**
        // - **low**
        @NameInMap("RiskLevel")
        public String riskLevel;

        // The tag that is added to the image.
        @NameInMap("Tag")
        public String tag;

        // The UUID of the image.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeImageListBySensitiveFileResponseBodyImageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageListBySensitiveFileResponseBodyImageInfos self = new DescribeImageListBySensitiveFileResponseBodyImageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeImageListBySensitiveFileResponseBodyImageInfos setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public DescribeImageListBySensitiveFileResponseBodyImageInfos setFirstScanTime(Long firstScanTime) {
            this.firstScanTime = firstScanTime;
            return this;
        }
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        public DescribeImageListBySensitiveFileResponseBodyImageInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeImageListBySensitiveFileResponseBodyImageInfos setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public DescribeImageListBySensitiveFileResponseBodyImageInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeImageListBySensitiveFileResponseBodyImageInfos setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeImageListBySensitiveFileResponseBodyImageInfos setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public DescribeImageListBySensitiveFileResponseBodyImageInfos setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeImageListBySensitiveFileResponseBodyImageInfos setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeImageListBySensitiveFileResponseBodyImageInfos setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeImageListBySensitiveFileResponseBodyPageInfo extends TeaModel {
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The key of the last data entry.
        @NameInMap("LastRowKey")
        public String lastRowKey;

        // The number of entries returned per page. Default value: 20.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageListBySensitiveFileResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageListBySensitiveFileResponseBodyPageInfo self = new DescribeImageListBySensitiveFileResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageListBySensitiveFileResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageListBySensitiveFileResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageListBySensitiveFileResponseBodyPageInfo setLastRowKey(String lastRowKey) {
            this.lastRowKey = lastRowKey;
            return this;
        }
        public String getLastRowKey() {
            return this.lastRowKey;
        }

        public DescribeImageListBySensitiveFileResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageListBySensitiveFileResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
