// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListBySensitiveFileResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The information about the images.</p>
     */
    @NameInMap("ImageInfos")
    public java.util.List<DescribeImageListBySensitiveFileResponseBodyImageInfos> imageInfos;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageListBySensitiveFileResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E0C5C07F-1576-509A-AE44-1C36B8445B37</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The image digest.</p>
         * 
         * <strong>example:</strong>
         * <p>v005</p>
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
         * <p>The image instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-a595qp31knh9****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649814050000</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The ID of the region in which the image instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The image repository name.</p>
         * 
         * <strong>example:</strong>
         * <p>opa-test</p>
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
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The sensitive file status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unhandled</li>
         * <li><strong>1</strong>: ignored</li>
         * <li><strong>2</strong>: false positive</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag that is added to the image.</p>
         * 
         * <strong>example:</strong>
         * <p>nuxeo6</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The image UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>f58681174f944623345379e23b7b****</p>
         */
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

        public DescribeImageListBySensitiveFileResponseBodyImageInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
        /**
         * <p>The number of entries returned on the current page.</p>
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
         * <p>The key of the last data entry.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESGgoSChAKDGNvbXBsZXRlVGltZRABCgQiAggAGAAiQAoJAGYXFWIAAAAACjMDLgAAADFTNzMyZDMwMzAzMDM1Mzc3Njc4MzA2ODY5NmI2YTY1Nzg2NTcxNjE2NDc4NjE=</p>
         */
        @NameInMap("LastRowKey")
        public String lastRowKey;

        /**
         * <p>The number of entries returned per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
         */
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
