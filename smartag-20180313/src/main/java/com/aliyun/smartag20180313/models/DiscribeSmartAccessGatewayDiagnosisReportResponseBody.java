// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DiscribeSmartAccessGatewayDiagnosisReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DiagnoseResult")
    public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult diagnoseResult;

    public static DiscribeSmartAccessGatewayDiagnosisReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiscribeSmartAccessGatewayDiagnosisReportResponseBody self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DiscribeSmartAccessGatewayDiagnosisReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DiscribeSmartAccessGatewayDiagnosisReportResponseBody setDiagnoseResult(DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult diagnoseResult) {
        this.diagnoseResult = diagnoseResult;
        return this;
    }
    public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult getDiagnoseResult() {
        return this.diagnoseResult;
    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN extends TeaModel {
        @NameInMap("Advice")
        public java.util.List<String> advice;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ItemLevel")
        public String itemLevel;

        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("Details")
        public java.util.List<String> details;

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

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN setItemLevel(String itemLevel) {
            this.itemLevel = itemLevel;
            return this;
        }
        public String getItemLevel() {
            return this.itemLevel;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN setDetails(java.util.List<String> details) {
            this.details = details;
            return this;
        }
        public java.util.List<String> getDetails() {
            return this.details;
        }

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN extends TeaModel {
        @NameInMap("Advice")
        public java.util.List<String> advice;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ItemLevel")
        public String itemLevel;

        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("Details")
        public java.util.List<String> details;

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

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN setItemLevel(String itemLevel) {
            this.itemLevel = itemLevel;
            return this;
        }
        public String getItemLevel() {
            return this.itemLevel;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN setDetails(java.util.List<String> details) {
            this.details = details;
            return this;
        }
        public java.util.List<String> getDetails() {
            return this.details;
        }

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("CN")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN CN;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("EN")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN EN;

        @NameInMap("Level")
        public String level;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems();
            return TeaModel.build(map, self);
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setCN(DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN CN) {
            this.CN = CN;
            return this;
        }
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN getCN() {
            return this.CN;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setEN(DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN EN) {
            this.EN = EN;
            return this;
        }
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN getEN() {
            return this.EN;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics extends TeaModel {
        @NameInMap("Warning")
        public Integer warning;

        @NameInMap("Error")
        public Integer error;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Info")
        public Integer info;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics();
            return TeaModel.build(map, self);
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics setWarning(Integer warning) {
            this.warning = warning;
            return this;
        }
        public Integer getWarning() {
            return this.warning;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics setError(Integer error) {
            this.error = error;
            return this;
        }
        public Integer getError() {
            return this.error;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics setInfo(Integer info) {
            this.info = info;
            return this;
        }
        public Integer getInfo() {
            return this.info;
        }

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Items")
        public java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems> items;

        @NameInMap("Statistics")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics statistics;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails();
            return TeaModel.build(map, self);
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel extends TeaModel {
        @NameInMap("Configuration")
        public String configuration;

        @NameInMap("Total")
        public String total;

        @NameInMap("Biz")
        public String biz;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel();
            return TeaModel.build(map, self);
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

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel setBiz(String biz) {
            this.biz = biz;
            return this;
        }
        public String getBiz() {
            return this.biz;
        }

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics extends TeaModel {
        @NameInMap("Warning")
        public Integer warning;

        @NameInMap("Error")
        public Integer error;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Info")
        public Integer info;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics();
            return TeaModel.build(map, self);
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics setWarning(Integer warning) {
            this.warning = warning;
            return this;
        }
        public Integer getWarning() {
            return this.warning;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics setError(Integer error) {
            this.error = error;
            return this;
        }
        public Integer getError() {
            return this.error;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics setInfo(Integer info) {
            this.info = info;
            return this;
        }
        public Integer getInfo() {
            return this.info;
        }

    }

    public static class DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult extends TeaModel {
        @NameInMap("Percent")
        public Integer percent;

        @NameInMap("SN")
        public String SN;

        @NameInMap("DiagnoseId")
        public String diagnoseId;

        @NameInMap("State")
        public String state;

        @NameInMap("UserLevel")
        public String userLevel;

        @NameInMap("BoxVersion")
        public String boxVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("BoxType")
        public String boxType;

        @NameInMap("MonitorVersion")
        public String monitorVersion;

        @NameInMap("FinishedNumber")
        public Integer finishedNumber;

        @NameInMap("Details")
        public java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails> details;

        @NameInMap("UId")
        public String UId;

        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("StoreType")
        public String storeType;

        @NameInMap("ReportSLSSuccess")
        public Integer reportSLSSuccess;

        @NameInMap("TotalNumber")
        public Integer totalNumber;

        @NameInMap("Level")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel level;

        @NameInMap("Statistics")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics statistics;

        public static DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult build(java.util.Map<String, ?> map) throws Exception {
            DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult self = new DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult();
            return TeaModel.build(map, self);
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setSN(String SN) {
            this.SN = SN;
            return this;
        }
        public String getSN() {
            return this.SN;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setDiagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setUserLevel(String userLevel) {
            this.userLevel = userLevel;
            return this;
        }
        public String getUserLevel() {
            return this.userLevel;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setBoxVersion(String boxVersion) {
            this.boxVersion = boxVersion;
            return this;
        }
        public String getBoxVersion() {
            return this.boxVersion;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setBoxType(String boxType) {
            this.boxType = boxType;
            return this;
        }
        public String getBoxType() {
            return this.boxType;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setMonitorVersion(String monitorVersion) {
            this.monitorVersion = monitorVersion;
            return this;
        }
        public String getMonitorVersion() {
            return this.monitorVersion;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setFinishedNumber(Integer finishedNumber) {
            this.finishedNumber = finishedNumber;
            return this;
        }
        public Integer getFinishedNumber() {
            return this.finishedNumber;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setDetails(java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails> getDetails() {
            return this.details;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setUId(String UId) {
            this.UId = UId;
            return this;
        }
        public String getUId() {
            return this.UId;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setStoreType(String storeType) {
            this.storeType = storeType;
            return this;
        }
        public String getStoreType() {
            return this.storeType;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setReportSLSSuccess(Integer reportSLSSuccess) {
            this.reportSLSSuccess = reportSLSSuccess;
            return this;
        }
        public Integer getReportSLSSuccess() {
            return this.reportSLSSuccess;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setLevel(DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel level) {
            this.level = level;
            return this;
        }
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel getLevel() {
            return this.level;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult setStatistics(DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics statistics) {
            this.statistics = statistics;
            return this;
        }
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics getStatistics() {
            return this.statistics;
        }

    }

}
