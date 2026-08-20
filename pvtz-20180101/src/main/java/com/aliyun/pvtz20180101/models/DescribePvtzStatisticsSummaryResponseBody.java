// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsSummaryResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurPage")
    public Integer curPage;

    /**
     * <p>A list of statistical entries for the current page.</p>
     */
    @NameInMap("PageData")
    public java.util.List<DescribePvtzStatisticsSummaryResponseBodyPageData> pageData;

    /**
     * <p>The number of entries per page. The maximum value is <strong>100</strong>. The default value is <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F0FCB52A-D512-41A0-8595-40234EDCFD8B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalSize")
    public Integer totalSize;

    public static DescribePvtzStatisticsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePvtzStatisticsSummaryResponseBody self = new DescribePvtzStatisticsSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePvtzStatisticsSummaryResponseBody setCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }
    public Integer getCurPage() {
        return this.curPage;
    }

    public DescribePvtzStatisticsSummaryResponseBody setPageData(java.util.List<DescribePvtzStatisticsSummaryResponseBodyPageData> pageData) {
        this.pageData = pageData;
        return this;
    }
    public java.util.List<DescribePvtzStatisticsSummaryResponseBodyPageData> getPageData() {
        return this.pageData;
    }

    public DescribePvtzStatisticsSummaryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePvtzStatisticsSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePvtzStatisticsSummaryResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribePvtzStatisticsSummaryResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class DescribePvtzStatisticsSummaryResponseBodyPageData extends TeaModel {
        /**
         * <p>The UNIX timestamp for the start of the current statistical period, rounded down to the minute.</p>
         * 
         * <strong>example:</strong>
         * <p>1776774900000</p>
         */
        @NameInMap("AggrTimestamp")
        public Long aggrTimestamp;

        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-ni1iadds-2c8uyzvgrm5ftsnq.clb.gz-tencentclb.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The fluctuation rate.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("FluctuationValue")
        public Integer fluctuationValue;

        /**
         * <p>The average resolution latency, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Latency")
        public Long latency;

        /**
         * <p>The resolution line.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Line")
        public String line;

        /**
         * <p>The statistics module.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTHORITY</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>The value from the previous statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>2227</p>
         */
        @NameInMap("PreviousCount")
        public Long previousCount;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The DNS query type.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("Qtype")
        public String qtype;

        /**
         * <p>The success rate.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Ratio")
        public Long ratio;

        /**
         * <p>The DNS response code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Rcode")
        public String rcode;

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>110.19.60.72</p>
         */
        @NameInMap("SourceIp")
        public String sourceIp;

        /**
         * <p>The source ISP of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        @NameInMap("SourceIsp")
        public String sourceIsp;

        /**
         * <p>The source region of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("SourceRegion")
        public String sourceRegion;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1uvv79h1t8unnzdh3nq</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone. The operation\&quot;s behavior depends on whether you specify this parameter:</p>
         * <ul>
         * <li><p>If you specify a ZoneId, the operation returns the change log of DNS records for that zone.<br></p>
         * </li>
         * <li><p>If you omit ZoneId, the operation returns the change log of all zone operations and DNS resolution changes for all zones in your account.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>479226c2db1f9bed449b0502c13bcd9d</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The zone name.</p>
         * 
         * <strong>example:</strong>
         * <p>bwcj.biz</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribePvtzStatisticsSummaryResponseBodyPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribePvtzStatisticsSummaryResponseBodyPageData self = new DescribePvtzStatisticsSummaryResponseBodyPageData();
            return TeaModel.build(map, self);
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setAggrTimestamp(Long aggrTimestamp) {
            this.aggrTimestamp = aggrTimestamp;
            return this;
        }
        public Long getAggrTimestamp() {
            return this.aggrTimestamp;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setFluctuationValue(Integer fluctuationValue) {
            this.fluctuationValue = fluctuationValue;
            return this;
        }
        public Integer getFluctuationValue() {
            return this.fluctuationValue;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setLatency(Long latency) {
            this.latency = latency;
            return this;
        }
        public Long getLatency() {
            return this.latency;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setPreviousCount(Long previousCount) {
            this.previousCount = previousCount;
            return this;
        }
        public Long getPreviousCount() {
            return this.previousCount;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setQtype(String qtype) {
            this.qtype = qtype;
            return this;
        }
        public String getQtype() {
            return this.qtype;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setRatio(Long ratio) {
            this.ratio = ratio;
            return this;
        }
        public Long getRatio() {
            return this.ratio;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setRcode(String rcode) {
            this.rcode = rcode;
            return this;
        }
        public String getRcode() {
            return this.rcode;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setSourceIsp(String sourceIsp) {
            this.sourceIsp = sourceIsp;
            return this;
        }
        public String getSourceIsp() {
            return this.sourceIsp;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribePvtzStatisticsSummaryResponseBodyPageData setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
