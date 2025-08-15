// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class CheckMfdServiceOpenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>AAC546A5-5EDC-5939-86A3-56DFAF******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckMfdServiceOpenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMfdServiceOpenResponseBody self = new CheckMfdServiceOpenResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMfdServiceOpenResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CheckMfdServiceOpenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
