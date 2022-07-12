// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListEtlMetaResponseBody extends TeaModel {
    @NameInMap("etlMetaList")
    public java.util.List<EtlMeta> etlMetaList;

    @NameInMap("total")
    public Integer total;

    public static ListEtlMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEtlMetaResponseBody self = new ListEtlMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEtlMetaResponseBody setEtlMetaList(java.util.List<EtlMeta> etlMetaList) {
        this.etlMetaList = etlMetaList;
        return this;
    }
    public java.util.List<EtlMeta> getEtlMetaList() {
        return this.etlMetaList;
    }

    public ListEtlMetaResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
