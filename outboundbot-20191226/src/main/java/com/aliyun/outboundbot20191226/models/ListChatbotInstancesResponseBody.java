// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListChatbotInstancesResponseBody extends TeaModel {
    @NameInMap("Bots")
    public java.util.List<ListChatbotInstancesResponseBodyBots> bots;

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
     * <p>5</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
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
    public Long totalCount;

    public static ListChatbotInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatbotInstancesResponseBody self = new ListChatbotInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatbotInstancesResponseBody setBots(java.util.List<ListChatbotInstancesResponseBodyBots> bots) {
        this.bots = bots;
        return this;
    }
    public java.util.List<ListChatbotInstancesResponseBodyBots> getBots() {
        return this.bots;
    }

    public ListChatbotInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChatbotInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListChatbotInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChatbotInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListChatbotInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListChatbotInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChatbotInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListChatbotInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListChatbotInstancesResponseBodyBots extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://ccrm.wengine.cn/ccrm/system/common/fileDownload/noToken?fileId=975cdeaa064846e3b6004abd9ba1d7c8">https://ccrm.wengine.cn/ccrm/system/common/fileDownload/noToken?fileId=975cdeaa064846e3b6004abd9ba1d7c8</a></p>
         */
        @NameInMap("Avatar")
        public String avatar;

        /**
         * <strong>example:</strong>
         * <p>2022-01-18T02:36:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>e874fcf0-d2f4-4e62-9377-b6f35fe55210</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Introduction")
        public String introduction;

        /**
         * <strong>example:</strong>
         * <p>zh-cn</p>
         */
        @NameInMap("LanguageCode")
        public String languageCode;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        public static ListChatbotInstancesResponseBodyBots build(java.util.Map<String, ?> map) throws Exception {
            ListChatbotInstancesResponseBodyBots self = new ListChatbotInstancesResponseBodyBots();
            return TeaModel.build(map, self);
        }

        public ListChatbotInstancesResponseBodyBots setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public ListChatbotInstancesResponseBodyBots setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListChatbotInstancesResponseBodyBots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListChatbotInstancesResponseBodyBots setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public ListChatbotInstancesResponseBodyBots setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

        public ListChatbotInstancesResponseBodyBots setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListChatbotInstancesResponseBodyBots setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
