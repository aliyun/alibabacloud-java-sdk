// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListDisasterRecoveryPlansRequest extends TeaModel {
    /**
     * <p>The filter condition. Filters backup plans by backup name or backup description.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-c97xxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListDisasterRecoveryPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDisasterRecoveryPlansRequest self = new ListDisasterRecoveryPlansRequest();
        return TeaModel.build(map, self);
    }

    public ListDisasterRecoveryPlansRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListDisasterRecoveryPlansRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDisasterRecoveryPlansRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDisasterRecoveryPlansRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
