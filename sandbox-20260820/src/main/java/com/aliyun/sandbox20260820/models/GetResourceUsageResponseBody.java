// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class GetResourceUsageResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success. Other values indicate specific error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The message that describes the result of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-5678-9abc-123456789abc</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The usage results for the query interval and each group.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;startTime&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T02:00:00Z&quot;,&quot;granularity&quot;:&quot;Hour&quot;,&quot;groupBy&quot;:[&quot;teamID&quot;],&quot;groups&quot;:[{&quot;dimensions&quot;:{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;},&quot;items&quot;:[{&quot;usageName&quot;:&quot;cpuActive&quot;,&quot;unit&quot;:&quot;CoreSecond&quot;,&quot;total&quot;:5400,&quot;buckets&quot;:[{&quot;startTime&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;quantity&quot;:3600},{&quot;startTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T02:00:00Z&quot;,&quot;quantity&quot;:1800}]}]}]}</p>
     */
    @NameInMap("resourceUsage")
    public ResourceUsage resourceUsage;

    public static GetResourceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceUsageResponseBody self = new GetResourceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResourceUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResourceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceUsageResponseBody setResourceUsage(ResourceUsage resourceUsage) {
        this.resourceUsage = resourceUsage;
        return this;
    }
    public ResourceUsage getResourceUsage() {
        return this.resourceUsage;
    }

}
