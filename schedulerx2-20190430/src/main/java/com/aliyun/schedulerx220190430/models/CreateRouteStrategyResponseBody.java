// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateRouteStrategyResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateRouteStrategyResponseBodyData data;

    /**
     * <p>The additional information, including errors and tips.</p>
     * 
     * <strong>example:</strong>
     * <p>strategy name is null or empty.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4F68ABED-AC31-4412-9297-D9A8F0401108</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateRouteStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteStrategyResponseBody self = new CreateRouteStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRouteStrategyResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateRouteStrategyResponseBody setData(CreateRouteStrategyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateRouteStrategyResponseBodyData getData() {
        return this.data;
    }

    public CreateRouteStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRouteStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRouteStrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateRouteStrategyResponseBodyData extends TeaModel {
        public static CreateRouteStrategyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteStrategyResponseBodyData self = new CreateRouteStrategyResponseBodyData();
            return TeaModel.build(map, self);
        }

    }

}
