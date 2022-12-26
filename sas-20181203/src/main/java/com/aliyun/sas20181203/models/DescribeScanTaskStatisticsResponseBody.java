// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScanTaskStatisticsResponseBody extends TeaModel {
    @NameInMap("DealedRiskNum")
    public Integer dealedRiskNum;

    @NameInMap("PersonalTaskNum")
    public Long personalTaskNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalTaskNum")
    public Long totalTaskNum;

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
