// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLDCOpsplanServiceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static RetryLDCOpsplanServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryLDCOpsplanServiceRequest self = new RetryLDCOpsplanServiceRequest();
        return TeaModel.build(map, self);
    }

    public RetryLDCOpsplanServiceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
