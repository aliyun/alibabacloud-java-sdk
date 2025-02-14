// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListTargetByBatchRequest extends TeaModel {
    /**
     * <p>The ID of the release batch.</p>
     * 
     * <strong>example:</strong>
     * <p>1371</p>
     */
    @NameInMap("BatchId")
    public Long batchId;

    /**
     * <p>The page number of the current page in a paginated query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Asset selection dimension. Values:</p>
     * <ul>
     * <li><strong>0</strong>: Machine instance</li>
     * <li><strong>1</strong>: Machine group</li>
     * <li><strong>2</strong>: VPC instance ID</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OperationBase")
    public Integer operationBase;

    /**
     * <p>The maximum number of items to return per page in a paginated query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListTargetByBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTargetByBatchRequest self = new ListTargetByBatchRequest();
        return TeaModel.build(map, self);
    }

    public ListTargetByBatchRequest setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

    public ListTargetByBatchRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTargetByBatchRequest setOperationBase(Integer operationBase) {
        this.operationBase = operationBase;
        return this;
    }
    public Integer getOperationBase() {
        return this.operationBase;
    }

    public ListTargetByBatchRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
