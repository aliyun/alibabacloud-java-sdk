// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotEventsResponseBody extends TeaModel {
    /**
     * <p>The intrusion events.</p>
     */
    @NameInMap("HoneypotEvents")
    public java.util.List<ListHoneypotEventsResponseBodyHoneypotEvents> honeypotEvents;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListHoneypotEventsResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FBD28009-6096-5E90-BFE6-62CCD67*****</p>
     */
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
        /**
         * <p>The supplementary information about the field.</p>
         * 
         * <strong>example:</strong>
         * <p>data</p>
         */
        @NameInMap("FieldExtInfo")
        public String fieldExtInfo;

        /**
         * <p>The key of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("FieldKey")
        public String fieldKey;

        /**
         * <p>The type of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>level2_item1</p>
         */
        @NameInMap("FieldType")
        public String fieldType;

        /**
         * <p>The value of the field key.</p>
         * 
         * <strong>example:</strong>
         * <p>web_access</p>
         */
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
        /**
         * <p>The probe ID.</p>
         * 
         * <strong>example:</strong>
         * <p>27d44bd5815d401992ea672874d9****</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The name of the probe.</p>
         * 
         * <strong>example:</strong>
         * <p>1193474_test_****</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The ID of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>1900752</p>
         */
        @NameInMap("AlarmEventId")
        public Long alarmEventId;

        /**
         * <p>The destination IP address of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>112.126.205.***</p>
         */
        @NameInMap("DstIp")
        public String dstIp;

        /**
         * <p>The timestamp at which the event was first detected.</p>
         * 
         * <strong>example:</strong>
         * <p>1692670297</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <p>The name of the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>honeypot-2</p>
         */
        @NameInMap("HoneypotName")
        public String honeypotName;

        /**
         * <p>The timestamp at which the event was last detected.</p>
         * 
         * <strong>example:</strong>
         * <p>1676558664</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>China Beijing</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The extended values that correspond to the field key.</p>
         */
        @NameInMap("MergeFieldList")
        public java.util.List<ListHoneypotEventsResponseBodyHoneypotEventsMergeFieldList> mergeFieldList;

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong></li>
         * <li><strong>udp</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: low</li>
         * <li><strong>3</strong>: medium</li>
         * <li><strong>4</strong>: high</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The ID of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>70427821</p>
         */
        @NameInMap("SecurityEventId")
        public Long securityEventId;

        /**
         * <p>The source IP address of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.62.***</p>
         */
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
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
         * <p>The key of the last data entry.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESGgoSChAKDGNvbXBsZXRlVGltZRABCgQiAggAGAAiQAoJAGYXFWIAAAAACjMDLgAAADFTNzMyZDMwMzAzMDM1Mzc3Njc4MzA2ODY5NmI2YTY*********</p>
         */
        @NameInMap("LastRowKey")
        public String lastRowKey;

        /**
         * <p>The value of the NextToken parameter that is returned by using the NextToken method.</p>
         * 
         * <strong>example:</strong>
         * <p>B604532DEF982B875E8360A6EFA3B***</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

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
         * <p>30</p>
         */
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
