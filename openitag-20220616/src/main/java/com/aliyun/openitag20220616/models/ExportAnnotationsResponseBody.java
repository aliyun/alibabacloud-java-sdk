// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ExportAnnotationsResponseBody extends TeaModel {
    /**
     * <p>Return encoding. The default value is 0, indicating Normal execution.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Details.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Details")
    public String details;

    /**
     * <p>Error code.</p>
     * <ul>
     * <li>When Success is false, returns a business error code.</li>
     * <li>When Success is true, returns an empty value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Pipeline.</p>
     */
    @NameInMap("FlowJob")
    public FlowJobInfo flowJob;

    /**
     * <p>The response message of the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90ABA848-AD74-1F6E-84BC-4182A7F1F29E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded. Valid values:</p>
     * <ul>
     * <li>true: Succeeded.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ExportAnnotationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportAnnotationsResponseBody self = new ExportAnnotationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportAnnotationsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ExportAnnotationsResponseBody setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public ExportAnnotationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ExportAnnotationsResponseBody setFlowJob(FlowJobInfo flowJob) {
        this.flowJob = flowJob;
        return this;
    }
    public FlowJobInfo getFlowJob() {
        return this.flowJob;
    }

    public ExportAnnotationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportAnnotationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportAnnotationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
