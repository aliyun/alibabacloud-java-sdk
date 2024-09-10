// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListBaselineCheckWhiteRecordResponseBody extends TeaModel {
    /**
     * <p>The whitelist rules.</p>
     */
    @NameInMap("List")
    public java.util.List<ListBaselineCheckWhiteRecordResponseBodyList> list;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListBaselineCheckWhiteRecordResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9F4E6157-9600-5588-86B9-38F09067****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBaselineCheckWhiteRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineCheckWhiteRecordResponseBody self = new ListBaselineCheckWhiteRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBaselineCheckWhiteRecordResponseBody setList(java.util.List<ListBaselineCheckWhiteRecordResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListBaselineCheckWhiteRecordResponseBodyList> getList() {
        return this.list;
    }

    public ListBaselineCheckWhiteRecordResponseBody setPageInfo(ListBaselineCheckWhiteRecordResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListBaselineCheckWhiteRecordResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListBaselineCheckWhiteRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBaselineCheckWhiteRecordResponseBodyList extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>696</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The description of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Config the Event Audit policys</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <p>The type of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Security audit</p>
         */
        @NameInMap("CheckType")
        public String checkType;

        /**
         * <p>The display name of the check item type.</p>
         * 
         * <strong>example:</strong>
         * <p>Security audit</p>
         */
        @NameInMap("CheckTypeDisName")
        public String checkTypeDisName;

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The reason why the check item is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>AutoTest</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The ID of the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>79412</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <p>The data source. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: server</li>
         * <li><strong>agentless</strong>: agentless detection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agentless</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The object that is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>HOST_BASELINE_WHITE_LIST_21</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The type of the assets on which the whitelist rule takes effect. Valid values:</p>
         * <ul>
         * <li><strong>all_instance</strong>: all servers</li>
         * <li><strong>instance</strong>: specific servers</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static ListBaselineCheckWhiteRecordResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListBaselineCheckWhiteRecordResponseBodyList self = new ListBaselineCheckWhiteRecordResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListBaselineCheckWhiteRecordResponseBodyList setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ListBaselineCheckWhiteRecordResponseBodyList setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public ListBaselineCheckWhiteRecordResponseBodyList setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public ListBaselineCheckWhiteRecordResponseBodyList setCheckTypeDisName(String checkTypeDisName) {
            this.checkTypeDisName = checkTypeDisName;
            return this;
        }
        public String getCheckTypeDisName() {
            return this.checkTypeDisName;
        }

        public ListBaselineCheckWhiteRecordResponseBodyList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public ListBaselineCheckWhiteRecordResponseBodyList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListBaselineCheckWhiteRecordResponseBodyList setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public ListBaselineCheckWhiteRecordResponseBodyList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListBaselineCheckWhiteRecordResponseBodyList setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public ListBaselineCheckWhiteRecordResponseBodyList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class ListBaselineCheckWhiteRecordResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
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
         * <p>45</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListBaselineCheckWhiteRecordResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListBaselineCheckWhiteRecordResponseBodyPageInfo self = new ListBaselineCheckWhiteRecordResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListBaselineCheckWhiteRecordResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListBaselineCheckWhiteRecordResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListBaselineCheckWhiteRecordResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBaselineCheckWhiteRecordResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
