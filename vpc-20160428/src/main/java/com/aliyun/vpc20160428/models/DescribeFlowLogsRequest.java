// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFlowLogsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("FlowLogName")
    public String flowLogName;

    @NameInMap("FlowLogId")
    public String flowLogId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("TrafficType")
    public String trafficType;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("LogStoreName")
    public String logStoreName;

    @NameInMap("Status")
    public String status;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeFlowLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowLogsRequest self = new DescribeFlowLogsRequest();
        return TeaModel.build(map, self);
    }

}
