// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendSearchRecordRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    public static GetTrendSearchRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrendSearchRecordRequest self = new GetTrendSearchRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetTrendSearchRecordRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
