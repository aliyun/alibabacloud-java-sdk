// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetMainPartListRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("MainName")
    public String mainName;

    @NameInMap("MainType")
    public Integer mainType;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ParentMainId")
    public Long parentMainId;

    public static GetMainPartListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMainPartListRequest self = new GetMainPartListRequest();
        return TeaModel.build(map, self);
    }

    public GetMainPartListRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public GetMainPartListRequest setMainName(String mainName) {
        this.mainName = mainName;
        return this;
    }
    public String getMainName() {
        return this.mainName;
    }

    public GetMainPartListRequest setMainType(Integer mainType) {
        this.mainType = mainType;
        return this;
    }
    public Integer getMainType() {
        return this.mainType;
    }

    public GetMainPartListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetMainPartListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMainPartListRequest setParentMainId(Long parentMainId) {
        this.parentMainId = parentMainId;
        return this;
    }
    public Long getParentMainId() {
        return this.parentMainId;
    }

}
