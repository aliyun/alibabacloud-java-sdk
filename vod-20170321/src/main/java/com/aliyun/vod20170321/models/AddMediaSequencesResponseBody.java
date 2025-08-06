// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddMediaSequencesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddMediaSequencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMediaSequencesResponseBody self = new AddMediaSequencesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMediaSequencesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
