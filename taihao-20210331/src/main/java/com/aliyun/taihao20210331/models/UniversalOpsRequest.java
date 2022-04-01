// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UniversalOpsRequest extends TeaModel {
    @NameInMap("apiName")
    public String apiName;

    @NameInMap("payload")
    public String payload;

    // 调用接口类型
    @NameInMap("type")
    public String type;

    public static UniversalOpsRequest build(java.util.Map<String, ?> map) throws Exception {
        UniversalOpsRequest self = new UniversalOpsRequest();
        return TeaModel.build(map, self);
    }

    public UniversalOpsRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public UniversalOpsRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public UniversalOpsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
