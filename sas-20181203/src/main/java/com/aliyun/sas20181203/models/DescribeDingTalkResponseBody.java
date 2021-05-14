// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDingTalkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribeDingTalkResponseBodyPageInfo pageInfo;

    @NameInMap("ActionList")
    public java.util.List<DescribeDingTalkResponseBodyActionList> actionList;

    public static DescribeDingTalkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDingTalkResponseBody self = new DescribeDingTalkResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDingTalkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDingTalkResponseBody setPageInfo(DescribeDingTalkResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeDingTalkResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeDingTalkResponseBody setActionList(java.util.List<DescribeDingTalkResponseBodyActionList> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<DescribeDingTalkResponseBodyActionList> getActionList() {
        return this.actionList;
    }

    public static class DescribeDingTalkResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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

    public static class DescribeDingTalkResponseBodyActionList extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("ConfigList")
        public String configList;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("ActionName")
        public String actionName;

        @NameInMap("Url")
        public String url;

        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("DingTalkLang")
        public String dingTalkLang;

        @NameInMap("IntervalTime")
        public Integer intervalTime;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("GroupIdList")
        public String groupIdList;

        @NameInMap("Id")
        public Integer id;

        public static DescribeDingTalkResponseBodyActionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDingTalkResponseBodyActionList self = new DescribeDingTalkResponseBodyActionList();
            return TeaModel.build(map, self);
        }

        public DescribeDingTalkResponseBodyActionList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDingTalkResponseBodyActionList setConfigList(String configList) {
            this.configList = configList;
            return this;
        }
        public String getConfigList() {
            return this.configList;
        }

        public DescribeDingTalkResponseBodyActionList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDingTalkResponseBodyActionList setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public DescribeDingTalkResponseBodyActionList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeDingTalkResponseBodyActionList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeDingTalkResponseBodyActionList setDingTalkLang(String dingTalkLang) {
            this.dingTalkLang = dingTalkLang;
            return this;
        }
        public String getDingTalkLang() {
            return this.dingTalkLang;
        }

        public DescribeDingTalkResponseBodyActionList setIntervalTime(Integer intervalTime) {
            this.intervalTime = intervalTime;
            return this;
        }
        public Integer getIntervalTime() {
            return this.intervalTime;
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

    }

}
