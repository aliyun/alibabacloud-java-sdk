// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryContentInfoRequest extends TeaModel {
    @NameInMap("ContentId")
    public Long contentId;

    public static QueryContentInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContentInfoRequest self = new QueryContentInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryContentInfoRequest setContentId(Long contentId) {
        this.contentId = contentId;
        return this;
    }
    public Long getContentId() {
        return this.contentId;
    }

}
