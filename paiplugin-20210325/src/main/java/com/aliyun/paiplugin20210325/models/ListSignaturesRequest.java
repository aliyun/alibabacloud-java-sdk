// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class ListSignaturesRequest extends TeaModel {
    // 签名名称，用于名称过滤或搜索，使用%name%模糊匹配
    @NameInMap("Name")
    public String name;

    // 分页数，从1开始，默认为1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小，默认为10
    @NameInMap("PageSize")
    public Integer pageSize;

    // 审核状态过滤
    @NameInMap("Status")
    public Integer status;

    public static ListSignaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSignaturesRequest self = new ListSignaturesRequest();
        return TeaModel.build(map, self);
    }

    public ListSignaturesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSignaturesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSignaturesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSignaturesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
