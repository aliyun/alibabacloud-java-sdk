// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeTransformStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeTransformStatusResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>173CA69A-3513-591D-8A09-C1EA37CBE2D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTransformStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransformStatusResponseBody self = new DescribeTransformStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransformStatusResponseBody setData(DescribeTransformStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTransformStatusResponseBodyData getData() {
        return this.data;
    }

    public DescribeTransformStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTransformStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanCancel")
        public Boolean canCancel;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanFinish")
        public Boolean canFinish;

        @NameInMap("CanSwitch")
        public Boolean canSwitch;

        @NameInMap("CanUndoSwitch")
        public Boolean canUndoSwitch;

        /**
         * <strong>example:</strong>
         * <p>pxc-*****</p>
         */
        @NameInMap("EnterpriseInsName")
        public String enterpriseInsName;

        /**
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("Phase")
        public String phase;

        @NameInMap("ReportSummary")
        public java.util.Map<String, ?> reportSummary;

        /**
         * <strong>example:</strong>
         * <p>2025-09-02 16:52:47.0</p>
         */
        @NameInMap("ReportTime")
        public Long reportTime;

        /**
         * <strong>example:</strong>
         * <p>pxc-*****</p>
         */
        @NameInMap("StandardInsName")
        public String standardInsName;

        public static DescribeTransformStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransformStatusResponseBodyData self = new DescribeTransformStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTransformStatusResponseBodyData setCanCancel(Boolean canCancel) {
            this.canCancel = canCancel;
            return this;
        }
        public Boolean getCanCancel() {
            return this.canCancel;
        }

        public DescribeTransformStatusResponseBodyData setCanFinish(Boolean canFinish) {
            this.canFinish = canFinish;
            return this;
        }
        public Boolean getCanFinish() {
            return this.canFinish;
        }

        public DescribeTransformStatusResponseBodyData setCanSwitch(Boolean canSwitch) {
            this.canSwitch = canSwitch;
            return this;
        }
        public Boolean getCanSwitch() {
            return this.canSwitch;
        }

        public DescribeTransformStatusResponseBodyData setCanUndoSwitch(Boolean canUndoSwitch) {
            this.canUndoSwitch = canUndoSwitch;
            return this;
        }
        public Boolean getCanUndoSwitch() {
            return this.canUndoSwitch;
        }

        public DescribeTransformStatusResponseBodyData setEnterpriseInsName(String enterpriseInsName) {
            this.enterpriseInsName = enterpriseInsName;
            return this;
        }
        public String getEnterpriseInsName() {
            return this.enterpriseInsName;
        }

        public DescribeTransformStatusResponseBodyData setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public DescribeTransformStatusResponseBodyData setReportSummary(java.util.Map<String, ?> reportSummary) {
            this.reportSummary = reportSummary;
            return this;
        }
        public java.util.Map<String, ?> getReportSummary() {
            return this.reportSummary;
        }

        public DescribeTransformStatusResponseBodyData setReportTime(Long reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public Long getReportTime() {
            return this.reportTime;
        }

        public DescribeTransformStatusResponseBodyData setStandardInsName(String standardInsName) {
            this.standardInsName = standardInsName;
            return this;
        }
        public String getStandardInsName() {
            return this.standardInsName;
        }

    }

}
