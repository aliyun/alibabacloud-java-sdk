// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpsRequest extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    public static ListCorpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCorpsRequest self = new ListCorpsRequest();
        return TeaModel.build(map, self);
    }

}
