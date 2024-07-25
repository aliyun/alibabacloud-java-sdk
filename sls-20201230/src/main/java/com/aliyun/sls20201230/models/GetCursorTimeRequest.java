// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCursorTimeRequest extends TeaModel {
    /**
     * <p>The cursor.</p>
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
