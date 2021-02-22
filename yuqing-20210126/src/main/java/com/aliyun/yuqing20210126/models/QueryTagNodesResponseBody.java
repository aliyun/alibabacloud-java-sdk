// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryTagNodesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 标签列表
    @NameInMap("bizTagTreeList")
    public java.util.List<BizTagTree> bizTagTreeList;

    public static QueryTagNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTagNodesResponseBody self = new QueryTagNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTagNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTagNodesResponseBody setBizTagTreeList(java.util.List<BizTagTree> bizTagTreeList) {
        this.bizTagTreeList = bizTagTreeList;
        return this;
    }
    public java.util.List<BizTagTree> getBizTagTreeList() {
        return this.bizTagTreeList;
    }

}
