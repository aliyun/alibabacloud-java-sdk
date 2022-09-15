// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListEtlJobResponseBody extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("etlJobNameList")
    public java.util.List<String> etlJobNameList;

    @NameInMap("total")
    public Integer total;

    public static ListEtlJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEtlJobResponseBody self = new ListEtlJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEtlJobResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListEtlJobResponseBody setEtlJobNameList(java.util.List<String> etlJobNameList) {
        this.etlJobNameList = etlJobNameList;
        return this;
    }
    public java.util.List<String> getEtlJobNameList() {
        return this.etlJobNameList;
    }

    public ListEtlJobResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
