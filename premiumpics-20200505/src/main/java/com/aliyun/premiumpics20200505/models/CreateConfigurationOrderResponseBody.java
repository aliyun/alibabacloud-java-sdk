// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class CreateConfigurationOrderResponseBody extends TeaModel {
    /**
     * <p>module</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>errorMsg</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>requestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateConfigurationOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigurationOrderResponseBody self = new CreateConfigurationOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConfigurationOrderResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateConfigurationOrderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateConfigurationOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateConfigurationOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
