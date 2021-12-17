// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetComputeResultRequest extends TeaModel {
    @NameInMap("bcId")
    public Long bcId;

    public static GetComputeResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetComputeResultRequest self = new GetComputeResultRequest();
        return TeaModel.build(map, self);
    }

    public GetComputeResultRequest setBcId(Long bcId) {
        this.bcId = bcId;
        return this;
    }
    public Long getBcId() {
        return this.bcId;
    }

}
