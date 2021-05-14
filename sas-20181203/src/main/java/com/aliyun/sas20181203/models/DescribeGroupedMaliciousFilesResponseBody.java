// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedMaliciousFilesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribeGroupedMaliciousFilesResponseBodyPageInfo pageInfo;

    @NameInMap("GroupedMaliciousFileResponse")
    public java.util.List<DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse> groupedMaliciousFileResponse;

    public static DescribeGroupedMaliciousFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedMaliciousFilesResponseBody self = new DescribeGroupedMaliciousFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedMaliciousFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupedMaliciousFilesResponseBody setPageInfo(DescribeGroupedMaliciousFilesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeGroupedMaliciousFilesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeGroupedMaliciousFilesResponseBody setGroupedMaliciousFileResponse(java.util.List<DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse> groupedMaliciousFileResponse) {
        this.groupedMaliciousFileResponse = groupedMaliciousFileResponse;
        return this;
    }
    public java.util.List<DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse> getGroupedMaliciousFileResponse() {
        return this.groupedMaliciousFileResponse;
    }

    public static class DescribeGroupedMaliciousFilesResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribeGroupedMaliciousFilesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedMaliciousFilesResponseBodyPageInfo self = new DescribeGroupedMaliciousFilesResponseBodyPageInfo();
            return TeaModel.build(map, self);
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

        public DescribeGroupedMaliciousFilesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("ImageCount")
        public Long imageCount;

        @NameInMap("LatestScanTimestamp")
        public Long latestScanTimestamp;

        @NameInMap("MaliciousName")
        public String maliciousName;

        @NameInMap("MaliciousMd5")
        public String maliciousMd5;

        @NameInMap("FirstScanTimestamp")
        public Long firstScanTimestamp;

        @NameInMap("Level")
        public String level;

        public static DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse self = new DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
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

        public DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse setMaliciousName(String maliciousName) {
            this.maliciousName = maliciousName;
            return this;
        }
        public String getMaliciousName() {
            return this.maliciousName;
        }

        public DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse setMaliciousMd5(String maliciousMd5) {
            this.maliciousMd5 = maliciousMd5;
            return this;
        }
        public String getMaliciousMd5() {
            return this.maliciousMd5;
        }

        public DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse setFirstScanTimestamp(Long firstScanTimestamp) {
            this.firstScanTimestamp = firstScanTimestamp;
            return this;
        }
        public Long getFirstScanTimestamp() {
            return this.firstScanTimestamp;
        }

        public DescribeGroupedMaliciousFilesResponseBodyGroupedMaliciousFileResponse setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
