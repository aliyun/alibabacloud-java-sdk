// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgorithmDefsRequest extends TeaModel {
    @NameInMap("Timestamp")
    public String timestamp;

    public static GetAlgorithmDefsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDefsRequest self = new GetAlgorithmDefsRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDefsRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
