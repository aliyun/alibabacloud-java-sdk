// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDingTalkResponseBody extends TeaModel {
    // An array that consists of details of notifications.
    @NameInMap("ActionList")
    public java.util.List<DescribeDingTalkResponseBodyActionList> actionList;

    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeDingTalkResponseBodyPageInfo pageInfo;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDingTalkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDingTalkResponseBody self = new DescribeDingTalkResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDingTalkResponseBody setActionList(java.util.List<DescribeDingTalkResponseBodyActionList> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<DescribeDingTalkResponseBodyActionList> getActionList() {
        return this.actionList;
    }

    public DescribeDingTalkResponseBody setPageInfo(DescribeDingTalkResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeDingTalkResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeDingTalkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDingTalkResponseBodyActionList extends TeaModel {
        // The name of the notification.
        @NameInMap("ActionName")
        public String actionName;

        // The UID of the user.
        @NameInMap("AliUid")
        public Long aliUid;

        // The list of notification settings.
        @NameInMap("ConfigList")
        public String configList;

        // The language of the content within notifications. Valid values:
        // 
        // *   **zh**: Chinese
        // *   **en**: English
        @NameInMap("DingTalkLang")
        public String dingTalkLang;

        // The creation time. unit:millisecond.
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        // The modification time.
        @NameInMap("GmtModified")
        public Long gmtModified;

        // The group IDs.
        @NameInMap("GroupIdList")
        public String groupIdList;

        // The ID of the notification.
        @NameInMap("Id")
        public Integer id;

        // The interval at which the notifications are sent.unit:minute.
        @NameInMap("IntervalTime")
        public Integer intervalTime;

        // The status of the notification. Valid values:
        // 
        // *   **0**: disabled
        // *   **1**: enabled
        @NameInMap("Status")
        public Integer status;

        // The parameters of the notification.
        @NameInMap("Url")
        public String url;

        public static DescribeDingTalkResponseBodyActionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDingTalkResponseBodyActionList self = new DescribeDingTalkResponseBodyActionList();
            return TeaModel.build(map, self);
        }

        public DescribeDingTalkResponseBodyActionList setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public DescribeDingTalkResponseBodyActionList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeDingTalkResponseBodyActionList setConfigList(String configList) {
            this.configList = configList;
            return this;
        }
        public String getConfigList() {
            return this.configList;
        }

        public DescribeDingTalkResponseBodyActionList setDingTalkLang(String dingTalkLang) {
            this.dingTalkLang = dingTalkLang;
            return this;
        }
        public String getDingTalkLang() {
            return this.dingTalkLang;
        }

        public DescribeDingTalkResponseBodyActionList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDingTalkResponseBodyActionList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDingTalkResponseBodyActionList setGroupIdList(String groupIdList) {
            this.groupIdList = groupIdList;
            return this;
        }
        public String getGroupIdList() {
            return this.groupIdList;
        }

        public DescribeDingTalkResponseBodyActionList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeDingTalkResponseBodyActionList setIntervalTime(Integer intervalTime) {
            this.intervalTime = intervalTime;
            return this;
        }
        public Integer getIntervalTime() {
            return this.intervalTime;
        }

        public DescribeDingTalkResponseBodyActionList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDingTalkResponseBodyActionList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeDingTalkResponseBodyPageInfo extends TeaModel {
        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of messages.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeDingTalkResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDingTalkResponseBodyPageInfo self = new DescribeDingTalkResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDingTalkResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeDingTalkResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeDingTalkResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
