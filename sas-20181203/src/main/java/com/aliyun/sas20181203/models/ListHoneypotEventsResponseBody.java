// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotEventsResponseBody extends TeaModel {
    @NameInMap("HoneypotEvents")
    public java.util.List<ListHoneypotEventsResponseBodyHoneypotEvents> honeypotEvents;

    @NameInMap("PageInfo")
    public ListHoneypotEventsResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListHoneypotEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotEventsResponseBody self = new ListHoneypotEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHoneypotEventsResponseBody setHoneypotEvents(java.util.List<ListHoneypotEventsResponseBodyHoneypotEvents> honeypotEvents) {
        this.honeypotEvents = honeypotEvents;
        return this;
    }
    public java.util.List<ListHoneypotEventsResponseBodyHoneypotEvents> getHoneypotEvents() {
        return this.honeypotEvents;
    }

    public ListHoneypotEventsResponseBody setPageInfo(ListHoneypotEventsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListHoneypotEventsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListHoneypotEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHoneypotEventsResponseBodyHoneypotEventsMergeFieldList extends TeaModel {
        @NameInMap("FieldExtInfo")
        public String fieldExtInfo;

        @NameInMap("FieldKey")
        public String fieldKey;

        @NameInMap("FieldType")
        public String fieldType;

        @NameInMap("FieldValue")
        public String fieldValue;

        public static ListHoneypotEventsResponseBodyHoneypotEventsMergeFieldList build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotEventsResponseBodyHoneypotEventsMergeFieldList self = new ListHoneypotEventsResponseBodyHoneypotEventsMergeFieldList();
            return TeaModel.build(map, self);
        }

        public ListHoneypotEventsResponseBodyHoneypotEventsMergeFieldList setFieldExtInfo(String fieldExtInfo) {
            this.fieldExtInfo = fieldExtInfo;
            return this;
        }
        public String getFieldExtInfo() {
            return this.fieldExtInfo;
        }

        public ListHoneypotEventsResponseBodyHoneypotEventsMergeFieldList setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public ListHoneypotEventsResponseBodyHoneypotEventsMergeFieldList setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public ListHoneypotEventsResponseBodyHoneypotEventsMergeFieldList setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

    public static class ListHoneypotEventsResponseBodyHoneypotEvents extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("AlarmEventId")
        public Long alarmEventId;

        @NameInMap("DstIp")
        public String dstIp;

        @NameInMap("FirstTime")
        public Long firstTime;

        @NameInMap("HoneypotName")
        public String honeypotName;

        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("Location")
        public String location;

        @NameInMap("MergeFieldList")
        public java.util.List<ListHoneypotEventsResponseBodyHoneypotEventsMergeFieldList> mergeFieldList;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("SecurityEventId")
        public Long securityEventId;

        @NameInMap("SrcIp")
        public String srcIp;

        public static ListHoneypotEventsResponseBodyHoneypotEvents build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotEventsResponseBodyHoneypotEvents self = new ListHoneypotEventsResponseBodyHoneypotEvents();
            return TeaModel.build(map, self);
        }

        public ListHoneypotEventsResponseBodyHoneypotEvents setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListHoneypotEventsResponseBodyHoneypotEvents setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListHoneypotEventsResponseBodyHoneypotEvents setAlarmEventId(Long alarmEventId) {
            this.alarmEventId = alarmEventId;
            return this;
        }
        public Long getAlarmEventId() {
            return this.alarmEventId;
        }

        public ListHoneypotEventsResponseBodyHoneypotEvents setDstIp(String dstIp) {
            this.dstIp = dstIp;
            return this;
        }
        public String getDstIp() {
            return this.dstIp;
        }

        public ListHoneypotEventsResponseBodyHoneypotEvents setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public ListHoneypotEventsResponseBodyHoneypotEvents setHoneypotName(String honeypotName) {
            this.honeypotName = honeypotName;
            return this;
        }
        public String getHoneypotName() {
            return this.honeypotName;
        }

        public ListHoneypotEventsResponseBodyHoneypotEvents setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public ListHoneypotEventsResponseBodyHoneypotEvents setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListHoneypotEventsResponseBodyHoneypotEvents setMergeFieldList(java.util.List<ListHoneypotEventsResponseBodyHoneypotEventsMergeFieldList> mergeFieldList) {
            this.mergeFieldList = mergeFieldList;
            return this;
        }
        public java.util.List<ListHoneypotEventsResponseBodyHoneypotEventsMergeFieldList> getMergeFieldList() {
            return this.mergeFieldList;
        }

        public ListHoneypotEventsResponseBodyHoneypotEvents setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListHoneypotEventsResponseBodyHoneypotEvents setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListHoneypotEventsResponseBodyHoneypotEvents setSecurityEventId(Long securityEventId) {
            this.securityEventId = securityEventId;
            return this;
        }
        public Long getSecurityEventId() {
            return this.securityEventId;
        }

        public ListHoneypotEventsResponseBodyHoneypotEvents setSrcIp(String srcIp) {
            this.srcIp = srcIp;
            return this;
        }
        public String getSrcIp() {
            return this.srcIp;
        }

    }

    public static class ListHoneypotEventsResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("LastRowKey")
        public String lastRowKey;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHoneypotEventsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotEventsResponseBodyPageInfo self = new ListHoneypotEventsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListHoneypotEventsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListHoneypotEventsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListHoneypotEventsResponseBodyPageInfo setLastRowKey(String lastRowKey) {
            this.lastRowKey = lastRowKey;
            return this;
        }
        public String getLastRowKey() {
            return this.lastRowKey;
        }

        public ListHoneypotEventsResponseBodyPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListHoneypotEventsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHoneypotEventsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
