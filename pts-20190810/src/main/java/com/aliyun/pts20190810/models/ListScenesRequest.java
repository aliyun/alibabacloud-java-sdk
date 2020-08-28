// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class ListScenesRequest extends TeaModel {
    @NameInMap("Keywords")
    public String keywords;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    public static ListScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScenesRequest self = new ListScenesRequest();
        return TeaModel.build(map, self);
    }

}
