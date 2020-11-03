// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetColumnObjectsRequest extends TeaModel {
    // 表ID
    @NameInMap("TableId")
    public String tableId;

    public static GetColumnObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetColumnObjectsRequest self = new GetColumnObjectsRequest();
        return TeaModel.build(map, self);
    }

    public GetColumnObjectsRequest setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

}
