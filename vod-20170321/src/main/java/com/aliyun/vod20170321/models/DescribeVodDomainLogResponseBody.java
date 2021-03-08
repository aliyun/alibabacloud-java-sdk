// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainLogDetails")
    public DescribeVodDomainLogResponseBodyDomainLogDetails domainLogDetails;

    public static DescribeVodDomainLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainLogResponseBody self = new DescribeVodDomainLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodDomainLogResponseBody setDomainLogDetails(DescribeVodDomainLogResponseBodyDomainLogDetails domainLogDetails) {
        this.domainLogDetails = domainLogDetails;
        return this;
    }
    public DescribeVodDomainLogResponseBodyDomainLogDetails getDomainLogDetails() {
        return this.domainLogDetails;
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

    public static class DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("LogPath")
        public String logPath;

        @NameInMap("LogSize")
        public Long logSize;

        @NameInMap("LogName")
        public String logName;

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

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
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

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
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

    public static class DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail extends TeaModel {
        @NameInMap("PageInfos")
        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos pageInfos;

        @NameInMap("LogCount")
        public Long logCount;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("LogInfos")
        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos logInfos;

        public static DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail self = new DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail setPageInfos(DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos pageInfos) {
            this.pageInfos = pageInfos;
            return this;
        }
        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos getPageInfos() {
            return this.pageInfos;
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail setLogCount(Long logCount) {
            this.logCount = logCount;
            return this;
        }
        public Long getLogCount() {
            return this.logCount;
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetail setLogInfos(DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos logInfos) {
            this.logInfos = logInfos;
            return this;
        }
        public DescribeVodDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos getLogInfos() {
            return this.logInfos;
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
