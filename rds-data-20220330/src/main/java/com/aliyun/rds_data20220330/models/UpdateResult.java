// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class UpdateResult extends TeaModel {
    @NameInMap("NumberOfRecordsUpdated")
    public Long numberOfRecordsUpdated;

    public static UpdateResult build(java.util.Map<String, ?> map) throws Exception {
        UpdateResult self = new UpdateResult();
        return TeaModel.build(map, self);
    }

    public UpdateResult setNumberOfRecordsUpdated(Long numberOfRecordsUpdated) {
        this.numberOfRecordsUpdated = numberOfRecordsUpdated;
        return this;
    }
    public Long getNumberOfRecordsUpdated() {
        return this.numberOfRecordsUpdated;
    }

}
