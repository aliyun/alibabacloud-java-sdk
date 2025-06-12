// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListBeebotIntentUserSayResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D7BBFCDF-59B0-1ADA-BCA3-4B77F642DDFB</p>
     */
    @NameInMap("BeebotRequestId")
    public String beebotRequestId;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>0956D5DA-0978-5DC9-94B0-C68527DA7475</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("UserSays")
    public java.util.List<ListBeebotIntentUserSayResponseBodyUserSays> userSays;

    public static ListBeebotIntentUserSayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBeebotIntentUserSayResponseBody self = new ListBeebotIntentUserSayResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBeebotIntentUserSayResponseBody setBeebotRequestId(String beebotRequestId) {
        this.beebotRequestId = beebotRequestId;
        return this;
    }
    public String getBeebotRequestId() {
        return this.beebotRequestId;
    }

    public ListBeebotIntentUserSayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBeebotIntentUserSayResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBeebotIntentUserSayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBeebotIntentUserSayResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBeebotIntentUserSayResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBeebotIntentUserSayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBeebotIntentUserSayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListBeebotIntentUserSayResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListBeebotIntentUserSayResponseBody setUserSays(java.util.List<ListBeebotIntentUserSayResponseBodyUserSays> userSays) {
        this.userSays = userSays;
        return this;
    }
    public java.util.List<ListBeebotIntentUserSayResponseBodyUserSays> getUserSays() {
        return this.userSays;
    }

    public static class ListBeebotIntentUserSayResponseBodyUserSays extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2025-04-21 14:16:05.+0800</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>10717802</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        /**
         * <strong>example:</strong>
         * <p>2025-04-21 14:16:05.+0800</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>17448458</p>
         */
        @NameInMap("UserSayId")
        public String userSayId;

        public static ListBeebotIntentUserSayResponseBodyUserSays build(java.util.Map<String, ?> map) throws Exception {
            ListBeebotIntentUserSayResponseBodyUserSays self = new ListBeebotIntentUserSayResponseBodyUserSays();
            return TeaModel.build(map, self);
        }

        public ListBeebotIntentUserSayResponseBodyUserSays setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListBeebotIntentUserSayResponseBodyUserSays setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBeebotIntentUserSayResponseBodyUserSays setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public ListBeebotIntentUserSayResponseBodyUserSays setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListBeebotIntentUserSayResponseBodyUserSays setUserSayId(String userSayId) {
            this.userSayId = userSayId;
            return this;
        }
        public String getUserSayId() {
            return this.userSayId;
        }

    }

}
