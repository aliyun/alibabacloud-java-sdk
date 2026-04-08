// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryTrafficControlTaskItemReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficControlTaskItemReports")
    public java.util.List<QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports> trafficControlTaskItemReports;

    public static QueryTrafficControlTaskItemReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrafficControlTaskItemReportResponseBody self = new QueryTrafficControlTaskItemReportResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrafficControlTaskItemReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTrafficControlTaskItemReportResponseBody setTrafficControlTaskItemReports(java.util.List<QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports> trafficControlTaskItemReports) {
        this.trafficControlTaskItemReports = trafficControlTaskItemReports;
        return this;
    }
    public java.util.List<QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports> getTrafficControlTaskItemReports() {
        return this.trafficControlTaskItemReports;
    }

    public static class QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ActualItemControlNum")
        public Long actualItemControlNum;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ActualItemControlTraffic")
        public Long actualItemControlTraffic;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("DoneItemControlNum")
        public Long doneItemControlNum;

        /**
         * <strong>example:</strong>
         * <p>20%</p>
         */
        @NameInMap("DoneItemControlPercentage")
        public String doneItemControlPercentage;

        /**
         * <strong>example:</strong>
         * <p>10%</p>
         */
        @NameInMap("ItemControlNumPercentage")
        public String itemControlNumPercentage;

        /**
         * <strong>example:</strong>
         * <p>20%</p>
         */
        @NameInMap("ItemControlTrafficPercentage")
        public String itemControlTrafficPercentage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OughtItemControlNum")
        public Long oughtItemControlNum;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OughtItemControlTraffic")
        public Long oughtItemControlTraffic;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TrafficControlTargetId")
        public String trafficControlTargetId;

        /**
         * <strong>example:</strong>
         * <p>item-1</p>
         */
        @NameInMap("TrafficControlTargetName")
        public String trafficControlTargetName;

        public static QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports build(java.util.Map<String, ?> map) throws Exception {
            QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports self = new QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports();
            return TeaModel.build(map, self);
        }

        public QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports setActualItemControlNum(Long actualItemControlNum) {
            this.actualItemControlNum = actualItemControlNum;
            return this;
        }
        public Long getActualItemControlNum() {
            return this.actualItemControlNum;
        }

        public QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports setActualItemControlTraffic(Long actualItemControlTraffic) {
            this.actualItemControlTraffic = actualItemControlTraffic;
            return this;
        }
        public Long getActualItemControlTraffic() {
            return this.actualItemControlTraffic;
        }

        public QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports setDoneItemControlNum(Long doneItemControlNum) {
            this.doneItemControlNum = doneItemControlNum;
            return this;
        }
        public Long getDoneItemControlNum() {
            return this.doneItemControlNum;
        }

        public QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports setDoneItemControlPercentage(String doneItemControlPercentage) {
            this.doneItemControlPercentage = doneItemControlPercentage;
            return this;
        }
        public String getDoneItemControlPercentage() {
            return this.doneItemControlPercentage;
        }

        public QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports setItemControlNumPercentage(String itemControlNumPercentage) {
            this.itemControlNumPercentage = itemControlNumPercentage;
            return this;
        }
        public String getItemControlNumPercentage() {
            return this.itemControlNumPercentage;
        }

        public QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports setItemControlTrafficPercentage(String itemControlTrafficPercentage) {
            this.itemControlTrafficPercentage = itemControlTrafficPercentage;
            return this;
        }
        public String getItemControlTrafficPercentage() {
            return this.itemControlTrafficPercentage;
        }

        public QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports setOughtItemControlNum(Long oughtItemControlNum) {
            this.oughtItemControlNum = oughtItemControlNum;
            return this;
        }
        public Long getOughtItemControlNum() {
            return this.oughtItemControlNum;
        }

        public QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports setOughtItemControlTraffic(Long oughtItemControlTraffic) {
            this.oughtItemControlTraffic = oughtItemControlTraffic;
            return this;
        }
        public Long getOughtItemControlTraffic() {
            return this.oughtItemControlTraffic;
        }

        public QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports setTrafficControlTargetId(String trafficControlTargetId) {
            this.trafficControlTargetId = trafficControlTargetId;
            return this;
        }
        public String getTrafficControlTargetId() {
            return this.trafficControlTargetId;
        }

        public QueryTrafficControlTaskItemReportResponseBodyTrafficControlTaskItemReports setTrafficControlTargetName(String trafficControlTargetName) {
            this.trafficControlTargetName = trafficControlTargetName;
            return this;
        }
        public String getTrafficControlTargetName() {
            return this.trafficControlTargetName;
        }

    }

}
