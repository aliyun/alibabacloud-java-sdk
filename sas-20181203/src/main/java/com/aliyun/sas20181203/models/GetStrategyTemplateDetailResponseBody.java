// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetStrategyTemplateDetailResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the template.</p>
     */
    @NameInMap("Data")
    public GetStrategyTemplateDetailResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetStrategyTemplateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStrategyTemplateDetailResponseBody self = new GetStrategyTemplateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStrategyTemplateDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStrategyTemplateDetailResponseBody setData(GetStrategyTemplateDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStrategyTemplateDetailResponseBodyData getData() {
        return this.data;
    }

    public GetStrategyTemplateDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStrategyTemplateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStrategyTemplateDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaselineItem extends TeaModel {
        /**
         * <p>The unique identifier of the baseline check item.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the baseline check item.</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaselineItem build(java.util.Map<String, ?> map) throws Exception {
            GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaselineItem self = new GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaselineItem();
            return TeaModel.build(map, self);
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaselineItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaselineItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaseline extends TeaModel {
        /**
         * <p>The baseline items.</p>
         */
        @NameInMap("Item")
        public java.util.List<GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaselineItem> item;

        /**
         * <p>The severities of the baselines. Valid values:</p>
         * <br>
         * <p>*   **high**</p>
         * <p>*   **medium**</p>
         * <p>*   **low**</p>
         */
        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaseline build(java.util.Map<String, ?> map) throws Exception {
            GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaseline self = new GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaseline();
            return TeaModel.build(map, self);
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaseline setItem(java.util.List<GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaselineItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaselineItem> getItem() {
            return this.item;
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaseline setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFileItem extends TeaModel {
        /**
         * <p>The unique identifier of the malicious sample.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the malicious sample.</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFileItem build(java.util.Map<String, ?> map) throws Exception {
            GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFileItem self = new GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFileItem();
            return TeaModel.build(map, self);
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFileItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFileItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFile extends TeaModel {
        /**
         * <p>The items on which malicious samples are detected.</p>
         */
        @NameInMap("Item")
        public java.util.List<GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFileItem> item;

        /**
         * <p>The severities of the malicious samples.</p>
         */
        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFile build(java.util.Map<String, ?> map) throws Exception {
            GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFile self = new GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFile();
            return TeaModel.build(map, self);
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFile setItem(java.util.List<GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFileItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFileItem> getItem() {
            return this.item;
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFile setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetStrategyTemplateDetailResponseBodyDataAlarmDetailVulItem extends TeaModel {
        /**
         * <p>The ID of the vulnerability.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The alias of the vulnerability.</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStrategyTemplateDetailResponseBodyDataAlarmDetailVulItem build(java.util.Map<String, ?> map) throws Exception {
            GetStrategyTemplateDetailResponseBodyDataAlarmDetailVulItem self = new GetStrategyTemplateDetailResponseBodyDataAlarmDetailVulItem();
            return TeaModel.build(map, self);
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailVulItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailVulItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStrategyTemplateDetailResponseBodyDataAlarmDetailVul extends TeaModel {
        /**
         * <p>The items on which vulnerabilities are detected.</p>
         */
        @NameInMap("Item")
        public java.util.List<GetStrategyTemplateDetailResponseBodyDataAlarmDetailVulItem> item;

        /**
         * <p>The severities of the vulnerabilities.</p>
         */
        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static GetStrategyTemplateDetailResponseBodyDataAlarmDetailVul build(java.util.Map<String, ?> map) throws Exception {
            GetStrategyTemplateDetailResponseBodyDataAlarmDetailVul self = new GetStrategyTemplateDetailResponseBodyDataAlarmDetailVul();
            return TeaModel.build(map, self);
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailVul setItem(java.util.List<GetStrategyTemplateDetailResponseBodyDataAlarmDetailVulItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<GetStrategyTemplateDetailResponseBodyDataAlarmDetailVulItem> getItem() {
            return this.item;
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailVul setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetStrategyTemplateDetailResponseBodyDataAlarmDetail extends TeaModel {
        /**
         * <p>The configuration of the baseline.</p>
         */
        @NameInMap("Baseline")
        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaseline baseline;

        /**
         * <p>The configuration of the alert rule for the malicious sample.</p>
         */
        @NameInMap("MaliciousFile")
        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFile maliciousFile;

        /**
         * <p>The configuration of the vulnerability detection rule.</p>
         */
        @NameInMap("Vul")
        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailVul vul;

        public static GetStrategyTemplateDetailResponseBodyDataAlarmDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStrategyTemplateDetailResponseBodyDataAlarmDetail self = new GetStrategyTemplateDetailResponseBodyDataAlarmDetail();
            return TeaModel.build(map, self);
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetail setBaseline(GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaseline baseline) {
            this.baseline = baseline;
            return this;
        }
        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaseline getBaseline() {
            return this.baseline;
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetail setMaliciousFile(GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFile maliciousFile) {
            this.maliciousFile = maliciousFile;
            return this;
        }
        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFile getMaliciousFile() {
            return this.maliciousFile;
        }

        public GetStrategyTemplateDetailResponseBodyDataAlarmDetail setVul(GetStrategyTemplateDetailResponseBodyDataAlarmDetailVul vul) {
            this.vul = vul;
            return this;
        }
        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailVul getVul() {
            return this.vul;
        }

    }

    public static class GetStrategyTemplateDetailResponseBodyData extends TeaModel {
        /**
         * <p>The configuration of the rule.</p>
         */
        @NameInMap("AlarmDetail")
        public GetStrategyTemplateDetailResponseBodyDataAlarmDetail alarmDetail;

        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The description of the rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The names of images.</p>
         */
        @NameInMap("ImageName")
        public java.util.List<String> imageName;

        /**
         * <p>The tags that are added to the containers.</p>
         */
        @NameInMap("Label")
        public java.util.List<String> label;

        /**
         * <p>Indicates whether the rule supports malicious Internet images. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("MaliciousImage")
        public Boolean maliciousImage;

        /**
         * <p>The namespaces.</p>
         */
        @NameInMap("Namespace")
        public java.util.List<String> namespace;

        /**
         * <p>The action on requests. Valid values:</p>
         * <br>
         * <p>*   **1**: trigger alerts</p>
         * <p>*   **2**: block</p>
         * <p>*   **3**: allow</p>
         */
        @NameInMap("RuleAction")
        public Integer ruleAction;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <p>The ID of the template.</p>
         */
        @NameInMap("StrategyTemplateId")
        public Long strategyTemplateId;

        /**
         * <p>Indicates whether the rule supports unscanned images. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("UnScanedImage")
        public Boolean unScanedImage;

        /**
         * <p>The whitelists of tags that are added to images.</p>
         */
        @NameInMap("WhiteList")
        public java.util.List<String> whiteList;

        public static GetStrategyTemplateDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStrategyTemplateDetailResponseBodyData self = new GetStrategyTemplateDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStrategyTemplateDetailResponseBodyData setAlarmDetail(GetStrategyTemplateDetailResponseBodyDataAlarmDetail alarmDetail) {
            this.alarmDetail = alarmDetail;
            return this;
        }
        public GetStrategyTemplateDetailResponseBodyDataAlarmDetail getAlarmDetail() {
            return this.alarmDetail;
        }

        public GetStrategyTemplateDetailResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetStrategyTemplateDetailResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetStrategyTemplateDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStrategyTemplateDetailResponseBodyData setImageName(java.util.List<String> imageName) {
            this.imageName = imageName;
            return this;
        }
        public java.util.List<String> getImageName() {
            return this.imageName;
        }

        public GetStrategyTemplateDetailResponseBodyData setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

        public GetStrategyTemplateDetailResponseBodyData setMaliciousImage(Boolean maliciousImage) {
            this.maliciousImage = maliciousImage;
            return this;
        }
        public Boolean getMaliciousImage() {
            return this.maliciousImage;
        }

        public GetStrategyTemplateDetailResponseBodyData setNamespace(java.util.List<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public java.util.List<String> getNamespace() {
            return this.namespace;
        }

        public GetStrategyTemplateDetailResponseBodyData setRuleAction(Integer ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public Integer getRuleAction() {
            return this.ruleAction;
        }

        public GetStrategyTemplateDetailResponseBodyData setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

        public GetStrategyTemplateDetailResponseBodyData setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public GetStrategyTemplateDetailResponseBodyData setStrategyTemplateId(Long strategyTemplateId) {
            this.strategyTemplateId = strategyTemplateId;
            return this;
        }
        public Long getStrategyTemplateId() {
            return this.strategyTemplateId;
        }

        public GetStrategyTemplateDetailResponseBodyData setUnScanedImage(Boolean unScanedImage) {
            this.unScanedImage = unScanedImage;
            return this;
        }
        public Boolean getUnScanedImage() {
            return this.unScanedImage;
        }

        public GetStrategyTemplateDetailResponseBodyData setWhiteList(java.util.List<String> whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public java.util.List<String> getWhiteList() {
            return this.whiteList;
        }

    }

}
