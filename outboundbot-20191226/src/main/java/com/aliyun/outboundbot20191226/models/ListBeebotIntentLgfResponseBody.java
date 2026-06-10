// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListBeebotIntentLgfResponseBody extends TeaModel {
    /**
     * <p>The internal request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>497CFAFF-48CC-161A-AD2C-252DED569037</p>
     */
    @NameInMap("BeebotRequestId")
    public String beebotRequestId;

    /**
     * <p>The API status code.</p>
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
     * <p>The list of LGFs.</p>
     */
    @NameInMap("Lgfs")
    public java.util.List<ListBeebotIntentLgfResponseBodyLgfs> lgfs;

    /**
     * <p>The message returned by the API.</p>
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
     * <p>The number of entries returned per page.</p>
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
     * <p>Indicates whether the request was successful.</p>
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

    public static ListBeebotIntentLgfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBeebotIntentLgfResponseBody self = new ListBeebotIntentLgfResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBeebotIntentLgfResponseBody setBeebotRequestId(String beebotRequestId) {
        this.beebotRequestId = beebotRequestId;
        return this;
    }
    public String getBeebotRequestId() {
        return this.beebotRequestId;
    }

    public ListBeebotIntentLgfResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBeebotIntentLgfResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBeebotIntentLgfResponseBody setLgfs(java.util.List<ListBeebotIntentLgfResponseBodyLgfs> lgfs) {
        this.lgfs = lgfs;
        return this;
    }
    public java.util.List<ListBeebotIntentLgfResponseBodyLgfs> getLgfs() {
        return this.lgfs;
    }

    public ListBeebotIntentLgfResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBeebotIntentLgfResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBeebotIntentLgfResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBeebotIntentLgfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBeebotIntentLgfResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListBeebotIntentLgfResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBeebotIntentLgfResponseBodyLgfs extends TeaModel {
        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-21 10:54:18.+0800</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The intent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10717802</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        /**
         * <p>The ID of the utterance template.</p>
         * 
         * <strong>example:</strong>
         * <p>5666117</p>
         */
        @NameInMap("LgfId")
        public Long lgfId;

        /**
         * <p>The time when the template was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-21 10:54:18.+0800</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The content of the utterance template.</p>
         * 
         * <strong>example:</strong>
         * <p>我是一个问法模版</p>
         */
        @NameInMap("RuleText")
        public String ruleText;

        public static ListBeebotIntentLgfResponseBodyLgfs build(java.util.Map<String, ?> map) throws Exception {
            ListBeebotIntentLgfResponseBodyLgfs self = new ListBeebotIntentLgfResponseBodyLgfs();
            return TeaModel.build(map, self);
        }

        public ListBeebotIntentLgfResponseBodyLgfs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBeebotIntentLgfResponseBodyLgfs setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public ListBeebotIntentLgfResponseBodyLgfs setLgfId(Long lgfId) {
            this.lgfId = lgfId;
            return this;
        }
        public Long getLgfId() {
            return this.lgfId;
        }

        public ListBeebotIntentLgfResponseBodyLgfs setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListBeebotIntentLgfResponseBodyLgfs setRuleText(String ruleText) {
            this.ruleText = ruleText;
            return this;
        }
        public String getRuleText() {
            return this.ruleText;
        }

    }

}
