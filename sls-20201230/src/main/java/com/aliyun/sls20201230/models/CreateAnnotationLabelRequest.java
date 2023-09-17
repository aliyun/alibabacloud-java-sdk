// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateAnnotationLabelRequest extends TeaModel {
    @NameInMap("body")
    public MLLabelParam body;

    public static CreateAnnotationLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAnnotationLabelRequest self = new CreateAnnotationLabelRequest();
        return TeaModel.build(map, self);
    }

    public CreateAnnotationLabelRequest setBody(MLLabelParam body) {
        this.body = body;
        return this;
    }
    public MLLabelParam getBody() {
        return this.body;
    }

}
