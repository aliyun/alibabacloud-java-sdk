// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteInstancesRequest extends TeaModel {
    // 集群删除后的备份保留策略。取值如下： - receive_all：保留全部备份集; - delete_all：删除全部备份集； - receive_last：保留最后一个备份集。 默认值为delete_all。
    @NameInMap("BackupRetainMode")
    public String backupRetainMode;

    // 要删除的集群ID。格式为son数组的字符串。
    @NameInMap("InstanceIds")
    public String instanceIds;

    public static DeleteInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancesRequest self = new DeleteInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstancesRequest setBackupRetainMode(String backupRetainMode) {
        this.backupRetainMode = backupRetainMode;
        return this;
    }
    public String getBackupRetainMode() {
        return this.backupRetainMode;
    }

    public DeleteInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
