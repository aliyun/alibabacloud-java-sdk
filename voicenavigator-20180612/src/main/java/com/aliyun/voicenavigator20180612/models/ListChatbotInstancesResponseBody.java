// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListChatbotInstancesResponseBody extends TeaModel {
    @NameInMap("Bots")
    public java.util.List<ListChatbotInstancesResponseBodyBots> bots;

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
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
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

    public ListChatbotInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
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
         * <p><a href="https://dss0.ali.com/70cFuHS.jpg">https://dss0.ali.com/70cFuHS.jpg</a></p>
         */
        @NameInMap("Avatar")
        public String avatar;

        /**
         * <strong>example:</strong>
         * <p>1582266750353</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>‘’</p>
         */
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
         * <p>UTC+8</p>
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
