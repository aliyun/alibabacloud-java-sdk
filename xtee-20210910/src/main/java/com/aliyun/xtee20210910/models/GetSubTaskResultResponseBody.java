// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class GetSubTaskResultResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A519CFA-0EEC-580A-A5C1-F9C653FB2354</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return Result.</p>
     */
    @NameInMap("ResultObject")
    public GetSubTaskResultResponseBodyResultObject resultObject;

    public static GetSubTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubTaskResultResponseBody self = new GetSubTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubTaskResultResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSubTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubTaskResultResponseBody setResultObject(GetSubTaskResultResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public GetSubTaskResultResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class GetSubTaskResultResponseBodyResultObjectConfig extends TeaModel {
        /**
         * <p>Backing field for service support.</p>
         * 
         * <strong>example:</strong>
         * <p>repl_lag</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>Product description information.</p>
         * 
         * <strong>example:</strong>
         * <p>des</p>
         */
        @NameInMap("ItemDesc")
        public String itemDesc;

        /**
         * <p>Sample.</p>
         * 
         * <strong>example:</strong>
         * <p>sample</p>
         */
        @NameInMap("SampleItem")
        public String sampleItem;

        /**
         * <p>List of fields corresponding to the sample.</p>
         */
        @NameInMap("SampleItems")
        public java.util.List<String> sampleItems;

        public static GetSubTaskResultResponseBodyResultObjectConfig build(java.util.Map<String, ?> map) throws Exception {
            GetSubTaskResultResponseBodyResultObjectConfig self = new GetSubTaskResultResponseBodyResultObjectConfig();
            return TeaModel.build(map, self);
        }

        public GetSubTaskResultResponseBodyResultObjectConfig setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public GetSubTaskResultResponseBodyResultObjectConfig setItemDesc(String itemDesc) {
            this.itemDesc = itemDesc;
            return this;
        }
        public String getItemDesc() {
            return this.itemDesc;
        }

        public GetSubTaskResultResponseBodyResultObjectConfig setSampleItem(String sampleItem) {
            this.sampleItem = sampleItem;
            return this;
        }
        public String getSampleItem() {
            return this.sampleItem;
        }

        public GetSubTaskResultResponseBodyResultObjectConfig setSampleItems(java.util.List<String> sampleItems) {
            this.sampleItems = sampleItems;
            return this;
        }
        public java.util.List<String> getSampleItems() {
            return this.sampleItems;
        }

    }

    public static class GetSubTaskResultResponseBodyResultObjectFileCol extends TeaModel {
        /**
         * <p>A0.</p>
         * 
         * <strong>example:</strong>
         * <p>A0</p>
         */
        @NameInMap("A0")
        public String a0;

        /**
         * <p>A1.</p>
         * 
         * <strong>example:</strong>
         * <p>A1</p>
         */
        @NameInMap("A1")
        public String a1;

        /**
         * <p>A10.</p>
         * 
         * <strong>example:</strong>
         * <p>A10</p>
         */
        @NameInMap("A10")
        public String a10;

        /**
         * <p>A11.</p>
         * 
         * <strong>example:</strong>
         * <p>A11</p>
         */
        @NameInMap("A11")
        public String a11;

        /**
         * <p>A2.</p>
         * 
         * <strong>example:</strong>
         * <p>A2</p>
         */
        @NameInMap("A2")
        public String a2;

        /**
         * <p>A3.</p>
         * 
         * <strong>example:</strong>
         * <p>A3</p>
         */
        @NameInMap("A3")
        public String a3;

        /**
         * <p>A4.</p>
         * 
         * <strong>example:</strong>
         * <p>A4</p>
         */
        @NameInMap("A4")
        public String a4;

        /**
         * <p>A5.</p>
         * 
         * <strong>example:</strong>
         * <p>A5</p>
         */
        @NameInMap("A5")
        public String a5;

        /**
         * <p>A6.</p>
         * 
         * <strong>example:</strong>
         * <p>A6</p>
         */
        @NameInMap("A6")
        public String a6;

        /**
         * <p>A7.</p>
         * 
         * <strong>example:</strong>
         * <p>A7</p>
         */
        @NameInMap("A7")
        public String a7;

        /**
         * <p>A8.</p>
         * 
         * <strong>example:</strong>
         * <p>A8</p>
         */
        @NameInMap("A8")
        public String a8;

        /**
         * <p>A9.</p>
         * 
         * <strong>example:</strong>
         * <p>A9</p>
         */
        @NameInMap("A9")
        public String a9;

        public static GetSubTaskResultResponseBodyResultObjectFileCol build(java.util.Map<String, ?> map) throws Exception {
            GetSubTaskResultResponseBodyResultObjectFileCol self = new GetSubTaskResultResponseBodyResultObjectFileCol();
            return TeaModel.build(map, self);
        }

        public GetSubTaskResultResponseBodyResultObjectFileCol setA0(String a0) {
            this.a0 = a0;
            return this;
        }
        public String getA0() {
            return this.a0;
        }

        public GetSubTaskResultResponseBodyResultObjectFileCol setA1(String a1) {
            this.a1 = a1;
            return this;
        }
        public String getA1() {
            return this.a1;
        }

        public GetSubTaskResultResponseBodyResultObjectFileCol setA10(String a10) {
            this.a10 = a10;
            return this;
        }
        public String getA10() {
            return this.a10;
        }

        public GetSubTaskResultResponseBodyResultObjectFileCol setA11(String a11) {
            this.a11 = a11;
            return this;
        }
        public String getA11() {
            return this.a11;
        }

        public GetSubTaskResultResponseBodyResultObjectFileCol setA2(String a2) {
            this.a2 = a2;
            return this;
        }
        public String getA2() {
            return this.a2;
        }

        public GetSubTaskResultResponseBodyResultObjectFileCol setA3(String a3) {
            this.a3 = a3;
            return this;
        }
        public String getA3() {
            return this.a3;
        }

        public GetSubTaskResultResponseBodyResultObjectFileCol setA4(String a4) {
            this.a4 = a4;
            return this;
        }
        public String getA4() {
            return this.a4;
        }

        public GetSubTaskResultResponseBodyResultObjectFileCol setA5(String a5) {
            this.a5 = a5;
            return this;
        }
        public String getA5() {
            return this.a5;
        }

        public GetSubTaskResultResponseBodyResultObjectFileCol setA6(String a6) {
            this.a6 = a6;
            return this;
        }
        public String getA6() {
            return this.a6;
        }

        public GetSubTaskResultResponseBodyResultObjectFileCol setA7(String a7) {
            this.a7 = a7;
            return this;
        }
        public String getA7() {
            return this.a7;
        }

        public GetSubTaskResultResponseBodyResultObjectFileCol setA8(String a8) {
            this.a8 = a8;
            return this;
        }
        public String getA8() {
            return this.a8;
        }

        public GetSubTaskResultResponseBodyResultObjectFileCol setA9(String a9) {
            this.a9 = a9;
            return this;
        }
        public String getA9() {
            return this.a9;
        }

    }

    public static class GetSubTaskResultResponseBodyResultObjectFile extends TeaModel {
        /**
         * <p>Column names.</p>
         */
        @NameInMap("Col")
        public java.util.List<GetSubTaskResultResponseBodyResultObjectFileCol> col;

        /**
         * <p>Variable title.</p>
         */
        @NameInMap("Title")
        public java.util.List<String> title;

        public static GetSubTaskResultResponseBodyResultObjectFile build(java.util.Map<String, ?> map) throws Exception {
            GetSubTaskResultResponseBodyResultObjectFile self = new GetSubTaskResultResponseBodyResultObjectFile();
            return TeaModel.build(map, self);
        }

        public GetSubTaskResultResponseBodyResultObjectFile setCol(java.util.List<GetSubTaskResultResponseBodyResultObjectFileCol> col) {
            this.col = col;
            return this;
        }
        public java.util.List<GetSubTaskResultResponseBodyResultObjectFileCol> getCol() {
            return this.col;
        }

        public GetSubTaskResultResponseBodyResultObjectFile setTitle(java.util.List<String> title) {
            this.title = title;
            return this;
        }
        public java.util.List<String> getTitle() {
            return this.title;
        }

    }

    public static class GetSubTaskResultResponseBodyResultObjectLog extends TeaModel {
        /**
         * <p>Processing type.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
        @NameInMap("OperateType")
        public String operateType;

        /**
         * <p>Reason for the service status.</p>
         * 
         * <strong>example:</strong>
         * <p>PasswordExpired</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Time. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1760408725312</p>
         */
        @NameInMap("Time")
        public Long time;

        public static GetSubTaskResultResponseBodyResultObjectLog build(java.util.Map<String, ?> map) throws Exception {
            GetSubTaskResultResponseBodyResultObjectLog self = new GetSubTaskResultResponseBodyResultObjectLog();
            return TeaModel.build(map, self);
        }

        public GetSubTaskResultResponseBodyResultObjectLog setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public GetSubTaskResultResponseBodyResultObjectLog setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetSubTaskResultResponseBodyResultObjectLog setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

    public static class GetSubTaskResultResponseBodyResultObject extends TeaModel {
        /**
         * <p>Outputs List Settings.</p>
         */
        @NameInMap("Config")
        public java.util.List<GetSubTaskResultResponseBodyResultObjectConfig> config;

        /**
         * <p>Additional extension information.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;approveNodeInfo\&quot;:[{\&quot;approver\&quot;:[\&quot;325337\&quot;,\&quot;270729\&quot;,\&quot;290278\&quot;,\&quot;371000\&quot;,\&quot;175234\&quot;,\&quot;237109\&quot;],\&quot;nodeName\&quot;:\&quot;团队审批人\&quot;,\&quot;nodeCode\&quot;:1,\&quot;approveRule\&quot;:\&quot;ONE\&quot;}]}</p>
         */
        @NameInMap("ExtraInfo")
        public String extraInfo;

        /**
         * <p>File.</p>
         */
        @NameInMap("File")
        public GetSubTaskResultResponseBodyResultObjectFile file;

        /**
         * <p>File name.</p>
         * 
         * <strong>example:</strong>
         * <p>enorl-20w-0926.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>File type.</p>
         * 
         * <strong>example:</strong>
         * <p>CSV</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>File URL.</p>
         * 
         * <strong>example:</strong>
         * <p>saf/cpoc/34cd7959590ef568086035b956210495/1760580976089_XN_test_1016_100000.csv</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>Is charged.</p>
         * 
         * <strong>example:</strong>
         * <p>是否收费</p>
         */
        @NameInMap("IsCharge")
        public Boolean isCharge;

        /**
         * <p>Log content.</p>
         */
        @NameInMap("Log")
        public java.util.List<GetSubTaskResultResponseBodyResultObjectLog> log;

        /**
         * <p>Reason.</p>
         * 
         * <strong>example:</strong>
         * <p>managed.by.apig</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Result URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://shuanglu-prod.oss-cn-shanghai-finance-1-pub.aliyuncs.com/idrs/24/local/remoteresult?Expires=1756436489&OSSAccessKeyId=****&Signature=">http://shuanglu-prod.oss-cn-shanghai-finance-1-pub.aliyuncs.com/idrs/24/local/remoteresult?Expires=1756436489&amp;OSSAccessKeyId=****&amp;Signature=</a>****</p>
         */
        @NameInMap("ResultUrl")
        public String resultUrl;

        /**
         * <p>Schedule type.</p>
         * 
         * <strong>example:</strong>
         * <p>rate</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <p>Service code.</p>
         * 
         * <strong>example:</strong>
         * <p>anti_fraud_customed_v3</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>申请反欺诈（定制增强版）</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>CLASS_CHANGING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>19150</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Task Name.</p>
         * 
         * <strong>example:</strong>
         * <p>icekredit_model_A_2025a_508185</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5129547232</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static GetSubTaskResultResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            GetSubTaskResultResponseBodyResultObject self = new GetSubTaskResultResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public GetSubTaskResultResponseBodyResultObject setConfig(java.util.List<GetSubTaskResultResponseBodyResultObjectConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<GetSubTaskResultResponseBodyResultObjectConfig> getConfig() {
            return this.config;
        }

        public GetSubTaskResultResponseBodyResultObject setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public GetSubTaskResultResponseBodyResultObject setFile(GetSubTaskResultResponseBodyResultObjectFile file) {
            this.file = file;
            return this;
        }
        public GetSubTaskResultResponseBodyResultObjectFile getFile() {
            return this.file;
        }

        public GetSubTaskResultResponseBodyResultObject setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetSubTaskResultResponseBodyResultObject setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetSubTaskResultResponseBodyResultObject setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetSubTaskResultResponseBodyResultObject setIsCharge(Boolean isCharge) {
            this.isCharge = isCharge;
            return this;
        }
        public Boolean getIsCharge() {
            return this.isCharge;
        }

        public GetSubTaskResultResponseBodyResultObject setLog(java.util.List<GetSubTaskResultResponseBodyResultObjectLog> log) {
            this.log = log;
            return this;
        }
        public java.util.List<GetSubTaskResultResponseBodyResultObjectLog> getLog() {
            return this.log;
        }

        public GetSubTaskResultResponseBodyResultObject setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetSubTaskResultResponseBodyResultObject setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public GetSubTaskResultResponseBodyResultObject setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public GetSubTaskResultResponseBodyResultObject setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public GetSubTaskResultResponseBodyResultObject setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetSubTaskResultResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSubTaskResultResponseBodyResultObject setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetSubTaskResultResponseBodyResultObject setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetSubTaskResultResponseBodyResultObject setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
