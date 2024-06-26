// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateBackupSetDownloadLinkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10000***67</p>
     */
    @NameInMap("DownloadTaskId")
    public Long downloadTaskId;

    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
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
