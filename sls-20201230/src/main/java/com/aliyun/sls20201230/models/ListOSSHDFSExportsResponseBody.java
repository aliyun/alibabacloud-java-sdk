// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListOSSHDFSExportsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("count")
    public Integer count;

    @NameInMap("results")
    public java.util.List<OSSExport> results;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListOSSHDFSExportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOSSHDFSExportsResponseBody self = new ListOSSHDFSExportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOSSHDFSExportsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListOSSHDFSExportsResponseBody setResults(java.util.List<OSSExport> results) {
        this.results = results;
        return this;
    }
    public java.util.List<OSSExport> getResults() {
        return this.results;
    }

    public ListOSSHDFSExportsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
