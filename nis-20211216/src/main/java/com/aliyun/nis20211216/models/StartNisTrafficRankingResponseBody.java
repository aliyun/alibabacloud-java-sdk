// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class StartNisTrafficRankingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>task-6462a7b4c4a54b****</p>
     */
    @NameInMap("NisTrafficRankingId")
    public String nisTrafficRankingId;

    /**
     * <strong>example:</strong>
     * <p>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartNisTrafficRankingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartNisTrafficRankingResponseBody self = new StartNisTrafficRankingResponseBody();
        return TeaModel.build(map, self);
    }

    public StartNisTrafficRankingResponseBody setNisTrafficRankingId(String nisTrafficRankingId) {
        this.nisTrafficRankingId = nisTrafficRankingId;
        return this;
    }
    public String getNisTrafficRankingId() {
        return this.nisTrafficRankingId;
    }

    public StartNisTrafficRankingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
