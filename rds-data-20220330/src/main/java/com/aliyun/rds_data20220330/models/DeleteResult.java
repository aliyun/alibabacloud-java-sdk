// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class DeleteResult extends TeaModel {
    @NameInMap("NumberOfRecordsUpdated")
    public Long numberOfRecordsUpdated;

    public static DeleteResult build(java.util.Map<String, ?> map) throws Exception {
        DeleteResult self = new DeleteResult();
        return TeaModel.build(map, self);
    }

    public DeleteResult setNumberOfRecordsUpdated(Long numberOfRecordsUpdated) {
        this.numberOfRecordsUpdated = numberOfRecordsUpdated;
        return this;
    }
    public Long getNumberOfRecordsUpdated() {
        return this.numberOfRecordsUpdated;
    }

}
