// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackResourceResponse extends TeaModel {
    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("LogicalResourceId")
    @Validation(required = true)
    public String logicalResourceId;

    @NameInMap("Metadata")
    @Validation(required = true)
    public java.util.Map<String, ?> metadata;

    @NameInMap("PhysicalResourceId")
    @Validation(required = true)
    public String physicalResourceId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("ResourceAttributes")
    @Validation(required = true)
    public java.util.List<java.util.Map<String, ?>> resourceAttributes;

    public static GetStackResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackResourceResponse self = new GetStackResourceResponse();
        return TeaModel.build(map, self);
    }

}
