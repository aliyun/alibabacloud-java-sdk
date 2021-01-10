// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogStoreslogstextRequest extends TeaModel {
    @NameInMap("LogId")
    public String logId;

    @NameInMap("Range")
    public String range;

    public static GetLinkeLinklogStoreslogstextRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogStoreslogstextRequest self = new GetLinkeLinklogStoreslogstextRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogStoreslogstextRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public GetLinkeLinklogStoreslogstextRequest setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

}
