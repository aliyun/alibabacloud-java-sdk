// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListChatbotInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Bots")
    public java.util.List<ListChatbotInstancesResponseBodyBots> bots;

    public static ListChatbotInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatbotInstancesResponseBody self = new ListChatbotInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatbotInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChatbotInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListChatbotInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListChatbotInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListChatbotInstancesResponseBody setBots(java.util.List<ListChatbotInstancesResponseBodyBots> bots) {
        this.bots = bots;
        return this;
    }
    public java.util.List<ListChatbotInstancesResponseBodyBots> getBots() {
        return this.bots;
    }

    public static class ListChatbotInstancesResponseBodyBots extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("LanguageCode")
        public String languageCode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Introduction")
        public String introduction;

        @NameInMap("CreateTime")
        public String createTime;

        public static ListChatbotInstancesResponseBodyBots build(java.util.Map<String, ?> map) throws Exception {
            ListChatbotInstancesResponseBodyBots self = new ListChatbotInstancesResponseBodyBots();
            return TeaModel.build(map, self);
        }

        public ListChatbotInstancesResponseBodyBots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListChatbotInstancesResponseBodyBots setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public ListChatbotInstancesResponseBodyBots setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
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

        public ListChatbotInstancesResponseBodyBots setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public ListChatbotInstancesResponseBodyBots setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
