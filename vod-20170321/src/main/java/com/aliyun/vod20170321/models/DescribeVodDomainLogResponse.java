// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainLogResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainLogDetails")
    @Validation(required = true)
    public DescribeVodDomainLogResponseDomainLogDetails domainLogDetails;

    public static DescribeVodDomainLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainLogResponse self = new DescribeVodDomainLogResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail extends TeaModel {
        @NameInMap("LogName")
        @Validation(required = true)
        public String logName;

        @NameInMap("LogPath")
        @Validation(required = true)
        public String logPath;

        @NameInMap("LogSize")
        @Validation(required = true)
        public Long logSize;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        public static DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail self = new DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailLogInfos extends TeaModel {
        @NameInMap("LogInfoDetail")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> logInfoDetail;

        public static DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailLogInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailLogInfos self = new DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailLogInfos();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailPageInfos extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Long pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Long pageSize;

        @NameInMap("Total")
        @Validation(required = true)
        public Long total;

        public static DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailPageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailPageInfos self = new DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailPageInfos();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetail extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("LogCount")
        @Validation(required = true)
        public Long logCount;

        @NameInMap("LogInfos")
        @Validation(required = true)
        public DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailLogInfos logInfos;

        @NameInMap("PageInfos")
        @Validation(required = true)
        public DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetailPageInfos pageInfos;

        public static DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetail self = new DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetail();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainLogResponseDomainLogDetails extends TeaModel {
        @NameInMap("DomainLogDetail")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainLogResponseDomainLogDetailsDomainLogDetail> domainLogDetail;

        public static DescribeVodDomainLogResponseDomainLogDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainLogResponseDomainLogDetails self = new DescribeVodDomainLogResponseDomainLogDetails();
            return TeaModel.build(map, self);
        }

    }

}
