// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLocalDefaultRegionResponseBody extends TeaModel {
    /**
     * <p>The unique identifier that Alibaba Cloud generates for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F6D23860-55C2-55AA-B484-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The access type of the multi-cloud site. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No default site exists. You can select one.</li>
     * <li><strong>1</strong>: The current site is already the default site.</li>
     * <li><strong>2</strong>: Another site is already set as the default site.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static GetLocalDefaultRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLocalDefaultRegionResponseBody self = new GetLocalDefaultRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLocalDefaultRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLocalDefaultRegionResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
