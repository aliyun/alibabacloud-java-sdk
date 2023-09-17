// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAnnotationDataResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<MLDataParam> data;

    @NameInMap("total")
    public Integer total;

    public static ListAnnotationDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationDataResponseBody self = new ListAnnotationDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnnotationDataResponseBody setData(java.util.List<MLDataParam> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MLDataParam> getData() {
        return this.data;
    }

    public ListAnnotationDataResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
