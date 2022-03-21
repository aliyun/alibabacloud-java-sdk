// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class CheckResourceRelationshipExistsShrinkRequest extends TeaModel {
    @NameInMap("SourceResource")
    public String sourceResourceShrink;

    @NameInMap("TargetResource")
    public String targetResourceShrink;

    public static CheckResourceRelationshipExistsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceRelationshipExistsShrinkRequest self = new CheckResourceRelationshipExistsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CheckResourceRelationshipExistsShrinkRequest setSourceResourceShrink(String sourceResourceShrink) {
        this.sourceResourceShrink = sourceResourceShrink;
        return this;
    }
    public String getSourceResourceShrink() {
        return this.sourceResourceShrink;
    }

    public CheckResourceRelationshipExistsShrinkRequest setTargetResourceShrink(String targetResourceShrink) {
        this.targetResourceShrink = targetResourceShrink;
        return this;
    }
    public String getTargetResourceShrink() {
        return this.targetResourceShrink;
    }

}
