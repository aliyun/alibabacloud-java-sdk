// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DiscribeSmartAccessGatewayDiagnosisReportResponseBody extends TeaModel {
    @NameInMap("DiagnoseResult")
    public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult diagnoseResult;

    @NameInMap("RequestId")
    public String requestId;

    public static DiscribeSmartAccessGatewayDiagnosisReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiscribeSmartAccessGatewayDiagnosisReportResponseBody self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DiscribeSmartAccessGatewayDiagnosisReportResponseBody setDiagnoseResult(DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult diagnoseResult) {
        this.diagnoseResult = diagnoseResult;
        return this;
    }
    public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult getDiagnoseResult() {
        return this.diagnoseResult;
    }

    public DiscribeSmartAccessGatewayDiagnosisReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN extends TeaModel {
        @NameInMap("Advice")
        public java.util.List<String> advice;

        @NameInMap("Details")
        public java.util.List<String> details;

        @NameInMap("ItemLevel")
        public String itemLevel;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ItemType")
        public String itemType;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN();
            return TeaModel.build(map, self);
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN setAdvice(java.util.List<String> advice) {
            this.advice = advice;
            return this;
        }
        public java.util.List<String> getAdvice() {
            return this.advice;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN setDetails(java.util.List<String> details) {
            this.details = details;
            return this;
        }
        public java.util.List<String> getDetails() {
            return this.details;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN setItemLevel(String itemLevel) {
            this.itemLevel = itemLevel;
            return this;
        }
        public String getItemLevel() {
            return this.itemLevel;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN extends TeaModel {
        @NameInMap("Advice")
        public java.util.List<String> advice;

        @NameInMap("Details")
        public java.util.List<String> details;

        @NameInMap("ItemLevel")
        public String itemLevel;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ItemType")
        public String itemType;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN();
            return TeaModel.build(map, self);
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN setAdvice(java.util.List<String> advice) {
            this.advice = advice;
            return this;
        }
        public java.util.List<String> getAdvice() {
            return this.advice;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN setDetails(java.util.List<String> details) {
            this.details = details;
            return this;
        }
        public java.util.List<String> getDetails() {
            return this.details;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN setItemLevel(String itemLevel) {
            this.itemLevel = itemLevel;
            return this;
        }
        public String getItemLevel() {
            return this.itemLevel;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems extends TeaModel {
        @NameInMap("CN")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN CN;

        @NameInMap("EN")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN EN;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("Level")
        public String level;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Type")
        public String type;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems();
            return TeaModel.build(map, self);
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setCN(DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN CN) {
            this.CN = CN;
            return this;
        }
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN getCN() {
            return this.CN;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setEN(DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN EN) {
            this.EN = EN;
            return this;
        }
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN getEN() {
            return this.EN;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics extends TeaModel {
        @NameInMap("Error")
        public Integer error;

        @NameInMap("Info")
        public Integer info;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Warning")
        public Integer warning;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics();
            return TeaModel.build(map, self);
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics setError(Integer error) {
            this.error = error;
            return this;
        }
        public Integer getError() {
            return this.error;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics setInfo(Integer info) {
            this.info = info;
            return this;
        }
        public Integer getInfo() {
            return this.info;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics setWarning(Integer warning) {
            this.warning = warning;
            return this;
        }
        public Integer getWarning() {
            return this.warning;
        }

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails extends TeaModel {
        @NameInMap("Items")
        public java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems> items;

        @NameInMap("Statistics")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics statistics;

        @NameInMap("Type")
        public String type;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails();
            return TeaModel.build(map, self);
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails setItems(java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems> getItems() {
            return this.items;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails setStatistics(DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics statistics) {
            this.statistics = statistics;
            return this;
        }
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics getStatistics() {
            return this.statistics;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel extends TeaModel {
        @NameInMap("Biz")
        public String biz;

        @NameInMap("Configuration")
        public String configuration;

        @NameInMap("Total")
        public String total;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel();
            return TeaModel.build(map, self);
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel setBiz(String biz) {
            this.biz = biz;
            return this;
        }
        public String getBiz() {
            return this.biz;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics extends TeaModel {
        @NameInMap("Error")
        public Integer error;

        @NameInMap("Info")
        public Integer info;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Warning")
        public Integer warning;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics();
            return TeaModel.build(map, self);
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics setError(Integer error) {
            this.error = error;
            return this;
        }
        public Integer getError() {
            return this.error;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics setInfo(Integer info) {
            this.info = info;
            return this;
        }
        public Integer getInfo() {
            return this.info;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics setWarning(Integer warning) {
            this.warning = warning;
            return this;
        }
        public Integer getWarning() {
            return this.warning;
        }

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult extends TeaModel {
        @NameInMap("BoxType")
        public String boxType;

        @NameInMap("BoxVersion")
        public String boxVersion;

        @NameInMap("Details")
        public java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails> details;

        @NameInMap("DiagnoseId")
        public String diagnoseId;

        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("FinishedNumber")
        public Integer finishedNumber;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Level")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel level;

        @NameInMap("MonitorVersion")
        public String monitorVersion;

        @NameInMap("Percent")
        public Integer percent;

        @NameInMap("ReportSLSSuccess")
        public Integer reportSLSSuccess;

        @NameInMap("SN")
        public String SN;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("Statistics")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics statistics;

        @NameInMap("StoreType")
        public String storeType;

        @NameInMap("TotalNumber")
        public Integer totalNumber;

        @NameInMap("UId")
        public String UId;

        @NameInMap("UserLevel")
        public String userLevel;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult();
            return TeaModel.build(map, self);
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setBoxType(String boxType) {
            this.boxType = boxType;
            return this;
        }
        public String getBoxType() {
            return this.boxType;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setBoxVersion(String boxVersion) {
            this.boxVersion = boxVersion;
            return this;
        }
        public String getBoxVersion() {
            return this.boxVersion;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setDetails(java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails> getDetails() {
            return this.details;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setDiagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setFinishedNumber(Integer finishedNumber) {
            this.finishedNumber = finishedNumber;
            return this;
        }
        public Integer getFinishedNumber() {
            return this.finishedNumber;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setLevel(DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel level) {
            this.level = level;
            return this;
        }
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel getLevel() {
            return this.level;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setMonitorVersion(String monitorVersion) {
            this.monitorVersion = monitorVersion;
            return this;
        }
        public String getMonitorVersion() {
            return this.monitorVersion;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setReportSLSSuccess(Integer reportSLSSuccess) {
            this.reportSLSSuccess = reportSLSSuccess;
            return this;
        }
        public Integer getReportSLSSuccess() {
            return this.reportSLSSuccess;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setSN(String SN) {
            this.SN = SN;
            return this;
        }
        public String getSN() {
            return this.SN;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setStatistics(DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics statistics) {
            this.statistics = statistics;
            return this;
        }
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics getStatistics() {
            return this.statistics;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setStoreType(String storeType) {
            this.storeType = storeType;
            return this;
        }
        public String getStoreType() {
            return this.storeType;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setUId(String UId) {
            this.UId = UId;
            return this;
        }
        public String getUId() {
            return this.UId;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setUserLevel(String userLevel) {
            this.userLevel = userLevel;
            return this;
        }
        public String getUserLevel() {
            return this.userLevel;
        }

    }

}
