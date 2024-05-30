// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaStrategyDetailNewResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetOpaStrategyDetailNewResponseBodyData data;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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
        /**
         * <p>The ID of the baseline check item.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the baseline check item.</p>
         */
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
        /**
         * <p>The information about the baseline check item.</p>
         */
        @NameInMap("Item")
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaselineItem> item;

        /**
         * <p>The risk levels.</p>
         */
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

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRiskItem extends TeaModel {
        /**
         * <p>The ID of the image build risk.</p>
         * <br>
         * <p>>  You can call the [ListImageBuildRiskItem](~~ListImageBuildRiskItem~~) operation to query the ID of the malicious sample.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the image build risk.</p>
         * <br>
         * <p>>  You can call the [ListImageBuildRiskItem](~~ListImageBuildRiskItem~~) operation to query the ID of the malicious sample.</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRiskItem build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRiskItem self = new GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRiskItem();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRiskItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRiskItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRisk extends TeaModel {
        /**
         * <p>The configuration of image build risk.</p>
         */
        @NameInMap("Item")
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRiskItem> item;

        /**
         * <p>The risk levels.</p>
         */
        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRisk build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRisk self = new GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRisk();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRisk setItem(java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRiskItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRiskItem> getItem() {
            return this.item;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRisk setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFileItem extends TeaModel {
        /**
         * <p>The ID of the malicious sample.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the malicious sample.</p>
         */
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
        /**
         * <p>The information about the malicious sample.</p>
         */
        @NameInMap("Item")
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFileItem> item;

        /**
         * <p>The risk levels.</p>
         */
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

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFileItem extends TeaModel {
        /**
         * <p>The ID of the sensitive files.</p>
         * <br>
         * <p>>  You can call the [GetSensitiveDefineRuleConfig](~~GetSensitiveDefineRuleConfig~~) operation to query the ID of the malicious sample.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the sensitive files.</p>
         * <br>
         * <p>>  You can call the [GetSensitiveDefineRuleConfig](https://help.aliyun.com/document_detail/4576877.html) operation to query the ID of the malicious sample.</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFileItem build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFileItem self = new GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFileItem();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFileItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFileItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFile extends TeaModel {
        /**
         * <p>The configuration of sensitive file.</p>
         */
        @NameInMap("Item")
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFileItem> item;

        /**
         * <p>The risk levels.</p>
         */
        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFile build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFile self = new GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFile();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFile setItem(java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFileItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFileItem> getItem() {
            return this.item;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFile setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulItem extends TeaModel {
        /**
         * <p>The ID of the vulnerability.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the vulnerability.</p>
         */
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

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulRiskClass extends TeaModel {
        /**
         * <p>The ID of the vulnerability types. Valid values:</p>
         * <br>
         * <p>*   **cve**: system vulnerability</p>
         * <p>*   **app**: application vulnerability</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **system vulnerability**</p>
         * <p>*   **application vulnerability**</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulRiskClass build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulRiskClass self = new GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulRiskClass();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulRiskClass setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulRiskClass setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVul extends TeaModel {
        /**
         * <p>The information about the vulnerability.</p>
         */
        @NameInMap("Item")
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulItem> item;

        /**
         * <p>Risk type of vulnerability.</p>
         */
        @NameInMap("RiskClass")
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulRiskClass> riskClass;

        /**
         * <p>The risk levels.</p>
         */
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

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVul setRiskClass(java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulRiskClass> riskClass) {
            this.riskClass = riskClass;
            return this;
        }
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataAlarmDetailVulRiskClass> getRiskClass() {
            return this.riskClass;
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
        /**
         * <p>The baseline check configuration.</p>
         */
        @NameInMap("Baseline")
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBaseline baseline;

        /**
         * <p>The configuration of image build risk.</p>
         */
        @NameInMap("BuildRisk")
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRisk buildRisk;

        /**
         * <p>The configuration of malicious samples.</p>
         */
        @NameInMap("MaliciousFile")
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFile maliciousFile;

        /**
         * <p>The configuration of sensitive file.</p>
         */
        @NameInMap("SensitiveFile")
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFile sensitiveFile;

        /**
         * <p>The vulnerability configuration.</p>
         */
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

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetail setBuildRisk(GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRisk buildRisk) {
            this.buildRisk = buildRisk;
            return this;
        }
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailBuildRisk getBuildRisk() {
            return this.buildRisk;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetail setMaliciousFile(GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFile maliciousFile) {
            this.maliciousFile = maliciousFile;
            return this;
        }
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailMaliciousFile getMaliciousFile() {
            return this.maliciousFile;
        }

        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetail setSensitiveFile(GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFile sensitiveFile) {
            this.sensitiveFile = sensitiveFile;
            return this;
        }
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetailSensitiveFile getSensitiveFile() {
            return this.sensitiveFile;
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
        /**
         * <p>The rule instance ID of the cluster.</p>
         */
        @NameInMap("AckPolicyInstanceId")
        public String ackPolicyInstanceId;

        /**
         * <p>Indicates whether all namespaces are included. Valid values:</p>
         * <br>
         * <p>*   **1**: yes</p>
         * <p>*   **0**: no</p>
         */
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The namespaces.</p>
         */
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
        /**
         * <p>The rule configuration.</p>
         */
        @NameInMap("AlarmDetail")
        public GetOpaStrategyDetailNewResponseBodyDataAlarmDetail alarmDetail;

        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The cluster name.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The page number. Default value: **1**. Pages start from page 1.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The image names.</p>
         */
        @NameInMap("ImageName")
        public java.util.List<String> imageName;

        /**
         * <p>The image tags.</p>
         */
        @NameInMap("Label")
        public java.util.List<String> label;

        /**
         * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
         * <br>
         * <p>*   **zh**: Chinese</p>
         * <p>*   **en**: English</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>Indicates whether the rule supports malicious Internet images. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("MaliciousImage")
        public Boolean maliciousImage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The action that is performed when the rule is hit. Valid values:</p>
         * <br>
         * <p>*   **1**: trigger alerts</p>
         * <p>*   **2**: block</p>
         * <p>*   **3**: allow</p>
         */
        @NameInMap("RuleAction")
        public Integer ruleAction;

        /**
         * <p>The application scope.</p>
         */
        @NameInMap("Scopes")
        public java.util.List<GetOpaStrategyDetailNewResponseBodyDataScopes> scopes;

        /**
         * <p>The rule ID.</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        /**
         * <p>The rule name.</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <p>The ID of the rule template.</p>
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
         * <p>The image tags that are added to the whitelist.</p>
         */
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
