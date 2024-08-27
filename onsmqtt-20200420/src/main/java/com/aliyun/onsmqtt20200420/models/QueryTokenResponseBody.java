// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryTokenResponseBody extends TeaModel {
    /**
     * <p>The unique ID that the system generates for the request. This parameter is a common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>5C8AADD0-6A95-436D-AFA0-3405CCE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the queried token. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: indicates the token is valid.</li>
     * <li><strong>false</strong>: indicates the token is invalid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TokenStatus")
    public Boolean tokenStatus;

    public static QueryTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTokenResponseBody self = new QueryTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTokenResponseBody setTokenStatus(Boolean tokenStatus) {
        this.tokenStatus = tokenStatus;
        return this;
    }
    public Boolean getTokenStatus() {
        return this.tokenStatus;
    }

}
