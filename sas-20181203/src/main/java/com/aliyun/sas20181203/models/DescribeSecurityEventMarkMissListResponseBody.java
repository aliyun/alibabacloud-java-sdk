// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventMarkMissListResponseBody extends TeaModel {
    /**
     * <p>The ID of the rule.</p>
     */
    @NameInMap("List")
    public java.util.List<DescribeSecurityEventMarkMissListResponseBodyList> list;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeSecurityEventMarkMissListResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSecurityEventMarkMissListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventMarkMissListResponseBody self = new DescribeSecurityEventMarkMissListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventMarkMissListResponseBody setList(java.util.List<DescribeSecurityEventMarkMissListResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeSecurityEventMarkMissListResponseBodyList> getList() {
        return this.list;
    }

    public DescribeSecurityEventMarkMissListResponseBody setPageInfo(DescribeSecurityEventMarkMissListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeSecurityEventMarkMissListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeSecurityEventMarkMissListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSecurityEventMarkMissListResponseBodyList extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>176618589410****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The name of the alert event. The value indicates a subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>Login with unusual location</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The name of the alert event. The value indicates a type.</p>
         * 
         * <strong>example:</strong>
         * <p>login_common_location</p>
         */
        @NameInMap("EventNameOriginal")
        public String eventNameOriginal;

        /**
         * <p>The subtype of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>Unusual Logon</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The type of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>login_common_location</p>
         */
        @NameInMap("EventTypeOriginal")
        public String eventTypeOriginal;

        /**
         * <p>The field that is used in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The value of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        /**
         * <p>The alias of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>Logon Time</p>
         */
        @NameInMap("FiledAliasName")
        public String filedAliasName;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>104037</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1e8t4q15sr3****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-test-001</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>8.210.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.25.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The operator. Valid values:</p>
         * <ul>
         * <li><strong>contains</strong>: contains</li>
         * <li><strong>notContains</strong>: does not contain</li>
         * <li><strong>strEqual</strong>: equals</li>
         * <li><strong>strNotEqual</strong>: does not equal</li>
         * <li><strong>regex</strong>: regular expression</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>contains</p>
         */
        @NameInMap("Operate")
        public String operate;

        /**
         * <p>The UUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>49e25e0f-bb51-4a5a-a1b3-13a4ddaa****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeSecurityEventMarkMissListResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventMarkMissListResponseBodyList self = new DescribeSecurityEventMarkMissListResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setEventNameOriginal(String eventNameOriginal) {
            this.eventNameOriginal = eventNameOriginal;
            return this;
        }
        public String getEventNameOriginal() {
            return this.eventNameOriginal;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setEventTypeOriginal(String eventTypeOriginal) {
            this.eventTypeOriginal = eventTypeOriginal;
            return this;
        }
        public String getEventTypeOriginal() {
            return this.eventTypeOriginal;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setFiledAliasName(String filedAliasName) {
            this.filedAliasName = filedAliasName;
            return this;
        }
        public String getFiledAliasName() {
            return this.filedAliasName;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setOperate(String operate) {
            this.operate = operate;
            return this;
        }
        public String getOperate() {
            return this.operate;
        }

        public DescribeSecurityEventMarkMissListResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeSecurityEventMarkMissListResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
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
         * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
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
         * <p>200</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSecurityEventMarkMissListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventMarkMissListResponseBodyPageInfo self = new DescribeSecurityEventMarkMissListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventMarkMissListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeSecurityEventMarkMissListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeSecurityEventMarkMissListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeSecurityEventMarkMissListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
