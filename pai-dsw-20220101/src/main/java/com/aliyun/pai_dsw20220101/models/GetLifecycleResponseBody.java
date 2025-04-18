// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetLifecycleResponseBody extends TeaModel {
    /**
     * <p>The status code. Valid values:</p>
     * <ul>
     * <li>InternalError: All errors, except for parameter validation errors, are internal errors.</li>
     * <li>ValidationError: A parameter validation error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The lifecycle details.</p>
     * 
     * <strong>example:</strong>
     * <p>[[{&quot;Status&quot;:&quot;Creating&quot;,&quot;GmtCreateTime&quot;:&quot;2022-09-19T22:38:00Z&quot;,&quot;Reason&quot;:&quot;&quot;,&quot;ReasonCode&quot;:&quot;&quot;}]]</p>
     */
    @NameInMap("Lifecycle")
    public java.util.List<java.util.List<GetLifecycleResponseBodyLifecycle>> lifecycle;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;XXX&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of queried sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>35</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetLifecycleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLifecycleResponseBody self = new GetLifecycleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLifecycleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLifecycleResponseBody setLifecycle(java.util.List<java.util.List<GetLifecycleResponseBodyLifecycle>> lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public java.util.List<java.util.List<GetLifecycleResponseBodyLifecycle>> getLifecycle() {
        return this.lifecycle;
    }

    public GetLifecycleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLifecycleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLifecycleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLifecycleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetLifecycleResponseBodyLifecycle extends TeaModel {
        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>SaveFailed: The instance image failed to be saved.</li>
         * <li>Stopped</li>
         * <li>Failed</li>
         * <li>ResourceAllocating</li>
         * <li>Stopping</li>
         * <li>Updating</li>
         * <li>Saving</li>
         * <li>Starting</li>
         * <li>Running</li>
         * <li>Saved</li>
         * <li>EnvPreparing: Preparing environment.</li>
         * <li>ArrearStopping: The service is being stopped due to overdue payments.</li>
         * <li>Arrearge: The service is stopped due to overdue payments.</li>
         * <li>Queuing</li>
         * <li>Recovering</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Starting</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason code that corresponds to an event.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The reason message that corresponds to an event.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        /**
         * <p>The time the status was created, specifically the time the instance transitioned to this status (in GMT).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-21T07:27:44Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        public static GetLifecycleResponseBodyLifecycle build(java.util.Map<String, ?> map) throws Exception {
            GetLifecycleResponseBodyLifecycle self = new GetLifecycleResponseBodyLifecycle();
            return TeaModel.build(map, self);
        }

        public GetLifecycleResponseBodyLifecycle setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLifecycleResponseBodyLifecycle setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public GetLifecycleResponseBodyLifecycle setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public GetLifecycleResponseBodyLifecycle setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

    }

}
