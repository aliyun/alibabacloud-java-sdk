// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAnnotationLabelsRequest extends TeaModel {
    /**
     * <p>The starting line of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListAnnotationLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationLabelsRequest self = new ListAnnotationLabelsRequest();
        return TeaModel.build(map, self);
    }

    public ListAnnotationLabelsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListAnnotationLabelsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
