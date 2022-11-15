// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class InsertResult extends TeaModel {
    @NameInMap("AutoIncrementKey")
    public Long autoIncrementKey;

    @NameInMap("NumberOfRecordsUpdated")
    public Long numberOfRecordsUpdated;

    public static InsertResult build(java.util.Map<String, ?> map) throws Exception {
        InsertResult self = new InsertResult();
        return TeaModel.build(map, self);
    }

    public InsertResult setAutoIncrementKey(Long autoIncrementKey) {
        this.autoIncrementKey = autoIncrementKey;
        return this;
    }
    public Long getAutoIncrementKey() {
        return this.autoIncrementKey;
    }

    public InsertResult setNumberOfRecordsUpdated(Long numberOfRecordsUpdated) {
        this.numberOfRecordsUpdated = numberOfRecordsUpdated;
        return this;
    }
    public Long getNumberOfRecordsUpdated() {
        return this.numberOfRecordsUpdated;
    }

}
