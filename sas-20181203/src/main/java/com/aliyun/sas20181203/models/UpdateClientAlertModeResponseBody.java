// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateClientAlertModeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>259E3E77-CA6D-5407-84A5-3A1C98D12F14</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateClientAlertModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientAlertModeResponseBody self = new UpdateClientAlertModeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateClientAlertModeResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateClientAlertModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
