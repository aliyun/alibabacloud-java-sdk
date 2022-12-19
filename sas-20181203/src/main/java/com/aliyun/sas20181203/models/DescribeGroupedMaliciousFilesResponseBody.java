// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedMaliciousFilesResponseBody extends TeaModel {
    // An array that consists of the malicious image samples.
    @NameInMap("GroupedMaliciousFileResponse")
    public java.util.List<DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse> groupedMaliciousFileResponse;

    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeGroupedMaliciousFilesResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGroupedMaliciousFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedMaliciousFilesResponseBody self = new DescribeGroupedMaliciousFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedMaliciousFilesResponseBody setGroupedMaliciousFileResponse(java.util.List<DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse> groupedMaliciousFileResponse) {
        this.groupedMaliciousFileResponse = groupedMaliciousFileResponse;
        return this;
    }
    public java.util.List<DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse> getGroupedMaliciousFileResponse() {
        return this.groupedMaliciousFileResponse;
    }

    public DescribeGroupedMaliciousFilesResponseBody setPageInfo(DescribeGroupedMaliciousFilesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeGroupedMaliciousFilesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeGroupedMaliciousFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse extends TeaModel {
        // The timestamp when the first scan was performed. Unit: milliseconds.
        @NameInMap("FirstScanTimestamp")
        public Long firstScanTimestamp;

        // The number of affected images.
        @NameInMap("ImageCount")
        public Long imageCount;

        // The timestamp when the last scan was performed. Unit: milliseconds.
        @NameInMap("LatestScanTimestamp")
        public Long latestScanTimestamp;

        // The severity of the malicious image sample. Valid values:
        // 
        // *   **serious**
        // *   **suspicious**
        // *   **remind**
        @NameInMap("Level")
        public String level;

        // The MD5 hash value of the malicious image sample.
        @NameInMap("MaliciousMd5")
        public String maliciousMd5;

        // The name of the malicious image sample.
        @NameInMap("MaliciousName")
        public String maliciousName;

        // The handling status of the malicious image sample. Valid values:
        // 
        // *   **0**: unhandled
        // *   **1**: handled
        // *   **2**: verifying
        // *   **3**: added to the whitelist
        @NameInMap("Status")
        public Integer status;

        public static DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse self = new DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse setFirstScanTimestamp(Long firstScanTimestamp) {
            this.firstScanTimestamp = firstScanTimestamp;
            return this;
        }
        public Long getFirstScanTimestamp() {
            return this.firstScanTimestamp;
        }

        public DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse setImageCount(Long imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Long getImageCount() {
            return this.imageCount;
        }

        public DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse setLatestScanTimestamp(Long latestScanTimestamp) {
            this.latestScanTimestamp = latestScanTimestamp;
            return this;
        }
        public Long getLatestScanTimestamp() {
            return this.latestScanTimestamp;
        }

        public DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse setMaliciousMd5(String maliciousMd5) {
            this.maliciousMd5 = maliciousMd5;
            return this;
        }
        public String getMaliciousMd5() {
            return this.maliciousMd5;
        }

        public DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse setMaliciousName(String maliciousName) {
            this.maliciousName = maliciousName;
            return this;
        }
        public String getMaliciousName() {
            return this.maliciousName;
        }

        public DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class DescribeGroupedMaliciousFilesResponseBodyPageInfo extends TeaModel {
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page. Default value: **20**.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeGroupedMaliciousFilesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedMaliciousFilesResponseBodyPageInfo self = new DescribeGroupedMaliciousFilesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedMaliciousFilesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeGroupedMaliciousFilesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeGroupedMaliciousFilesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeGroupedMaliciousFilesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
