// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventDetailResponseBody extends TeaModel {
    // Indicates whether the online processing of exceptions is supported, such as blocking an exception, adding an exception to the whitelist, and ignoring an exception. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("CanBeDealOnLine")
    public Boolean canBeDealOnLine;

    // The data source of the exception.
    @NameInMap("DataSource")
    public String dataSource;

    // The details about the exception.
    @NameInMap("Details")
    public java.util.List<DescribeSuspEventDetailResponseBodyDetails> details;

    // The description of the exception.
    @NameInMap("EventDesc")
    public String eventDesc;

    // The name of the exception.
    @NameInMap("EventName")
    public String eventName;

    // The status of the exception. Valid values:
    // 
    // *   **1**: pending handling
    // *   **2**: ignored
    // *   **4**: confirmed
    // *   **8**: marked as a false positive
    // *   **16**: handling
    // *   **32**: handled
    // *   **64**: expired
    @NameInMap("EventStatus")
    public String eventStatus;

    // The type of the exception.
    @NameInMap("EventTypeDesc")
    public String eventTypeDesc;

    // The ID of the exception.
    @NameInMap("Id")
    public Integer id;

    // The name of the server on which the exception was detected.
    @NameInMap("InstanceName")
    public String instanceName;

    // The public IP address of the server on which the exception was detected.
    @NameInMap("InternetIp")
    public String internetIp;

    // The private IP address of the server on which the exception was detected.
    @NameInMap("IntranetIp")
    public String intranetIp;

    // The time when the exception was last detected.
    @NameInMap("LastTime")
    public String lastTime;

    // The severity of the exception. Valid values:
    // 
    // *   **serious**
    // *   **suspicious**
    // *   **remind**
    @NameInMap("Level")
    public String level;

    // The code that indicates the handling result of the exception.
    @NameInMap("OperateErrorCode")
    public String operateErrorCode;

    // The message that indicates the handling result of the exception.
    @NameInMap("OperateMsg")
    public String operateMsg;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The edition of Security Center in which the exception can be detected. Valid values:
    // 
    // *   **0**: Basic edition
    // *   **1**: Advanced edition
    // *   **2**: Enterprise edition
    @NameInMap("SaleVersion")
    public String saleVersion;

    // The UUID of the server on which the exception was detected.
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeSuspEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventDetailResponseBody self = new DescribeSuspEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventDetailResponseBody setCanBeDealOnLine(Boolean canBeDealOnLine) {
        this.canBeDealOnLine = canBeDealOnLine;
        return this;
    }
    public Boolean getCanBeDealOnLine() {
        return this.canBeDealOnLine;
    }

    public DescribeSuspEventDetailResponseBody setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public DescribeSuspEventDetailResponseBody setDetails(java.util.List<DescribeSuspEventDetailResponseBodyDetails> details) {
        this.details = details;
        return this;
    }
    public java.util.List<DescribeSuspEventDetailResponseBodyDetails> getDetails() {
        return this.details;
    }

    public DescribeSuspEventDetailResponseBody setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
        return this;
    }
    public String getEventDesc() {
        return this.eventDesc;
    }

    public DescribeSuspEventDetailResponseBody setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeSuspEventDetailResponseBody setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }
    public String getEventStatus() {
        return this.eventStatus;
    }

    public DescribeSuspEventDetailResponseBody setEventTypeDesc(String eventTypeDesc) {
        this.eventTypeDesc = eventTypeDesc;
        return this;
    }
    public String getEventTypeDesc() {
        return this.eventTypeDesc;
    }

    public DescribeSuspEventDetailResponseBody setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public DescribeSuspEventDetailResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeSuspEventDetailResponseBody setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public DescribeSuspEventDetailResponseBody setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public DescribeSuspEventDetailResponseBody setLastTime(String lastTime) {
        this.lastTime = lastTime;
        return this;
    }
    public String getLastTime() {
        return this.lastTime;
    }

    public DescribeSuspEventDetailResponseBody setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeSuspEventDetailResponseBody setOperateErrorCode(String operateErrorCode) {
        this.operateErrorCode = operateErrorCode;
        return this;
    }
    public String getOperateErrorCode() {
        return this.operateErrorCode;
    }

    public DescribeSuspEventDetailResponseBody setOperateMsg(String operateMsg) {
        this.operateMsg = operateMsg;
        return this;
    }
    public String getOperateMsg() {
        return this.operateMsg;
    }

    public DescribeSuspEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventDetailResponseBody setSaleVersion(String saleVersion) {
        this.saleVersion = saleVersion;
        return this;
    }
    public String getSaleVersion() {
        return this.saleVersion;
    }

    public DescribeSuspEventDetailResponseBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class DescribeSuspEventDetailResponseBodyDetails extends TeaModel {
        // The display name of the alert event.
        @NameInMap("NameDisplay")
        public String nameDisplay;

        // The format in which the details about the exception are displayed.
        // 
        // Valid values:
        // 
        // *   **text**
        // *   **html**
        @NameInMap("Type")
        public String type;

        // The attribute information about the exception. For example, if the exception is associated with an alert that is triggered by an unusual logon, the information can include the time when the logon is initiated and the location from which the logon is initiated. If the exception is associated with an alert that is triggered by a webshell file, the information can include the path of the trojan file and the type of the trojan.
        @NameInMap("Value")
        public String value;

        public static DescribeSuspEventDetailResponseBodyDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventDetailResponseBodyDetails self = new DescribeSuspEventDetailResponseBodyDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventDetailResponseBodyDetails setNameDisplay(String nameDisplay) {
            this.nameDisplay = nameDisplay;
            return this;
        }
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        public DescribeSuspEventDetailResponseBodyDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSuspEventDetailResponseBodyDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
