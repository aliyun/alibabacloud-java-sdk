// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryTaskListShrinkRequest extends TeaModel {
    @NameInMap("DigTaskPageQuery")
    public String digTaskPageQueryShrink;

    @NameInMap("PageData")
    public String pageDataShrink;

    public static QueryTaskListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskListShrinkRequest self = new QueryTaskListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskListShrinkRequest setDigTaskPageQueryShrink(String digTaskPageQueryShrink) {
        this.digTaskPageQueryShrink = digTaskPageQueryShrink;
        return this;
    }
    public String getDigTaskPageQueryShrink() {
        return this.digTaskPageQueryShrink;
    }

    public QueryTaskListShrinkRequest setPageDataShrink(String pageDataShrink) {
        this.pageDataShrink = pageDataShrink;
        return this;
    }
    public String getPageDataShrink() {
        return this.pageDataShrink;
    }

}
