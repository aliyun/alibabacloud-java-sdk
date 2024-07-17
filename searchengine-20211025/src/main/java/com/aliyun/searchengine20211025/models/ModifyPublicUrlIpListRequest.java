// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyPublicUrlIpListRequest extends TeaModel {
    /**
     * <p>The request parameters.</p>
     */
    @NameInMap("body")
    public java.util.Map<String, String> body;

    public static ModifyPublicUrlIpListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPublicUrlIpListRequest self = new ModifyPublicUrlIpListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPublicUrlIpListRequest setBody(java.util.Map<String, String> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, String> getBody() {
        return this.body;
    }

}
