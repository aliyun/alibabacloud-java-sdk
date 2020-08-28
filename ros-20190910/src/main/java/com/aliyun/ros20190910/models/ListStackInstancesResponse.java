// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackInstancesResponse extends TeaModel {
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

    @NameInMap("StackInstances")
    @Validation(required = true)
    public java.util.List<ListStackInstancesResponseStackInstances> stackInstances;

    public static ListStackInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackInstancesResponse self = new ListStackInstancesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListStackInstancesResponseStackInstances extends TeaModel {
        @NameInMap("StackGroupName")
        @Validation(required = true)
        public String stackGroupName;

        @NameInMap("StackGroupId")
        @Validation(required = true)
        public String stackGroupId;

        @NameInMap("StackId")
        @Validation(required = true)
        public String stackId;

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

        @NameInMap("StackDriftStatus")
        @Validation(required = true)
        public String stackDriftStatus;

        @NameInMap("DriftDetectionTime")
        @Validation(required = true)
        public String driftDetectionTime;

        public static ListStackInstancesResponseStackInstances build(java.util.Map<String, ?> map) throws Exception {
            ListStackInstancesResponseStackInstances self = new ListStackInstancesResponseStackInstances();
            return TeaModel.build(map, self);
        }

    }

}
