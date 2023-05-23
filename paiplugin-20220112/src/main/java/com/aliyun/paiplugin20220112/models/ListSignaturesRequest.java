// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListSignaturesRequest extends TeaModel {
    /**
     * <p>签名名称过滤。</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>分页数，从1开始，默认为1。</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>分页大小，默认为10。</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>签名审核状态过滤。</p>
     * <p>- 0：审核中。</p>
     * <p>- 1：审核通过。</p>
     * <p>- 2：审核不通过。</p>
     */
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
