// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStacksResponse extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Stacks")
    @Validation(required = true)
    public java.util.List<ListStacksResponseStacks> stacks;

    public static ListStacksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStacksResponse self = new ListStacksResponse();
        return TeaModel.build(map, self);
    }

    public static class ListStacksResponseStacks extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("DisableRollback")
        @Validation(required = true)
        public Boolean disableRollback;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("StackId")
        @Validation(required = true)
        public String stackId;

        @NameInMap("StackName")
        @Validation(required = true)
        public String stackName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StatusReason")
        @Validation(required = true)
        public String statusReason;

        @NameInMap("TimeoutInMinutes")
        @Validation(required = true)
        public Integer timeoutInMinutes;

        @NameInMap("ParentStackId")
        @Validation(required = true)
        public String parentStackId;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("StackDriftStatus")
        @Validation(required = true)
        public String stackDriftStatus;

        @NameInMap("DriftDetectionTime")
        @Validation(required = true)
        public String driftDetectionTime;

        public static ListStacksResponseStacks build(java.util.Map<String, ?> map) throws Exception {
            ListStacksResponseStacks self = new ListStacksResponseStacks();
            return TeaModel.build(map, self);
        }

    }

}
