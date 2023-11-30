// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Int64Range extends TeaModel {
    @NameInMap("from")
    public Long from;

    @NameInMap("to")
    public Long to;

    public static Int64Range build(java.util.Map<String, ?> map) throws Exception {
        Int64Range self = new Int64Range();
        return TeaModel.build(map, self);
    }

    public Int64Range setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public Int64Range setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
