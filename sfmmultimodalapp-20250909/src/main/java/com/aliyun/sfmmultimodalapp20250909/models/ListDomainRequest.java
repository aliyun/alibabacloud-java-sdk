// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class ListDomainRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Type")
    public String type;

    public static ListDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDomainRequest self = new ListDomainRequest();
        return TeaModel.build(map, self);
    }

    public ListDomainRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListDomainRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDomainRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDomainRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
