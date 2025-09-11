// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddDataSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E1********DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>472b241b-c651-<strong><strong>-</strong></strong>-ee719d6faf45</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceResponseBody self = new AddDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDataSourceResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public AddDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
