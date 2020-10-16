// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetMonitorListRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("PageNo")
    @Validation(required = true)
    public Integer pageNo;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    public static GetMonitorListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorListRequest self = new GetMonitorListRequest();
        return TeaModel.build(map, self);
    }

    public GetMonitorListRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetMonitorListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetMonitorListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
