// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeNewPlayVideoPlaySessionListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeNewPlayVideoPlaySessionListResponseBodyData> data;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ReadyTs")
    public Long readyTs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public Long totalNum;

    public static DescribeNewPlayVideoPlaySessionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewPlayVideoPlaySessionListResponseBody self = new DescribeNewPlayVideoPlaySessionListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNewPlayVideoPlaySessionListResponseBody setData(java.util.List<DescribeNewPlayVideoPlaySessionListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeNewPlayVideoPlaySessionListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeNewPlayVideoPlaySessionListResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeNewPlayVideoPlaySessionListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeNewPlayVideoPlaySessionListResponseBody setReadyTs(Long readyTs) {
        this.readyTs = readyTs;
        return this;
    }
    public Long getReadyTs() {
        return this.readyTs;
    }

    public DescribeNewPlayVideoPlaySessionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNewPlayVideoPlaySessionListResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class DescribeNewPlayVideoPlaySessionListResponseBodyData extends TeaModel {
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("UUID")
        public String UUID;

        @NameInMap("VPS")
        public String VPS;

        public static DescribeNewPlayVideoPlaySessionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNewPlayVideoPlaySessionListResponseBodyData self = new DescribeNewPlayVideoPlaySessionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNewPlayVideoPlaySessionListResponseBodyData setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public DescribeNewPlayVideoPlaySessionListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNewPlayVideoPlaySessionListResponseBodyData setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribeNewPlayVideoPlaySessionListResponseBodyData setUUID(String UUID) {
            this.UUID = UUID;
            return this;
        }
        public String getUUID() {
            return this.UUID;
        }

        public DescribeNewPlayVideoPlaySessionListResponseBodyData setVPS(String VPS) {
            this.VPS = VPS;
            return this;
        }
        public String getVPS() {
            return this.VPS;
        }

    }

}
