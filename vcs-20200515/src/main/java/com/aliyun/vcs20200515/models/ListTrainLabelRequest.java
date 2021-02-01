// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListTrainLabelRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    public static ListTrainLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrainLabelRequest self = new ListTrainLabelRequest();
        return TeaModel.build(map, self);
    }

    public ListTrainLabelRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

}
