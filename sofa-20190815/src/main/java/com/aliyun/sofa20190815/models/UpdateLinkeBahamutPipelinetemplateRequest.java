// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutPipelinetemplateRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static UpdateLinkeBahamutPipelinetemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutPipelinetemplateRequest self = new UpdateLinkeBahamutPipelinetemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutPipelinetemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
