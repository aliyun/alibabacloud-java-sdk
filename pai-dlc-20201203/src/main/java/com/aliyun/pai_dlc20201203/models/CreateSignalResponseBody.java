// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateSignalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dlc********</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>019F6385-7481-57A7-BEC9-***********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SIGUSR1</p>
     */
    @NameInMap("Signal")
    public String signal;

    /**
     * <strong>example:</strong>
     * <p>oper************</p>
     */
    @NameInMap("SignalId")
    public String signalId;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateSignalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSignalResponseBody self = new CreateSignalResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSignalResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateSignalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSignalResponseBody setSignal(String signal) {
        this.signal = signal;
        return this;
    }
    public String getSignal() {
        return this.signal;
    }

    public CreateSignalResponseBody setSignalId(String signalId) {
        this.signalId = signalId;
        return this;
    }
    public String getSignalId() {
        return this.signalId;
    }

    public CreateSignalResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
