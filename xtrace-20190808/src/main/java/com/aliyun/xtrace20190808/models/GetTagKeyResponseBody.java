// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTagKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagKeys")
    public java.util.List<String> tagKeys;

    public static GetTagKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTagKeyResponseBody self = new GetTagKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTagKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTagKeyResponseBody setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

}
