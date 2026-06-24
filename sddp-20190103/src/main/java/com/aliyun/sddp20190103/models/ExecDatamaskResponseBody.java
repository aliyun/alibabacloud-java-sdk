// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ExecDatamaskResponseBody extends TeaModel {
    /**
     * <p>The data after it is masked. The data is a string in JSON format and includes the following fields:</p>
     * <ul>
     * <li><p><strong>dataHeaderList</strong>: The column names of the masked data.</p>
     * </li>
     * <li><p><strong>dataList</strong>: The masked data. The order of the fields corresponds to the order of the column names.</p>
     * </li>
     * <li><p><strong>ruleList</strong>: The sensitive data type IDs. Each ID corresponds to the unique ID of a sensitive data type that is returned by the <a href="https://help.aliyun.com/document_detail/410141.html">DescribeRules</a> operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dataHeaderList&quot;:[&quot;name&quot;,&quot;age&quot;],&quot;dataList&quot;:[[&quot;l***&quot;,18],[&quot;l***&quot;,17]],&quot;ruleList&quot;:[1002,null]}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique ID for each request. You can use this ID to troubleshoot issues.</p>
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
