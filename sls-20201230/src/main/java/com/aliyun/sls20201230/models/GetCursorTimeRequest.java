// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCursorTimeRequest extends TeaModel {
    /**
     * <p>The cursor for which you want to obtain the timestamp. Call the <a href="https://help.aliyun.com/document_detail/2771314.html">GetCursor</a> operation to obtain a cursor.</p>
     * <blockquote>
     * <p>If the value of the cursor is less than the begin cursor or greater than the end cursor, InvalidCursor is returned. If the shard contains no data, the current time is returned.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MTU0NzQ3MDY4MjM3NjUxMzQ0Ng==</p>
     */
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
