// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModelOssTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Lxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p><a href="https://safxxxxxxxxx.aliyuncs.com">https://safxxxxxxxxx.aliyuncs.com</a></p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>saf/xxxxxx/xxxxxx</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <strong>example:</strong>
     * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public DescribeModelOssTokenResponseBodyResultObject resultObject;

    /**
     * <strong>example:</strong>
     * <p>lUxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("Signature")
    public String signature;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>smxxxxxxxxxxx</p>
     */
    @NameInMap("XOssSecurityToken")
    public String XOssSecurityToken;

    public static DescribeModelOssTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOssTokenResponseBody self = new DescribeModelOssTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelOssTokenResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public DescribeModelOssTokenResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeModelOssTokenResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeModelOssTokenResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeModelOssTokenResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeModelOssTokenResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeModelOssTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelOssTokenResponseBody setResultObject(DescribeModelOssTokenResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeModelOssTokenResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeModelOssTokenResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public DescribeModelOssTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeModelOssTokenResponseBody setXOssSecurityToken(String XOssSecurityToken) {
        this.XOssSecurityToken = XOssSecurityToken;
        return this;
    }
    public String getXOssSecurityToken() {
        return this.XOssSecurityToken;
    }

    public static class DescribeModelOssTokenResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Lxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://safxxxxxxxxx.aliyuncs.com">https://safxxxxxxxxx.aliyuncs.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>saf/xxxxxx/xxxxxx</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>lUxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <strong>example:</strong>
         * <p>smxxxxxxxxxxx</p>
         */
        @NameInMap("XOssSecurityToken")
        public String XOssSecurityToken;

        public static DescribeModelOssTokenResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelOssTokenResponseBodyResultObject self = new DescribeModelOssTokenResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeModelOssTokenResponseBodyResultObject setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public DescribeModelOssTokenResponseBodyResultObject setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeModelOssTokenResponseBodyResultObject setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeModelOssTokenResponseBodyResultObject setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeModelOssTokenResponseBodyResultObject setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public DescribeModelOssTokenResponseBodyResultObject setXOssSecurityToken(String XOssSecurityToken) {
            this.XOssSecurityToken = XOssSecurityToken;
            return this;
        }
        public String getXOssSecurityToken() {
            return this.XOssSecurityToken;
        }

    }

}
