// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeTasksResponseItems items;

    public static DescribeTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponse self = new DescribeTasksResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeTasksResponseItemsTaskProgressInfo extends TeaModel {
        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("BeginTime")
        @Validation(required = true)
        public String beginTime;

        @NameInMap("ProgressInfo")
        @Validation(required = true)
        public String progressInfo;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public String finishTime;

        @NameInMap("TaskAction")
        @Validation(required = true)
        public String taskAction;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("ExpectedFinishTime")
        @Validation(required = true)
        public String expectedFinishTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("TaskErrorCode")
        @Validation(required = true)
        public String taskErrorCode;

        @NameInMap("TaskErrorMessage")
        @Validation(required = true)
        public String taskErrorMessage;

        @NameInMap("StepsInfo")
        @Validation(required = true)
        public String stepsInfo;

        @NameInMap("Remain")
        @Validation(required = true)
        public Integer remain;

        @NameInMap("StepProgressInfo")
        @Validation(required = true)
        public String stepProgressInfo;

        @NameInMap("CurrentStepName")
        @Validation(required = true)
        public String currentStepName;

        public static DescribeTasksResponseItemsTaskProgressInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseItemsTaskProgressInfo self = new DescribeTasksResponseItemsTaskProgressInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeTasksResponseItems extends TeaModel {
        @NameInMap("TaskProgressInfo")
        @Validation(required = true)
        public java.util.List<DescribeTasksResponseItemsTaskProgressInfo> taskProgressInfo;

        public static DescribeTasksResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseItems self = new DescribeTasksResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
