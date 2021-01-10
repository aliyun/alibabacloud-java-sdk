// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchCellgroupRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    @NameInMap("CellGroupId")
    public String cellGroupId;

    public static UpdateHasCloudarchCellgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchCellgroupRequest self = new UpdateHasCloudarchCellgroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchCellgroupRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public UpdateHasCloudarchCellgroupRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

    public UpdateHasCloudarchCellgroupRequest setCellGroupId(String cellGroupId) {
        this.cellGroupId = cellGroupId;
        return this;
    }
    public String getCellGroupId() {
        return this.cellGroupId;
    }

}
