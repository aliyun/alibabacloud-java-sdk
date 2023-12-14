// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayAutoPlansResponseBody extends TeaModel {
    @NameInMap("AutoPlans")
    public java.util.List<DescribeGatewayAutoPlansResponseBodyAutoPlans> autoPlans;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGatewayAutoPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayAutoPlansResponseBody self = new DescribeGatewayAutoPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayAutoPlansResponseBody setAutoPlans(java.util.List<DescribeGatewayAutoPlansResponseBodyAutoPlans> autoPlans) {
        this.autoPlans = autoPlans;
        return this;
    }
    public java.util.List<DescribeGatewayAutoPlansResponseBodyAutoPlans> getAutoPlans() {
        return this.autoPlans;
    }

    public DescribeGatewayAutoPlansResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayAutoPlansResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayAutoPlansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGatewayAutoPlansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGatewayAutoPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayAutoPlansResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGatewayAutoPlansResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGatewayAutoPlansResponseBodyAutoPlans extends TeaModel {
        @NameInMap("Detail")
        public String detail;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Event")
        public String event;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        public static DescribeGatewayAutoPlansResponseBodyAutoPlans build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayAutoPlansResponseBodyAutoPlans self = new DescribeGatewayAutoPlansResponseBodyAutoPlans();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayAutoPlansResponseBodyAutoPlans setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeGatewayAutoPlansResponseBodyAutoPlans setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeGatewayAutoPlansResponseBodyAutoPlans setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public DescribeGatewayAutoPlansResponseBodyAutoPlans setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public DescribeGatewayAutoPlansResponseBodyAutoPlans setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeGatewayAutoPlansResponseBodyAutoPlans setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
