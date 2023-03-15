// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationResultsRequest extends TeaModel {
    /**
     * <p>The ID of the operation.</p>
     * <br>
     * <p>You can call the [ListStackGroupOperations](~~151342~~) operation to query the operation ID.</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>*   Pages start from page 1.</p>
     * <p>*   Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>*   Valid values: 1 to 50.</p>
     * <p>*   Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the stack group.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListStackGroupOperationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationResultsRequest self = new ListStackGroupOperationResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListStackGroupOperationResultsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ListStackGroupOperationResultsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListStackGroupOperationResultsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListStackGroupOperationResultsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
