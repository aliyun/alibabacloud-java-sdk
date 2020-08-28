// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshTasksRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("ObjectPath")
    public String objectPath;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Status")
    public String status;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeVodRefreshTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRefreshTasksRequest self = new DescribeVodRefreshTasksRequest();
        return TeaModel.build(map, self);
    }

}
