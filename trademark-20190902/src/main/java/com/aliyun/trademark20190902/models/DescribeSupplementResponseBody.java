// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeSupplementResponseBody extends TeaModel {
    @NameInMap("AcceptExpirationDate")
    public Long acceptExpirationDate;

    @NameInMap("AcceptTime")
    public Long acceptTime;

    @NameInMap("ApplicationType")
    public Integer applicationType;

    @NameInMap("Content")
    public String content;

    @NameInMap("OfficialFile")
    public String officialFile;

    @NameInMap("OperateTime")
    public Long operateTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SbjExpirationDate")
    public Long sbjExpirationDate;

    @NameInMap("SendTime")
    public Long sendTime;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("SupplementId")
    public Long supplementId;

    @NameInMap("SupplementStatus")
    public Integer supplementStatus;

    @NameInMap("TrademarkNumber")
    public String trademarkNumber;

    @NameInMap("UserFiles")
    public DescribeSupplementResponseBodyUserFiles userFiles;

    public static DescribeSupplementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupplementResponseBody self = new DescribeSupplementResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupplementResponseBody setAcceptExpirationDate(Long acceptExpirationDate) {
        this.acceptExpirationDate = acceptExpirationDate;
        return this;
    }
    public Long getAcceptExpirationDate() {
        return this.acceptExpirationDate;
    }

    public DescribeSupplementResponseBody setAcceptTime(Long acceptTime) {
        this.acceptTime = acceptTime;
        return this;
    }
    public Long getAcceptTime() {
        return this.acceptTime;
    }

    public DescribeSupplementResponseBody setApplicationType(Integer applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public Integer getApplicationType() {
        return this.applicationType;
    }

    public DescribeSupplementResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeSupplementResponseBody setOfficialFile(String officialFile) {
        this.officialFile = officialFile;
        return this;
    }
    public String getOfficialFile() {
        return this.officialFile;
    }

    public DescribeSupplementResponseBody setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public DescribeSupplementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSupplementResponseBody setSbjExpirationDate(Long sbjExpirationDate) {
        this.sbjExpirationDate = sbjExpirationDate;
        return this;
    }
    public Long getSbjExpirationDate() {
        return this.sbjExpirationDate;
    }

    public DescribeSupplementResponseBody setSendTime(Long sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public Long getSendTime() {
        return this.sendTime;
    }

    public DescribeSupplementResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DescribeSupplementResponseBody setSupplementId(Long supplementId) {
        this.supplementId = supplementId;
        return this;
    }
    public Long getSupplementId() {
        return this.supplementId;
    }

    public DescribeSupplementResponseBody setSupplementStatus(Integer supplementStatus) {
        this.supplementStatus = supplementStatus;
        return this;
    }
    public Integer getSupplementStatus() {
        return this.supplementStatus;
    }

    public DescribeSupplementResponseBody setTrademarkNumber(String trademarkNumber) {
        this.trademarkNumber = trademarkNumber;
        return this;
    }
    public String getTrademarkNumber() {
        return this.trademarkNumber;
    }

    public DescribeSupplementResponseBody setUserFiles(DescribeSupplementResponseBodyUserFiles userFiles) {
        this.userFiles = userFiles;
        return this;
    }
    public DescribeSupplementResponseBodyUserFiles getUserFiles() {
        return this.userFiles;
    }

    public static class DescribeSupplementResponseBodyUserFiles extends TeaModel {
        @NameInMap("UserFile")
        public java.util.List<String> userFile;

        public static DescribeSupplementResponseBodyUserFiles build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupplementResponseBodyUserFiles self = new DescribeSupplementResponseBodyUserFiles();
            return TeaModel.build(map, self);
        }

        public DescribeSupplementResponseBodyUserFiles setUserFile(java.util.List<String> userFile) {
            this.userFile = userFile;
            return this;
        }
        public java.util.List<String> getUserFile() {
            return this.userFile;
        }

    }

}
