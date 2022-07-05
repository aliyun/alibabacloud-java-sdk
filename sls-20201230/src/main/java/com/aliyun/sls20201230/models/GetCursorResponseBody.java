// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCursorResponseBody extends TeaModel {
    // 游标位置。
    @NameInMap("cursor")
    public String cursor;

    public static GetCursorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCursorResponseBody self = new GetCursorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCursorResponseBody setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

}
