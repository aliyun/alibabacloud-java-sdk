// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DiscribeSmartAccessGatewayDiagnosisReportResponseBody extends TeaModel {
    /**
     * <p>The diagnosis report of the Smart Access Gateway device.</p>
     */
    @NameInMap("DiagnoseResult")
    public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult diagnoseResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7D6E3AB-D41A-42E3-8D4E-97B145F4B7C3</p>
     */
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
        /**
         * <p>The diagnosis suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>Check the leased-line port link wiring first, and then go to the local Leased Line Management page for configuration.</p>
         */
        @NameInMap("Advice")
        public java.util.List<String> advice;

        /**
         * <p>The diagnosis result.</p>
         * 
         * <strong>example:</strong>
         * <p>All leased-line ports have link anomalies or missing port IPs: Port 4.</p>
         */
        @NameInMap("Details")
        public java.util.List<String> details;

        /**
         * <p>The severity level of the diagnosis result for the diagnosis item.</p>
         * <ul>
         * <li><strong>严重</strong> (Critical): indicates that the issue of the diagnosis item may affect service running. We recommend that you handle the issue at the earliest opportunity.</li>
         * <li><strong>警告</strong> (Warning): indicates that the diagnosis item has an issue. Handle the issue based on the suggestion.</li>
         * <li><strong>正常</strong> (Normal): indicates that the diagnosis item is running as expected. No action is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("ItemLevel")
        public String itemLevel;

        /**
         * <p>The name of the diagnosis item.</p>
         * 
         * <strong>example:</strong>
         * <p>Leased line port configuration check</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The diagnosis type to which the diagnosis item belongs.</p>
         * <ul>
         * <li><strong>配置</strong> (Configuration): indicates the <strong>SAG configuration</strong> type.</li>
         * <li><strong>业务</strong> (Service): indicates the <strong>service quality</strong> type.</li>
         * <li><strong>公网</strong> (Internet): indicates the <strong>Internet quality</strong> type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Configuration</p>
         */
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
        /**
         * <p>The diagnosis suggestion.</p>
         */
        @NameInMap("Advice")
        public java.util.List<String> advice;

        /**
         * <p>The diagnosis result.</p>
         */
        @NameInMap("Details")
        public java.util.List<String> details;

        /**
         * <p>The severity level of the diagnosis result for the diagnosis item.</p>
         * <ul>
         * <li><strong>ERROR</strong>: indicates that the issue of the diagnosis item may affect service running. We recommend that you handle the issue at the earliest opportunity.</li>
         * <li><strong>WARNING</strong>: indicates that the diagnosis item has an issue. Handle the issue based on the suggestion.</li>
         * <li><strong>INFO</strong>: indicates that the diagnosis item is running as expected. No action is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("ItemLevel")
        public String itemLevel;

        /**
         * <p>The name of the diagnosis item.</p>
         * 
         * <strong>example:</strong>
         * <p>Express Connect Port Configuration</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The diagnosis type to which the diagnosis item belongs.</p>
         * <ul>
         * <li><strong>Config</strong>: indicates the <strong>SAG configuration</strong> type.</li>
         * <li><strong>Service</strong>: indicates the <strong>service quality</strong> type.</li>
         * <li><strong>Internet</strong>: indicates the <strong>Internet quality</strong> type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Config</p>
         */
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
        /**
         * <p>The diagnosis result in Chinese.</p>
         */
        @NameInMap("CN")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN CN;

        /**
         * <p>The diagnosis result in English.</p>
         */
        @NameInMap("EN")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN EN;

        /**
         * <p>The timestamp when the diagnosis of the diagnosis item ended.</p>
         * 
         * <strong>example:</strong>
         * <p>1602741570596</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The name of the diagnosis item, which is the unique identifier of the diagnosis item.</p>
         * 
         * <strong>example:</strong>
         * <p>eccConfigCheck</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The severity level of the diagnosis result for the diagnosis item.</p>
         * <ul>
         * <li><strong>error</strong>: Critical.</li>
         * <li><strong>warning</strong>: Warning.</li>
         * <li><strong>info</strong>: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The timestamp when the diagnosis of the diagnosis item started.</p>
         * 
         * <strong>example:</strong>
         * <p>1602741570567</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The diagnosis type to which the diagnosis item belongs.</p>
         * <ul>
         * <li><strong>config</strong>: SAG configuration.</li>
         * <li><strong>internet</strong>: Internet quality.</li>
         * <li><strong>biz</strong>: Service quality.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>config</p>
         */
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
        /**
         * <p>The number of diagnosis items with the <strong>Error</strong> severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Error")
        public Integer error;

        /**
         * <p>The number of diagnosis items with the <strong>Info</strong> severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Info")
        public Integer info;

        /**
         * <p>The total number of diagnosis items under the current diagnosis type.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <p>The number of diagnosis items with the <strong>Warning</strong> severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
        /**
         * <p>The list of detailed information about diagnosis items.</p>
         */
        @NameInMap("Items")
        public java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems> items;

        /**
         * <p>The statistics on the severity levels of diagnosis items under the current diagnosis type.</p>
         */
        @NameInMap("Statistics")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics statistics;

        /**
         * <p>The diagnosis type.</p>
         * <ul>
         * <li><strong>config</strong>: SAG configuration.</li>
         * <li><strong>internet</strong>: Internet quality.</li>
         * <li><strong>biz</strong>: Service quality.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>config</p>
         */
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
        /**
         * <p>The diagnosis result level for service quality.</p>
         * 
         * <strong>example:</strong>
         * <p>warning</p>
         */
        @NameInMap("Biz")
        public String biz;

        /**
         * <p>The diagnosis result level for SAG configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>The overall diagnosis result level.</p>
         * <ul>
         * <li><strong>error</strong>: Critical.</li>
         * <li><strong>warning</strong>: Warning.</li>
         * <li><strong>info</strong>: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
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
        /**
         * <p>The total number of diagnosis items with the <strong>Error</strong> severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Error")
        public Integer error;

        /**
         * <p>The total number of diagnosis items with the <strong>Info</strong> severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Info")
        public Integer info;

        /**
         * <p>The total number of all diagnosis items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <p>The total number of diagnosis items with the <strong>Warning</strong> severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
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
        /**
         * <p>The type of the Smart Access Gateway device.</p>
         * <ul>
         * <li><strong>sag-1000</strong></li>
         * <li><strong>sag-100WM</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sag-1000</p>
         */
        @NameInMap("BoxType")
        public String boxType;

        /**
         * <p>The software version that runs on the Smart Access Gateway device.</p>
         * 
         * <strong>example:</strong>
         * <p>2.1.0</p>
         */
        @NameInMap("BoxVersion")
        public String boxVersion;

        /**
         * <p>The list of diagnosis results.</p>
         */
        @NameInMap("Details")
        public java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails> details;

        /**
         * <p>The diagnosis ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dia-sag42c3t703trh02olv5rf****</p>
         */
        @NameInMap("DiagnoseId")
        public String diagnoseId;

        /**
         * <p>The timestamp when the diagnosis ended.</p>
         * 
         * <strong>example:</strong>
         * <p>160274157</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>The number of completed diagnosis items.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("FinishedNumber")
        public Integer finishedNumber;

        /**
         * <p>The ID of the Smart Access Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-0nnteglltw6z4b***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The diagnosis result level.</p>
         */
        @NameInMap("Level")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel level;

        /**
         * <p>The monitoring version used by the Smart Access Gateway device.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.2.9</p>
         */
        @NameInMap("MonitorVersion")
        public String monitorVersion;

        /**
         * <p>The completion percentage of the diagnosis report.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The status of uploading the diagnosis report to SLS.</p>
         * <ul>
         * <li><strong>0</strong>: The upload failed.</li>
         * <li><strong>1</strong>: The upload was successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReportSLSSuccess")
        public Integer reportSLSSuccess;

        /**
         * <p>The serial number of the Smart Access Gateway device.</p>
         * 
         * <strong>example:</strong>
         * <p>sag42c3****</p>
         */
        @NameInMap("SN")
        public String SN;

        /**
         * <p>The timestamp when the diagnosis started.</p>
         * 
         * <strong>example:</strong>
         * <p>160274157</p>
         */
        @NameInMap("StartTime")
        public Integer startTime;

        /**
         * <p>The diagnosis state.</p>
         * <ul>
         * <li><strong>processing</strong>: The diagnosis is in progress.</li>
         * <li><strong>finished</strong>: The diagnosis is successful.</li>
         * <li><strong>failed</strong>: The diagnosis failed.</li>
         * <li><strong>error</strong>: An error occurred during the diagnosis.</li>
         * <li><strong>upload_to_sls_fail</strong>: The diagnosis report failed to be uploaded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The overall statistics of diagnosis item results.</p>
         */
        @NameInMap("Statistics")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics statistics;

        /**
         * <p>The storage type.</p>
         * <p>Value: <strong>both</strong>, which indicates that the diagnosis report is stored on both the Smart Access Gateway device and in Log Service (SLS).</p>
         * 
         * <strong>example:</strong>
         * <p>both</p>
         */
        @NameInMap("StoreType")
        public String storeType;

        /**
         * <p>The total number of diagnosis result entries.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TotalNumber")
        public Integer totalNumber;

        /**
         * <p>The ID of the account to which the Smart Access Gateway instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1688000000000000</p>
         */
        @NameInMap("UId")
        public String UId;

        /**
         * <p>The type of user who initiated the diagnosis. Value: <strong>user</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
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
