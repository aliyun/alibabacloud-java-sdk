// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.productcatalog20180918.models;

import com.aliyun.tea.*;

public class GetApiRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("Reader")
    public String reader;

    public static GetApiRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApiRequest self = new GetApiRequest();
        return TeaModel.build(map, self);
    }

    public GetApiRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetApiRequest setReader(String reader) {
        this.reader = reader;
        return this;
    }
    public String getReader() {
        return this.reader;
    }

}
