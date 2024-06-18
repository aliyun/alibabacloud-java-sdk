// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class QueryRecommendByCodeResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;SupportOnlineResizeDisk&quot;: true,
     *       &quot;DBInstanceName&quot;: &quot;rm-bp****&quot;,
     *       &quot;maxSupportDiskSizeGB&quot;: 6144
     * }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90496720-2319-42A8-87CD-FCE4DF95EBED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryRecommendByCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecommendByCodeResponseBody self = new QueryRecommendByCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecommendByCodeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryRecommendByCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecommendByCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
