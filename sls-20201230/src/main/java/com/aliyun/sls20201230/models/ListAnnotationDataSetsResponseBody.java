// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAnnotationDataSetsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public java.util.List<MLDataSetParam> data;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListAnnotationDataSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationDataSetsResponseBody self = new ListAnnotationDataSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnnotationDataSetsResponseBody setData(java.util.List<MLDataSetParam> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MLDataSetParam> getData() {
        return this.data;
    }

    public ListAnnotationDataSetsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
