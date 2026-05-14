// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetJinaAiReaderRequest extends TeaModel {
    @NameInMap("url")
    public String url;

    public static GetJinaAiReaderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJinaAiReaderRequest self = new GetJinaAiReaderRequest();
        return TeaModel.build(map, self);
    }

    public GetJinaAiReaderRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
