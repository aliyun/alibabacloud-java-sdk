// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationResultsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("OperationId")
    @Validation(required = true)
    public String operationId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static ListStackGroupOperationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationResultsRequest self = new ListStackGroupOperationResultsRequest();
        return TeaModel.build(map, self);
    }

}
