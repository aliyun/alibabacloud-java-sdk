// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetContactWhiteListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CountTotalRow")
    public Boolean countTotalRow;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2a830781-324e-4568-ae96-309f93090fe1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetContactWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContactWhiteListRequest self = new GetContactWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public GetContactWhiteListRequest setCountTotalRow(Boolean countTotalRow) {
        this.countTotalRow = countTotalRow;
        return this;
    }
    public Boolean getCountTotalRow() {
        return this.countTotalRow;
    }

    public GetContactWhiteListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetContactWhiteListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetContactWhiteListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
