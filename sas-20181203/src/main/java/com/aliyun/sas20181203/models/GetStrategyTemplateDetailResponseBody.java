// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetStrategyTemplateDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetStrategyTemplateDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Id")
        public String id;

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
        @NameInMap("Item")
        public java.util.List<GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaselineItem> item;

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
        @NameInMap("Id")
        public String id;

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
        @NameInMap("Item")
        public java.util.List<GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFileItem> item;

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
        @NameInMap("Id")
        public String id;

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
        @NameInMap("Item")
        public java.util.List<GetStrategyTemplateDetailResponseBodyDataAlarmDetailVulItem> item;

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
        @NameInMap("Baseline")
        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailBaseline baseline;

        @NameInMap("MaliciousFile")
        public GetStrategyTemplateDetailResponseBodyDataAlarmDetailMaliciousFile maliciousFile;

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
        @NameInMap("AlarmDetail")
        public GetStrategyTemplateDetailResponseBodyDataAlarmDetail alarmDetail;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImageName")
        public java.util.List<String> imageName;

        @NameInMap("Label")
        public java.util.List<String> label;

        @NameInMap("MaliciousImage")
        public Boolean maliciousImage;

        @NameInMap("Namespace")
        public java.util.List<String> namespace;

        @NameInMap("RuleAction")
        public Integer ruleAction;

        @NameInMap("StrategyId")
        public Long strategyId;

        @NameInMap("StrategyName")
        public String strategyName;

        @NameInMap("StrategyTemplateId")
        public Long strategyTemplateId;

        @NameInMap("UnScanedImage")
        public Boolean unScanedImage;

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
