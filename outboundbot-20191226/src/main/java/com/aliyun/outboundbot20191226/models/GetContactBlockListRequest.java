// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetContactBlockListRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CountTotalRow")
    public Boolean countTotalRow;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>846e20ae-e113-4231-a792-cb354187c9f6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries (required)</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
