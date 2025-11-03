// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventDetailResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the alarm event.</p>
     * <blockquote>
     * <p>If querying the anomaly information of a single alarm event, you need to provide the unique ID of the alarm event, which can be obtained by calling the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> interface.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8df914418f4211fb****</p>
     */
    @NameInMap("AlarmUniqueInfo")
    public String alarmUniqueInfo;

    /**
     * <p>Indicates whether the online processing of exceptions is supported, such as blocking an exception, adding an exception to the whitelist, and ignoring an exception. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The online processing of exceptions is supported.</li>
     * <li><strong>false</strong>: The online processing of exceptions is not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CanBeDealOnLine")
    public Boolean canBeDealOnLine;

    /**
     * <p>The data source of the exception.</p>
     * 
     * <strong>example:</strong>
     * <p>aegis_suspicious_****</p>
     */
    @NameInMap("DataSource")
    public String dataSource;

    /**
     * <p>An array that consists of the details of the exception.</p>
     */
    @NameInMap("Details")
    public java.util.List<DescribeSuspEventDetailResponseBodyDetails> details;

    /**
     * <p>The description of the exception.</p>
     * 
     * <strong>example:</strong>
     * <p>The detection model found a suspicious Webshell file on your server, which may be a backdoor file implanted to maintain permissions after the attacker successfully invaded the website.</p>
     */
    @NameInMap("EventDesc")
    public String eventDesc;

    /**
     * <p>The name of the exception.</p>
     * 
     * <strong>example:</strong>
     * <p>WEBSHELL</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The status of the exception. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: pending handling</li>
     * <li><strong>2</strong>: ignored</li>
     * <li><strong>4</strong>: confirmed</li>
     * <li><strong>8</strong>: marked as a false positive</li>
     * <li><strong>16</strong>: handling</li>
     * <li><strong>32</strong>: handled</li>
     * <li><strong>64</strong>: expired</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EventStatus")
    public String eventStatus;

    /**
     * <p>The type of the exception.</p>
     * 
     * <strong>example:</strong>
     * <p>Malicious Software-Variable Trojan</p>
     */
    @NameInMap("EventTypeDesc")
    public String eventTypeDesc;

    /**
     * <p>The ID of the exception.</p>
     * 
     * <strong>example:</strong>
     * <p>11416624</p>
     */
    @NameInMap("Id")
    public Integer id;

    /**
     * <p>The name of the server on which the exception was detected.</p>
     * 
     * <strong>example:</strong>
     * <p>ca_cpm_****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The public IP address of the server on which the exception was detected.</p>
     * 
     * <strong>example:</strong>
     * <p>101.132.XX.XX</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The private IP address of the server on which the exception was detected.</p>
     * 
     * <strong>example:</strong>
     * <p>172.26.XX.XX</p>
     */
    @NameInMap("IntranetIp")
    public String intranetIp;

    /**
     * <p>The time when the exception was last detected.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-10-30 11:43:46</p>
     */
    @NameInMap("LastTime")
    public String lastTime;

    /**
     * <p>The risk level of the exception. Valid values:</p>
     * <ul>
     * <li><strong>serious</strong></li>
     * <li><strong>suspicious</strong></li>
     * <li><strong>remind</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>serious</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The code that indicates the handling result of the exception.</p>
     * 
     * <strong>example:</strong>
     * <p>quara.Succes</p>
     */
    @NameInMap("OperateErrorCode")
    public String operateErrorCode;

    /**
     * <p>The message that indicates the handling result of the exception.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("OperateMsg")
    public String operateMsg;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The edition of Security Center in which the exception can be detected. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Basic edition</li>
     * <li><strong>1</strong>: Advanced edition</li>
     * <li><strong>2</strong>: Enterprise edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SaleVersion")
    public String saleVersion;

    /**
     * <p>The UUID of the server on which the exception was detected.</p>
     * 
     * <strong>example:</strong>
     * <p>bffb12c3-590a-4db2-b538-****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeSuspEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventDetailResponseBody self = new DescribeSuspEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventDetailResponseBody setAlarmUniqueInfo(String alarmUniqueInfo) {
        this.alarmUniqueInfo = alarmUniqueInfo;
        return this;
    }
    public String getAlarmUniqueInfo() {
        return this.alarmUniqueInfo;
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
        /**
         * <p>The display name of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>Trojan Path</p>
         */
        @NameInMap("NameDisplay")
        public String nameDisplay;

        /**
         * <p>The format in which the details of the exception are displayed.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>text</strong></li>
         * <li><strong>html</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>html</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The attribute information about the exception. For example, if the exception is associated with an alert that is triggered by an unusual logon, the information can include the time when the logon is initiated and the location from which the logon is initiated. If the exception is associated with an alert that is triggered by a webshell file, the information can include the path of the trojan file and the type of the trojan.</p>
         * 
         * <strong>example:</strong>
         * <p>getopt</p>
         */
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
