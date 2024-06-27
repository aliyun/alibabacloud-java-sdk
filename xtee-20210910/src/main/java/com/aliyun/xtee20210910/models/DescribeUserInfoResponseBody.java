// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeUserInfoResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("resultObject")
    public DescribeUserInfoResponseBodyResultObject resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserInfoResponseBody self = new DescribeUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeUserInfoResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeUserInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeUserInfoResponseBody setResultObject(DescribeUserInfoResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeUserInfoResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeUserInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeUserInfoResponseBodyResultObject extends TeaModel {
        @NameInMap("clientIp")
        public String clientIp;

        @NameInMap("subId")
        public String subId;

        @NameInMap("userId")
        public Long userId;

        @NameInMap("userName")
        public String userName;

        public static DescribeUserInfoResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserInfoResponseBodyResultObject self = new DescribeUserInfoResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeUserInfoResponseBodyResultObject setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeUserInfoResponseBodyResultObject setSubId(String subId) {
            this.subId = subId;
            return this;
        }
        public String getSubId() {
            return this.subId;
        }

        public DescribeUserInfoResponseBodyResultObject setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeUserInfoResponseBodyResultObject setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
