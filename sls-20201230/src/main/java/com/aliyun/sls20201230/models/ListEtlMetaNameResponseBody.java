// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListEtlMetaNameResponseBody extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("etlMetaNameList")
    public java.util.List<String> etlMetaNameList;

    @NameInMap("total")
    public Integer total;

    public static ListEtlMetaNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEtlMetaNameResponseBody self = new ListEtlMetaNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEtlMetaNameResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListEtlMetaNameResponseBody setEtlMetaNameList(java.util.List<String> etlMetaNameList) {
        this.etlMetaNameList = etlMetaNameList;
        return this;
    }
    public java.util.List<String> getEtlMetaNameList() {
        return this.etlMetaNameList;
    }

    public ListEtlMetaNameResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
