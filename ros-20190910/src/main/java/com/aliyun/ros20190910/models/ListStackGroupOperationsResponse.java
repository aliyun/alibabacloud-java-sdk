// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationsResponse extends TeaModel {
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

    @NameInMap("StackGroupOperations")
    @Validation(required = true)
    public java.util.List<ListStackGroupOperationsResponseStackGroupOperations> stackGroupOperations;

    public static ListStackGroupOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationsResponse self = new ListStackGroupOperationsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListStackGroupOperationsResponseStackGroupOperations extends TeaModel {
        @NameInMap("StackGroupName")
        @Validation(required = true)
        public String stackGroupName;

        @NameInMap("StackGroupId")
        @Validation(required = true)
        public String stackGroupId;

        @NameInMap("OperationId")
        @Validation(required = true)
        public String operationId;

        @NameInMap("OperationDescription")
        @Validation(required = true)
        public String operationDescription;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("Action")
        @Validation(required = true)
        public String action;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static ListStackGroupOperationsResponseStackGroupOperations build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupOperationsResponseStackGroupOperations self = new ListStackGroupOperationsResponseStackGroupOperations();
            return TeaModel.build(map, self);
        }

    }

}
