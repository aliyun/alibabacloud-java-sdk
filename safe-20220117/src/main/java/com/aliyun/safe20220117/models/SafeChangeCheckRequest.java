// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeCheckRequest extends TeaModel {
    @NameInMap("AffectCustomer")
    public String affectCustomer;

    @NameInMap("ApproveFlowParam")
    public SafeChangeCheckRequestApproveFlowParam approveFlowParam;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("BgCustomTemplateExtraDTO")
    public SafeChangeCheckRequestBgCustomTemplateExtraDTO bgCustomTemplateExtraDTO;

    @NameInMap("BlockInfos")
    public java.util.List<SafeChangeCheckRequestBlockInfos> blockInfos;

    @NameInMap("CallBackInfo")
    public SafeChangeCheckRequestCallBackInfo callBackInfo;

    @NameInMap("ChangeDataType")
    public String changeDataType;

    @NameInMap("ChangeDesc")
    public String changeDesc;

    @NameInMap("ChangeEndTime")
    public Long changeEndTime;

    @NameInMap("ChangeEnv")
    public String changeEnv;

    @NameInMap("ChangeItems")
    public String changeItems;

    @NameInMap("ChangeObject")
    public String changeObject;

    @NameInMap("ChangeOptSubType")
    public String changeOptSubType;

    @NameInMap("ChangeOptType")
    public String changeOptType;

    @NameInMap("ChangeReason")
    public String changeReason;

    @NameInMap("ChangeRmarks")
    public String changeRmarks;

    @NameInMap("ChangeSchemes")
    public String changeSchemes;

    @NameInMap("ChangeStartTime")
    public Long changeStartTime;

    @NameInMap("ChangeSubTypeDesc")
    public String changeSubTypeDesc;

    @NameInMap("ChangeSystem")
    public String changeSystem;

    @NameInMap("ChangeTimes")
    public java.util.List<SafeChangeCheckRequestChangeTimes> changeTimes;

    @NameInMap("ChangeTitle")
    public String changeTitle;

    @NameInMap("ChangeValidation")
    public String changeValidation;

    @NameInMap("Checker")
    public java.util.List<String> checker;

    @NameInMap("CreatorEmpId")
    public String creatorEmpId;

    @NameInMap("DamagedChangeNotices")
    public java.util.List<SafeChangeCheckRequestDamagedChangeNotices> damagedChangeNotices;

    @NameInMap("ExecutorEmpId")
    public String executorEmpId;

    @NameInMap("ExtraInfo")
    public String extraInfo;

    @NameInMap("Follower")
    public java.util.List<String> follower;

    @NameInMap("GrayStatus")
    public String grayStatus;

    @NameInMap("HarmChangeNoticeEnum")
    public String harmChangeNoticeEnum;

    @NameInMap("HarmNoticeCombineParam")
    public SafeChangeCheckRequestHarmNoticeCombineParam harmNoticeCombineParam;

    @NameInMap("Incidence")
    public String incidence;

    @NameInMap("InfluenceInfo")
    public SafeChangeCheckRequestInfluenceInfo influenceInfo;

    @NameInMap("Instance")
    public SafeChangeCheckRequestInstance instance;

    @NameInMap("NeedModifyDoc")
    public String needModifyDoc;

    @NameInMap("OperateEmpNo")
    public String operateEmpNo;

    @NameInMap("Product")
    public java.util.List<SafeChangeCheckRequestProduct> product;

    @NameInMap("ReleasePackageInfos")
    public java.util.List<SafeChangeCheckRequestReleasePackageInfos> releasePackageInfos;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    @NameInMap("ReuseSourceOrderId")
    public String reuseSourceOrderId;

    @NameInMap("RiskLevel")
    public String riskLevel;

    @NameInMap("Rollback")
    public String rollback;

    @NameInMap("SourceName")
    public String sourceName;

    @NameInMap("SourceOrderId")
    public String sourceOrderId;

    @NameInMap("SourceUrl")
    public String sourceUrl;

    @NameInMap("whiteType")
    public Integer whiteType;

    public static SafeChangeCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeCheckRequest self = new SafeChangeCheckRequest();
        return TeaModel.build(map, self);
    }

    public SafeChangeCheckRequest setAffectCustomer(String affectCustomer) {
        this.affectCustomer = affectCustomer;
        return this;
    }
    public String getAffectCustomer() {
        return this.affectCustomer;
    }

    public SafeChangeCheckRequest setApproveFlowParam(SafeChangeCheckRequestApproveFlowParam approveFlowParam) {
        this.approveFlowParam = approveFlowParam;
        return this;
    }
    public SafeChangeCheckRequestApproveFlowParam getApproveFlowParam() {
        return this.approveFlowParam;
    }

    public SafeChangeCheckRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SafeChangeCheckRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public SafeChangeCheckRequest setBgCustomTemplateExtraDTO(SafeChangeCheckRequestBgCustomTemplateExtraDTO bgCustomTemplateExtraDTO) {
        this.bgCustomTemplateExtraDTO = bgCustomTemplateExtraDTO;
        return this;
    }
    public SafeChangeCheckRequestBgCustomTemplateExtraDTO getBgCustomTemplateExtraDTO() {
        return this.bgCustomTemplateExtraDTO;
    }

    public SafeChangeCheckRequest setBlockInfos(java.util.List<SafeChangeCheckRequestBlockInfos> blockInfos) {
        this.blockInfos = blockInfos;
        return this;
    }
    public java.util.List<SafeChangeCheckRequestBlockInfos> getBlockInfos() {
        return this.blockInfos;
    }

    public SafeChangeCheckRequest setCallBackInfo(SafeChangeCheckRequestCallBackInfo callBackInfo) {
        this.callBackInfo = callBackInfo;
        return this;
    }
    public SafeChangeCheckRequestCallBackInfo getCallBackInfo() {
        return this.callBackInfo;
    }

    public SafeChangeCheckRequest setChangeDataType(String changeDataType) {
        this.changeDataType = changeDataType;
        return this;
    }
    public String getChangeDataType() {
        return this.changeDataType;
    }

    public SafeChangeCheckRequest setChangeDesc(String changeDesc) {
        this.changeDesc = changeDesc;
        return this;
    }
    public String getChangeDesc() {
        return this.changeDesc;
    }

    public SafeChangeCheckRequest setChangeEndTime(Long changeEndTime) {
        this.changeEndTime = changeEndTime;
        return this;
    }
    public Long getChangeEndTime() {
        return this.changeEndTime;
    }

    public SafeChangeCheckRequest setChangeEnv(String changeEnv) {
        this.changeEnv = changeEnv;
        return this;
    }
    public String getChangeEnv() {
        return this.changeEnv;
    }

    public SafeChangeCheckRequest setChangeItems(String changeItems) {
        this.changeItems = changeItems;
        return this;
    }
    public String getChangeItems() {
        return this.changeItems;
    }

    public SafeChangeCheckRequest setChangeObject(String changeObject) {
        this.changeObject = changeObject;
        return this;
    }
    public String getChangeObject() {
        return this.changeObject;
    }

    public SafeChangeCheckRequest setChangeOptSubType(String changeOptSubType) {
        this.changeOptSubType = changeOptSubType;
        return this;
    }
    public String getChangeOptSubType() {
        return this.changeOptSubType;
    }

    public SafeChangeCheckRequest setChangeOptType(String changeOptType) {
        this.changeOptType = changeOptType;
        return this;
    }
    public String getChangeOptType() {
        return this.changeOptType;
    }

    public SafeChangeCheckRequest setChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }
    public String getChangeReason() {
        return this.changeReason;
    }

    public SafeChangeCheckRequest setChangeRmarks(String changeRmarks) {
        this.changeRmarks = changeRmarks;
        return this;
    }
    public String getChangeRmarks() {
        return this.changeRmarks;
    }

    public SafeChangeCheckRequest setChangeSchemes(String changeSchemes) {
        this.changeSchemes = changeSchemes;
        return this;
    }
    public String getChangeSchemes() {
        return this.changeSchemes;
    }

    public SafeChangeCheckRequest setChangeStartTime(Long changeStartTime) {
        this.changeStartTime = changeStartTime;
        return this;
    }
    public Long getChangeStartTime() {
        return this.changeStartTime;
    }

    public SafeChangeCheckRequest setChangeSubTypeDesc(String changeSubTypeDesc) {
        this.changeSubTypeDesc = changeSubTypeDesc;
        return this;
    }
    public String getChangeSubTypeDesc() {
        return this.changeSubTypeDesc;
    }

    public SafeChangeCheckRequest setChangeSystem(String changeSystem) {
        this.changeSystem = changeSystem;
        return this;
    }
    public String getChangeSystem() {
        return this.changeSystem;
    }

    public SafeChangeCheckRequest setChangeTimes(java.util.List<SafeChangeCheckRequestChangeTimes> changeTimes) {
        this.changeTimes = changeTimes;
        return this;
    }
    public java.util.List<SafeChangeCheckRequestChangeTimes> getChangeTimes() {
        return this.changeTimes;
    }

    public SafeChangeCheckRequest setChangeTitle(String changeTitle) {
        this.changeTitle = changeTitle;
        return this;
    }
    public String getChangeTitle() {
        return this.changeTitle;
    }

    public SafeChangeCheckRequest setChangeValidation(String changeValidation) {
        this.changeValidation = changeValidation;
        return this;
    }
    public String getChangeValidation() {
        return this.changeValidation;
    }

    public SafeChangeCheckRequest setChecker(java.util.List<String> checker) {
        this.checker = checker;
        return this;
    }
    public java.util.List<String> getChecker() {
        return this.checker;
    }

    public SafeChangeCheckRequest setCreatorEmpId(String creatorEmpId) {
        this.creatorEmpId = creatorEmpId;
        return this;
    }
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    public SafeChangeCheckRequest setDamagedChangeNotices(java.util.List<SafeChangeCheckRequestDamagedChangeNotices> damagedChangeNotices) {
        this.damagedChangeNotices = damagedChangeNotices;
        return this;
    }
    public java.util.List<SafeChangeCheckRequestDamagedChangeNotices> getDamagedChangeNotices() {
        return this.damagedChangeNotices;
    }

    public SafeChangeCheckRequest setExecutorEmpId(String executorEmpId) {
        this.executorEmpId = executorEmpId;
        return this;
    }
    public String getExecutorEmpId() {
        return this.executorEmpId;
    }

    public SafeChangeCheckRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public SafeChangeCheckRequest setFollower(java.util.List<String> follower) {
        this.follower = follower;
        return this;
    }
    public java.util.List<String> getFollower() {
        return this.follower;
    }

    public SafeChangeCheckRequest setGrayStatus(String grayStatus) {
        this.grayStatus = grayStatus;
        return this;
    }
    public String getGrayStatus() {
        return this.grayStatus;
    }

    public SafeChangeCheckRequest setHarmChangeNoticeEnum(String harmChangeNoticeEnum) {
        this.harmChangeNoticeEnum = harmChangeNoticeEnum;
        return this;
    }
    public String getHarmChangeNoticeEnum() {
        return this.harmChangeNoticeEnum;
    }

    public SafeChangeCheckRequest setHarmNoticeCombineParam(SafeChangeCheckRequestHarmNoticeCombineParam harmNoticeCombineParam) {
        this.harmNoticeCombineParam = harmNoticeCombineParam;
        return this;
    }
    public SafeChangeCheckRequestHarmNoticeCombineParam getHarmNoticeCombineParam() {
        return this.harmNoticeCombineParam;
    }

    public SafeChangeCheckRequest setIncidence(String incidence) {
        this.incidence = incidence;
        return this;
    }
    public String getIncidence() {
        return this.incidence;
    }

    public SafeChangeCheckRequest setInfluenceInfo(SafeChangeCheckRequestInfluenceInfo influenceInfo) {
        this.influenceInfo = influenceInfo;
        return this;
    }
    public SafeChangeCheckRequestInfluenceInfo getInfluenceInfo() {
        return this.influenceInfo;
    }

    public SafeChangeCheckRequest setInstance(SafeChangeCheckRequestInstance instance) {
        this.instance = instance;
        return this;
    }
    public SafeChangeCheckRequestInstance getInstance() {
        return this.instance;
    }

    public SafeChangeCheckRequest setNeedModifyDoc(String needModifyDoc) {
        this.needModifyDoc = needModifyDoc;
        return this;
    }
    public String getNeedModifyDoc() {
        return this.needModifyDoc;
    }

    public SafeChangeCheckRequest setOperateEmpNo(String operateEmpNo) {
        this.operateEmpNo = operateEmpNo;
        return this;
    }
    public String getOperateEmpNo() {
        return this.operateEmpNo;
    }

    public SafeChangeCheckRequest setProduct(java.util.List<SafeChangeCheckRequestProduct> product) {
        this.product = product;
        return this;
    }
    public java.util.List<SafeChangeCheckRequestProduct> getProduct() {
        return this.product;
    }

    public SafeChangeCheckRequest setReleasePackageInfos(java.util.List<SafeChangeCheckRequestReleasePackageInfos> releasePackageInfos) {
        this.releasePackageInfos = releasePackageInfos;
        return this;
    }
    public java.util.List<SafeChangeCheckRequestReleasePackageInfos> getReleasePackageInfos() {
        return this.releasePackageInfos;
    }

    public SafeChangeCheckRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public SafeChangeCheckRequest setReuseSourceOrderId(String reuseSourceOrderId) {
        this.reuseSourceOrderId = reuseSourceOrderId;
        return this;
    }
    public String getReuseSourceOrderId() {
        return this.reuseSourceOrderId;
    }

    public SafeChangeCheckRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public SafeChangeCheckRequest setRollback(String rollback) {
        this.rollback = rollback;
        return this;
    }
    public String getRollback() {
        return this.rollback;
    }

    public SafeChangeCheckRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public SafeChangeCheckRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public SafeChangeCheckRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public SafeChangeCheckRequest setWhiteType(Integer whiteType) {
        this.whiteType = whiteType;
        return this;
    }
    public Integer getWhiteType() {
        return this.whiteType;
    }

    public static class SafeChangeCheckRequestApproveFlowParamApproveNodesApproverDTO extends TeaModel {
        @NameInMap("ApproveDesc")
        public String approveDesc;

        @NameInMap("ApproveTime")
        public Long approveTime;

        @NameInMap("ApproverId")
        public String approverId;

        @NameInMap("ApproverName")
        public String approverName;

        @NameInMap("Opinion")
        public Integer opinion;

        public static SafeChangeCheckRequestApproveFlowParamApproveNodesApproverDTO build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestApproveFlowParamApproveNodesApproverDTO self = new SafeChangeCheckRequestApproveFlowParamApproveNodesApproverDTO();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestApproveFlowParamApproveNodesApproverDTO setApproveDesc(String approveDesc) {
            this.approveDesc = approveDesc;
            return this;
        }
        public String getApproveDesc() {
            return this.approveDesc;
        }

        public SafeChangeCheckRequestApproveFlowParamApproveNodesApproverDTO setApproveTime(Long approveTime) {
            this.approveTime = approveTime;
            return this;
        }
        public Long getApproveTime() {
            return this.approveTime;
        }

        public SafeChangeCheckRequestApproveFlowParamApproveNodesApproverDTO setApproverId(String approverId) {
            this.approverId = approverId;
            return this;
        }
        public String getApproverId() {
            return this.approverId;
        }

        public SafeChangeCheckRequestApproveFlowParamApproveNodesApproverDTO setApproverName(String approverName) {
            this.approverName = approverName;
            return this;
        }
        public String getApproverName() {
            return this.approverName;
        }

        public SafeChangeCheckRequestApproveFlowParamApproveNodesApproverDTO setOpinion(Integer opinion) {
            this.opinion = opinion;
            return this;
        }
        public Integer getOpinion() {
            return this.opinion;
        }

    }

    public static class SafeChangeCheckRequestApproveFlowParamApproveNodes extends TeaModel {
        @NameInMap("ApproverDTO")
        public java.util.List<SafeChangeCheckRequestApproveFlowParamApproveNodesApproverDTO> approverDTO;

        @NameInMap("NodeStatus")
        public Integer nodeStatus;

        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("ProcessNodeOrder")
        public Integer processNodeOrder;

        @NameInMap("Strategy")
        public Integer strategy;

        public static SafeChangeCheckRequestApproveFlowParamApproveNodes build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestApproveFlowParamApproveNodes self = new SafeChangeCheckRequestApproveFlowParamApproveNodes();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestApproveFlowParamApproveNodes setApproverDTO(java.util.List<SafeChangeCheckRequestApproveFlowParamApproveNodesApproverDTO> approverDTO) {
            this.approverDTO = approverDTO;
            return this;
        }
        public java.util.List<SafeChangeCheckRequestApproveFlowParamApproveNodesApproverDTO> getApproverDTO() {
            return this.approverDTO;
        }

        public SafeChangeCheckRequestApproveFlowParamApproveNodes setNodeStatus(Integer nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        public SafeChangeCheckRequestApproveFlowParamApproveNodes setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public SafeChangeCheckRequestApproveFlowParamApproveNodes setProcessNodeOrder(Integer processNodeOrder) {
            this.processNodeOrder = processNodeOrder;
            return this;
        }
        public Integer getProcessNodeOrder() {
            return this.processNodeOrder;
        }

        public SafeChangeCheckRequestApproveFlowParamApproveNodes setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

    }

    public static class SafeChangeCheckRequestApproveFlowParam extends TeaModel {
        @NameInMap("ApproveNodes")
        public java.util.List<SafeChangeCheckRequestApproveFlowParamApproveNodes> approveNodes;

        @NameInMap("FlowStatus")
        public Integer flowStatus;

        public static SafeChangeCheckRequestApproveFlowParam build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestApproveFlowParam self = new SafeChangeCheckRequestApproveFlowParam();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestApproveFlowParam setApproveNodes(java.util.List<SafeChangeCheckRequestApproveFlowParamApproveNodes> approveNodes) {
            this.approveNodes = approveNodes;
            return this;
        }
        public java.util.List<SafeChangeCheckRequestApproveFlowParamApproveNodes> getApproveNodes() {
            return this.approveNodes;
        }

        public SafeChangeCheckRequestApproveFlowParam setFlowStatus(Integer flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public Integer getFlowStatus() {
            return this.flowStatus;
        }

    }

    public static class SafeChangeCheckRequestBgCustomTemplateExtraDTO extends TeaModel {
        @NameInMap("BgCustomTemplateInfo")
        public String bgCustomTemplateInfo;

        public static SafeChangeCheckRequestBgCustomTemplateExtraDTO build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestBgCustomTemplateExtraDTO self = new SafeChangeCheckRequestBgCustomTemplateExtraDTO();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestBgCustomTemplateExtraDTO setBgCustomTemplateInfo(String bgCustomTemplateInfo) {
            this.bgCustomTemplateInfo = bgCustomTemplateInfo;
            return this;
        }
        public String getBgCustomTemplateInfo() {
            return this.bgCustomTemplateInfo;
        }

    }

    public static class SafeChangeCheckRequestBlockInfosHitInfos extends TeaModel {
        @NameInMap("HitInfo")
        public String hitInfo;

        @NameInMap("HitObject")
        public String hitObject;

        @NameInMap("Scope")
        public String scope;

        public static SafeChangeCheckRequestBlockInfosHitInfos build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestBlockInfosHitInfos self = new SafeChangeCheckRequestBlockInfosHitInfos();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestBlockInfosHitInfos setHitInfo(String hitInfo) {
            this.hitInfo = hitInfo;
            return this;
        }
        public String getHitInfo() {
            return this.hitInfo;
        }

        public SafeChangeCheckRequestBlockInfosHitInfos setHitObject(String hitObject) {
            this.hitObject = hitObject;
            return this;
        }
        public String getHitObject() {
            return this.hitObject;
        }

        public SafeChangeCheckRequestBlockInfosHitInfos setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

    public static class SafeChangeCheckRequestBlockInfos extends TeaModel {
        @NameInMap("HitInfos")
        public java.util.List<SafeChangeCheckRequestBlockInfosHitInfos> hitInfos;

        @NameInMap("Id")
        public Long id;

        public static SafeChangeCheckRequestBlockInfos build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestBlockInfos self = new SafeChangeCheckRequestBlockInfos();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestBlockInfos setHitInfos(java.util.List<SafeChangeCheckRequestBlockInfosHitInfos> hitInfos) {
            this.hitInfos = hitInfos;
            return this;
        }
        public java.util.List<SafeChangeCheckRequestBlockInfosHitInfos> getHitInfos() {
            return this.hitInfos;
        }

        public SafeChangeCheckRequestBlockInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class SafeChangeCheckRequestCallBackInfo extends TeaModel {
        @NameInMap("Api")
        public String api;

        @NameInMap("ApiVersion")
        public String apiVersion;

        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("PopProduct")
        public String popProduct;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static SafeChangeCheckRequestCallBackInfo build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestCallBackInfo self = new SafeChangeCheckRequestCallBackInfo();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestCallBackInfo setApi(String api) {
            this.api = api;
            return this;
        }
        public String getApi() {
            return this.api;
        }

        public SafeChangeCheckRequestCallBackInfo setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public SafeChangeCheckRequestCallBackInfo setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public SafeChangeCheckRequestCallBackInfo setPopProduct(String popProduct) {
            this.popProduct = popProduct;
            return this;
        }
        public String getPopProduct() {
            return this.popProduct;
        }

        public SafeChangeCheckRequestCallBackInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SafeChangeCheckRequestCallBackInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SafeChangeCheckRequestCallBackInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SafeChangeCheckRequestChangeTimes extends TeaModel {
        @NameInMap("ChangeEndTime")
        public Long changeEndTime;

        @NameInMap("ChangeStartTime")
        public Long changeStartTime;

        public static SafeChangeCheckRequestChangeTimes build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestChangeTimes self = new SafeChangeCheckRequestChangeTimes();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestChangeTimes setChangeEndTime(Long changeEndTime) {
            this.changeEndTime = changeEndTime;
            return this;
        }
        public Long getChangeEndTime() {
            return this.changeEndTime;
        }

        public SafeChangeCheckRequestChangeTimes setChangeStartTime(Long changeStartTime) {
            this.changeStartTime = changeStartTime;
            return this;
        }
        public Long getChangeStartTime() {
            return this.changeStartTime;
        }

    }

    public static class SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo extends TeaModel {
        @NameInMap("ExtraInfo")
        public java.util.Map<String, ?> extraInfo;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uid")
        public String uid;

        public static SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo self = new SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo setExtraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        public SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomers extends TeaModel {
        @NameInMap("CustomerInfo")
        public java.util.List<SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo> customerInfo;

        @NameInMap("ProductCode")
        public String productCode;

        public static SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomers build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomers self = new SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomers();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomers setCustomerInfo(java.util.List<SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo> customerInfo) {
            this.customerInfo = customerInfo;
            return this;
        }
        public java.util.List<SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo> getCustomerInfo() {
            return this.customerInfo;
        }

        public SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomers setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class SafeChangeCheckRequestDamagedChangeNotices extends TeaModel {
        @NameInMap("BgCancelNoticeContent")
        public String bgCancelNoticeContent;

        @NameInMap("BgCancelNoticeEventId")
        public String bgCancelNoticeEventId;

        @NameInMap("Channel")
        public java.util.List<String> channel;

        @NameInMap("Content")
        public String content;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("SensitiveCustomers")
        public java.util.List<SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomers> sensitiveCustomers;

        @NameInMap("Type")
        public String type;

        public static SafeChangeCheckRequestDamagedChangeNotices build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestDamagedChangeNotices self = new SafeChangeCheckRequestDamagedChangeNotices();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestDamagedChangeNotices setBgCancelNoticeContent(String bgCancelNoticeContent) {
            this.bgCancelNoticeContent = bgCancelNoticeContent;
            return this;
        }
        public String getBgCancelNoticeContent() {
            return this.bgCancelNoticeContent;
        }

        public SafeChangeCheckRequestDamagedChangeNotices setBgCancelNoticeEventId(String bgCancelNoticeEventId) {
            this.bgCancelNoticeEventId = bgCancelNoticeEventId;
            return this;
        }
        public String getBgCancelNoticeEventId() {
            return this.bgCancelNoticeEventId;
        }

        public SafeChangeCheckRequestDamagedChangeNotices setChannel(java.util.List<String> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<String> getChannel() {
            return this.channel;
        }

        public SafeChangeCheckRequestDamagedChangeNotices setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SafeChangeCheckRequestDamagedChangeNotices setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public SafeChangeCheckRequestDamagedChangeNotices setSensitiveCustomers(java.util.List<SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomers> sensitiveCustomers) {
            this.sensitiveCustomers = sensitiveCustomers;
            return this;
        }
        public java.util.List<SafeChangeCheckRequestDamagedChangeNoticesSensitiveCustomers> getSensitiveCustomers() {
            return this.sensitiveCustomers;
        }

        public SafeChangeCheckRequestDamagedChangeNotices setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SafeChangeCheckRequestHarmNoticeCombineParam extends TeaModel {
        @NameInMap("Combine")
        public Boolean combine;

        @NameInMap("CombineMark")
        public String combineMark;

        @NameInMap("CombineRule")
        public String combineRule;

        public static SafeChangeCheckRequestHarmNoticeCombineParam build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestHarmNoticeCombineParam self = new SafeChangeCheckRequestHarmNoticeCombineParam();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestHarmNoticeCombineParam setCombine(Boolean combine) {
            this.combine = combine;
            return this;
        }
        public Boolean getCombine() {
            return this.combine;
        }

        public SafeChangeCheckRequestHarmNoticeCombineParam setCombineMark(String combineMark) {
            this.combineMark = combineMark;
            return this;
        }
        public String getCombineMark() {
            return this.combineMark;
        }

        public SafeChangeCheckRequestHarmNoticeCombineParam setCombineRule(String combineRule) {
            this.combineRule = combineRule;
            return this;
        }
        public String getCombineRule() {
            return this.combineRule;
        }

    }

    public static class SafeChangeCheckRequestInfluenceInfoNoticeInfos extends TeaModel {
        @NameInMap("Channel")
        public java.util.List<String> channel;

        @NameInMap("Content")
        public String content;

        @NameInMap("EventId")
        public String eventId;

        public static SafeChangeCheckRequestInfluenceInfoNoticeInfos build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestInfluenceInfoNoticeInfos self = new SafeChangeCheckRequestInfluenceInfoNoticeInfos();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestInfluenceInfoNoticeInfos setChannel(java.util.List<String> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<String> getChannel() {
            return this.channel;
        }

        public SafeChangeCheckRequestInfluenceInfoNoticeInfos setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SafeChangeCheckRequestInfluenceInfoNoticeInfos setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

    }

    public static class SafeChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo extends TeaModel {
        @NameInMap("ExtraInfo")
        public java.util.Map<String, ?> extraInfo;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uid")
        public String uid;

        public static SafeChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo self = new SafeChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo setExtraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        public SafeChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SafeChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class SafeChangeCheckRequestInfluenceInfoSensitiveCustomers extends TeaModel {
        @NameInMap("CustomerInfo")
        public java.util.List<SafeChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo> customerInfo;

        @NameInMap("ProductCode")
        public String productCode;

        public static SafeChangeCheckRequestInfluenceInfoSensitiveCustomers build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestInfluenceInfoSensitiveCustomers self = new SafeChangeCheckRequestInfluenceInfoSensitiveCustomers();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestInfluenceInfoSensitiveCustomers setCustomerInfo(java.util.List<SafeChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo> customerInfo) {
            this.customerInfo = customerInfo;
            return this;
        }
        public java.util.List<SafeChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo> getCustomerInfo() {
            return this.customerInfo;
        }

        public SafeChangeCheckRequestInfluenceInfoSensitiveCustomers setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class SafeChangeCheckRequestInfluenceInfo extends TeaModel {
        @NameInMap("NoticeInfos")
        public java.util.List<SafeChangeCheckRequestInfluenceInfoNoticeInfos> noticeInfos;

        @NameInMap("SensitiveCustomers")
        public java.util.List<SafeChangeCheckRequestInfluenceInfoSensitiveCustomers> sensitiveCustomers;

        public static SafeChangeCheckRequestInfluenceInfo build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestInfluenceInfo self = new SafeChangeCheckRequestInfluenceInfo();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestInfluenceInfo setNoticeInfos(java.util.List<SafeChangeCheckRequestInfluenceInfoNoticeInfos> noticeInfos) {
            this.noticeInfos = noticeInfos;
            return this;
        }
        public java.util.List<SafeChangeCheckRequestInfluenceInfoNoticeInfos> getNoticeInfos() {
            return this.noticeInfos;
        }

        public SafeChangeCheckRequestInfluenceInfo setSensitiveCustomers(java.util.List<SafeChangeCheckRequestInfluenceInfoSensitiveCustomers> sensitiveCustomers) {
            this.sensitiveCustomers = sensitiveCustomers;
            return this;
        }
        public java.util.List<SafeChangeCheckRequestInfluenceInfoSensitiveCustomers> getSensitiveCustomers() {
            return this.sensitiveCustomers;
        }

    }

    public static class SafeChangeCheckRequestInstance extends TeaModel {
        @NameInMap("Nc")
        public java.util.List<String> nc;

        @NameInMap("Uids")
        public java.util.List<String> uids;

        @NameInMap("attributionApp")
        public java.util.List<String> attributionApp;

        @NameInMap("influenceApp")
        public java.util.List<String> influenceApp;

        @NameInMap("instance")
        public java.util.List<String> instance;

        public static SafeChangeCheckRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestInstance self = new SafeChangeCheckRequestInstance();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestInstance setNc(java.util.List<String> nc) {
            this.nc = nc;
            return this;
        }
        public java.util.List<String> getNc() {
            return this.nc;
        }

        public SafeChangeCheckRequestInstance setUids(java.util.List<String> uids) {
            this.uids = uids;
            return this;
        }
        public java.util.List<String> getUids() {
            return this.uids;
        }

        public SafeChangeCheckRequestInstance setAttributionApp(java.util.List<String> attributionApp) {
            this.attributionApp = attributionApp;
            return this;
        }
        public java.util.List<String> getAttributionApp() {
            return this.attributionApp;
        }

        public SafeChangeCheckRequestInstance setInfluenceApp(java.util.List<String> influenceApp) {
            this.influenceApp = influenceApp;
            return this;
        }
        public java.util.List<String> getInfluenceApp() {
            return this.influenceApp;
        }

        public SafeChangeCheckRequestInstance setInstance(java.util.List<String> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<String> getInstance() {
            return this.instance;
        }

    }

    public static class SafeChangeCheckRequestProduct extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static SafeChangeCheckRequestProduct build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestProduct self = new SafeChangeCheckRequestProduct();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestProduct setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SafeChangeCheckRequestProduct setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SafeChangeCheckRequestReleasePackageInfos extends TeaModel {
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ReleasePackage")
        public java.util.List<String> releasePackage;

        public static SafeChangeCheckRequestReleasePackageInfos build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckRequestReleasePackageInfos self = new SafeChangeCheckRequestReleasePackageInfos();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckRequestReleasePackageInfos setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public SafeChangeCheckRequestReleasePackageInfos setReleasePackage(java.util.List<String> releasePackage) {
            this.releasePackage = releasePackage;
            return this;
        }
        public java.util.List<String> getReleasePackage() {
            return this.releasePackage;
        }

    }

}
