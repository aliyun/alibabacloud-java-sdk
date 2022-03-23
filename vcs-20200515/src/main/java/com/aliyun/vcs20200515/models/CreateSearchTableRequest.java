// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateSearchTableRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("SearchTableName")
    public String searchTableName;

    @NameInMap("TargetType")
    public String targetType;

    public static CreateSearchTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchTableRequest self = new CreateSearchTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateSearchTableRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public CreateSearchTableRequest setSearchTableName(String searchTableName) {
        this.searchTableName = searchTableName;
        return this;
    }
    public String getSearchTableName() {
        return this.searchTableName;
    }

    public CreateSearchTableRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
