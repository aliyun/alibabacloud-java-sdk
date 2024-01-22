// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListStaticsQueryResponse extends TeaModel {
    @NameInMap("length")
    public Long length;

    @NameInMap("sort")
    public String sort;

    @NameInMap("statics")
    public java.util.List<StaticsInfo> statics;

    public static ListStaticsQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStaticsQueryResponse self = new ListStaticsQueryResponse();
        return TeaModel.build(map, self);
    }

    public ListStaticsQueryResponse setLength(Long length) {
        this.length = length;
        return this;
    }
    public Long getLength() {
        return this.length;
    }

    public ListStaticsQueryResponse setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListStaticsQueryResponse setStatics(java.util.List<StaticsInfo> statics) {
        this.statics = statics;
        return this;
    }
    public java.util.List<StaticsInfo> getStatics() {
        return this.statics;
    }

}
