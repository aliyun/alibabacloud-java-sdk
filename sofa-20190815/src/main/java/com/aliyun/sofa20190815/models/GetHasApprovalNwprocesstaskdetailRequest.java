// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasApprovalNwprocesstaskdetailRequest extends TeaModel {
    @NameInMap("NwApprovalProcessTaskId")
    public String nwApprovalProcessTaskId;

    public static GetHasApprovalNwprocesstaskdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasApprovalNwprocesstaskdetailRequest self = new GetHasApprovalNwprocesstaskdetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasApprovalNwprocesstaskdetailRequest setNwApprovalProcessTaskId(String nwApprovalProcessTaskId) {
        this.nwApprovalProcessTaskId = nwApprovalProcessTaskId;
        return this;
    }
    public String getNwApprovalProcessTaskId() {
        return this.nwApprovalProcessTaskId;
    }

}
