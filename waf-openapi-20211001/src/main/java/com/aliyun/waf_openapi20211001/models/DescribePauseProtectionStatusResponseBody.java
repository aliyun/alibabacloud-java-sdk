// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePauseProtectionStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether WAF protection is paused.</p>
     * <ul>
     * <li><strong>0</strong>: indicates that WAF protection is not paused. This is the default value.</li>
     * <li><strong>1</strong>: indicates that WAF protection is paused.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PauseStatus")
    public Integer pauseStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-<strong><strong>-46CE-A47C-6B19</strong></strong>5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePauseProtectionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePauseProtectionStatusResponseBody self = new DescribePauseProtectionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePauseProtectionStatusResponseBody setPauseStatus(Integer pauseStatus) {
        this.pauseStatus = pauseStatus;
        return this;
    }
    public Integer getPauseStatus() {
        return this.pauseStatus;
    }

    public DescribePauseProtectionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
