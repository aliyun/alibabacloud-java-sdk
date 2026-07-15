// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetOverviewResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The overview data in JSON format, which corresponds to the overview data on the console. The result is returned in one of the following three formats:</p>
     * <ul>
     * <li>Basic information.</li>
     * <li>Node runtime information within a time interval.</li>
     * <li>Node runtime timing information within a time interval. This format returns statistics information at each time point for three data items: node triggers, successful executions, and failed executions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Basic info: {&quot;schedulerx_job_counter_disable&quot;: &quot;4&quot;,&quot;schedulerx_job_trigger_counter_running&quot;: &quot;0&quot;,&quot;schedulerx_job_counter_enable&quot;: &quot;70&quot;,&quot;schedulerx_job_counter_all&quot;: &quot;74&quot;,&quot;schedulerx_worker_counter&quot;: &quot;2&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message. This parameter is returned only when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>No access permission for the namespace [***]</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39090022-1F3B-4797-8518-6B61095F1AF0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call was successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOverviewResponseBody self = new GetOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOverviewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetOverviewResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
