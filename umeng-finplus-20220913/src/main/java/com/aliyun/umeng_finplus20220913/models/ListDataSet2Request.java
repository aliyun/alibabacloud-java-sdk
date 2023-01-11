// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class ListDataSet2Request extends TeaModel {
    @NameInMap("clientId")
    public Long clientId;

    @NameInMap("pageNo")
    public Integer pageNo;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListDataSet2Request build(java.util.Map<String, ?> map) throws Exception {
        ListDataSet2Request self = new ListDataSet2Request();
        return TeaModel.build(map, self);
    }

    public ListDataSet2Request setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public ListDataSet2Request setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListDataSet2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
