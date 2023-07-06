// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryTagNodesResponseBody extends TeaModel {
    @NameInMap("bizTagTreeList")
    public java.util.List<BizTagTree> bizTagTreeList;

    @NameInMap("requestId")
    public String requestId;

    public static QueryTagNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTagNodesResponseBody self = new QueryTagNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTagNodesResponseBody setBizTagTreeList(java.util.List<BizTagTree> bizTagTreeList) {
        this.bizTagTreeList = bizTagTreeList;
        return this;
    }
    public java.util.List<BizTagTree> getBizTagTreeList() {
        return this.bizTagTreeList;
    }

    public QueryTagNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
