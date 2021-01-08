// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetChangeLogShrinkRequest extends TeaModel {
    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("TargetIds")
    public String targetIdsShrink;

    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    public static GetChangeLogShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChangeLogShrinkRequest self = new GetChangeLogShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetChangeLogShrinkRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public GetChangeLogShrinkRequest setTargetIdsShrink(String targetIdsShrink) {
        this.targetIdsShrink = targetIdsShrink;
        return this;
    }
    public String getTargetIdsShrink() {
        return this.targetIdsShrink;
    }

    public GetChangeLogShrinkRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

}
