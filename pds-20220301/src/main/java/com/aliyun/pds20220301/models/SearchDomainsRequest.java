// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchDomainsRequest extends TeaModel {
    /**
     * <p>预付费domain支持按订单实例ID搜索，通过下单接口获取对应的实例ID</p>
     */
    @NameInMap("instance_id")
    public String instanceId;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 100.</p>
     * <br>
     * <p>The number of returned results must be less than or equal to the specified number.</p>
     */
    @NameInMap("limit")
    public Long limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\</p>
     * <p>By default, this parameter is empty.</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The name of the domain. Fuzzy search is supported.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The sorting rule. Set the value to created_at, which specifies that the results are sorted based on the time when the domain was created.</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    public static SearchDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDomainsRequest self = new SearchDomainsRequest();
        return TeaModel.build(map, self);
    }

    public SearchDomainsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SearchDomainsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public SearchDomainsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public SearchDomainsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SearchDomainsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

}
