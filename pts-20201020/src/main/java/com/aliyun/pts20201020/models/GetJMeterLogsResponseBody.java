// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterLogsResponseBody extends TeaModel {
    /**
     * <p>The number of engines. The AgentCount value must be greater than the PageNumber value.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AgentCount")
    public Integer agentCount;

    /**
     * <p>The system status code. If the request was successful, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;timeTS&quot;:1637114804326, &quot;instanceId&quot;:0, &quot;level&quot;:&quot;INFO&quot;, &quot;logger&quot;:&quot;org.apache.jmeter.util.JMeterUtils&quot;, &quot;sceneId&quot;:251546, 	&quot;planId&quot;:1501546, &quot;thread&quot;:&quot;main&quot;, &quot;time&quot;:&quot;2021-11-17T10:06Z&quot;, &quot;taskId&quot;:15015460000, &quot;logText&quot;:&quot;Setting Locale to en_EN\n&quot; }</p>
     */
    @NameInMap("Logs")
    public java.util.List<java.util.Map<String, ?>> logs;

    /**
     * <p>The returned message. If the request was successful, this parameter is left empty.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
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
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetJMeterLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterLogsResponseBody self = new GetJMeterLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJMeterLogsResponseBody setAgentCount(Integer agentCount) {
        this.agentCount = agentCount;
        return this;
    }
    public Integer getAgentCount() {
        return this.agentCount;
    }

    public GetJMeterLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJMeterLogsResponseBody setLogs(java.util.List<java.util.Map<String, ?>> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getLogs() {
        return this.logs;
    }

    public GetJMeterLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJMeterLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetJMeterLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetJMeterLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJMeterLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetJMeterLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
