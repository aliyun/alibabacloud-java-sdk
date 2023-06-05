// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateSearchTableRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("SearchTableId")
    public String searchTableId;

    @NameInMap("SearchTableName")
    public String searchTableName;

    public static UpdateSearchTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSearchTableRequest self = new UpdateSearchTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSearchTableRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public UpdateSearchTableRequest setSearchTableId(String searchTableId) {
        this.searchTableId = searchTableId;
        return this;
    }
    public String getSearchTableId() {
        return this.searchTableId;
    }

    public UpdateSearchTableRequest setSearchTableName(String searchTableName) {
        this.searchTableName = searchTableName;
        return this;
    }
    public String getSearchTableName() {
        return this.searchTableName;
    }

}
