// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListSchedulesRequest extends TeaModel {
    /**
     * <p>触达计划名称过滤。</p>
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
     * <p>发送状态过滤。</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ListSchedulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSchedulesRequest self = new ListSchedulesRequest();
        return TeaModel.build(map, self);
    }

    public ListSchedulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSchedulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSchedulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSchedulesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
