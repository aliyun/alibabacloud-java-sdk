// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasBaselineNwapprovalprocessRequest extends TeaModel {
    @NameInMap("NwApprovalProcessId")
    public String nwApprovalProcessId;

    public static DeleteHasBaselineNwapprovalprocessRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasBaselineNwapprovalprocessRequest self = new DeleteHasBaselineNwapprovalprocessRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasBaselineNwapprovalprocessRequest setNwApprovalProcessId(String nwApprovalProcessId) {
        this.nwApprovalProcessId = nwApprovalProcessId;
        return this;
    }
    public String getNwApprovalProcessId() {
        return this.nwApprovalProcessId;
    }

}
