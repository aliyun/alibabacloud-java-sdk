// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstanceStateReportsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("StateReports")
    public java.util.List<ListInstanceStateReportsResponseBodyStateReports> stateReports;

    public static ListInstanceStateReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStateReportsResponseBody self = new ListInstanceStateReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceStateReportsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstanceStateReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceStateReportsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstanceStateReportsResponseBody setStateReports(java.util.List<ListInstanceStateReportsResponseBodyStateReports> stateReports) {
        this.stateReports = stateReports;
        return this;
    }
    public java.util.List<ListInstanceStateReportsResponseBodyStateReports> getStateReports() {
        return this.stateReports;
    }

    public static class ListInstanceStateReportsResponseBodyStateReports extends TeaModel {
        @NameInMap("ReportStatus")
        public String reportStatus;

        @NameInMap("ReportInfo")
        public String reportInfo;

        @NameInMap("SuccessApplyTime")
        public String successApplyTime;

        @NameInMap("StateConfigurationId")
        public String stateConfigurationId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("ReportTime")
        public String reportTime;

        public static ListInstanceStateReportsResponseBodyStateReports build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceStateReportsResponseBodyStateReports self = new ListInstanceStateReportsResponseBodyStateReports();
            return TeaModel.build(map, self);
        }

        public ListInstanceStateReportsResponseBodyStateReports setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

        public ListInstanceStateReportsResponseBodyStateReports setReportInfo(String reportInfo) {
            this.reportInfo = reportInfo;
            return this;
        }
        public String getReportInfo() {
            return this.reportInfo;
        }

        public ListInstanceStateReportsResponseBodyStateReports setSuccessApplyTime(String successApplyTime) {
            this.successApplyTime = successApplyTime;
            return this;
        }
        public String getSuccessApplyTime() {
            return this.successApplyTime;
        }

        public ListInstanceStateReportsResponseBodyStateReports setStateConfigurationId(String stateConfigurationId) {
            this.stateConfigurationId = stateConfigurationId;
            return this;
        }
        public String getStateConfigurationId() {
            return this.stateConfigurationId;
        }

        public ListInstanceStateReportsResponseBodyStateReports setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceStateReportsResponseBodyStateReports setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListInstanceStateReportsResponseBodyStateReports setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

    }

}
