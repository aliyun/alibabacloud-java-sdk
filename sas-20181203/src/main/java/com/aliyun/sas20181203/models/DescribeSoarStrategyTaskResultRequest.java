// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyTaskResultRequest extends TeaModel {
    /**
     * <p>The condition parameter for task scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;status&quot;:1}</p>
     */
    @NameInMap("Condition")
    public String condition;

    /**
     * <p>The page number of the current page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The maximum number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the policy task.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeSoarStrategyTasks~~">DescribeSoarStrategyTasks</a> operation to obtain this parameter.</p>
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
