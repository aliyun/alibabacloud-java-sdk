// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchCellgroupRequest extends TeaModel {
    @NameInMap("CellGroupId")
    public String cellGroupId;

    public static DeleteHasCloudarchCellgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchCellgroupRequest self = new DeleteHasCloudarchCellgroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchCellgroupRequest setCellGroupId(String cellGroupId) {
        this.cellGroupId = cellGroupId;
        return this;
    }
    public String getCellGroupId() {
        return this.cellGroupId;
    }

}
