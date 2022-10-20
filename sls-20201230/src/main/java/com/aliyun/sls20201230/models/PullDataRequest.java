// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PullDataRequest extends TeaModel {
    @NameInMap("count")
    public String count;

    @NameInMap("cursor")
    public String cursor;

    @NameInMap("endCursor")
    public String endCursor;

    public static PullDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PullDataRequest self = new PullDataRequest();
        return TeaModel.build(map, self);
    }

    public PullDataRequest setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public PullDataRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public PullDataRequest setEndCursor(String endCursor) {
        this.endCursor = endCursor;
        return this;
    }
    public String getEndCursor() {
        return this.endCursor;
    }

}
