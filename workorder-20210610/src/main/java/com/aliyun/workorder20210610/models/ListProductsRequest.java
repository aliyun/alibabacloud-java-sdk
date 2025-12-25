// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListProductsRequest extends TeaModel {
    /**
     * <p>The language that you use, supporting English, Chinese, and Japanese. Valid values: en, zh, and jp, which indicate English, Chinese, and Japanese, respectively.</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the product. Fuzzy search is supported. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Name")
    public String name;

    public static ListProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsRequest self = new ListProductsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListProductsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
