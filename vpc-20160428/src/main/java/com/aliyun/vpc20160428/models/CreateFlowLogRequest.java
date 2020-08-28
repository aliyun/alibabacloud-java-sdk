// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFlowLogRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("FlowLogName")
    public String flowLogName;

    @NameInMap("Description")
    public String description;

    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("ResourceId")
    @Validation(required = true)
    public String resourceId;

    @NameInMap("TrafficType")
    @Validation(required = true)
    public String trafficType;

    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    @NameInMap("LogStoreName")
    @Validation(required = true)
    public String logStoreName;

    public static CreateFlowLogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLogRequest self = new CreateFlowLogRequest();
        return TeaModel.build(map, self);
    }

}
