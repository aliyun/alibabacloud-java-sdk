// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationResultsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("StackGroupOperationResults")
    @Validation(required = true)
    public java.util.List<ListStackGroupOperationResultsResponseStackGroupOperationResults> stackGroupOperationResults;

    public static ListStackGroupOperationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationResultsResponse self = new ListStackGroupOperationResultsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListStackGroupOperationResultsResponseStackGroupOperationResults extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StatusReason")
        @Validation(required = true)
        public String statusReason;

        public static ListStackGroupOperationResultsResponseStackGroupOperationResults build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupOperationResultsResponseStackGroupOperationResults self = new ListStackGroupOperationResultsResponseStackGroupOperationResults();
            return TeaModel.build(map, self);
        }

    }

}
