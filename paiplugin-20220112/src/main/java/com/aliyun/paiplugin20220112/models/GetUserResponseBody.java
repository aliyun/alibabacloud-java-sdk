// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public GetUserResponseBodyData data;

    /**
     * <p>错误码。</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <p>错误信息。</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setData(GetUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserResponseBodyData getData() {
        return this.data;
    }

    public GetUserResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetUserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUserResponseBodyData extends TeaModel {
        /**
         * <p>账号状态。</p>
         * <p>- 0 : 正常使用。</p>
         * <p>- 1 : 因欠费等原因暂时停用。</p>
         * <p>- 2 : 已释放产品。</p>
         */
        @NameInMap("AccountStatus")
        public Integer accountStatus;

        public static GetUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyData self = new GetUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyData setAccountStatus(Integer accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public Integer getAccountStatus() {
            return this.accountStatus;
        }

    }

}
