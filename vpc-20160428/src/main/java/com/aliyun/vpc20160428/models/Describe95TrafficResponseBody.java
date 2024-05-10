// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class Describe95TrafficResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information returned.</p>
     */
    @NameInMap("Traffic95Summary")
    public Describe95TrafficResponseBodyTraffic95Summary traffic95Summary;

    public static Describe95TrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Describe95TrafficResponseBody self = new Describe95TrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public Describe95TrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Describe95TrafficResponseBody setTraffic95Summary(Describe95TrafficResponseBodyTraffic95Summary traffic95Summary) {
        this.traffic95Summary = traffic95Summary;
        return this;
    }
    public Describe95TrafficResponseBodyTraffic95Summary getTraffic95Summary() {
        return this.traffic95Summary;
    }

    public static class Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailListTraffic95Detail extends TeaModel {
        /**
         * <p>The sampled bandwidth value, which is the larger bandwidth value in the inbound and outbound directions within a sampling interval. Unit: Mbit/s.</p>
         */
        @NameInMap("BillBandwidth")
        public String billBandwidth;

        /**
         * <p>The inbound bandwidth. Unit: Mbit/s.</p>
         */
        @NameInMap("InBandwidth")
        public String inBandwidth;

        /**
         * <p>The outbound bandwidth. Unit: Mbit/s.</p>
         */
        @NameInMap("OutBandwidth")
        public String outBandwidth;

        /**
         * <p>The statistical time. The value is a string.</p>
         */
        @NameInMap("Time")
        public String time;

        public static Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailListTraffic95Detail build(java.util.Map<String, ?> map) throws Exception {
            Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailListTraffic95Detail self = new Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailListTraffic95Detail();
            return TeaModel.build(map, self);
        }

        public Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailListTraffic95Detail setBillBandwidth(String billBandwidth) {
            this.billBandwidth = billBandwidth;
            return this;
        }
        public String getBillBandwidth() {
            return this.billBandwidth;
        }

        public Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailListTraffic95Detail setInBandwidth(String inBandwidth) {
            this.inBandwidth = inBandwidth;
            return this;
        }
        public String getInBandwidth() {
            return this.inBandwidth;
        }

        public Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailListTraffic95Detail setOutBandwidth(String outBandwidth) {
            this.outBandwidth = outBandwidth;
            return this;
        }
        public String getOutBandwidth() {
            return this.outBandwidth;
        }

        public Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailListTraffic95Detail setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailList extends TeaModel {
        @NameInMap("Traffic95Detail")
        public java.util.List<Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailListTraffic95Detail> traffic95Detail;

        public static Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailList build(java.util.Map<String, ?> map) throws Exception {
            Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailList self = new Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailList();
            return TeaModel.build(map, self);
        }

        public Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailList setTraffic95Detail(java.util.List<Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailListTraffic95Detail> traffic95Detail) {
            this.traffic95Detail = traffic95Detail;
            return this;
        }
        public java.util.List<Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailListTraffic95Detail> getTraffic95Detail() {
            return this.traffic95Detail;
        }

    }

    public static class Describe95TrafficResponseBodyTraffic95Summary extends TeaModel {
        /**
         * <p>The peak bandwidth of the Internet Shared Bandwidth instance. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The daily peak bandwidth. Unit: Mbit/s.</p>
         * <p><props="china"> For more information, see [Daily peak bandwidth](https://help.aliyun.com/document_detail/89729.html).</p>
         */
        @NameInMap("FifthPeakBandwidth")
        public String fifthPeakBandwidth;

        /**
         * <p>The resource ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The metering method of the Internet Shared Bandwidth instance. Valid values:</p>
         * <br>
         * <p>*   PayBy95: pay-by-enhanced-95th-percentile</p>
         * <p>*   PayByBandwidth: pay-by-bandwidth</p>
         * <p>*   PayByDominantTraffic: pay-by-dominant-traffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The guaranteed bandwidth of the Internet Shared Bandwidth instance. Unit: Mbit/s.</p>
         */
        @NameInMap("MinimumConsumeBandwidth")
        public String minimumConsumeBandwidth;

        /**
         * <p>The average bandwidth every 5 minutes in the inbound and outbound directions.</p>
         */
        @NameInMap("Traffic95DetailList")
        public Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailList traffic95DetailList;

        public static Describe95TrafficResponseBodyTraffic95Summary build(java.util.Map<String, ?> map) throws Exception {
            Describe95TrafficResponseBodyTraffic95Summary self = new Describe95TrafficResponseBodyTraffic95Summary();
            return TeaModel.build(map, self);
        }

        public Describe95TrafficResponseBodyTraffic95Summary setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public Describe95TrafficResponseBodyTraffic95Summary setFifthPeakBandwidth(String fifthPeakBandwidth) {
            this.fifthPeakBandwidth = fifthPeakBandwidth;
            return this;
        }
        public String getFifthPeakBandwidth() {
            return this.fifthPeakBandwidth;
        }

        public Describe95TrafficResponseBodyTraffic95Summary setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public Describe95TrafficResponseBodyTraffic95Summary setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public Describe95TrafficResponseBodyTraffic95Summary setMinimumConsumeBandwidth(String minimumConsumeBandwidth) {
            this.minimumConsumeBandwidth = minimumConsumeBandwidth;
            return this;
        }
        public String getMinimumConsumeBandwidth() {
            return this.minimumConsumeBandwidth;
        }

        public Describe95TrafficResponseBodyTraffic95Summary setTraffic95DetailList(Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailList traffic95DetailList) {
            this.traffic95DetailList = traffic95DetailList;
            return this;
        }
        public Describe95TrafficResponseBodyTraffic95SummaryTraffic95DetailList getTraffic95DetailList() {
            return this.traffic95DetailList;
        }

    }

}
