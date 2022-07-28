// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryByTaskIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryByTaskIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryByTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryByTaskIdResponseBody self = new QueryByTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryByTaskIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryByTaskIdResponseBody setData(QueryByTaskIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryByTaskIdResponseBodyData getData() {
        return this.data;
    }

    public QueryByTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryByTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryByTaskIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryByTaskIdResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("AnswerFilePath")
        public String answerFilePath;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("ExpirationDate")
        public Long expirationDate;

        @NameInMap("QueryFilePath")
        public String queryFilePath;

        @NameInMap("RobotCode")
        public String robotCode;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static QueryByTaskIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryByTaskIdResponseBodyData self = new QueryByTaskIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryByTaskIdResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public QueryByTaskIdResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public QueryByTaskIdResponseBodyData setAnswerFilePath(String answerFilePath) {
            this.answerFilePath = answerFilePath;
            return this;
        }
        public String getAnswerFilePath() {
            return this.answerFilePath;
        }

        public QueryByTaskIdResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public QueryByTaskIdResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public QueryByTaskIdResponseBodyData setExpirationDate(Long expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Long getExpirationDate() {
            return this.expirationDate;
        }

        public QueryByTaskIdResponseBodyData setQueryFilePath(String queryFilePath) {
            this.queryFilePath = queryFilePath;
            return this;
        }
        public String getQueryFilePath() {
            return this.queryFilePath;
        }

        public QueryByTaskIdResponseBodyData setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public QueryByTaskIdResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
