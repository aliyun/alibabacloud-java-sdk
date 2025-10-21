// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class RowUpdate extends TeaModel {
    @NameInMap("row")
    public Row row;

    @NameInMap("rowKind")
    public String rowKind;

    public static RowUpdate build(java.util.Map<String, ?> map) throws Exception {
        RowUpdate self = new RowUpdate();
        return TeaModel.build(map, self);
    }

    public RowUpdate setRow(Row row) {
        this.row = row;
        return this;
    }
    public Row getRow() {
        return this.row;
    }

    public RowUpdate setRowKind(String rowKind) {
        this.rowKind = rowKind;
        return this;
    }
    public String getRowKind() {
        return this.rowKind;
    }

}
