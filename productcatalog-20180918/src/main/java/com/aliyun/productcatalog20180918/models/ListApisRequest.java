// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.productcatalog20180918.models;

import com.aliyun.tea.*;

public class ListApisRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("Page")
    public String page;

    @NameInMap("Limit")
    public String limit;

    public static ListApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApisRequest self = new ListApisRequest();
        return TeaModel.build(map, self);
    }

    public ListApisRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListApisRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public ListApisRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

}
