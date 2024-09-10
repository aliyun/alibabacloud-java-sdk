// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDingTalkResponseBody extends TeaModel {
    /**
     * <p>An array that consists of details of notifications.</p>
     */
    @NameInMap("ActionList")
    public java.util.List<DescribeDingTalkResponseBodyActionList> actionList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeDingTalkResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B256A525-7E42-4BB9-A27C-9017FDDFF1A2</p>
     */
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
        /**
         * <p>The name of the notification.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert notification</p>
         */
        @NameInMap("ActionName")
        public String actionName;

        /**
         * <p>The UID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>12312412341</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The list of notification settings.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;type\&quot;:\&quot;vul\&quot;,\&quot;configItemList\&quot;:[{\&quot;key\&quot;:\&quot;key\&quot;, \&quot;valueList\&quot;:\&quot;123\&quot;}]}]</p>
         */
        @NameInMap("ConfigList")
        public String configList;

        /**
         * <p>The language of the content within notifications. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("DingTalkLang")
        public String dingTalkLang;

        /**
         * <p>The creation time. unit:millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>1550828400000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1550828400000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The group IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;123,456&quot;</p>
         */
        @NameInMap("GroupIdList")
        public String groupIdList;

        /**
         * <p>The ID of the notification.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The interval at which the notifications are sent.unit:minute.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("IntervalTime")
        public Integer intervalTime;

        /**
         * <p>The status of the notification. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The parameters of the notification.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send">https://oapi.dingtalk.com/robot/send</a></p>
         */
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
         * <p>The total number of messages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
