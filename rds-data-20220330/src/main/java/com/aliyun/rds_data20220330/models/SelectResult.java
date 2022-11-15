// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class SelectResult extends TeaModel {
    @NameInMap("Records")
    public java.util.List<java.util.Map<String, ?>> records;

    public static SelectResult build(java.util.Map<String, ?> map) throws Exception {
        SelectResult self = new SelectResult();
        return TeaModel.build(map, self);
    }

    public SelectResult setRecords(java.util.List<java.util.Map<String, ?>> records) {
        this.records = records;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getRecords() {
        return this.records;
    }

}
