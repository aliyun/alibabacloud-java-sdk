// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class ListSlaWarningsRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    public static ListSlaWarningsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSlaWarningsRequest self = new ListSlaWarningsRequest();
        return TeaModel.build(map, self);
    }

}
