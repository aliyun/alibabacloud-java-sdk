// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetFeeHistoryRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    public String version;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    public static GetFeeHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFeeHistoryRequest self = new GetFeeHistoryRequest();
        return TeaModel.build(map, self);
    }

    public GetFeeHistoryRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetFeeHistoryRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetFeeHistoryRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetFeeHistoryRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
