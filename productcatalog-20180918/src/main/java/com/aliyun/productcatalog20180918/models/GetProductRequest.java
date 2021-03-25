// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.productcatalog20180918.models;

import com.aliyun.tea.*;

public class GetProductRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    public static GetProductRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductRequest self = new GetProductRequest();
        return TeaModel.build(map, self);
    }

    public GetProductRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
