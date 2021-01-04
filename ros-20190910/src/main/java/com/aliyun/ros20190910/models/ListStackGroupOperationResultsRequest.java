// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationResultsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static ListStackGroupOperationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationResultsRequest self = new ListStackGroupOperationResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListStackGroupOperationResultsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListStackGroupOperationResultsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ListStackGroupOperationResultsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListStackGroupOperationResultsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

}
