// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class CheckZoneNameResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the zone name is valid. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Check")
    public Boolean check;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CA29B88F-A571-4123-80D5-768AC2F7F806</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckZoneNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckZoneNameResponseBody self = new CheckZoneNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckZoneNameResponseBody setCheck(Boolean check) {
        this.check = check;
        return this;
    }
    public Boolean getCheck() {
        return this.check;
    }

    public CheckZoneNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckZoneNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
