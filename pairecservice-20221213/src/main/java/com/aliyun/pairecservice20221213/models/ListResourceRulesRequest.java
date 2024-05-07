// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListResourceRulesRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceRuleId")
    public String resourceRuleId;

    @NameInMap("ResourceRuleName")
    public String resourceRuleName;

    @NameInMap("SortBy")
    public String sortBy;

    public static ListResourceRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRulesRequest self = new ListResourceRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceRulesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ListResourceRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListResourceRulesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListResourceRulesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceRulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListResourceRulesRequest setResourceRuleId(String resourceRuleId) {
        this.resourceRuleId = resourceRuleId;
        return this;
    }
    public String getResourceRuleId() {
        return this.resourceRuleId;
    }

    public ListResourceRulesRequest setResourceRuleName(String resourceRuleName) {
        this.resourceRuleName = resourceRuleName;
        return this;
    }
    public String getResourceRuleName() {
        return this.resourceRuleName;
    }

    public ListResourceRulesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
