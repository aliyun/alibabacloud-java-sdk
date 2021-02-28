// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnTopDomainsByFlowResponseBody extends TeaModel {
    @NameInMap("TopDomains")
    public DescribeScdnTopDomainsByFlowResponseBodyTopDomains topDomains;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainOnlineCount")
    public Long domainOnlineCount;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DomainCount")
    public Long domainCount;

    public static DescribeScdnTopDomainsByFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnTopDomainsByFlowResponseBody self = new DescribeScdnTopDomainsByFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnTopDomainsByFlowResponseBody setTopDomains(DescribeScdnTopDomainsByFlowResponseBodyTopDomains topDomains) {
        this.topDomains = topDomains;
        return this;
    }
    public DescribeScdnTopDomainsByFlowResponseBodyTopDomains getTopDomains() {
        return this.topDomains;
    }

    public DescribeScdnTopDomainsByFlowResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnTopDomainsByFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnTopDomainsByFlowResponseBody setDomainOnlineCount(Long domainOnlineCount) {
        this.domainOnlineCount = domainOnlineCount;
        return this;
    }
    public Long getDomainOnlineCount() {
        return this.domainOnlineCount;
    }

    public DescribeScdnTopDomainsByFlowResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeScdnTopDomainsByFlowResponseBody setDomainCount(Long domainCount) {
        this.domainCount = domainCount;
        return this;
    }
    public Long getDomainCount() {
        return this.domainCount;
    }

    public static class DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain extends TeaModel {
        @NameInMap("MaxBps")
        public Long maxBps;

        @NameInMap("Rank")
        public Long rank;

        @NameInMap("TotalAccess")
        public Long totalAccess;

        @NameInMap("TrafficPercent")
        public String trafficPercent;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("TotalTraffic")
        public String totalTraffic;

        @NameInMap("MaxBpsTime")
        public String maxBpsTime;

        public static DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain self = new DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain();
            return TeaModel.build(map, self);
        }

        public DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setMaxBps(Long maxBps) {
            this.maxBps = maxBps;
            return this;
        }
        public Long getMaxBps() {
            return this.maxBps;
        }

        public DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setRank(Long rank) {
            this.rank = rank;
            return this;
        }
        public Long getRank() {
            return this.rank;
        }

        public DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setTotalAccess(Long totalAccess) {
            this.totalAccess = totalAccess;
            return this;
        }
        public Long getTotalAccess() {
            return this.totalAccess;
        }

        public DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setTrafficPercent(String trafficPercent) {
            this.trafficPercent = trafficPercent;
            return this;
        }
        public String getTrafficPercent() {
            return this.trafficPercent;
        }

        public DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setTotalTraffic(String totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }
        public String getTotalTraffic() {
            return this.totalTraffic;
        }

        public DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setMaxBpsTime(String maxBpsTime) {
            this.maxBpsTime = maxBpsTime;
            return this;
        }
        public String getMaxBpsTime() {
            return this.maxBpsTime;
        }

    }

    public static class DescribeScdnTopDomainsByFlowResponseBodyTopDomains extends TeaModel {
        @NameInMap("TopDomain")
        public java.util.List<DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain> topDomain;

        public static DescribeScdnTopDomainsByFlowResponseBodyTopDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnTopDomainsByFlowResponseBodyTopDomains self = new DescribeScdnTopDomainsByFlowResponseBodyTopDomains();
            return TeaModel.build(map, self);
        }

        public DescribeScdnTopDomainsByFlowResponseBodyTopDomains setTopDomain(java.util.List<DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain> topDomain) {
            this.topDomain = topDomain;
            return this;
        }
        public java.util.List<DescribeScdnTopDomainsByFlowResponseBodyTopDomainsTopDomain> getTopDomain() {
            return this.topDomain;
        }

    }

}
