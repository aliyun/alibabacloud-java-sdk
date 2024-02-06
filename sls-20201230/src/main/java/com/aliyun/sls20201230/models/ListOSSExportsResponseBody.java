// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListOSSExportsResponseBody extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("results")
    public java.util.List<OSSExport> results;

    @NameInMap("total")
    public Integer total;

    public static ListOSSExportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOSSExportsResponseBody self = new ListOSSExportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOSSExportsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListOSSExportsResponseBody setResults(java.util.List<OSSExport> results) {
        this.results = results;
        return this;
    }
    public java.util.List<OSSExport> getResults() {
        return this.results;
    }

    public ListOSSExportsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
