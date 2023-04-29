// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClientUserDefineRulesResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public ListClientUserDefineRulesResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserDefineRuleList")
    public java.util.List<ListClientUserDefineRulesResponseBodyUserDefineRuleList> userDefineRuleList;

    public static ListClientUserDefineRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClientUserDefineRulesResponseBody self = new ListClientUserDefineRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClientUserDefineRulesResponseBody setPageInfo(ListClientUserDefineRulesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListClientUserDefineRulesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListClientUserDefineRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClientUserDefineRulesResponseBody setUserDefineRuleList(java.util.List<ListClientUserDefineRulesResponseBodyUserDefineRuleList> userDefineRuleList) {
        this.userDefineRuleList = userDefineRuleList;
        return this;
    }
    public java.util.List<ListClientUserDefineRulesResponseBodyUserDefineRuleList> getUserDefineRuleList() {
        return this.userDefineRuleList;
    }

    public static class ListClientUserDefineRulesResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListClientUserDefineRulesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListClientUserDefineRulesResponseBodyPageInfo self = new ListClientUserDefineRulesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListClientUserDefineRulesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListClientUserDefineRulesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListClientUserDefineRulesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListClientUserDefineRulesResponseBodyUserDefineRuleList extends TeaModel {
        @NameInMap("ActionType")
        public Integer actionType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("SwitchId")
        public String switchId;

        @NameInMap("Type")
        public Integer type;

        public static ListClientUserDefineRulesResponseBodyUserDefineRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListClientUserDefineRulesResponseBodyUserDefineRuleList self = new ListClientUserDefineRulesResponseBodyUserDefineRuleList();
            return TeaModel.build(map, self);
        }

        public ListClientUserDefineRulesResponseBodyUserDefineRuleList setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public ListClientUserDefineRulesResponseBodyUserDefineRuleList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListClientUserDefineRulesResponseBodyUserDefineRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClientUserDefineRulesResponseBodyUserDefineRuleList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListClientUserDefineRulesResponseBodyUserDefineRuleList setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public ListClientUserDefineRulesResponseBodyUserDefineRuleList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
