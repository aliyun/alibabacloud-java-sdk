// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateTopicResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Topic.Existed</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Return result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <p>Dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>TopicName</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>Dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>topicName</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The topic already exists.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID, each request\&quot;s ID is unique and can be used for troubleshooting and problem localization.</p>
     * 
     * <strong>example:</strong>
     * <p>AF9A8B10-C426-530F-A0DD-96320B39****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the execution was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicResponseBody self = new CreateTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTopicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTopicResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreateTopicResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public CreateTopicResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public CreateTopicResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateTopicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
