// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class InsertListResult extends TeaModel {
    @NameInMap("AutoIncrementKeys")
    public java.util.List<Long> autoIncrementKeys;

    @NameInMap("NumberOfRecordsUpdated")
    public Long numberOfRecordsUpdated;

    public static InsertListResult build(java.util.Map<String, ?> map) throws Exception {
        InsertListResult self = new InsertListResult();
        return TeaModel.build(map, self);
    }

    public InsertListResult setAutoIncrementKeys(java.util.List<Long> autoIncrementKeys) {
        this.autoIncrementKeys = autoIncrementKeys;
        return this;
    }
    public java.util.List<Long> getAutoIncrementKeys() {
        return this.autoIncrementKeys;
    }

    public InsertListResult setNumberOfRecordsUpdated(Long numberOfRecordsUpdated) {
        this.numberOfRecordsUpdated = numberOfRecordsUpdated;
        return this;
    }
    public Long getNumberOfRecordsUpdated() {
        return this.numberOfRecordsUpdated;
    }

}
