// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScanTaskStatisticsResponseBody extends TeaModel {
    /**
     * <p>The number of risks that are handled for the user.</p>
     */
    @NameInMap("DealedRiskNum")
    public Integer dealedRiskNum;

    /**
     * <p>The total number of tasks that are created for the user.</p>
     */
    @NameInMap("PersonalTaskNum")
    public Long personalTaskNum;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of virus detection tasks.</p>
     */
    @NameInMap("TotalTaskNum")
    public Long totalTaskNum;

    /**
     * <p>The number of risks that are detected for the user.</p>
     */
    @NameInMap("UserNum")
    public Long userNum;

    public static DescribeScanTaskStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanTaskStatisticsResponseBody self = new DescribeScanTaskStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScanTaskStatisticsResponseBody setDealedRiskNum(Integer dealedRiskNum) {
        this.dealedRiskNum = dealedRiskNum;
        return this;
    }
    public Integer getDealedRiskNum() {
        return this.dealedRiskNum;
    }

    public DescribeScanTaskStatisticsResponseBody setPersonalTaskNum(Long personalTaskNum) {
        this.personalTaskNum = personalTaskNum;
        return this;
    }
    public Long getPersonalTaskNum() {
        return this.personalTaskNum;
    }

    public DescribeScanTaskStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScanTaskStatisticsResponseBody setTotalTaskNum(Long totalTaskNum) {
        this.totalTaskNum = totalTaskNum;
        return this;
    }
    public Long getTotalTaskNum() {
        return this.totalTaskNum;
    }

    public DescribeScanTaskStatisticsResponseBody setUserNum(Long userNum) {
        this.userNum = userNum;
        return this;
    }
    public Long getUserNum() {
        return this.userNum;
    }

}
