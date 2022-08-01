// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCursorTimeResponseBody extends TeaModel {
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
