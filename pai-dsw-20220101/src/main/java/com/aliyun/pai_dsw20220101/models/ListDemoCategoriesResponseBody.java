// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListDemoCategoriesResponseBody extends TeaModel {
    // 样例列表
    @NameInMap("Categories")
    public java.util.List<DemoCategory> categories;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static ListDemoCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDemoCategoriesResponseBody self = new ListDemoCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDemoCategoriesResponseBody setCategories(java.util.List<DemoCategory> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<DemoCategory> getCategories() {
        return this.categories;
    }

    public ListDemoCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
