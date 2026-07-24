// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.thirdswaicall20251127.models;

import com.aliyun.tea.*;

public class CreateCallOutboundInstantRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>13800138000</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("CustomerName")
    public String customerName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EncryptCall")
    public Boolean encryptCall;

    /**
     * <strong>example:</strong>
     * <p>{&quot;start&quot;:&quot;2220&quot;}</p>
     */
    @NameInMap("PromptVariables")
    public String promptVariables;

    /**
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static CreateCallOutboundInstantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCallOutboundInstantRequest self = new CreateCallOutboundInstantRequest();
        return TeaModel.build(map, self);
    }

    public CreateCallOutboundInstantRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public CreateCallOutboundInstantRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public CreateCallOutboundInstantRequest setEncryptCall(Boolean encryptCall) {
        this.encryptCall = encryptCall;
        return this;
    }
    public Boolean getEncryptCall() {
        return this.encryptCall;
    }

    public CreateCallOutboundInstantRequest setPromptVariables(String promptVariables) {
        this.promptVariables = promptVariables;
        return this;
    }
    public String getPromptVariables() {
        return this.promptVariables;
    }

    public CreateCallOutboundInstantRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
