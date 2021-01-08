// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetChangeLogRequest extends TeaModel {
    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("TargetIds")
    public java.util.Map<String, ?> targetIds;

    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    public static GetChangeLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChangeLogRequest self = new GetChangeLogRequest();
        return TeaModel.build(map, self);
    }

    public GetChangeLogRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public GetChangeLogRequest setTargetIds(java.util.Map<String, ?> targetIds) {
        this.targetIds = targetIds;
        return this;
    }
    public java.util.Map<String, ?> getTargetIds() {
        return this.targetIds;
    }

    public GetChangeLogRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

}
