// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateModelFeatureFGInfoRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    public static UpdateModelFeatureFGInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelFeatureFGInfoRequest self = new UpdateModelFeatureFGInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelFeatureFGInfoRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
