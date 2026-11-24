// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class ListMediaFoldersRequest extends TeaModel {
    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 50. If the value exceeds 50, it is truncated to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The project ID. If this parameter is not specified, the default project of the current account is used. The value format is <code>pd_{uid}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>pd_1585***</p>
     */
    @NameInMap("ProductionId")
    public String productionId;

    public static ListMediaFoldersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaFoldersRequest self = new ListMediaFoldersRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaFoldersRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListMediaFoldersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMediaFoldersRequest setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

}
