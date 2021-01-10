// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchCellRequest extends TeaModel {
    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    @NameInMap("CellId")
    public String cellId;

    public static UpdateHasCloudarchCellRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchCellRequest self = new UpdateHasCloudarchCellRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchCellRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

    public UpdateHasCloudarchCellRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

}
