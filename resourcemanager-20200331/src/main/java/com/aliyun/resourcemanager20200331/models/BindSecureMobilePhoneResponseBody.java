// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class BindSecureMobilePhoneResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0217AFEB-5318-56D4-B167-1933D83EDF3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindSecureMobilePhoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindSecureMobilePhoneResponseBody self = new BindSecureMobilePhoneResponseBody();
        return TeaModel.build(map, self);
    }

    public BindSecureMobilePhoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
