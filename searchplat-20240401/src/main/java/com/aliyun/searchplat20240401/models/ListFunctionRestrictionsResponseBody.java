// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListFunctionRestrictionsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>not found</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Long httpCode;

    /**
     * <p>The execution duration.</p>
     * 
     * <strong>example:</strong>
     * <p>10.444</p>
     */
    @NameInMap("latency")
    public Double latency;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;xx not found&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2423C841-91C4-5E51-B296-590D367967FC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public java.util.List<ListFunctionRestrictionsResponseBodyResult> result;

    /**
     * <p>The request status.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListFunctionRestrictionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionRestrictionsResponseBody self = new ListFunctionRestrictionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionRestrictionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFunctionRestrictionsResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public ListFunctionRestrictionsResponseBody setLatency(Double latency) {
        this.latency = latency;
        return this;
    }
    public Double getLatency() {
        return this.latency;
    }

    public ListFunctionRestrictionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFunctionRestrictionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFunctionRestrictionsResponseBody setResult(java.util.List<ListFunctionRestrictionsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListFunctionRestrictionsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListFunctionRestrictionsResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListFunctionRestrictionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListFunctionRestrictionsResponseBodyResult extends TeaModel {
        /**
         * <p>The metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *                     &quot;taskType&quot;:&quot;text-embedding&quot;,
         *                     &quot;modelSource&quot;:[
         *                         &quot;ai_search&quot;
         *                     ],
         *                     &quot;regionId&quot;:[
         *                         &quot;cn-hangzhou&quot;,
         *                         &quot;cn-zhangjiakou&quot;
         *                     ],
         *                     &quot;instanceType&quot;:[
         *                         &quot;gpu.v100.16g.x1&quot;,
         *                         &quot;gpu.t4.16g.x1&quot;,
         *                         &quot;gpu.a10.24g.x1&quot;
         *                     ]
         *                 }</p>
         */
        @NameInMap("meta")
        public java.util.Map<String, ?> meta;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        public static ListFunctionRestrictionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionRestrictionsResponseBodyResult self = new ListFunctionRestrictionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListFunctionRestrictionsResponseBodyResult setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public ListFunctionRestrictionsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
