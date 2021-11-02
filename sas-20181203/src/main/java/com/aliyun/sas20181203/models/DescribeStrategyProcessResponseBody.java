// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyProcessResponseBody extends TeaModel {
    @NameInMap("ExecStatus")
    public Integer execStatus;

    @NameInMap("PassRate")
    public String passRate;

    @NameInMap("ProcessRate")
    public Integer processRate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StrategyId")
    public Long strategyId;

    public static DescribeStrategyProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyProcessResponseBody self = new DescribeStrategyProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyProcessResponseBody setExecStatus(Integer execStatus) {
        this.execStatus = execStatus;
        return this;
    }
    public Integer getExecStatus() {
        return this.execStatus;
    }

    public DescribeStrategyProcessResponseBody setPassRate(String passRate) {
        this.passRate = passRate;
        return this;
    }
    public String getPassRate() {
        return this.passRate;
    }

    public DescribeStrategyProcessResponseBody setProcessRate(Integer processRate) {
        this.processRate = processRate;
        return this;
    }
    public Integer getProcessRate() {
        return this.processRate;
    }

    public DescribeStrategyProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStrategyProcessResponseBody setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

}
