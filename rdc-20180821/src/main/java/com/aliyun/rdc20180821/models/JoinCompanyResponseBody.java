// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class JoinCompanyResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public JoinCompanyResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static JoinCompanyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JoinCompanyResponseBody self = new JoinCompanyResponseBody();
        return TeaModel.build(map, self);
    }

    public JoinCompanyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public JoinCompanyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public JoinCompanyResponseBody setData(JoinCompanyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public JoinCompanyResponseBodyData getData() {
        return this.data;
    }

    public JoinCompanyResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public JoinCompanyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class JoinCompanyResponseBodyData extends TeaModel {
        @NameInMap("ApplicationId")
        public String applicationId;

        public static JoinCompanyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            JoinCompanyResponseBodyData self = new JoinCompanyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public JoinCompanyResponseBodyData setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

    }

}
