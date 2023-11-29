// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMachinesRequest extends TeaModel {
    /**
     * <p>The line from which the query starts. Default value: 0.</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of entries per page. Default value: 100. Maximum value: 500.</p>
     */
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
