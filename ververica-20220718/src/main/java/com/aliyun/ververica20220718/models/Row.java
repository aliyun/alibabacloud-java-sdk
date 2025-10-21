// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Row extends TeaModel {
    @NameInMap("cells")
    public java.util.List<Cell> cells;

    public static Row build(java.util.Map<String, ?> map) throws Exception {
        Row self = new Row();
        return TeaModel.build(map, self);
    }

    public Row setCells(java.util.List<Cell> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<Cell> getCells() {
        return this.cells;
    }

}
