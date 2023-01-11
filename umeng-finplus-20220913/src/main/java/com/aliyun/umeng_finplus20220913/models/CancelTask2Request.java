// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CancelTask2Request extends TeaModel {
    @NameInMap("bcId")
    public Long bcId;

    @NameInMap("clientId")
    public Long clientId;

    public static CancelTask2Request build(java.util.Map<String, ?> map) throws Exception {
        CancelTask2Request self = new CancelTask2Request();
        return TeaModel.build(map, self);
    }

    public CancelTask2Request setBcId(Long bcId) {
        this.bcId = bcId;
        return this;
    }
    public Long getBcId() {
        return this.bcId;
    }

    public CancelTask2Request setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

}
