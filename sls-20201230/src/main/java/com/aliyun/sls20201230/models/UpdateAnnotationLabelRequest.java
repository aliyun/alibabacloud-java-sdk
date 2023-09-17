// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateAnnotationLabelRequest extends TeaModel {
    @NameInMap("body")
    public MLLabelParam body;

    public static UpdateAnnotationLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAnnotationLabelRequest self = new UpdateAnnotationLabelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAnnotationLabelRequest setBody(MLLabelParam body) {
        this.body = body;
        return this;
    }
    public MLLabelParam getBody() {
        return this.body;
    }

}
