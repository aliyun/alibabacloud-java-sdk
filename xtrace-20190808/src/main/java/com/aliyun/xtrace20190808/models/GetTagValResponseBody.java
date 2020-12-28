// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTagValResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagValues")
    public java.util.List<String> tagValues;

    public static GetTagValResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTagValResponseBody self = new GetTagValResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTagValResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTagValResponseBody setTagValues(java.util.List<String> tagValues) {
        this.tagValues = tagValues;
        return this;
    }
    public java.util.List<String> getTagValues() {
        return this.tagValues;
    }

}
