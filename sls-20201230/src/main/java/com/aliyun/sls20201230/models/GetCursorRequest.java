// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCursorRequest extends TeaModel {
    @NameInMap("from")
    public String from;

    public static GetCursorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCursorRequest self = new GetCursorRequest();
        return TeaModel.build(map, self);
    }

    public GetCursorRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

}
