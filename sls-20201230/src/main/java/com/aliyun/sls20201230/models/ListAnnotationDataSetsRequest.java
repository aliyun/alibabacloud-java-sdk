// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAnnotationDataSetsRequest extends TeaModel {
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

    public static ListAnnotationDataSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationDataSetsRequest self = new ListAnnotationDataSetsRequest();
        return TeaModel.build(map, self);
    }

    public ListAnnotationDataSetsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListAnnotationDataSetsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
