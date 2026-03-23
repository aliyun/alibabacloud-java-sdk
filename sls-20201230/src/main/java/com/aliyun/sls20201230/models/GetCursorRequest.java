// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCursorRequest extends TeaModel {
    /**
     * <p>A point in time. This can be a UNIX timestamp or the string <code>begin</code> or <code>end</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>begin</p>
     */
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
