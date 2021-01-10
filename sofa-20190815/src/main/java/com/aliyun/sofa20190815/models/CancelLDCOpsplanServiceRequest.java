// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLDCOpsplanServiceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Reason")
    public String reason;

    public static CancelLDCOpsplanServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLDCOpsplanServiceRequest self = new CancelLDCOpsplanServiceRequest();
        return TeaModel.build(map, self);
    }

    public CancelLDCOpsplanServiceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CancelLDCOpsplanServiceRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
