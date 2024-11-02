// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordInOutputResponseBody extends TeaModel {
    /**
     * <p>The execution result of the component action.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;actionUuid&quot;: &quot;3896a25d-4967-493c-942e-4e60f27da1f7-xxxxx&quot;,
     *     &quot;outputSummary&quot;: {
     *         &quot;datalist&quot;: [
     *             {
     *                 &quot;a&quot;: &quot;a&quot;
     *             }
     *         ],
     *         &quot;total_data_successful&quot;: 1,
     *         &quot;total_data&quot;: 1,
     *         &quot;total_exe_successful&quot;: 1,
     *         &quot;total_exe&quot;: 1,
     *         &quot;total_data_with_dup&quot;: 1,
     *         &quot;status&quot;: true
     *     },
     *     &quot;outputSchema&quot;: {
     *         &quot;a&quot;: &quot;String&quot;,
     *         &quot;startTime&quot;: &quot;DateTime&quot;
     *     },
     *     &quot;inputParams&quot;: {
     *         &quot;inputData&quot;: [
     *             {
     *                 &quot;outputFields&quot;: {
     *                     &quot;a&quot;: &quot;a&quot;
     *                 }
     *             }
     *         ],
     *         &quot;totalSize&quot;: 1
     *     },
     *     &quot;startTime&quot;: &quot;2023-11-13 17:47:28.645&quot;,
     *     &quot;taskName&quot;: &quot;92af3c79-1754-4646-9366-9ddbxxxxx&quot;
     * }</p>
     */
    @NameInMap("InOutputInfo")
    public String inOutputInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>372D8B41-AF8D-573A-9B3F-0924950F241F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSoarRecordInOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarRecordInOutputResponseBody self = new DescribeSoarRecordInOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSoarRecordInOutputResponseBody setInOutputInfo(String inOutputInfo) {
        this.inOutputInfo = inOutputInfo;
        return this;
    }
    public String getInOutputInfo() {
        return this.inOutputInfo;
    }

    public DescribeSoarRecordInOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
