// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeHighDefinitionMonitorLogAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InstanceType")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("LogProject")
    @Validation(required = true)
    public String logProject;

    @NameInMap("LogStore")
    @Validation(required = true)
    public String logStore;

    public static DescribeHighDefinitionMonitorLogAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighDefinitionMonitorLogAttributeResponse self = new DescribeHighDefinitionMonitorLogAttributeResponse();
        return TeaModel.build(map, self);
    }

}
