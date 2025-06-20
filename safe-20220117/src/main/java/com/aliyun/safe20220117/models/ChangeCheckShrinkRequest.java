// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class ChangeCheckShrinkRequest extends TeaModel {
    @NameInMap("AffectCustomer")
    public String affectCustomer;

    @NameInMap("ApproveFlowParam")
    public ChangeCheckShrinkRequestApproveFlowParam approveFlowParam;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("BgCustomTemplateExtraDTO")
    public ChangeCheckShrinkRequestBgCustomTemplateExtraDTO bgCustomTemplateExtraDTO;

    @NameInMap("BgVid")
    public String bgVid;

    @NameInMap("BlockInfos")
    public java.util.List<ChangeCheckShrinkRequestBlockInfos> blockInfos;

    @NameInMap("CallBackInfo")
    public ChangeCheckShrinkRequestCallBackInfo callBackInfo;

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
    public java.util.List<ChangeCheckShrinkRequestChangeTimes> changeTimes;

    @NameInMap("ChangeTitle")
    public String changeTitle;

    @NameInMap("ChangeValidation")
    public String changeValidation;

    @NameInMap("CreatorEmpId")
    public String creatorEmpId;

    @NameInMap("DamagedChangeNotices")
    public String damagedChangeNoticesShrink;

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

    @NameInMap("Incidence")
    public String incidence;

    @NameInMap("InfluenceInfo")
    public ChangeCheckShrinkRequestInfluenceInfo influenceInfo;

    @NameInMap("Instance")
    public ChangeCheckShrinkRequestInstance instance;

    @NameInMap("NeedModifyDoc")
    public String needModifyDoc;

    @NameInMap("Product")
    public java.util.List<ChangeCheckShrinkRequestProduct> product;

    @NameInMap("ReleasePackageInfos")
    public java.util.List<ChangeCheckShrinkRequestReleasePackageInfos> releasePackageInfos;

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

    @NameInMap("WhiteType")
    public Integer whiteType;

    public static ChangeCheckShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckShrinkRequest self = new ChangeCheckShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCheckShrinkRequest setAffectCustomer(String affectCustomer) {
        this.affectCustomer = affectCustomer;
        return this;
    }
    public String getAffectCustomer() {
        return this.affectCustomer;
    }

    public ChangeCheckShrinkRequest setApproveFlowParam(ChangeCheckShrinkRequestApproveFlowParam approveFlowParam) {
        this.approveFlowParam = approveFlowParam;
        return this;
    }
    public ChangeCheckShrinkRequestApproveFlowParam getApproveFlowParam() {
        return this.approveFlowParam;
    }

    public ChangeCheckShrinkRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public ChangeCheckShrinkRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public ChangeCheckShrinkRequest setBgCustomTemplateExtraDTO(ChangeCheckShrinkRequestBgCustomTemplateExtraDTO bgCustomTemplateExtraDTO) {
        this.bgCustomTemplateExtraDTO = bgCustomTemplateExtraDTO;
        return this;
    }
    public ChangeCheckShrinkRequestBgCustomTemplateExtraDTO getBgCustomTemplateExtraDTO() {
        return this.bgCustomTemplateExtraDTO;
    }

    public ChangeCheckShrinkRequest setBgVid(String bgVid) {
        this.bgVid = bgVid;
        return this;
    }
    public String getBgVid() {
        return this.bgVid;
    }

    public ChangeCheckShrinkRequest setBlockInfos(java.util.List<ChangeCheckShrinkRequestBlockInfos> blockInfos) {
        this.blockInfos = blockInfos;
        return this;
    }
    public java.util.List<ChangeCheckShrinkRequestBlockInfos> getBlockInfos() {
        return this.blockInfos;
    }

    public ChangeCheckShrinkRequest setCallBackInfo(ChangeCheckShrinkRequestCallBackInfo callBackInfo) {
        this.callBackInfo = callBackInfo;
        return this;
    }
    public ChangeCheckShrinkRequestCallBackInfo getCallBackInfo() {
        return this.callBackInfo;
    }

    public ChangeCheckShrinkRequest setChangeDataType(String changeDataType) {
        this.changeDataType = changeDataType;
        return this;
    }
    public String getChangeDataType() {
        return this.changeDataType;
    }

    public ChangeCheckShrinkRequest setChangeDesc(String changeDesc) {
        this.changeDesc = changeDesc;
        return this;
    }
    public String getChangeDesc() {
        return this.changeDesc;
    }

    public ChangeCheckShrinkRequest setChangeEndTime(Long changeEndTime) {
        this.changeEndTime = changeEndTime;
        return this;
    }
    public Long getChangeEndTime() {
        return this.changeEndTime;
    }

    public ChangeCheckShrinkRequest setChangeEnv(String changeEnv) {
        this.changeEnv = changeEnv;
        return this;
    }
    public String getChangeEnv() {
        return this.changeEnv;
    }

    public ChangeCheckShrinkRequest setChangeItems(String changeItems) {
        this.changeItems = changeItems;
        return this;
    }
    public String getChangeItems() {
        return this.changeItems;
    }

    public ChangeCheckShrinkRequest setChangeObject(String changeObject) {
        this.changeObject = changeObject;
        return this;
    }
    public String getChangeObject() {
        return this.changeObject;
    }

    public ChangeCheckShrinkRequest setChangeOptSubType(String changeOptSubType) {
        this.changeOptSubType = changeOptSubType;
        return this;
    }
    public String getChangeOptSubType() {
        return this.changeOptSubType;
    }

    public ChangeCheckShrinkRequest setChangeOptType(String changeOptType) {
        this.changeOptType = changeOptType;
        return this;
    }
    public String getChangeOptType() {
        return this.changeOptType;
    }

    public ChangeCheckShrinkRequest setChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }
    public String getChangeReason() {
        return this.changeReason;
    }

    public ChangeCheckShrinkRequest setChangeRmarks(String changeRmarks) {
        this.changeRmarks = changeRmarks;
        return this;
    }
    public String getChangeRmarks() {
        return this.changeRmarks;
    }

    public ChangeCheckShrinkRequest setChangeSchemes(String changeSchemes) {
        this.changeSchemes = changeSchemes;
        return this;
    }
    public String getChangeSchemes() {
        return this.changeSchemes;
    }

    public ChangeCheckShrinkRequest setChangeStartTime(Long changeStartTime) {
        this.changeStartTime = changeStartTime;
        return this;
    }
    public Long getChangeStartTime() {
        return this.changeStartTime;
    }

    public ChangeCheckShrinkRequest setChangeSubTypeDesc(String changeSubTypeDesc) {
        this.changeSubTypeDesc = changeSubTypeDesc;
        return this;
    }
    public String getChangeSubTypeDesc() {
        return this.changeSubTypeDesc;
    }

    public ChangeCheckShrinkRequest setChangeSystem(String changeSystem) {
        this.changeSystem = changeSystem;
        return this;
    }
    public String getChangeSystem() {
        return this.changeSystem;
    }

    public ChangeCheckShrinkRequest setChangeTimes(java.util.List<ChangeCheckShrinkRequestChangeTimes> changeTimes) {
        this.changeTimes = changeTimes;
        return this;
    }
    public java.util.List<ChangeCheckShrinkRequestChangeTimes> getChangeTimes() {
        return this.changeTimes;
    }

    public ChangeCheckShrinkRequest setChangeTitle(String changeTitle) {
        this.changeTitle = changeTitle;
        return this;
    }
    public String getChangeTitle() {
        return this.changeTitle;
    }

    public ChangeCheckShrinkRequest setChangeValidation(String changeValidation) {
        this.changeValidation = changeValidation;
        return this;
    }
    public String getChangeValidation() {
        return this.changeValidation;
    }

    public ChangeCheckShrinkRequest setCreatorEmpId(String creatorEmpId) {
        this.creatorEmpId = creatorEmpId;
        return this;
    }
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    public ChangeCheckShrinkRequest setDamagedChangeNoticesShrink(String damagedChangeNoticesShrink) {
        this.damagedChangeNoticesShrink = damagedChangeNoticesShrink;
        return this;
    }
    public String getDamagedChangeNoticesShrink() {
        return this.damagedChangeNoticesShrink;
    }

    public ChangeCheckShrinkRequest setExecutorEmpId(String executorEmpId) {
        this.executorEmpId = executorEmpId;
        return this;
    }
    public String getExecutorEmpId() {
        return this.executorEmpId;
    }

    public ChangeCheckShrinkRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public ChangeCheckShrinkRequest setFollower(java.util.List<String> follower) {
        this.follower = follower;
        return this;
    }
    public java.util.List<String> getFollower() {
        return this.follower;
    }

    public ChangeCheckShrinkRequest setGrayStatus(String grayStatus) {
        this.grayStatus = grayStatus;
        return this;
    }
    public String getGrayStatus() {
        return this.grayStatus;
    }

    public ChangeCheckShrinkRequest setHarmChangeNoticeEnum(String harmChangeNoticeEnum) {
        this.harmChangeNoticeEnum = harmChangeNoticeEnum;
        return this;
    }
    public String getHarmChangeNoticeEnum() {
        return this.harmChangeNoticeEnum;
    }

    public ChangeCheckShrinkRequest setIncidence(String incidence) {
        this.incidence = incidence;
        return this;
    }
    public String getIncidence() {
        return this.incidence;
    }

    public ChangeCheckShrinkRequest setInfluenceInfo(ChangeCheckShrinkRequestInfluenceInfo influenceInfo) {
        this.influenceInfo = influenceInfo;
        return this;
    }
    public ChangeCheckShrinkRequestInfluenceInfo getInfluenceInfo() {
        return this.influenceInfo;
    }

    public ChangeCheckShrinkRequest setInstance(ChangeCheckShrinkRequestInstance instance) {
        this.instance = instance;
        return this;
    }
    public ChangeCheckShrinkRequestInstance getInstance() {
        return this.instance;
    }

    public ChangeCheckShrinkRequest setNeedModifyDoc(String needModifyDoc) {
        this.needModifyDoc = needModifyDoc;
        return this;
    }
    public String getNeedModifyDoc() {
        return this.needModifyDoc;
    }

    public ChangeCheckShrinkRequest setProduct(java.util.List<ChangeCheckShrinkRequestProduct> product) {
        this.product = product;
        return this;
    }
    public java.util.List<ChangeCheckShrinkRequestProduct> getProduct() {
        return this.product;
    }

    public ChangeCheckShrinkRequest setReleasePackageInfos(java.util.List<ChangeCheckShrinkRequestReleasePackageInfos> releasePackageInfos) {
        this.releasePackageInfos = releasePackageInfos;
        return this;
    }
    public java.util.List<ChangeCheckShrinkRequestReleasePackageInfos> getReleasePackageInfos() {
        return this.releasePackageInfos;
    }

    public ChangeCheckShrinkRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public ChangeCheckShrinkRequest setReuseSourceOrderId(String reuseSourceOrderId) {
        this.reuseSourceOrderId = reuseSourceOrderId;
        return this;
    }
    public String getReuseSourceOrderId() {
        return this.reuseSourceOrderId;
    }

    public ChangeCheckShrinkRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public ChangeCheckShrinkRequest setRollback(String rollback) {
        this.rollback = rollback;
        return this;
    }
    public String getRollback() {
        return this.rollback;
    }

    public ChangeCheckShrinkRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public ChangeCheckShrinkRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public ChangeCheckShrinkRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public ChangeCheckShrinkRequest setWhiteType(Integer whiteType) {
        this.whiteType = whiteType;
        return this;
    }
    public Integer getWhiteType() {
        return this.whiteType;
    }

    public static class ChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO extends TeaModel {
        @NameInMap("ApproveDesc")
        public String approveDesc;

        @NameInMap("ApproveTime")
        public String approveTime;

        @NameInMap("ApproverId")
        public String approverId;

        @NameInMap("ApproverName")
        public String approverName;

        @NameInMap("Opinion")
        public Integer opinion;

        public static ChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO self = new ChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO setApproveDesc(String approveDesc) {
            this.approveDesc = approveDesc;
            return this;
        }
        public String getApproveDesc() {
            return this.approveDesc;
        }

        public ChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO setApproveTime(String approveTime) {
            this.approveTime = approveTime;
            return this;
        }
        public String getApproveTime() {
            return this.approveTime;
        }

        public ChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO setApproverId(String approverId) {
            this.approverId = approverId;
            return this;
        }
        public String getApproverId() {
            return this.approverId;
        }

        public ChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO setApproverName(String approverName) {
            this.approverName = approverName;
            return this;
        }
        public String getApproverName() {
            return this.approverName;
        }

        public ChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO setOpinion(Integer opinion) {
            this.opinion = opinion;
            return this;
        }
        public Integer getOpinion() {
            return this.opinion;
        }

    }

    public static class ChangeCheckShrinkRequestApproveFlowParamApproveNodes extends TeaModel {
        @NameInMap("ApproverDTO")
        public java.util.List<ChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO> approverDTO;

        @NameInMap("NodeStatus")
        public Integer nodeStatus;

        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("ProcessNodeOrder")
        public Integer processNodeOrder;

        @NameInMap("Strategy")
        public Integer strategy;

        public static ChangeCheckShrinkRequestApproveFlowParamApproveNodes build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestApproveFlowParamApproveNodes self = new ChangeCheckShrinkRequestApproveFlowParamApproveNodes();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestApproveFlowParamApproveNodes setApproverDTO(java.util.List<ChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO> approverDTO) {
            this.approverDTO = approverDTO;
            return this;
        }
        public java.util.List<ChangeCheckShrinkRequestApproveFlowParamApproveNodesApproverDTO> getApproverDTO() {
            return this.approverDTO;
        }

        public ChangeCheckShrinkRequestApproveFlowParamApproveNodes setNodeStatus(Integer nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        public ChangeCheckShrinkRequestApproveFlowParamApproveNodes setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public ChangeCheckShrinkRequestApproveFlowParamApproveNodes setProcessNodeOrder(Integer processNodeOrder) {
            this.processNodeOrder = processNodeOrder;
            return this;
        }
        public Integer getProcessNodeOrder() {
            return this.processNodeOrder;
        }

        public ChangeCheckShrinkRequestApproveFlowParamApproveNodes setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

    }

    public static class ChangeCheckShrinkRequestApproveFlowParam extends TeaModel {
        @NameInMap("ApproveNodes")
        public java.util.List<ChangeCheckShrinkRequestApproveFlowParamApproveNodes> approveNodes;

        @NameInMap("AuthKey")
        public String authKey;

        @NameInMap("AuthSign")
        public String authSign;

        @NameInMap("BgVid")
        public String bgVid;

        @NameInMap("FlowStatus")
        public Integer flowStatus;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static ChangeCheckShrinkRequestApproveFlowParam build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestApproveFlowParam self = new ChangeCheckShrinkRequestApproveFlowParam();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestApproveFlowParam setApproveNodes(java.util.List<ChangeCheckShrinkRequestApproveFlowParamApproveNodes> approveNodes) {
            this.approveNodes = approveNodes;
            return this;
        }
        public java.util.List<ChangeCheckShrinkRequestApproveFlowParamApproveNodes> getApproveNodes() {
            return this.approveNodes;
        }

        public ChangeCheckShrinkRequestApproveFlowParam setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public ChangeCheckShrinkRequestApproveFlowParam setAuthSign(String authSign) {
            this.authSign = authSign;
            return this;
        }
        public String getAuthSign() {
            return this.authSign;
        }

        public ChangeCheckShrinkRequestApproveFlowParam setBgVid(String bgVid) {
            this.bgVid = bgVid;
            return this;
        }
        public String getBgVid() {
            return this.bgVid;
        }

        public ChangeCheckShrinkRequestApproveFlowParam setFlowStatus(Integer flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public Integer getFlowStatus() {
            return this.flowStatus;
        }

        public ChangeCheckShrinkRequestApproveFlowParam setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class ChangeCheckShrinkRequestBgCustomTemplateExtraDTO extends TeaModel {
        @NameInMap("BgCustomTemplate")
        public String bgCustomTemplate;

        @NameInMap("BgCustomTemplateId")
        public Long bgCustomTemplateId;

        @NameInMap("BgCustomTemplateInfo")
        public String bgCustomTemplateInfo;

        @NameInMap("BgCustomTemplateTitle")
        public String bgCustomTemplateTitle;

        @NameInMap("BgVid")
        public String bgVid;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        public static ChangeCheckShrinkRequestBgCustomTemplateExtraDTO build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestBgCustomTemplateExtraDTO self = new ChangeCheckShrinkRequestBgCustomTemplateExtraDTO();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestBgCustomTemplateExtraDTO setBgCustomTemplate(String bgCustomTemplate) {
            this.bgCustomTemplate = bgCustomTemplate;
            return this;
        }
        public String getBgCustomTemplate() {
            return this.bgCustomTemplate;
        }

        public ChangeCheckShrinkRequestBgCustomTemplateExtraDTO setBgCustomTemplateId(Long bgCustomTemplateId) {
            this.bgCustomTemplateId = bgCustomTemplateId;
            return this;
        }
        public Long getBgCustomTemplateId() {
            return this.bgCustomTemplateId;
        }

        public ChangeCheckShrinkRequestBgCustomTemplateExtraDTO setBgCustomTemplateInfo(String bgCustomTemplateInfo) {
            this.bgCustomTemplateInfo = bgCustomTemplateInfo;
            return this;
        }
        public String getBgCustomTemplateInfo() {
            return this.bgCustomTemplateInfo;
        }

        public ChangeCheckShrinkRequestBgCustomTemplateExtraDTO setBgCustomTemplateTitle(String bgCustomTemplateTitle) {
            this.bgCustomTemplateTitle = bgCustomTemplateTitle;
            return this;
        }
        public String getBgCustomTemplateTitle() {
            return this.bgCustomTemplateTitle;
        }

        public ChangeCheckShrinkRequestBgCustomTemplateExtraDTO setBgVid(String bgVid) {
            this.bgVid = bgVid;
            return this;
        }
        public String getBgVid() {
            return this.bgVid;
        }

        public ChangeCheckShrinkRequestBgCustomTemplateExtraDTO setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

    }

    public static class ChangeCheckShrinkRequestBlockInfosHitInfos extends TeaModel {
        @NameInMap("HitInfo")
        public String hitInfo;

        @NameInMap("HitObject")
        public String hitObject;

        @NameInMap("Scope")
        public String scope;

        public static ChangeCheckShrinkRequestBlockInfosHitInfos build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestBlockInfosHitInfos self = new ChangeCheckShrinkRequestBlockInfosHitInfos();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestBlockInfosHitInfos setHitInfo(String hitInfo) {
            this.hitInfo = hitInfo;
            return this;
        }
        public String getHitInfo() {
            return this.hitInfo;
        }

        public ChangeCheckShrinkRequestBlockInfosHitInfos setHitObject(String hitObject) {
            this.hitObject = hitObject;
            return this;
        }
        public String getHitObject() {
            return this.hitObject;
        }

        public ChangeCheckShrinkRequestBlockInfosHitInfos setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

    public static class ChangeCheckShrinkRequestBlockInfos extends TeaModel {
        @NameInMap("HitInfos")
        public java.util.List<ChangeCheckShrinkRequestBlockInfosHitInfos> hitInfos;

        @NameInMap("Id")
        public Long id;

        public static ChangeCheckShrinkRequestBlockInfos build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestBlockInfos self = new ChangeCheckShrinkRequestBlockInfos();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestBlockInfos setHitInfos(java.util.List<ChangeCheckShrinkRequestBlockInfosHitInfos> hitInfos) {
            this.hitInfos = hitInfos;
            return this;
        }
        public java.util.List<ChangeCheckShrinkRequestBlockInfosHitInfos> getHitInfos() {
            return this.hitInfos;
        }

        public ChangeCheckShrinkRequestBlockInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ChangeCheckShrinkRequestCallBackInfo extends TeaModel {
        @NameInMap("Api")
        public String api;

        @NameInMap("ApiVersion")
        public String apiVersion;

        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("PopProduct")
        public String popProduct;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static ChangeCheckShrinkRequestCallBackInfo build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestCallBackInfo self = new ChangeCheckShrinkRequestCallBackInfo();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestCallBackInfo setApi(String api) {
            this.api = api;
            return this;
        }
        public String getApi() {
            return this.api;
        }

        public ChangeCheckShrinkRequestCallBackInfo setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public ChangeCheckShrinkRequestCallBackInfo setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public ChangeCheckShrinkRequestCallBackInfo setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public ChangeCheckShrinkRequestCallBackInfo setPopProduct(String popProduct) {
            this.popProduct = popProduct;
            return this;
        }
        public String getPopProduct() {
            return this.popProduct;
        }

        public ChangeCheckShrinkRequestCallBackInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ChangeCheckShrinkRequestCallBackInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ChangeCheckShrinkRequestCallBackInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ChangeCheckShrinkRequestChangeTimes extends TeaModel {
        @NameInMap("ChangeEndTime")
        public Long changeEndTime;

        @NameInMap("ChangeStartTime")
        public Long changeStartTime;

        public static ChangeCheckShrinkRequestChangeTimes build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestChangeTimes self = new ChangeCheckShrinkRequestChangeTimes();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestChangeTimes setChangeEndTime(Long changeEndTime) {
            this.changeEndTime = changeEndTime;
            return this;
        }
        public Long getChangeEndTime() {
            return this.changeEndTime;
        }

        public ChangeCheckShrinkRequestChangeTimes setChangeStartTime(Long changeStartTime) {
            this.changeStartTime = changeStartTime;
            return this;
        }
        public Long getChangeStartTime() {
            return this.changeStartTime;
        }

    }

    public static class ChangeCheckShrinkRequestInfluenceInfoNoticeInfos extends TeaModel {
        @NameInMap("Channel")
        public java.util.List<String> channel;

        @NameInMap("Content")
        public String content;

        @NameInMap("EventId")
        public String eventId;

        public static ChangeCheckShrinkRequestInfluenceInfoNoticeInfos build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestInfluenceInfoNoticeInfos self = new ChangeCheckShrinkRequestInfluenceInfoNoticeInfos();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestInfluenceInfoNoticeInfos setChannel(java.util.List<String> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<String> getChannel() {
            return this.channel;
        }

        public ChangeCheckShrinkRequestInfluenceInfoNoticeInfos setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChangeCheckShrinkRequestInfluenceInfoNoticeInfos setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

    }

    public static class ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo extends TeaModel {
        @NameInMap("ExtraInfo")
        public java.util.Map<String, ?> extraInfo;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uid")
        public String uid;

        public static ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo self = new ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo setExtraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        public ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers extends TeaModel {
        @NameInMap("CustomerInfo")
        public java.util.List<ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo> customerInfo;

        @NameInMap("ProductCode")
        public String productCode;

        public static ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers self = new ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers setCustomerInfo(java.util.List<ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo> customerInfo) {
            this.customerInfo = customerInfo;
            return this;
        }
        public java.util.List<ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomersCustomerInfo> getCustomerInfo() {
            return this.customerInfo;
        }

        public ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class ChangeCheckShrinkRequestInfluenceInfo extends TeaModel {
        @NameInMap("NoticeInfos")
        public java.util.List<ChangeCheckShrinkRequestInfluenceInfoNoticeInfos> noticeInfos;

        @NameInMap("SensitiveCustomers")
        public java.util.List<ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers> sensitiveCustomers;

        public static ChangeCheckShrinkRequestInfluenceInfo build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestInfluenceInfo self = new ChangeCheckShrinkRequestInfluenceInfo();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestInfluenceInfo setNoticeInfos(java.util.List<ChangeCheckShrinkRequestInfluenceInfoNoticeInfos> noticeInfos) {
            this.noticeInfos = noticeInfos;
            return this;
        }
        public java.util.List<ChangeCheckShrinkRequestInfluenceInfoNoticeInfos> getNoticeInfos() {
            return this.noticeInfos;
        }

        public ChangeCheckShrinkRequestInfluenceInfo setSensitiveCustomers(java.util.List<ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers> sensitiveCustomers) {
            this.sensitiveCustomers = sensitiveCustomers;
            return this;
        }
        public java.util.List<ChangeCheckShrinkRequestInfluenceInfoSensitiveCustomers> getSensitiveCustomers() {
            return this.sensitiveCustomers;
        }

    }

    public static class ChangeCheckShrinkRequestInstance extends TeaModel {
        @NameInMap("AttributionApp")
        public java.util.List<String> attributionApp;

        @NameInMap("InfluenceApp")
        public java.util.List<String> influenceApp;

        @NameInMap("Instance")
        public java.util.List<String> instance;

        @NameInMap("Nc")
        public java.util.List<String> nc;

        @NameInMap("Uids")
        public java.util.List<String> uids;

        public static ChangeCheckShrinkRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestInstance self = new ChangeCheckShrinkRequestInstance();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestInstance setAttributionApp(java.util.List<String> attributionApp) {
            this.attributionApp = attributionApp;
            return this;
        }
        public java.util.List<String> getAttributionApp() {
            return this.attributionApp;
        }

        public ChangeCheckShrinkRequestInstance setInfluenceApp(java.util.List<String> influenceApp) {
            this.influenceApp = influenceApp;
            return this;
        }
        public java.util.List<String> getInfluenceApp() {
            return this.influenceApp;
        }

        public ChangeCheckShrinkRequestInstance setInstance(java.util.List<String> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<String> getInstance() {
            return this.instance;
        }

        public ChangeCheckShrinkRequestInstance setNc(java.util.List<String> nc) {
            this.nc = nc;
            return this;
        }
        public java.util.List<String> getNc() {
            return this.nc;
        }

        public ChangeCheckShrinkRequestInstance setUids(java.util.List<String> uids) {
            this.uids = uids;
            return this;
        }
        public java.util.List<String> getUids() {
            return this.uids;
        }

    }

    public static class ChangeCheckShrinkRequestProduct extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static ChangeCheckShrinkRequestProduct build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestProduct self = new ChangeCheckShrinkRequestProduct();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestProduct setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ChangeCheckShrinkRequestProduct setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ChangeCheckShrinkRequestReleasePackageInfos extends TeaModel {
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ReleasePackage")
        public java.util.List<String> releasePackage;

        public static ChangeCheckShrinkRequestReleasePackageInfos build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckShrinkRequestReleasePackageInfos self = new ChangeCheckShrinkRequestReleasePackageInfos();
            return TeaModel.build(map, self);
        }

        public ChangeCheckShrinkRequestReleasePackageInfos setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ChangeCheckShrinkRequestReleasePackageInfos setReleasePackage(java.util.List<String> releasePackage) {
            this.releasePackage = releasePackage;
            return this;
        }
        public java.util.List<String> getReleasePackage() {
            return this.releasePackage;
        }

    }

}
