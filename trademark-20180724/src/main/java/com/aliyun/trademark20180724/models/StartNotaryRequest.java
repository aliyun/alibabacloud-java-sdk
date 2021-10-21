// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class StartNotaryRequest extends TeaModel {
    @NameInMap("NotaryOrderId")
    public Long notaryOrderId;

    public static StartNotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        StartNotaryRequest self = new StartNotaryRequest();
        return TeaModel.build(map, self);
    }

    public StartNotaryRequest setNotaryOrderId(Long notaryOrderId) {
        this.notaryOrderId = notaryOrderId;
        return this;
    }
    public Long getNotaryOrderId() {
        return this.notaryOrderId;
    }

}
