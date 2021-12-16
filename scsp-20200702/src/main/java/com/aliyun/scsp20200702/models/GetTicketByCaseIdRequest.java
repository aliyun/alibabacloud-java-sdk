// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetTicketByCaseIdRequest extends TeaModel {
    @NameInMap("CaseId")
    public Long caseId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetTicketByCaseIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTicketByCaseIdRequest self = new GetTicketByCaseIdRequest();
        return TeaModel.build(map, self);
    }

    public GetTicketByCaseIdRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public GetTicketByCaseIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
