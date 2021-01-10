// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasBaselineNwapprovalprocessRequest extends TeaModel {
    @NameInMap("NwApprovalProcessId")
    public String nwApprovalProcessId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static UpdateHasBaselineNwapprovalprocessRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasBaselineNwapprovalprocessRequest self = new UpdateHasBaselineNwapprovalprocessRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasBaselineNwapprovalprocessRequest setNwApprovalProcessId(String nwApprovalProcessId) {
        this.nwApprovalProcessId = nwApprovalProcessId;
        return this;
    }
    public String getNwApprovalProcessId() {
        return this.nwApprovalProcessId;
    }

    public UpdateHasBaselineNwapprovalprocessRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
