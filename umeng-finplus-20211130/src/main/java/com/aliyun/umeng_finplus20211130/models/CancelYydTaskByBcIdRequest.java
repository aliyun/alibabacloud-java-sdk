// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CancelYydTaskByBcIdRequest extends TeaModel {
    @NameInMap("bcId")
    public Long bcId;

    public static CancelYydTaskByBcIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelYydTaskByBcIdRequest self = new CancelYydTaskByBcIdRequest();
        return TeaModel.build(map, self);
    }

    public CancelYydTaskByBcIdRequest setBcId(Long bcId) {
        this.bcId = bcId;
        return this;
    }
    public Long getBcId() {
        return this.bcId;
    }

}
