// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMachinesRequest extends TeaModel {
    // 查询开始行。默认值为0。
    @NameInMap("offset")
    public Integer offset;

    // 分页查询时，设置的每页行数。默认值为100，最大值为500。
    @NameInMap("size")
    public Integer size;

    public static ListMachinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMachinesRequest self = new ListMachinesRequest();
        return TeaModel.build(map, self);
    }

    public ListMachinesRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListMachinesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
