// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetContactBlockListRequest extends TeaModel {
    @NameInMap("CountTotalRow")
    public Boolean countTotalRow;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetContactBlockListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContactBlockListRequest self = new GetContactBlockListRequest();
        return TeaModel.build(map, self);
    }

    public GetContactBlockListRequest setCountTotalRow(Boolean countTotalRow) {
        this.countTotalRow = countTotalRow;
        return this;
    }
    public Boolean getCountTotalRow() {
        return this.countTotalRow;
    }

    public GetContactBlockListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetContactBlockListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetContactBlockListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
