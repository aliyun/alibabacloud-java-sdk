// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListBeebotIntentResponseBody extends TeaModel {
    /**
     * <p>The internal request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>497CFAFF-48CC-161A-AD2C-252DED569037</p>
     */
    @NameInMap("BeebotRequestId")
    public String beebotRequestId;

    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of intents.</p>
     */
    @NameInMap("Intents")
    public java.util.List<ListBeebotIntentResponseBodyIntents> intents;

    /**
     * <p>The message returned by the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBeebotIntentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBeebotIntentResponseBody self = new ListBeebotIntentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBeebotIntentResponseBody setBeebotRequestId(String beebotRequestId) {
        this.beebotRequestId = beebotRequestId;
        return this;
    }
    public String getBeebotRequestId() {
        return this.beebotRequestId;
    }

    public ListBeebotIntentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBeebotIntentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBeebotIntentResponseBody setIntents(java.util.List<ListBeebotIntentResponseBodyIntents> intents) {
        this.intents = intents;
        return this;
    }
    public java.util.List<ListBeebotIntentResponseBodyIntents> getIntents() {
        return this.intents;
    }

    public ListBeebotIntentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBeebotIntentResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBeebotIntentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBeebotIntentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBeebotIntentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListBeebotIntentResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBeebotIntentResponseBodyIntents extends TeaModel {
        /**
         * <p>The intent alias.</p>
         * 
         * <strong>example:</strong>
         * <p>嗯明白了</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The time when the intent was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-21 16:03:15.+0800</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the user who created the intent.</p>
         * 
         * <strong>example:</strong>
         * <p>1252504</p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <p>The name of the account that created the intent.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@voice-navigator-testonaliyun.com">xxx@voice-navigator-testonaliyun.com</a></p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>The intent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10717802</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        /**
         * <p>The intent name.</p>
         * <blockquote>
         * <p>This is the intent code. It uniquely identifies the intent.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>知道了</p>
         */
        @NameInMap("IntentName")
        public String intentName;

        /**
         * <p>The time when the intent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-21 16:03:15.+0800</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>Modify User ID</p>
         * 
         * <strong>example:</strong>
         * <p>1252504</p>
         */
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        /**
         * <p>Modify the account name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@voice-navigator-testonaliyun.com">xxx@voice-navigator-testonaliyun.com</a></p>
         */
        @NameInMap("ModifyUserName")
        public String modifyUserName;

        public static ListBeebotIntentResponseBodyIntents build(java.util.Map<String, ?> map) throws Exception {
            ListBeebotIntentResponseBodyIntents self = new ListBeebotIntentResponseBodyIntents();
            return TeaModel.build(map, self);
        }

        public ListBeebotIntentResponseBodyIntents setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListBeebotIntentResponseBodyIntents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBeebotIntentResponseBodyIntents setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListBeebotIntentResponseBodyIntents setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListBeebotIntentResponseBodyIntents setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public ListBeebotIntentResponseBodyIntents setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public ListBeebotIntentResponseBodyIntents setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListBeebotIntentResponseBodyIntents setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListBeebotIntentResponseBodyIntents setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

    }

}
