// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeBackupTasksResponseItems items;

    public static DescribeBackupTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTasksResponse self = new DescribeBackupTasksResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeBackupTasksResponseItemsBackupJob extends TeaModel {
        @NameInMap("BackupProgressStatus")
        @Validation(required = true)
        public String backupProgressStatus;

        @NameInMap("BackupStatus")
        @Validation(required = true)
        public String backupStatus;

        @NameInMap("JobMode")
        @Validation(required = true)
        public String jobMode;

        @NameInMap("Process")
        @Validation(required = true)
        public String process;

        @NameInMap("TaskAction")
        @Validation(required = true)
        public String taskAction;

        @NameInMap("BackupJobId")
        @Validation(required = true)
        public String backupJobId;

        @NameInMap("BackupId")
        @Validation(required = true)
        public String backupId;

        public static DescribeBackupTasksResponseItemsBackupJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTasksResponseItemsBackupJob self = new DescribeBackupTasksResponseItemsBackupJob();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeBackupTasksResponseItems extends TeaModel {
        @NameInMap("BackupJob")
        @Validation(required = true)
        public java.util.List<DescribeBackupTasksResponseItemsBackupJob> backupJob;

        public static DescribeBackupTasksResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTasksResponseItems self = new DescribeBackupTasksResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
