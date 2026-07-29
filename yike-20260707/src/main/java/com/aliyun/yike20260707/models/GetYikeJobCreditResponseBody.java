// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetYikeJobCreditResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("CreditStatus")
    public String creditStatus;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("JobCreditCost")
    public Double jobCreditCost;

    /**
     * <strong>example:</strong>
     * <p>ag_12412424****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetYikeJobCreditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYikeJobCreditResponseBody self = new GetYikeJobCreditResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYikeJobCreditResponseBody setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
        return this;
    }
    public String getCreditStatus() {
        return this.creditStatus;
    }

    public GetYikeJobCreditResponseBody setJobCreditCost(Double jobCreditCost) {
        this.jobCreditCost = jobCreditCost;
        return this;
    }
    public Double getJobCreditCost() {
        return this.jobCreditCost;
    }

    public GetYikeJobCreditResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetYikeJobCreditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
