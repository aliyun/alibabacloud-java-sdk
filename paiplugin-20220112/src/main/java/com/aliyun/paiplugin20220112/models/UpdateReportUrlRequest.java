// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class UpdateReportUrlRequest extends TeaModel {
    /**
     * <p>可公开访问的地址。</p>
     */
    @NameInMap("Url")
    public String url;

    public static UpdateReportUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateReportUrlRequest self = new UpdateReportUrlRequest();
        return TeaModel.build(map, self);
    }

    public UpdateReportUrlRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
