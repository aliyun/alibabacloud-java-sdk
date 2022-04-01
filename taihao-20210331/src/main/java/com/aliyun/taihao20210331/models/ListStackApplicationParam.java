// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListStackApplicationParam extends TeaModel {
    // createTimeEnd
    @NameInMap("createTimeEnd")
    public Long createTimeEnd;

    // createTimeStart
    @NameInMap("createTimeStart")
    public Long createTimeStart;

    // name
    @NameInMap("name")
    public String name;

    // pageNumber
    @NameInMap("pageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListStackApplicationParam build(java.util.Map<String, ?> map) throws Exception {
        ListStackApplicationParam self = new ListStackApplicationParam();
        return TeaModel.build(map, self);
    }

    public ListStackApplicationParam setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public ListStackApplicationParam setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public ListStackApplicationParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListStackApplicationParam setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListStackApplicationParam setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
