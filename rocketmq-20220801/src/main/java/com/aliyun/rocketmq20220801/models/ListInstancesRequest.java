// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The filter condition that is used to query instances. If you do not configure this parameter, all instances are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-7e22ody****</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <p>The number of the page to return.</p>
     * <p>Valid values: 1 to 100000000.</p>
     * <p>If the value that you specify for this parameter is less than 1, the system uses 1 as the value. If the value that you specify for this parameter is greater than 100000000, the system uses 100000000 as the value.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * <p>Valid values: 10 to 200.</p>
     * <p>If the value that you specify for this parameter is less than 10, the system uses 10 as the value. If the value that you specify for this parameter is greater than 200, the system uses 200 as the value.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmx7caj******</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags that are used to filter instances.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;: &quot;rmq-test&quot;, &quot;value&quot;: &quot;test&quot;}]</p>
     */
    @NameInMap("tags")
    public String tags;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListInstancesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
