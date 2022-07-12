// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetEtlMetaResponseBody extends TeaModel {
    @NameInMap("etlMetaList")
    public java.util.List<EtlMeta> etlMetaList;

    @NameInMap("total")
    public Integer total;

    public static GetEtlMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEtlMetaResponseBody self = new GetEtlMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEtlMetaResponseBody setEtlMetaList(java.util.List<EtlMeta> etlMetaList) {
        this.etlMetaList = etlMetaList;
        return this;
    }
    public java.util.List<EtlMeta> getEtlMetaList() {
        return this.etlMetaList;
    }

    public GetEtlMetaResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
