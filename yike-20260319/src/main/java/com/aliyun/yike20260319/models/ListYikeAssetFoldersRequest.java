// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class ListYikeAssetFoldersRequest extends TeaModel {
    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The project ID. If this parameter is not specified, the default project is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>ProductionId</p>
     */
    @NameInMap("ProductionId")
    public String productionId;

    public static ListYikeAssetFoldersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListYikeAssetFoldersRequest self = new ListYikeAssetFoldersRequest();
        return TeaModel.build(map, self);
    }

    public ListYikeAssetFoldersRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListYikeAssetFoldersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListYikeAssetFoldersRequest setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

}
