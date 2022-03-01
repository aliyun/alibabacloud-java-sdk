// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListAlgorithmsRequest extends TeaModel {
    // 算法Id过滤。
    @NameInMap("Id")
    public String id;

    // 算法名称过滤。
    @NameInMap("Name")
    public String name;

    // 分页数，从1开始，默认为1。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小，默认为10。
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAlgorithmsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlgorithmsRequest self = new ListAlgorithmsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlgorithmsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListAlgorithmsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAlgorithmsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlgorithmsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
