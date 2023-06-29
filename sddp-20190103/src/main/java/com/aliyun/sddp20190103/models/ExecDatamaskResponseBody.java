// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ExecDatamaskResponseBody extends TeaModel {
    /**
     * <p>The de-identified data, which is described in a JSON string. The JSON string contains the following parameters:</p>
     * <br>
     * <p>*   **dataHeaderList**: the names of columns that contain the de-identified data.</p>
     * <p>*   **dataList**: the de-identified data. The column order of the de-identified data is the same as that indicated by the dataHeaderList parameter.</p>
     * <p>*   **ruleList**: the IDs of sensitive data detection rules.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecDatamaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecDatamaskResponseBody self = new ExecDatamaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecDatamaskResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExecDatamaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
