// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAnnotationDataRequest extends TeaModel {
    /**
     * <p>The line from which the query starts.</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListAnnotationDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationDataRequest self = new ListAnnotationDataRequest();
        return TeaModel.build(map, self);
    }

    public ListAnnotationDataRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListAnnotationDataRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
