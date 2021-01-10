// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DownloadLinkeLinklogStoreslogsfileRequest extends TeaModel {
    @NameInMap("LogId")
    public String logId;

    public static DownloadLinkeLinklogStoreslogsfileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadLinkeLinklogStoreslogsfileRequest self = new DownloadLinkeLinklogStoreslogsfileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadLinkeLinklogStoreslogsfileRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

}
