// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class DenySupplementRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DenySupplementRequest build(java.util.Map<String, ?> map) throws Exception {
        DenySupplementRequest self = new DenySupplementRequest();
        return TeaModel.build(map, self);
    }

    public DenySupplementRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
