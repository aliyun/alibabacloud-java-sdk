// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetListRecordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    public static GetListRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetListRecordRequest self = new GetListRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetListRecordRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetListRecordRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
