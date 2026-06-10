// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeBeebotIntentResponseBody extends TeaModel {
    /**
     * <p>Internal request ID</p>
     * 
     * <strong>example:</strong>
     * <p>0B219FCB-EC71-1F08-BB1B-0E87C20158C8</p>
     */
    @NameInMap("BeebotRequestId")
    public String beebotRequestId;

    /**
     * <p>API status code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Intent information</p>
     */
    @NameInMap("Intent")
    public DescribeBeebotIntentResponseBodyIntent intent;

    /**
     * <p>Intent ID</p>
     * 
     * <strong>example:</strong>
     * <p>10717802</p>
     */
    @NameInMap("IntentId")
    public Long intentId;

    /**
     * <p>API message</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeBeebotIntentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBeebotIntentResponseBody self = new DescribeBeebotIntentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBeebotIntentResponseBody setBeebotRequestId(String beebotRequestId) {
        this.beebotRequestId = beebotRequestId;
        return this;
    }
    public String getBeebotRequestId() {
        return this.beebotRequestId;
    }

    public DescribeBeebotIntentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeBeebotIntentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeBeebotIntentResponseBody setIntent(DescribeBeebotIntentResponseBodyIntent intent) {
        this.intent = intent;
        return this;
    }
    public DescribeBeebotIntentResponseBodyIntent getIntent() {
        return this.intent;
    }

    public DescribeBeebotIntentResponseBody setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public DescribeBeebotIntentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBeebotIntentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBeebotIntentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBeebotIntentResponseBodyIntent extends TeaModel {
        /**
         * <p>Intent alias</p>
         * 
         * <strong>example:</strong>
         * <p>嗯明白了</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-21 10:29:59.+0800</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Creator user ID</p>
         * 
         * <strong>example:</strong>
         * <p>1252504</p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <p>Creator account name</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@voice-navigator-testonaliyun.com">xxx@voice-navigator-testonaliyun.com</a></p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>Intent ID</p>
         * 
         * <strong>example:</strong>
         * <p>10717802</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        /**
         * <p>Intent name</p>
         * 
         * <strong>example:</strong>
         * <p>知道了</p>
         */
        @NameInMap("IntentName")
        public String intentName;

        /**
         * <p>Modification time</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-21 15:52:57.+0800</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>Modifier user ID</p>
         * 
         * <strong>example:</strong>
         * <p>1252504</p>
         */
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        /**
         * <p>Modifier account name</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@voice-navigator-testonaliyun.com">xxx@voice-navigator-testonaliyun.com</a></p>
         */
        @NameInMap("ModifyUserName")
        public String modifyUserName;

        public static DescribeBeebotIntentResponseBodyIntent build(java.util.Map<String, ?> map) throws Exception {
            DescribeBeebotIntentResponseBodyIntent self = new DescribeBeebotIntentResponseBodyIntent();
            return TeaModel.build(map, self);
        }

        public DescribeBeebotIntentResponseBodyIntent setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeBeebotIntentResponseBodyIntent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeBeebotIntentResponseBodyIntent setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public DescribeBeebotIntentResponseBodyIntent setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public DescribeBeebotIntentResponseBodyIntent setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public DescribeBeebotIntentResponseBodyIntent setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public DescribeBeebotIntentResponseBodyIntent setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeBeebotIntentResponseBodyIntent setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public DescribeBeebotIntentResponseBodyIntent setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

    }

}
