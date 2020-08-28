// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Tasks")
    @Validation(required = true)
    public DescribeVodRefreshTasksResponseTasks tasks;

    public static DescribeVodRefreshTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRefreshTasksResponse self = new DescribeVodRefreshTasksResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodRefreshTasksResponseTasksTask extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("ObjectPath")
        @Validation(required = true)
        public String objectPath;

        @NameInMap("Process")
        @Validation(required = true)
        public String process;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ObjectType")
        @Validation(required = true)
        public String objectType;

        public static DescribeVodRefreshTasksResponseTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodRefreshTasksResponseTasksTask self = new DescribeVodRefreshTasksResponseTasksTask();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodRefreshTasksResponseTasks extends TeaModel {
        @NameInMap("Task")
        @Validation(required = true)
        public java.util.List<DescribeVodRefreshTasksResponseTasksTask> task;

        public static DescribeVodRefreshTasksResponseTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodRefreshTasksResponseTasks self = new DescribeVodRefreshTasksResponseTasks();
            return TeaModel.build(map, self);
        }

    }

}
