// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailabel20200608.models;

import com.aliyun.tea.*;

public class ListDatasetsRequest extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("NameLike")
    public String nameLike;

    public static ListDatasetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsRequest self = new ListDatasetsRequest();
        return TeaModel.build(map, self);
    }

}
