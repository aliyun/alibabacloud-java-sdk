// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaStrategyDetailNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOpaStrategyDetailNewResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOpaStrategyDetailNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpaStrategyDetailNewResponseBody self = new GetOpaStrategyDetailNewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpaStrategyDetailNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOpaStrategyDetailNewResponseBody setData(GetOpaStrategyDetailNewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOpaStrategyDetailNewResponseBodyData getData() {
        return this.data;
    }

    public GetOpaStrategyDetailNewResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetOpaStrategyDetailNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOpaStrategyDetailNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpaStrategyDetailNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaselineItem extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaselineItem build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaselineItem self = new GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaselineItem();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaselineItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaselineItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaseline extends TeaModel {
        @NameInMap("Item")
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaselineItem> item;

        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaseline build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaseline self = new GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaseline();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaseline setItem(java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaselineItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaselineItem> getItem() {
            return this.item;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaseline setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFileItem extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFileItem build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFileItem self = new GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFileItem();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFileItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFileItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFile extends TeaModel {
        @NameInMap("Item")
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFileItem> item;

        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFile build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFile self = new GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFile();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFile setItem(java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFileItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFileItem> getItem() {
            return this.item;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFile setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulItem extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulItem build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulItem self = new GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulItem();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVul extends TeaModel {
        @NameInMap("Item")
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulItem> item;

        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVul build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVul self = new GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVul();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVul setItem(java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulItem> getItem() {
            return this.item;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVul setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetail extends TeaModel {
        @NameInMap("Baseline")
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaseline baseline;

        @NameInMap("MaliciousFile")
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFile maliciousFile;

        @NameInMap("Vul")
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVul vul;

        public static GetOpaStrategyDetailNewResponseBodyDataAlarmDetail build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyDataAlarmDetail self = new GetOpaStrategyDetailNewResponseBodyDataAlarmDetail();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetail setBaseline(GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaseline baseline) {
            this.baseline = baseline;
            return this;
        }
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaseline getBaseline() {
            return this.baseline;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetail setMaliciousFile(GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFile maliciousFile) {
            this.maliciousFile = maliciousFile;
            return this;
        }
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFile getMaliciousFile() {
            return this.maliciousFile;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetail setVul(GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVul vul) {
            this.vul = vul;
            return this;
        }
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVul getVul() {
            return this.vul;
        }

    }

    public static class GetOpaStrategyDetailNewResponseBodyDataScopes extends TeaModel {
        @NameInMap("AckPolicyInstanceId")
        public String ackPolicyInstanceId;

        @NameInMap("AllNamespace")
        public Integer allNamespace;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("NamespaceList")
        public java.util.List<String> namespaceList;

        public static GetOpaStrategyDetailNewResponseBodyDataScopes build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyDataScopes self = new GetOpaStrategyDetailNewResponseBodyDataScopes();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyDataScopes setAckPolicyInstanceId(String ackPolicyInstanceId) {
            this.ackPolicyInstanceId = ackPolicyInstanceId;
            return this;
        }
        public String getAckPolicyInstanceId() {
            return this.ackPolicyInstanceId;
        }

        public GetOpaStrategyDetailNewResponseBodyDataScopes setAllNamespace(Integer allNamespace) {
            this.allNamespace = allNamespace;
            return this;
        }
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        public GetOpaStrategyDetailNewResponseBodyDataScopes setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetOpaStrategyDetailNewResponseBodyDataScopes setNamespaceList(java.util.List<String> namespaceList) {
            this.namespaceList = namespaceList;
            return this;
        }
        public java.util.List<String> getNamespaceList() {
            return this.namespaceList;
        }

    }

    public static class GetOpaStrategyDetailNewResponseBodyData extends TeaModel {
        @NameInMap("AlarmDetail")
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetail alarmDetail;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImageName")
        public java.util.List<String> imageName;

        @NameInMap("Label")
        public java.util.List<String> label;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("MaliciousImage")
        public Boolean maliciousImage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RuleAction")
        public Integer ruleAction;

        @NameInMap("Scopes")
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataScopes> scopes;

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

        public static GetOpaStrategyDetailNewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyData self = new GetOpaStrategyDetailNewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyData setAlarmDetail(GetOpaStrategyDetailNewResponseBodyDataAlarmDetail alarmDetail) {
            this.alarmDetail = alarmDetail;
            return this;
        }
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetail getAlarmDetail() {
            return this.alarmDetail;
        }

        public GetOpaStrategyDetailNewResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetOpaStrategyDetailNewResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetOpaStrategyDetailNewResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetOpaStrategyDetailNewResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOpaStrategyDetailNewResponseBodyData setImageName(java.util.List<String> imageName) {
            this.imageName = imageName;
            return this;
        }
        public java.util.List<String> getImageName() {
            return this.imageName;
        }

        public GetOpaStrategyDetailNewResponseBodyData setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

        public GetOpaStrategyDetailNewResponseBodyData setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetOpaStrategyDetailNewResponseBodyData setMaliciousImage(Boolean maliciousImage) {
            this.maliciousImage = maliciousImage;
            return this;
        }
        public Boolean getMaliciousImage() {
            return this.maliciousImage;
        }

        public GetOpaStrategyDetailNewResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetOpaStrategyDetailNewResponseBodyData setRuleAction(Integer ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public Integer getRuleAction() {
            return this.ruleAction;
        }

        public GetOpaStrategyDetailNewResponseBodyData setScopes(java.util.List<GetOpaStrategyDetailNewResponseBodyDataScopes> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataScopes> getScopes() {
            return this.scopes;
        }

        public GetOpaStrategyDetailNewResponseBodyData setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

        public GetOpaStrategyDetailNewResponseBodyData setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public GetOpaStrategyDetailNewResponseBodyData setStrategyTemplateId(Long strategyTemplateId) {
            this.strategyTemplateId = strategyTemplateId;
            return this;
        }
        public Long getStrategyTemplateId() {
            return this.strategyTemplateId;
        }

        public GetOpaStrategyDetailNewResponseBodyData setUnScanedImage(Boolean unScanedImage) {
            this.unScanedImage = unScanedImage;
            return this;
        }
        public Boolean getUnScanedImage() {
            return this.unScanedImage;
        }

        public GetOpaStrategyDetailNewResponseBodyData setWhiteList(java.util.List<String> whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public java.util.List<String> getWhiteList() {
            return this.whiteList;
        }

    }

}
