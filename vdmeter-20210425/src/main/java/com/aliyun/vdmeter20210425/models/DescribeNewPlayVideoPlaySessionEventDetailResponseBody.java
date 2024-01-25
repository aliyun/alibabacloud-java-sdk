// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeNewPlayVideoPlaySessionEventDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData> data;

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

    public static DescribeNewPlayVideoPlaySessionEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewPlayVideoPlaySessionEventDetailResponseBody self = new DescribeNewPlayVideoPlaySessionEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNewPlayVideoPlaySessionEventDetailResponseBody setData(java.util.List<DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData> getData() {
        return this.data;
    }

    public DescribeNewPlayVideoPlaySessionEventDetailResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeNewPlayVideoPlaySessionEventDetailResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeNewPlayVideoPlaySessionEventDetailResponseBody setReadyTs(Long readyTs) {
        this.readyTs = readyTs;
        return this;
    }
    public Long getReadyTs() {
        return this.readyTs;
    }

    public DescribeNewPlayVideoPlaySessionEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNewPlayVideoPlaySessionEventDetailResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData extends TeaModel {
        @NameInMap("BizTime")
        public String bizTime;

        @NameInMap("Cost")
        public String cost;

        @NameInMap("Details")
        public String details;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("IP")
        public String IP;

        @NameInMap("ISP")
        public String ISP;

        @NameInMap("IsNormal")
        public Integer isNormal;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Region")
        public String region;

        @NameInMap("Subject")
        public String subject;

        public static DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData self = new DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData setBizTime(String bizTime) {
            this.bizTime = bizTime;
            return this;
        }
        public String getBizTime() {
            return this.bizTime;
        }

        public DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData setCost(String cost) {
            this.cost = cost;
            return this;
        }
        public String getCost() {
            return this.cost;
        }

        public DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData setDetails(String details) {
            this.details = details;
            return this;
        }
        public String getDetails() {
            return this.details;
        }

        public DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData setIsNormal(Integer isNormal) {
            this.isNormal = isNormal;
            return this;
        }
        public Integer getIsNormal() {
            return this.isNormal;
        }

        public DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeNewPlayVideoPlaySessionEventDetailResponseBodyData setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

}
