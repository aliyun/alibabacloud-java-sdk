// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Resources")
    @Validation(required = true)
    public java.util.List<ListStackResourcesResponseResources> resources;

    public static ListStackResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackResourcesResponse self = new ListStackResourcesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListStackResourcesResponseResources extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("LogicalResourceId")
        @Validation(required = true)
        public String logicalResourceId;

        @NameInMap("PhysicalResourceId")
        @Validation(required = true)
        public String physicalResourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

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

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("ResourceDriftStatus")
        @Validation(required = true)
        public String resourceDriftStatus;

        @NameInMap("DriftDetectionTime")
        @Validation(required = true)
        public String driftDetectionTime;

        public static ListStackResourcesResponseResources build(java.util.Map<String, ?> map) throws Exception {
            ListStackResourcesResponseResources self = new ListStackResourcesResponseResources();
            return TeaModel.build(map, self);
        }

    }

}
