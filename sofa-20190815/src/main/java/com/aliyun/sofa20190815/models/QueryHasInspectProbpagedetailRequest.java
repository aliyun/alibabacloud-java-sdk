// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectProbpagedetailRequest extends TeaModel {
    @NameInMap("PageId")
    public String pageId;

    public static QueryHasInspectProbpagedetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectProbpagedetailRequest self = new QueryHasInspectProbpagedetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectProbpagedetailRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

}
