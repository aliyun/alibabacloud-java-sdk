// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DiscribeSmartAccessGatewayDiagnosisReportResponseBody extends TeaModel {
    /**
     * <p>The diagnosis report of the SAG device.</p>
     */
    @NameInMap("DiagnoseResult")
    public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResult diagnoseResult;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The suggestion for the diagnosis.</p>
         */
        @NameInMap("Advice")
        public java.util.List<String> advice;

        /**
         * <p>The diagnosis.</p>
         */
        @NameInMap("Details")
        public java.util.List<String> details;

        /**
         * <p>The diagnosis level of the item. Valid values:</p>
         * <ul>
         * <li><strong>ERROR</strong>: indicates that the item has an issue that may affect your services. We recommend that you handle the issue at the earliest opportunity.</li>
         * <li><strong>WARNING</strong>: indicates that the item has an issue. You can handle the issue based on your business requirements.</li>
         * <li><strong>INFO</strong>: indicates that the item is working as expected. No additional operation is required.</li>
         * </ul>
         */
        @NameInMap("ItemLevel")
        public String itemLevel;

        /**
         * <p>The name of the item.</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The type of the item. Valid values:</p>
         * <ul>
         * <li><strong>Config</strong>: <strong>SAG configuration</strong></li>
         * <li><strong>Service</strong>: <strong>service quality</strong></li>
         * <li><strong>Internet</strong>: <strong>quality of connections to the Internet</strong></li>
         * </ul>
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
         * <p>The suggestion for the diagnosis.</p>
         */
        @NameInMap("Advice")
        public java.util.List<String> advice;

        /**
         * <p>The diagnosis.</p>
         */
        @NameInMap("Details")
        public java.util.List<String> details;

        /**
         * <p>The diagnosis level of the item. Valid values:</p>
         * <ul>
         * <li><strong>ERROR</strong>: indicates that the item has an issue that may affect your services. We recommend that you handle the issue at the earliest opportunity.</li>
         * <li><strong>WARNING</strong>: indicates that the item has an issue. You can handle the issue based on your business requirements.</li>
         * <li><strong>INFO</strong>: indicates that the item is working as expected. No additional operation is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("ItemLevel")
        public String itemLevel;

        /**
         * <p>The name of the item.</p>
         * 
         * <strong>example:</strong>
         * <p>Express Connect Port Configuration</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The type of the item. Valid values:</p>
         * <ul>
         * <li><strong>Config</strong>: <strong>SAG configuration</strong></li>
         * <li><strong>Service</strong>: <strong>service quality</strong></li>
         * <li><strong>Internet</strong>: <strong>quality of connections to the Internet</strong></li>
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
         * <p>The diagnosis report in Chinese.</p>
         */
        @NameInMap("CN")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsCN CN;

        /**
         * <p>The diagnosis report in English.</p>
         */
        @NameInMap("EN")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItemsEN EN;

        /**
         * <p>The timestamp when the system finishes diagnosing the item.</p>
         * 
         * <strong>example:</strong>
         * <p>1602741570596</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The name of the item, which is the unique identifier of the item.</p>
         * 
         * <strong>example:</strong>
         * <p>eccConfigCheck</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The diagnosis level of the item. Valid values:</p>
         * <ul>
         * <li><strong>error</strong>: severe</li>
         * <li><strong>warning</strong>: warning</li>
         * <li><strong>info</strong>: normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The timestamp when the system starts to diagnose the item.</p>
         * 
         * <strong>example:</strong>
         * <p>1602741570567</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The type of the item. Valid values:</p>
         * <ul>
         * <li><strong>config</strong>: SAG configuration</li>
         * <li><strong>internet</strong>: quality of connections to the Internet</li>
         * <li><strong>biz</strong>: service quality</li>
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
         * <p>The number of items of the <strong>ERROR</strong> level.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Error")
        public Integer error;

        /**
         * <p>The number of items of the <strong>INFO</strong> level.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Info")
        public Integer info;

        /**
         * <p>The total number of items for the current diagnosis type.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <p>The number of items of the <strong>WARNING</strong> level.</p>
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
         * <p>The list of items diagnosed.</p>
         */
        @NameInMap("Items")
        public java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsItems> items;

        /**
         * <p>The information about items of each diagnosis level for the current diagnosis type.</p>
         */
        @NameInMap("Statistics")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetailsStatistics statistics;

        /**
         * <p>The type of the diagnosis. Valid values:</p>
         * <ul>
         * <li><strong>config</strong>: SAG configuration</li>
         * <li><strong>internet</strong>: quality of connections to the Internet</li>
         * <li><strong>biz</strong>: service quality</li>
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
         * <p>The diagnosis level of the service quality.</p>
         * 
         * <strong>example:</strong>
         * <p>warning</p>
         */
        @NameInMap("Biz")
        public String biz;

        /**
         * <p>The diagnosis level of the SAG configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>The overall diagnosis level.</p>
         * <ul>
         * <li><strong>error</strong>: severe</li>
         * <li><strong>warning</strong>: warning</li>
         * <li><strong>info</strong>: normal</li>
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
         * <p>The number of items of the <strong>ERROR</strong> level.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Error")
        public Integer error;

        /**
         * <p>The number of items of the <strong>INFO</strong> level.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Info")
        public Integer info;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <p>The number of items of the <strong>WARNING</strong> level.</p>
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
         * <p>The model of the SAG device.</p>
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
         * <p>The version of the SAG device.</p>
         * 
         * <strong>example:</strong>
         * <p>2.1.0</p>
         */
        @NameInMap("BoxVersion")
        public String boxVersion;

        /**
         * <p>The list of diagnoses that are returned.</p>
         */
        @NameInMap("Details")
        public java.util.List<DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultDetails> details;

        /**
         * <p>The ID of the diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>dia-sag42c3t703trh02olv5rf****</p>
         */
        @NameInMap("DiagnoseId")
        public String diagnoseId;

        /**
         * <p>The timestamp when the system finishes diagnosing the item.</p>
         * 
         * <strong>example:</strong>
         * <p>160274157</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>The number of items that are diagnosed.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("FinishedNumber")
        public Integer finishedNumber;

        /**
         * <p>The ID of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-0nnteglltw6z4b***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The diagnosis level.</p>
         */
        @NameInMap("Level")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultLevel level;

        /**
         * <p>The version of the monitoring feature that is used by the SAG device.</p>
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
         * <p>The status of the diagnosis report to be uploaded to Log Service.</p>
         * <ul>
         * <li><strong>0</strong>: The system failed to upload the report.</li>
         * <li><strong>1</strong>: The system has uploaded the report to Log Service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReportSLSSuccess")
        public Integer reportSLSSuccess;

        /**
         * <p>The serial number of the SAG device.</p>
         * 
         * <strong>example:</strong>
         * <p>sag42c3****</p>
         */
        @NameInMap("SN")
        public String SN;

        /**
         * <p>The timestamp when the system starts to diagnose the item.</p>
         * 
         * <strong>example:</strong>
         * <p>160274157</p>
         */
        @NameInMap("StartTime")
        public Integer startTime;

        /**
         * <p>The diagnosis status. Valid values:</p>
         * <ul>
         * <li><strong>processing</strong>: The SAG device is being diagnosed.</li>
         * <li><strong>finished</strong>: The SAG device is diagnosed.</li>
         * <li><strong>failed</strong>: The system failed to diagnose the SAG device.</li>
         * <li><strong>error</strong>: A diagnostic error occurred.</li>
         * <li><strong>upload_to_sls_fail</strong>: The system failed to upload the diagnosis report.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The overall diagnosis level.</p>
         */
        @NameInMap("Statistics")
        public DiscribeSmartAccessGatewayDiagnosisReportResponseBodyDiagnoseResultStatistics statistics;

        /**
         * <p>The storage type.</p>
         * <p>The value is set to <strong>both</strong>, which indicates that the data is stored in the SAG device and Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>both</p>
         */
        @NameInMap("StoreType")
        public String storeType;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TotalNumber")
        public Integer totalNumber;

        /**
         * <p>The user ID (UID) of the Alibaba Cloud account to which the SAG instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1688000000000000</p>
         */
        @NameInMap("UId")
        public String UId;

        /**
         * <p>The type of user that initiated the diagnostics. The value is set to <strong>user</strong>.</p>
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
