// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCursorTimeRequest extends TeaModel {
    @NameInMap("cursor")
    public String cursor;

    public static GetCursorTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCursorTimeRequest self = new GetCursorTimeRequest();
        return TeaModel.build(map, self);
    }

    public GetCursorTimeRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

}
