// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDingTalkRequest extends TeaModel {
    /**
     * <p>The UID of the user.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The group IDs.</p>
     */
    @NameInMap("RuleActionName")
    public String ruleActionName;

    public static DescribeDingTalkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDingTalkRequest self = new DescribeDingTalkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDingTalkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDingTalkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDingTalkRequest setRuleActionName(String ruleActionName) {
        this.ruleActionName = ruleActionName;
        return this;
    }
    public String getRuleActionName() {
        return this.ruleActionName;
    }

}
