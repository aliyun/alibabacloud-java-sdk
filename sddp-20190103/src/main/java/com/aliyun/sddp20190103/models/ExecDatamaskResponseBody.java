// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ExecDatamaskResponseBody extends TeaModel {
    /**
     * <p>The de-identified data, which is described in a JSON string. The JSON string contains the following parameters:</p>
     * <ul>
     * <li><strong>dataHeaderList</strong>: the names of columns that contain the de-identified data.</li>
     * <li><strong>dataList</strong>: the de-identified data. The column order of the de-identified data is the same as that indicated by the dataHeaderList parameter.</li>
     * <li><strong>ruleList</strong>: the IDs of sensitive data detection rules.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dataHeaderList&quot;:[&quot;name&quot;,&quot;age&quot;],&quot;dataList&quot;:[[&quot;l***&quot;,18],[&quot;l***&quot;,17]],&quot;ruleList&quot;:[1002,null]}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>813BA9FA-D062-42C4-8CD5-11A7640B96E6</p>
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
