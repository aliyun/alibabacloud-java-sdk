// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAsyncSqlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("line")
    public Integer line;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    public static GetAsyncSqlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncSqlRequest self = new GetAsyncSqlRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncSqlRequest setLine(Integer line) {
        this.line = line;
        return this;
    }
    public Integer getLine() {
        return this.line;
    }

    public GetAsyncSqlRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

}
