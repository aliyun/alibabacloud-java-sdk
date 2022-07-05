// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCursorTimeRequest extends TeaModel {
    // 游标。
    @NameInMap("cursor")
    public String cursor;

    // 固定为 cursor_time 。
    @NameInMap("type")
    public String type;

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

    public GetCursorTimeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
