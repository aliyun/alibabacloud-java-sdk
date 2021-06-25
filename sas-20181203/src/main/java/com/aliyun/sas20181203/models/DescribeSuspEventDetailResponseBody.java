// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventDetailResponseBody extends TeaModel {
    @NameInMap("DataSource")
    public String dataSource;

    @NameInMap("EventName")
    public String eventName;

    @NameInMap("InternetIp")
    public String internetIp;

    @NameInMap("IntranetIp")
    public String intranetIp;

    @NameInMap("LastTime")
    public String lastTime;

    @NameInMap("OperateMsg")
    public String operateMsg;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("CanBeDealOnLine")
    public Boolean canBeDealOnLine;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EventTypeDesc")
    public String eventTypeDesc;

    @NameInMap("EventDesc")
    public String eventDesc;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("EventStatus")
    public String eventStatus;

    @NameInMap("SaleVersion")
    public String saleVersion;

    @NameInMap("OperateErrorCode")
    public String operateErrorCode;

    @NameInMap("SasId")
    public String sasId;

    @NameInMap("Level")
    public String level;

    @NameInMap("Id")
    public Integer id;

    @NameInMap("Details")
    public java.util.List<DescribeSuspEventDetailResponseBodyDetails> details;

    public static DescribeSuspEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventDetailResponseBody self = new DescribeSuspEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventDetailResponseBody setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public DescribeSuspEventDetailResponseBody setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
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

    public DescribeSuspEventDetailResponseBody setOperateMsg(String operateMsg) {
        this.operateMsg = operateMsg;
        return this;
    }
    public String getOperateMsg() {
        return this.operateMsg;
    }

    public DescribeSuspEventDetailResponseBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeSuspEventDetailResponseBody setCanBeDealOnLine(Boolean canBeDealOnLine) {
        this.canBeDealOnLine = canBeDealOnLine;
        return this;
    }
    public Boolean getCanBeDealOnLine() {
        return this.canBeDealOnLine;
    }

    public DescribeSuspEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventDetailResponseBody setEventTypeDesc(String eventTypeDesc) {
        this.eventTypeDesc = eventTypeDesc;
        return this;
    }
    public String getEventTypeDesc() {
        return this.eventTypeDesc;
    }

    public DescribeSuspEventDetailResponseBody setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
        return this;
    }
    public String getEventDesc() {
        return this.eventDesc;
    }

    public DescribeSuspEventDetailResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeSuspEventDetailResponseBody setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }
    public String getEventStatus() {
        return this.eventStatus;
    }

    public DescribeSuspEventDetailResponseBody setSaleVersion(String saleVersion) {
        this.saleVersion = saleVersion;
        return this;
    }
    public String getSaleVersion() {
        return this.saleVersion;
    }

    public DescribeSuspEventDetailResponseBody setOperateErrorCode(String operateErrorCode) {
        this.operateErrorCode = operateErrorCode;
        return this;
    }
    public String getOperateErrorCode() {
        return this.operateErrorCode;
    }

    public DescribeSuspEventDetailResponseBody setSasId(String sasId) {
        this.sasId = sasId;
        return this;
    }
    public String getSasId() {
        return this.sasId;
    }

    public DescribeSuspEventDetailResponseBody setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeSuspEventDetailResponseBody setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public DescribeSuspEventDetailResponseBody setDetails(java.util.List<DescribeSuspEventDetailResponseBodyDetails> details) {
        this.details = details;
        return this;
    }
    public java.util.List<DescribeSuspEventDetailResponseBodyDetails> getDetails() {
        return this.details;
    }

    public static class DescribeSuspEventDetailResponseBodyDetails extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("InfoType")
        public String infoType;

        @NameInMap("NameDisplay")
        public String nameDisplay;

        @NameInMap("Name")
        public String name;

        public static DescribeSuspEventDetailResponseBodyDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventDetailResponseBodyDetails self = new DescribeSuspEventDetailResponseBodyDetails();
            return TeaModel.build(map, self);
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

        public DescribeSuspEventDetailResponseBodyDetails setInfoType(String infoType) {
            this.infoType = infoType;
            return this;
        }
        public String getInfoType() {
            return this.infoType;
        }

        public DescribeSuspEventDetailResponseBodyDetails setNameDisplay(String nameDisplay) {
            this.nameDisplay = nameDisplay;
            return this;
        }
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        public DescribeSuspEventDetailResponseBodyDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
