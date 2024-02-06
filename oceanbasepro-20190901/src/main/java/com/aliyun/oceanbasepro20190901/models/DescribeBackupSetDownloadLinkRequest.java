// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeBackupSetDownloadLinkRequest extends TeaModel {
    @NameInMap("DownloadTaskId")
    public String downloadTaskId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeBackupSetDownloadLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetDownloadLinkRequest self = new DescribeBackupSetDownloadLinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetDownloadLinkRequest setDownloadTaskId(String downloadTaskId) {
        this.downloadTaskId = downloadTaskId;
        return this;
    }
    public String getDownloadTaskId() {
        return this.downloadTaskId;
    }

    public DescribeBackupSetDownloadLinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
