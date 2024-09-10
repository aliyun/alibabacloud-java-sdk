// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClientUserDefineRulesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListClientUserDefineRulesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB393***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the rules.</p>
     */
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
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
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
        /**
         * <p>The action of the rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: allow</li>
         * <li><strong>1</strong>: block</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ActionType")
        public Integer actionType;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>200****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Rule\<em>\</em>\<em>\</em></p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows</li>
         * <li><strong>linux</strong>: Linux</li>
         * <li><strong>all</strong>: all types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The switch ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>USER-DEFINE-RULE-SWITCH-TYPE_200****</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Process hash</li>
         * <li><strong>2</strong>: Command line</li>
         * <li><strong>3</strong>: Process Network</li>
         * <li><strong>4</strong>: File Read and Write</li>
         * <li><strong>5</strong>: Operation on Registry</li>
         * <li><strong>6</strong>: Dynamic-link Library Loading</li>
         * <li><strong>7</strong>: File Renaming</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
