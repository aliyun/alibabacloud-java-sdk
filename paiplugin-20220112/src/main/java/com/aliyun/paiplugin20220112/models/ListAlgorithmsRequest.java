// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListAlgorithmsRequest extends TeaModel {
    /**
     * <p>算法Id过滤。</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>算法名称过滤。</p>
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
