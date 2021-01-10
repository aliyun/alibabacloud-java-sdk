// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinklogAbridgedcontentwithrangeRequest extends TeaModel {
    @NameInMap("BlockIndex")
    public String blockIndex;

    @NameInMap("LogId")
    public String logId;

    @NameInMap("Range")
    public String range;

    public static QueryLinkeLinklogAbridgedcontentwithrangeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinklogAbridgedcontentwithrangeRequest self = new QueryLinkeLinklogAbridgedcontentwithrangeRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinklogAbridgedcontentwithrangeRequest setBlockIndex(String blockIndex) {
        this.blockIndex = blockIndex;
        return this;
    }
    public String getBlockIndex() {
        return this.blockIndex;
    }

    public QueryLinkeLinklogAbridgedcontentwithrangeRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public QueryLinkeLinklogAbridgedcontentwithrangeRequest setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

}
