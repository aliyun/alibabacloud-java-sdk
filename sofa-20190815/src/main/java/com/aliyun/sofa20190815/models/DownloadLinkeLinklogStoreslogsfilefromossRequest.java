// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DownloadLinkeLinklogStoreslogsfilefromossRequest extends TeaModel {
    @NameInMap("LogId")
    public String logId;

    public static DownloadLinkeLinklogStoreslogsfilefromossRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadLinkeLinklogStoreslogsfilefromossRequest self = new DownloadLinkeLinklogStoreslogsfilefromossRequest();
        return TeaModel.build(map, self);
    }

    public DownloadLinkeLinklogStoreslogsfilefromossRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

}
