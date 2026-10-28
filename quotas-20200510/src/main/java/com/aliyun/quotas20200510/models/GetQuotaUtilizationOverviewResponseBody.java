// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaUtilizationOverviewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>RAM.PERMISSION.DENIED</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>You are not authorized to do this action or the API input parameter is invalid.</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>2026-10-21T07:30:10Z</p>
     */
    @NameInMap("GeneratedAt")
    public String generatedAt;

    /**
     * <strong>example:</strong>
     * <p>Quota utilization data is available.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("QuotaOverview")
    public GetQuotaUtilizationOverviewResponseBodyQuotaOverview quotaOverview;

    /**
     * <strong>example:</strong>
     * <p>920D8A47-26BB-49FA-A09F-F98D7DAA55F3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetQuotaUtilizationOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaUtilizationOverviewResponseBody self = new GetQuotaUtilizationOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaUtilizationOverviewResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetQuotaUtilizationOverviewResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetQuotaUtilizationOverviewResponseBody setGeneratedAt(String generatedAt) {
        this.generatedAt = generatedAt;
        return this;
    }
    public String getGeneratedAt() {
        return this.generatedAt;
    }

    public GetQuotaUtilizationOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQuotaUtilizationOverviewResponseBody setQuotaOverview(GetQuotaUtilizationOverviewResponseBodyQuotaOverview quotaOverview) {
        this.quotaOverview = quotaOverview;
        return this;
    }
    public GetQuotaUtilizationOverviewResponseBodyQuotaOverview getQuotaOverview() {
        return this.quotaOverview;
    }

    public GetQuotaUtilizationOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQuotaUtilizationOverviewResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetQuotaUtilizationOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQuotaUtilizationOverviewResponseBodyQuotaOverviewInUse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Adjustable")
        public Long adjustable;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("AdjustableRatio")
        public Double adjustableRatio;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetQuotaUtilizationOverviewResponseBodyQuotaOverviewInUse build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaUtilizationOverviewResponseBodyQuotaOverviewInUse self = new GetQuotaUtilizationOverviewResponseBodyQuotaOverviewInUse();
            return TeaModel.build(map, self);
        }

        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewInUse setAdjustable(Long adjustable) {
            this.adjustable = adjustable;
            return this;
        }
        public Long getAdjustable() {
            return this.adjustable;
        }

        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewInUse setAdjustableRatio(Double adjustableRatio) {
            this.adjustableRatio = adjustableRatio;
            return this;
        }
        public Double getAdjustableRatio() {
            return this.adjustableRatio;
        }

        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewInUse setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver80Percent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Adjustable")
        public Long adjustable;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("AdjustableRatio")
        public Double adjustableRatio;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver80Percent build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver80Percent self = new GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver80Percent();
            return TeaModel.build(map, self);
        }

        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver80Percent setAdjustable(Long adjustable) {
            this.adjustable = adjustable;
            return this;
        }
        public Long getAdjustable() {
            return this.adjustable;
        }

        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver80Percent setAdjustableRatio(Double adjustableRatio) {
            this.adjustableRatio = adjustableRatio;
            return this;
        }
        public Double getAdjustableRatio() {
            return this.adjustableRatio;
        }

        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver80Percent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver95Percent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Adjustable")
        public Long adjustable;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("AdjustableRatio")
        public Double adjustableRatio;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver95Percent build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver95Percent self = new GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver95Percent();
            return TeaModel.build(map, self);
        }

        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver95Percent setAdjustable(Long adjustable) {
            this.adjustable = adjustable;
            return this;
        }
        public Long getAdjustable() {
            return this.adjustable;
        }

        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver95Percent setAdjustableRatio(Double adjustableRatio) {
            this.adjustableRatio = adjustableRatio;
            return this;
        }
        public Double getAdjustableRatio() {
            return this.adjustableRatio;
        }

        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver95Percent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetQuotaUtilizationOverviewResponseBodyQuotaOverview extends TeaModel {
        @NameInMap("InUse")
        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewInUse inUse;

        @NameInMap("Over80Percent")
        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver80Percent over80Percent;

        @NameInMap("Over95Percent")
        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver95Percent over95Percent;

        public static GetQuotaUtilizationOverviewResponseBodyQuotaOverview build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaUtilizationOverviewResponseBodyQuotaOverview self = new GetQuotaUtilizationOverviewResponseBodyQuotaOverview();
            return TeaModel.build(map, self);
        }

        public GetQuotaUtilizationOverviewResponseBodyQuotaOverview setInUse(GetQuotaUtilizationOverviewResponseBodyQuotaOverviewInUse inUse) {
            this.inUse = inUse;
            return this;
        }
        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewInUse getInUse() {
            return this.inUse;
        }

        public GetQuotaUtilizationOverviewResponseBodyQuotaOverview setOver80Percent(GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver80Percent over80Percent) {
            this.over80Percent = over80Percent;
            return this;
        }
        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver80Percent getOver80Percent() {
            return this.over80Percent;
        }

        public GetQuotaUtilizationOverviewResponseBodyQuotaOverview setOver95Percent(GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver95Percent over95Percent) {
            this.over95Percent = over95Percent;
            return this;
        }
        public GetQuotaUtilizationOverviewResponseBodyQuotaOverviewOver95Percent getOver95Percent() {
            return this.over95Percent;
        }

    }

}
