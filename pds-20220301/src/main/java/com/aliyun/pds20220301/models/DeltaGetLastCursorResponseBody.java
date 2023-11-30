// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DeltaGetLastCursorResponseBody extends TeaModel {
    /**
     * <p>The latest cursor of incremental information in the specified drive or synced folder.</p>
     */
    @NameInMap("cursor")
    public String cursor;

    public static DeltaGetLastCursorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeltaGetLastCursorResponseBody self = new DeltaGetLastCursorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeltaGetLastCursorResponseBody setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

}
