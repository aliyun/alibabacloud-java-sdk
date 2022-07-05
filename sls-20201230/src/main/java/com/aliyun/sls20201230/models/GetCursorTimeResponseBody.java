// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCursorTimeResponseBody extends TeaModel {
    // Cursor的服务端时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
    @NameInMap("cursor_time")
    public String cursorTime;

    public static GetCursorTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCursorTimeResponseBody self = new GetCursorTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCursorTimeResponseBody setCursorTime(String cursorTime) {
        this.cursorTime = cursorTime;
        return this;
    }
    public String getCursorTime() {
        return this.cursorTime;
    }

}
