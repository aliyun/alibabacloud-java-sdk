// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class ListSessionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>44553E9A-******-37ADC33FE2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sessions")
    public java.util.List<Session> sessions;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSessionsResponseBody self = new ListSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSessionsResponseBody setSessions(java.util.List<Session> sessions) {
        this.sessions = sessions;
        return this;
    }
    public java.util.List<Session> getSessions() {
        return this.sessions;
    }

    public ListSessionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
