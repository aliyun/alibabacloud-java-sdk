// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyExecDetailRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StrategyId")
    public Integer strategyId;

    public static DescribeStrategyExecDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyExecDetailRequest self = new DescribeStrategyExecDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyExecDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeStrategyExecDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStrategyExecDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeStrategyExecDetailRequest setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Integer getStrategyId() {
        return this.strategyId;
    }

}
