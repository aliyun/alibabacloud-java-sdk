// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAnnotationLabelsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public java.util.List<MLLabelParam> data;

    /**
     * <p>The total number of tags that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListAnnotationLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationLabelsResponseBody self = new ListAnnotationLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnnotationLabelsResponseBody setData(java.util.List<MLLabelParam> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MLLabelParam> getData() {
        return this.data;
    }

    public ListAnnotationLabelsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
