// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCursorTimeResponseBody extends TeaModel {
    /**
     * <p>The server time that corresponds to the cursor. The value is a UNIX timestamp. A UNIX timestamp represents the number of seconds that have elapsed since 1970-01-01 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1554260243</p>
     */
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
