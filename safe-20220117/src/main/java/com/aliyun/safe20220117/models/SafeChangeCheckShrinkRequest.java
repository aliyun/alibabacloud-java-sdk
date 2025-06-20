// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeCheckShrinkRequest extends TeaModel {
    @NameInMap("AffectCustomer")
    public String affectCustomer;

    @NameInMap("ApproveFlowParam")
    public SafeChangeCheckShrinkRequestApproveFlowParam approveFlowParam;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("BgCustomTemplateExtraDTO")
    public SafeChangeCheckShrinkRequestBgCustomTemplateExtraDTO bgCustomTemplateExtraDTO;

    @NameInMap("BlockInfos")
    public java.util.List<SafeChangeCheckShrinkRequestBlockInfos> blockInfos;

    @NameInMap("CallBackInfo")
    public SafeChangeCheckShrinkRequestCallBackInfo callBackInfo;

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
    public java.util.List<SafeChangeCheckShrinkRequestChangeTimes> changeTimes;

    @NameInMap("ChangeTitle")
    public String changeTitle;

    @NameInMap("ChangeValidation")
    public String changeValidation;

    @NameInMap("Checker")
    public java.util.List<String> checker;

    @NameInMap("CreatorEmpId")
    public String creatorEmpId;

    @NameInMap("DamagedChangeNotices")
    public java.util.List<SafeChangeCheckShrinkRequestDamagedChangeNotices> damagedChangeNotices;

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
    public String harmNoticeCombineParamShrink;

    @NameInMap("Incidence")
    public String incidence;

    @NameInMap("InfluenceInfo")
    public SafeChangeCheckShrinkRequestInfluenceInfo influenceInfo;

    @NameInMap("Instance")
    public SafeChangeCheckShrinkRequestInstance instance;

    @NameInMap("NeedModifyDoc")
    public String needModifyDoc;

    @NameInMap("OperateEmpNo")
    public String operateEmpNo;

    @NameInMap("Product")
    public java.util.List<SafeChangeCheckShrinkRequestProduct> product;

    @NameInMap("ReleasePackageInfos")
    public java.util.List<SafeChangeCheckShrinkRequestReleasePackageInfos> releasePackageInfos;

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

    public static SafeChangeCheckShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeCheckShrinkRequest self = new SafeChangeCheckShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SafeChangeCheckShrinkRequest setAffectCustomer(String affectCustomer) {
        this.affectCustomer = affectCustomer;
        return this;
    }
    public String getAffectCustomer() {
        return this.affectCustomer;
    }

    public SafeChangeCheckShrinkRequest setApproveFlowParam(SafeChangeCheckShrinkRequestApproveFlowParam approveFlowParam) {
        this.approveFlowParam = approveFlowParam;
        return this;
    }
    public SafeChangeCheckShrinkRequestApproveFlowParam getApproveFlowParam() {
        return this.approveFlowParam;
    }

    public SafeChangeCheckShrinkRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SafeChangeCheckShrinkRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public SafeChangeCheckShrinkRequest setBgCustomTemplateExtraDTO(SafeChangeCheckShrinkRequestBgCustomTemplateExtraDTO bgCustomTemplateExtraDTO) {
        this.bgCustomTemplateExtraDTO = bgCustomTemplateExtraDTO;
        return this;
    }
    public SafeChangeCheckShrinkRequestBgCustomTemplateExtraDTO getBgCustomTemplateExtraDTO() {
        return this.bgCustomTemplateExtraDTO;
    }

    public SafeChangeCheckShrinkRequest setBlockInfos(java.util.List<SafeChangeCheckShrinkRequestBlockInfos> blockInfos) {
        this.blockInfos = blockInfos;
        return this;
    }
    public java.util.List<SafeChangeCheckShrinkRequestBlockInfos> getBlockInfos() {
        return this.blockInfos;
    }

    public SafeChangeCheckShrinkRequest setCallBackInfo(SafeChangeCheckShrinkRequestCallBackInfo callBackInfo) {
        this.callBackInfo = callBackInfo;
        return this;
    }
    public SafeChangeCheckShrinkRequestCallBackInfo getCallBackInfo() {
        return this.callBackInfo;
    }

    public SafeChangeCheckShrinkRequest setChangeDataType(String changeDataType) {
        this.changeDataType = changeDataType;
        return this;
    }
    public String getChangeDataType() {
        return this.changeDataType;
    }

    public SafeChangeCheckShrinkRequest setChangeDesc(String changeDesc) {
        this.changeDesc = changeDesc;
        return this;
    }
    public String getChangeDesc() {
        return this.changeDesc;
    }

    public SafeChangeCheckShrinkRequest setChangeEndTime(Long changeEndTime) {
        this.changeEndTime = changeEndTime;
        return this;
    }
    public Long getChangeEndTime() {
        return this.changeEndTime;
    }

    public SafeChangeCheckShrinkRequest setChangeEnv(String changeEnv) {
        this.changeEnv = changeEnv;
        return this;
    }
    public String getChangeEnv() {
        return this.changeEnv;
    }

    public SafeChangeCheckShrinkRequest setChangeItems(String changeItems) {
        this.changeItems = changeItems;
        return this;
    }
    public String getChangeItems() {
        return this.changeItems;
    }

    public SafeChangeCheckShrinkRequest setChangeObject(String changeObject) {
        this.changeObject = changeObject;
        return this;
    }
    public String getChangeObject() {
        return this.changeObject;
    }

    public SafeChangeCheckShrinkRequest setChangeOptSubType(String changeOptSubType) {
        this.changeOptSubType = changeOptSubType;
        return this;
    }
    public String getChangeOptSubType() {
        return this.changeOptSubType;
    }

    public SafeChangeCheckShrinkRequest setChangeOptType(String changeOptType) {
        this.changeOptType = changeOptType;
        return this;
    }
    public String getChangeOptType() {
        return this.changeOptType;
    }

    public SafeChangeCheckShrinkRequest setChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }
    public String getChangeReason() {
        return this.changeReason;
    }

    public SafeChangeCheckShrinkRequest setChangeRmarks(String changeRmarks) {
        this.changeRmarks = changeRmarks;
        return this;
    }
    public String getChangeRmarks() {
        return this.changeRmarks;
    }

    public SafeChangeCheckShrinkRequest setChangeSchemes(String changeSchemes) {
        this.changeSchemes = changeSchemes;
        return this;
    }
    public String getChangeSchemes() {
        return this.changeSchemes;
    }

    public SafeChangeCheckShrinkRequest setChangeStartTime(Long changeStartTime) {
        this.changeStartTime = changeStartTime;
        return this;
    }
    public Long getChangeStartTime() {
        return this.changeStartTime;
    }

    public SafeChangeCheckShrinkRequest setChangeSubTypeDesc(String changeSubTypeDesc) {
        this.changeSubTypeDesc = changeSubTypeDesc;
        return this;
    }
    public String getChangeSubTypeDesc() {
        return this.changeSubTypeDesc;
    }

    public SafeChangeCheckShrinkRequest setChangeSystem(String changeSystem) {
        this.changeSystem = changeSystem;
        return this;
    }
    public String getChangeSystem() {
        return this.changeSystem;
    }

    public SafeChangeCheckShrinkRequest setChangeTimes(java.util.List<SafeChangeCheckShrinkRequestChangeTimes> changeTimes) {
        this.changeTimes = changeTimes;
        return this;
    }
    public java.util.List<SafeChangeCheckShrinkRequestChangeTimes> getChangeTimes() {
        return this.changeTimes;
    }

    public SafeChangeCheckShrinkRequest setChangeTitle(String changeTitle) {
        this.changeTitle = changeTitle;
        return this;
    }
    public String getChangeTitle() {
        return this.changeTitle;
    }

    public SafeChangeCheckShrinkRequest setChangeValidation(String changeValidation) {
        this.changeValidation = changeValidation;
        return this;
    }
    public String getChangeValidation() {
        return this.changeValidation;
    }

    public SafeChangeCheckShrinkRequest setChecker(java.util.List<String> checker) {
        this.checker = checker;
        return this;
    }
    public java.util.List<String> getChecker() {
        return this.checker;
    }

    public SafeChangeCheckShrinkRequest setCreatorEmpId(String creatorEmpId) {
        this.creatorEmpId = creatorEmpId;
        return this;
    }
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    public SafeChangeCheckShrinkRequest setDamagedChangeNotices(java.util.List<SafeChangeCheckShrinkRequestDamagedChangeNotices> damagedChangeNotices) {
        this.damagedChangeNotices = damagedChangeNotices;
        return this;
    }
    public java.util.List<SafeChangeCheckShrinkRequestDamagedChangeNotices> getDamagedChangeNotices() {
        return this.damagedChangeNotices;
    }

    public SafeChangeCheckShrinkRequest setExecutorEmpId(String executorEmpId) {
        this.executorEmpId = executorEmpId;
        return this;
    }
    public String getExecutorEmpId() {
        return this.executorEmpId;
    }

    public SafeChangeCheckShrinkRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public SafeChangeCheckShrinkRequest setFollower(java.util.List<String> follower) {
        this.follower = follower;
        return this;
    }
    public java.util.List<String> getFollower() {
        return this.follower;
    }

    public SafeChangeCheckShrinkRequest setGrayStatus(String grayStatus) {
        this.grayStatus = grayStatus;
        return this;
    }
    public String getGrayStatus() {
        return this.grayStatus;
    }

    public SafeChangeCheckShrinkRequest setHarmChangeNoticeEnum(String harmChangeNoticeEnum) {
        this.harmChangeNoticeEnum = harmChangeNoticeEnum;
        return this;
    }
    public String getHarmChangeNoticeEnum() {
        return this.harmChangeNoticeEnum;
    }

    public SafeChangeCheckShrinkRequest setHarmNoticeCombineParamShrink(String harmNoticeCombineParamShrink) {
        this.harmNoticeCombineParamShrink = harmNoticeCombineParamShrink;
        return this;
    }
    public String getHarmNoticeCombineParamShrink() {
        return this.harmNoticeCombineParamShrink;
    }

    public SafeChangeCheckShrinkRequest setIncidence(String incidence) {
        this.incidence = incidence;
        return this;
    }
    public String getIncidence() {
        return this.incidence;
    }

    public SafeChangeCheckShrinkRequest setInfluenceInfo(SafeChangeCheckShrinkRequestInfluenceInfo influenceInfo) {
        this.influenceInfo = influenceInfo;
        return this;
    }
    public SafeChangeCheckShrinkRequestInfluenceInfo getInfluenceInfo() {
        return this.influenceInfo;
    }

    public SafeChangeCheckShrinkRequest setInstance(SafeChangeCheckShrinkRequestInstance instance) {
        this.instance = instance;
        return this;
    }
    public SafeChangeCheckShrinkRequestInstance getInstance() {
        return this.instance;
    }

    public SafeChangeCheckShrinkRequest setNeedModifyDoc(String needModifyDoc) {
        this.needModifyDoc = needModifyDoc;
        return this;
    }
    public String getNeedModifyDoc() {
        return this.needModifyDoc;
    }

    public SafeChangeCheckShrinkRequest setOperateEmpNo(String operateEmpNo) {
        this.operateEmpNo = operateEmpNo;
        return this;
    }
    public String getOperateEmpNo() {
        return this.operateEmpNo;
    }

    public SafeChangeCheckShrinkRequest setProduct(java.util.List<SafeChangeCheckShrinkRequestProduct> product) {
        this.product = product;
        return this;
    }
    public java.util.List<SafeChangeCheckShrinkRequestProduct> getProduct() {
        return this.product;
    }

    public SafeChangeCheckShrinkRequest setReleasePackageInfos(java.util.List<SafeChangeCheckShrinkRequestReleasePackageInfos> releasePackageInfos) {
        this.releasePackageInfos = releasePackageInfos;
        return this;
    }
    public java.util.List<SafeChangeCheckShrinkRequestReleasePackageInfos> getReleasePackageInfos() {
        return this.releasePackageInfos;
    }

    public SafeChangeCheckShrinkRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public SafeChangeCheckShrinkRequest setReuseSourceOrderId(String reuseSourceOrderId) {
        this.reuseSourceOrderId = reuseSourceOrderId;
        return this;
    }
    public String getReuseSourceOrderId() {
        return this.reuseSourceOrderId;
    }

    public SafeChangeCheckShrinkRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public SafeChangeCheckShrinkRequest setRollback(String rollback) {
        this.rollback = rollback;
        return this;
    }
    public String getRollback() {
        return this.rollback;
    }

    public SafeChangeCheckShrinkRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public SafeChangeCheckShrinkRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public SafeChangeCheckShrinkRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public SafeChangeCheckShrinkRequest setWhiteType(Integer whiteType) {
        this.whiteType = whiteType;
        return this;
    }
    public Integer getWhiteType() {
        return this.whiteType;
    }

    public static class SafeChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO extends TeaModel {
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

        public static SafeChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO self = new SafeChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO setApproveDesc(String approveDesc) {
            this.approveDesc = approveDesc;
            return this;
        }
        public String getApproveDesc() {
            return this.approveDesc;
        }

        public SafeChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO setApproveTime(Long approveTime) {
            this.approveTime = approveTime;
            return this;
        }
        public Long getApproveTime() {
            return this.approveTime;
        }

        public SafeChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO setApproverId(String approverId) {
            this.approverId = approverId;
            return this;
        }
        public String getApproverId() {
            return this.approverId;
        }

        public SafeChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO setApproverName(String approverName) {
            this.approverName = approverName;
            return this;
        }
        public String getApproverName() {
            return this.approverName;
        }

        public SafeChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO setOpinion(Integer opinion) {
            this.opinion = opinion;
            return this;
        }
        public Integer getOpinion() {
            return this.opinion;
        }

    }

    public static class SafeChangeCheckShrinkRequestApproveFlowParamApproveNodes extends TeaModel {
        @NameInMap("ApproverDTO")
        public java.util.List<SafeChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO> approverDTO;

        @NameInMap("NodeStatus")
        public Integer nodeStatus;

        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("ProcessNodeOrder")
        public Integer processNodeOrder;

        @NameInMap("Strategy")
        public Integer strategy;

        public static SafeChangeCheckShrinkRequestApproveFlowParamApproveNodes build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestApproveFlowParamApproveNodes self = new SafeChangeCheckShrinkRequestApproveFlowParamApproveNodes();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestApproveFlowParamApproveNodes setApproverDTO(java.util.List<SafeChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO> approverDTO) {
            this.approverDTO = approverDTO;
            return this;
        }
        public java.util.List<SafeChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO> getApproverDTO() {
            return this.approverDTO;
        }

        public SafeChangeCheckShrinkRequestApproveFlowParamApproveNodes setNodeStatus(Integer nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        public SafeChangeCheckShrinkRequestApproveFlowParamApproveNodes setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public SafeChangeCheckShrinkRequestApproveFlowParamApproveNodes setProcessNodeOrder(Integer processNodeOrder) {
            this.processNodeOrder = processNodeOrder;
            return this;
        }
        public Integer getProcessNodeOrder() {
            return this.processNodeOrder;
        }

        public SafeChangeCheckShrinkRequestApproveFlowParamApproveNodes setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

    }

    public static class SafeChangeCheckShrinkRequestApproveFlowParam extends TeaModel {
        @NameInMap("ApproveNodes")
        public java.util.List<SafeChangeCheckShrinkRequestApproveFlowParamApproveNodes> approveNodes;

        @NameInMap("FlowStatus")
        public Integer flowStatus;

        public static SafeChangeCheckShrinkRequestApproveFlowParam build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestApproveFlowParam self = new SafeChangeCheckShrinkRequestApproveFlowParam();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestApproveFlowParam setApproveNodes(java.util.List<SafeChangeCheckShrinkRequestApproveFlowParamApproveNodes> approveNodes) {
            this.approveNodes = approveNodes;
            return this;
        }
        public java.util.List<SafeChangeCheckShrinkRequestApproveFlowParamApproveNodes> getApproveNodes() {
            return this.approveNodes;
        }

        public SafeChangeCheckShrinkRequestApproveFlowParam setFlowStatus(Integer flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public Integer getFlowStatus() {
            return this.flowStatus;
        }

    }

    public static class SafeChangeCheckShrinkRequestBgCustomTemplateExtraDTO extends TeaModel {
        @NameInMap("BgCustomTemplateInfo")
        public String bgCustomTemplateInfo;

        public static SafeChangeCheckShrinkRequestBgCustomTemplateExtraDTO build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestBgCustomTemplateExtraDTO self = new SafeChangeCheckShrinkRequestBgCustomTemplateExtraDTO();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestBgCustomTemplateExtraDTO setBgCustomTemplateInfo(String bgCustomTemplateInfo) {
            this.bgCustomTemplateInfo = bgCustomTemplateInfo;
            return this;
        }
        public String getBgCustomTemplateInfo() {
            return this.bgCustomTemplateInfo;
        }

    }

    public static class SafeChangeCheckShrinkRequestBlockInfosHitInfos extends TeaModel {
        @NameInMap("HitInfo")
        public String hitInfo;

        @NameInMap("HitObject")
        public String hitObject;

        @NameInMap("Scope")
        public String scope;

        public static SafeChangeCheckShrinkRequestBlockInfosHitInfos build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestBlockInfosHitInfos self = new SafeChangeCheckShrinkRequestBlockInfosHitInfos();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestBlockInfosHitInfos setHitInfo(String hitInfo) {
            this.hitInfo = hitInfo;
            return this;
        }
        public String getHitInfo() {
            return this.hitInfo;
        }

        public SafeChangeCheckShrinkRequestBlockInfosHitInfos setHitObject(String hitObject) {
            this.hitObject = hitObject;
            return this;
        }
        public String getHitObject() {
            return this.hitObject;
        }

        public SafeChangeCheckShrinkRequestBlockInfosHitInfos setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

    public static class SafeChangeCheckShrinkRequestBlockInfos extends TeaModel {
        @NameInMap("HitInfos")
        public java.util.List<SafeChangeCheckShrinkRequestBlockInfosHitInfos> hitInfos;

        @NameInMap("Id")
        public Long id;

        public static SafeChangeCheckShrinkRequestBlockInfos build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestBlockInfos self = new SafeChangeCheckShrinkRequestBlockInfos();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestBlockInfos setHitInfos(java.util.List<SafeChangeCheckShrinkRequestBlockInfosHitInfos> hitInfos) {
            this.hitInfos = hitInfos;
            return this;
        }
        public java.util.List<SafeChangeCheckShrinkRequestBlockInfosHitInfos> getHitInfos() {
            return this.hitInfos;
        }

        public SafeChangeCheckShrinkRequestBlockInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class SafeChangeCheckShrinkRequestCallBackInfo extends TeaModel {
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

        public static SafeChangeCheckShrinkRequestCallBackInfo build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestCallBackInfo self = new SafeChangeCheckShrinkRequestCallBackInfo();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestCallBackInfo setApi(String api) {
            this.api = api;
            return this;
        }
        public String getApi() {
            return this.api;
        }

        public SafeChangeCheckShrinkRequestCallBackInfo setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public SafeChangeCheckShrinkRequestCallBackInfo setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public SafeChangeCheckShrinkRequestCallBackInfo setPopProduct(String popProduct) {
            this.popProduct = popProduct;
            return this;
        }
        public String getPopProduct() {
            return this.popProduct;
        }

        public SafeChangeCheckShrinkRequestCallBackInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SafeChangeCheckShrinkRequestCallBackInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SafeChangeCheckShrinkRequestCallBackInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SafeChangeCheckShrinkRequestChangeTimes extends TeaModel {
        @NameInMap("ChangeEndTime")
        public Long changeEndTime;

        @NameInMap("ChangeStartTime")
        public Long changeStartTime;

        public static SafeChangeCheckShrinkRequestChangeTimes build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestChangeTimes self = new SafeChangeCheckShrinkRequestChangeTimes();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestChangeTimes setChangeEndTime(Long changeEndTime) {
            this.changeEndTime = changeEndTime;
            return this;
        }
        public Long getChangeEndTime() {
            return this.changeEndTime;
        }

        public SafeChangeCheckShrinkRequestChangeTimes setChangeStartTime(Long changeStartTime) {
            this.changeStartTime = changeStartTime;
            return this;
        }
        public Long getChangeStartTime() {
            return this.changeStartTime;
        }

    }

    public static class SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo extends TeaModel {
        @NameInMap("ExtraInfo")
        public java.util.Map<String, ?> extraInfo;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uid")
        public String uid;

        public static SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo self = new SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo setExtraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        public SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomers extends TeaModel {
        @NameInMap("CustomerInfo")
        public java.util.List<SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo> customerInfo;

        @NameInMap("ProductCode")
        public String productCode;

        public static SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomers build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomers self = new SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomers();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomers setCustomerInfo(java.util.List<SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo> customerInfo) {
            this.customerInfo = customerInfo;
            return this;
        }
        public java.util.List<SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo> getCustomerInfo() {
            return this.customerInfo;
        }

        public SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomers setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class SafeChangeCheckShrinkRequestDamagedChangeNotices extends TeaModel {
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
        public java.util.List<SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomers> sensitiveCustomers;

        @NameInMap("Type")
        public String type;

        public static SafeChangeCheckShrinkRequestDamagedChangeNotices build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestDamagedChangeNotices self = new SafeChangeCheckShrinkRequestDamagedChangeNotices();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestDamagedChangeNotices setBgCancelNoticeContent(String bgCancelNoticeContent) {
            this.bgCancelNoticeContent = bgCancelNoticeContent;
            return this;
        }
        public String getBgCancelNoticeContent() {
            return this.bgCancelNoticeContent;
        }

        public SafeChangeCheckShrinkRequestDamagedChangeNotices setBgCancelNoticeEventId(String bgCancelNoticeEventId) {
            this.bgCancelNoticeEventId = bgCancelNoticeEventId;
            return this;
        }
        public String getBgCancelNoticeEventId() {
            return this.bgCancelNoticeEventId;
        }

        public SafeChangeCheckShrinkRequestDamagedChangeNotices setChannel(java.util.List<String> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<String> getChannel() {
            return this.channel;
        }

        public SafeChangeCheckShrinkRequestDamagedChangeNotices setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SafeChangeCheckShrinkRequestDamagedChangeNotices setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public SafeChangeCheckShrinkRequestDamagedChangeNotices setSensitiveCustomers(java.util.List<SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomers> sensitiveCustomers) {
            this.sensitiveCustomers = sensitiveCustomers;
            return this;
        }
        public java.util.List<SafeChangeCheckShrinkRequestDamagedChangeNoticesSensitiveCustomers> getSensitiveCustomers() {
            return this.sensitiveCustomers;
        }

        public SafeChangeCheckShrinkRequestDamagedChangeNotices setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SafeChangeCheckShrinkRequestInfluenceInfoNoticeInfos extends TeaModel {
        @NameInMap("Channel")
        public java.util.List<String> channel;

        @NameInMap("Content")
        public String content;

        @NameInMap("EventId")
        public String eventId;

        public static SafeChangeCheckShrinkRequestInfluenceInfoNoticeInfos build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestInfluenceInfoNoticeInfos self = new SafeChangeCheckShrinkRequestInfluenceInfoNoticeInfos();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestInfluenceInfoNoticeInfos setChannel(java.util.List<String> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<String> getChannel() {
            return this.channel;
        }

        public SafeChangeCheckShrinkRequestInfluenceInfoNoticeInfos setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SafeChangeCheckShrinkRequestInfluenceInfoNoticeInfos setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

    }

    public static class SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo extends TeaModel {
        @NameInMap("ExtraInfo")
        public java.util.Map<String, ?> extraInfo;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uid")
        public String uid;

        public static SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo self = new SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo setExtraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        public SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers extends TeaModel {
        @NameInMap("CustomerInfo")
        public java.util.List<SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo> customerInfo;

        @NameInMap("ProductCode")
        public String productCode;

        public static SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers self = new SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers setCustomerInfo(java.util.List<SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo> customerInfo) {
            this.customerInfo = customerInfo;
            return this;
        }
        public java.util.List<SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo> getCustomerInfo() {
            return this.customerInfo;
        }

        public SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class SafeChangeCheckShrinkRequestInfluenceInfo extends TeaModel {
        @NameInMap("NoticeInfos")
        public java.util.List<SafeChangeCheckShrinkRequestInfluenceInfoNoticeInfos> noticeInfos;

        @NameInMap("SensitiveCustomers")
        public java.util.List<SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers> sensitiveCustomers;

        public static SafeChangeCheckShrinkRequestInfluenceInfo build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestInfluenceInfo self = new SafeChangeCheckShrinkRequestInfluenceInfo();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestInfluenceInfo setNoticeInfos(java.util.List<SafeChangeCheckShrinkRequestInfluenceInfoNoticeInfos> noticeInfos) {
            this.noticeInfos = noticeInfos;
            return this;
        }
        public java.util.List<SafeChangeCheckShrinkRequestInfluenceInfoNoticeInfos> getNoticeInfos() {
            return this.noticeInfos;
        }

        public SafeChangeCheckShrinkRequestInfluenceInfo setSensitiveCustomers(java.util.List<SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers> sensitiveCustomers) {
            this.sensitiveCustomers = sensitiveCustomers;
            return this;
        }
        public java.util.List<SafeChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers> getSensitiveCustomers() {
            return this.sensitiveCustomers;
        }

    }

    public static class SafeChangeCheckShrinkRequestInstance extends TeaModel {
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

        public static SafeChangeCheckShrinkRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestInstance self = new SafeChangeCheckShrinkRequestInstance();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestInstance setNc(java.util.List<String> nc) {
            this.nc = nc;
            return this;
        }
        public java.util.List<String> getNc() {
            return this.nc;
        }

        public SafeChangeCheckShrinkRequestInstance setUids(java.util.List<String> uids) {
            this.uids = uids;
            return this;
        }
        public java.util.List<String> getUids() {
            return this.uids;
        }

        public SafeChangeCheckShrinkRequestInstance setAttributionApp(java.util.List<String> attributionApp) {
            this.attributionApp = attributionApp;
            return this;
        }
        public java.util.List<String> getAttributionApp() {
            return this.attributionApp;
        }

        public SafeChangeCheckShrinkRequestInstance setInfluenceApp(java.util.List<String> influenceApp) {
            this.influenceApp = influenceApp;
            return this;
        }
        public java.util.List<String> getInfluenceApp() {
            return this.influenceApp;
        }

        public SafeChangeCheckShrinkRequestInstance setInstance(java.util.List<String> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<String> getInstance() {
            return this.instance;
        }

    }

    public static class SafeChangeCheckShrinkRequestProduct extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static SafeChangeCheckShrinkRequestProduct build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestProduct self = new SafeChangeCheckShrinkRequestProduct();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestProduct setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SafeChangeCheckShrinkRequestProduct setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SafeChangeCheckShrinkRequestReleasePackageInfos extends TeaModel {
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ReleasePackage")
        public java.util.List<String> releasePackage;

        public static SafeChangeCheckShrinkRequestReleasePackageInfos build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckShrinkRequestReleasePackageInfos self = new SafeChangeCheckShrinkRequestReleasePackageInfos();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckShrinkRequestReleasePackageInfos setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public SafeChangeCheckShrinkRequestReleasePackageInfos setReleasePackage(java.util.List<String> releasePackage) {
            this.releasePackage = releasePackage;
            return this;
        }
        public java.util.List<String> getReleasePackage() {
            return this.releasePackage;
        }

    }

}
