// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainLogResponseBody extends TeaModel {
    /**
     * <p>The detailed data of Alibaba Cloud CDN logs.</p>
     */
    @NameInMap("DomainLogDetails")
    public DescribeVodDomainLogResponseBodyDomainLogDetails domainLogDetails;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodDomainLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainLogResponseBody self = new DescribeVodDomainLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainLogResponseBody setDomainLogDetails(DescribeVodDomainLogResponseBodyDomainLogDetails domainLogDetails) {
        this.domainLogDetails = domainLogDetails;
        return this;
    }
    public DescribeVodDomainLogResponseBodyDomainLogDetails getDomainLogDetails() {
        return this.domainLogDetails;
    }

    public DescribeVodDomainLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail extends TeaModel {
        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Queries the information about the raw access logs for a specific domain name, including the log path.</p>
         */
        @NameInMap("LogName")
        public String logName;

        @NameInMap("LogPath")
        public String logPath;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("LogSize")
        public Long logSize;

        /**
         * <p>The pagination settings of Alibaba Cloud CDN logs.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail self = new DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }
        public Long getLogSize() {
            return this.logSize;
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos extends TeaModel {
        @NameInMap("LogInfoDetail")
        public java.util.List<DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> logInfoDetail;

        public static DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos self = new DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos setLogInfoDetail(java.util.List<DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> logInfoDetail) {
            this.logInfoDetail = logInfoDetail;
            return this;
        }
        public java.util.List<DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> getLogInfoDetail() {
            return this.logInfoDetail;
        }

    }

    public static class DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos self = new DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail extends TeaModel {
        /**
         * <p>The domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The detailed information about Alibaba Cloud CDN logs.</p>
         */
        @NameInMap("LogCount")
        public Long logCount;

        /**
         * <p>The path of the log file.</p>
         */
        @NameInMap("LogInfos")
        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos logInfos;

        @NameInMap("PageInfos")
        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos pageInfos;

        public static DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail self = new DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail setLogCount(Long logCount) {
            this.logCount = logCount;
            return this;
        }
        public Long getLogCount() {
            return this.logCount;
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail setLogInfos(DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos logInfos) {
            this.logInfos = logInfos;
            return this;
        }
        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos getLogInfos() {
            return this.logInfos;
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail setPageInfos(DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos pageInfos) {
            this.pageInfos = pageInfos;
            return this;
        }
        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos getPageInfos() {
            return this.pageInfos;
        }

    }

    public static class DescribeVodDomainLogResponseBodyDomainLogDetails extends TeaModel {
        @NameInMap("DomainLogDetail")
        public java.util.List<DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail> domainLogDetail;

        public static DescribeVodDomainLogResponseBodyDomainLogDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainLogResponseBodyDomainLogDetails self = new DescribeVodDomainLogResponseBodyDomainLogDetails();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetails setDomainLogDetail(java.util.List<DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail> domainLogDetail) {
            this.domainLogDetail = domainLogDetail;
            return this;
        }
        public java.util.List<DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail> getDomainLogDetail() {
            return this.domainLogDetail;
        }

    }

}
