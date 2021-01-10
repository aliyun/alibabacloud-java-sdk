// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchCellRequest extends TeaModel {
    @NameInMap("CellId")
    public String cellId;

    public static DeleteHasCloudarchCellRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchCellRequest self = new DeleteHasCloudarchCellRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchCellRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

}
