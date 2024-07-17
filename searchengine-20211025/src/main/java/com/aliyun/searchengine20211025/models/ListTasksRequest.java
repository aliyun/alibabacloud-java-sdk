// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    /**
     * <p>The timestamp that indicates the end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1690423741577</p>
     */
    @NameInMap("end")
    public Long end;

    /**
     * <p>The timestamp that indicates the beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1687238865434</p>
     */
    @NameInMap("start")
    public Long start;

    public static ListTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksRequest self = new ListTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public ListTasksRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
