// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class ListComputeTask2Request extends TeaModel {
    @NameInMap("clientId")
    public Long clientId;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListComputeTask2Request build(java.util.Map<String, ?> map) throws Exception {
        ListComputeTask2Request self = new ListComputeTask2Request();
        return TeaModel.build(map, self);
    }

    public ListComputeTask2Request setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public ListComputeTask2Request setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListComputeTask2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
