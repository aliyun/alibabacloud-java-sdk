// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateBackupSetDownloadLinkResponseBody extends TeaModel {
    @NameInMap("DownloadTaskId")
    public Long downloadTaskId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateBackupSetDownloadLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupSetDownloadLinkResponseBody self = new CreateBackupSetDownloadLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupSetDownloadLinkResponseBody setDownloadTaskId(Long downloadTaskId) {
        this.downloadTaskId = downloadTaskId;
        return this;
    }
    public Long getDownloadTaskId() {
        return this.downloadTaskId;
    }

    public CreateBackupSetDownloadLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
