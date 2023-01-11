// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SelectComputeTask2Request extends TeaModel {
    @NameInMap("bcConfirm")
    public Boolean bcConfirm;

    @NameInMap("bcId")
    public Long bcId;

    @NameInMap("clientId")
    public Long clientId;

    public static SelectComputeTask2Request build(java.util.Map<String, ?> map) throws Exception {
        SelectComputeTask2Request self = new SelectComputeTask2Request();
        return TeaModel.build(map, self);
    }

    public SelectComputeTask2Request setBcConfirm(Boolean bcConfirm) {
        this.bcConfirm = bcConfirm;
        return this;
    }
    public Boolean getBcConfirm() {
        return this.bcConfirm;
    }

    public SelectComputeTask2Request setBcId(Long bcId) {
        this.bcId = bcId;
        return this;
    }
    public Long getBcId() {
        return this.bcId;
    }

    public SelectComputeTask2Request setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

}
