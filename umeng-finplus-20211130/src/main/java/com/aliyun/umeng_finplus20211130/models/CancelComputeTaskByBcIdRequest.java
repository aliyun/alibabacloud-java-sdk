// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CancelComputeTaskByBcIdRequest extends TeaModel {
    @NameInMap("bcId")
    public Long bcId;

    public static CancelComputeTaskByBcIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelComputeTaskByBcIdRequest self = new CancelComputeTaskByBcIdRequest();
        return TeaModel.build(map, self);
    }

    public CancelComputeTaskByBcIdRequest setBcId(Long bcId) {
        this.bcId = bcId;
        return this;
    }
    public Long getBcId() {
        return this.bcId;
    }

}
