// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyTaskResultRequest extends TeaModel {
    /**
     * <p>Condition parameters for task scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;status&quot;:1}</p>
     */
    @NameInMap("Condition")
    public String condition;

    /**
     * <p>The current page number during paginated queries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The maximum number of entries to display per page during paginated queries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Strategy task ID.</p>
     * <blockquote>
     * <p>You can obtain this parameter by calling the <a href="~~DescribeSoarStrategyTasks~~">DescribeSoarStrategyTasks</a> interface.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StrategyTaskId")
    public Long strategyTaskId;

    public static DescribeSoarStrategyTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategyTaskResultRequest self = new DescribeSoarStrategyTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategyTaskResultRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public DescribeSoarStrategyTaskResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSoarStrategyTaskResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSoarStrategyTaskResultRequest setStrategyTaskId(Long strategyTaskId) {
        this.strategyTaskId = strategyTaskId;
        return this;
    }
    public Long getStrategyTaskId() {
        return this.strategyTaskId;
    }

}
