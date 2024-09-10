// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckSecurityEventIdResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the alert events are generated on the server. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8E67FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckSecurityEventIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSecurityEventIdResponseBody self = new CheckSecurityEventIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSecurityEventIdResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CheckSecurityEventIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
