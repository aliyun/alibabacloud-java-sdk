// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateAnnotationDataSetRequest extends TeaModel {
    /**
     * <p>The data structure of the request.</p>
     */
    @NameInMap("body")
    public MLDataSetParam body;

    public static UpdateAnnotationDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAnnotationDataSetRequest self = new UpdateAnnotationDataSetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAnnotationDataSetRequest setBody(MLDataSetParam body) {
        this.body = body;
        return this;
    }
    public MLDataSetParam getBody() {
        return this.body;
    }

}
