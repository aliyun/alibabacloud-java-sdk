// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchCelldetailRequest extends TeaModel {
    @NameInMap("CellId")
    public String cellId;

    public static QueryHasCloudarchCelldetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchCelldetailRequest self = new QueryHasCloudarchCelldetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchCelldetailRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

}
