// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class ChangeCheckRequest extends TeaModel {
    @NameInMap("AffectCustomer")
    public String affectCustomer;

    @NameInMap("ApproveFlowParam")
    public ChangeCheckRequestApproveFlowParam approveFlowParam;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("BgCustomTemplateExtraDTO")
    public ChangeCheckRequestBgCustomTemplateExtraDTO bgCustomTemplateExtraDTO;

    @NameInMap("BgVid")
    public String bgVid;

    @NameInMap("BlockInfos")
    public java.util.List<ChangeCheckRequestBlockInfos> blockInfos;

    @NameInMap("CallBackInfo")
    public ChangeCheckRequestCallBackInfo callBackInfo;

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
    public java.util.List<ChangeCheckRequestChangeTimes> changeTimes;

    @NameInMap("ChangeTitle")
    public String changeTitle;

    @NameInMap("ChangeValidation")
    public String changeValidation;

    @NameInMap("CreatorEmpId")
    public String creatorEmpId;

    @NameInMap("DamagedChangeNotices")
    public java.util.List<ChangeCheckRequestDamagedChangeNotices> damagedChangeNotices;

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
    public ChangeCheckRequestInfluenceInfo influenceInfo;

    @NameInMap("Instance")
    public ChangeCheckRequestInstance instance;

    @NameInMap("NeedModifyDoc")
    public String needModifyDoc;

    @NameInMap("Product")
    public java.util.List<ChangeCheckRequestProduct> product;

    @NameInMap("ReleasePackageInfos")
    public java.util.List<ChangeCheckRequestReleasePackageInfos> releasePackageInfos;

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

    public static ChangeCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckRequest self = new ChangeCheckRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCheckRequest setAffectCustomer(String affectCustomer) {
        this.affectCustomer = affectCustomer;
        return this;
    }
    public String getAffectCustomer() {
        return this.affectCustomer;
    }

    public ChangeCheckRequest setApproveFlowParam(ChangeCheckRequestApproveFlowParam approveFlowParam) {
        this.approveFlowParam = approveFlowParam;
        return this;
    }
    public ChangeCheckRequestApproveFlowParam getApproveFlowParam() {
        return this.approveFlowParam;
    }

    public ChangeCheckRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public ChangeCheckRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public ChangeCheckRequest setBgCustomTemplateExtraDTO(ChangeCheckRequestBgCustomTemplateExtraDTO bgCustomTemplateExtraDTO) {
        this.bgCustomTemplateExtraDTO = bgCustomTemplateExtraDTO;
        return this;
    }
    public ChangeCheckRequestBgCustomTemplateExtraDTO getBgCustomTemplateExtraDTO() {
        return this.bgCustomTemplateExtraDTO;
    }

    public ChangeCheckRequest setBgVid(String bgVid) {
        this.bgVid = bgVid;
        return this;
    }
    public String getBgVid() {
        return this.bgVid;
    }

    public ChangeCheckRequest setBlockInfos(java.util.List<ChangeCheckRequestBlockInfos> blockInfos) {
        this.blockInfos = blockInfos;
        return this;
    }
    public java.util.List<ChangeCheckRequestBlockInfos> getBlockInfos() {
        return this.blockInfos;
    }

    public ChangeCheckRequest setCallBackInfo(ChangeCheckRequestCallBackInfo callBackInfo) {
        this.callBackInfo = callBackInfo;
        return this;
    }
    public ChangeCheckRequestCallBackInfo getCallBackInfo() {
        return this.callBackInfo;
    }

    public ChangeCheckRequest setChangeDataType(String changeDataType) {
        this.changeDataType = changeDataType;
        return this;
    }
    public String getChangeDataType() {
        return this.changeDataType;
    }

    public ChangeCheckRequest setChangeDesc(String changeDesc) {
        this.changeDesc = changeDesc;
        return this;
    }
    public String getChangeDesc() {
        return this.changeDesc;
    }

    public ChangeCheckRequest setChangeEndTime(Long changeEndTime) {
        this.changeEndTime = changeEndTime;
        return this;
    }
    public Long getChangeEndTime() {
        return this.changeEndTime;
    }

    public ChangeCheckRequest setChangeEnv(String changeEnv) {
        this.changeEnv = changeEnv;
        return this;
    }
    public String getChangeEnv() {
        return this.changeEnv;
    }

    public ChangeCheckRequest setChangeItems(String changeItems) {
        this.changeItems = changeItems;
        return this;
    }
    public String getChangeItems() {
        return this.changeItems;
    }

    public ChangeCheckRequest setChangeObject(String changeObject) {
        this.changeObject = changeObject;
        return this;
    }
    public String getChangeObject() {
        return this.changeObject;
    }

    public ChangeCheckRequest setChangeOptSubType(String changeOptSubType) {
        this.changeOptSubType = changeOptSubType;
        return this;
    }
    public String getChangeOptSubType() {
        return this.changeOptSubType;
    }

    public ChangeCheckRequest setChangeOptType(String changeOptType) {
        this.changeOptType = changeOptType;
        return this;
    }
    public String getChangeOptType() {
        return this.changeOptType;
    }

    public ChangeCheckRequest setChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }
    public String getChangeReason() {
        return this.changeReason;
    }

    public ChangeCheckRequest setChangeRmarks(String changeRmarks) {
        this.changeRmarks = changeRmarks;
        return this;
    }
    public String getChangeRmarks() {
        return this.changeRmarks;
    }

    public ChangeCheckRequest setChangeSchemes(String changeSchemes) {
        this.changeSchemes = changeSchemes;
        return this;
    }
    public String getChangeSchemes() {
        return this.changeSchemes;
    }

    public ChangeCheckRequest setChangeStartTime(Long changeStartTime) {
        this.changeStartTime = changeStartTime;
        return this;
    }
    public Long getChangeStartTime() {
        return this.changeStartTime;
    }

    public ChangeCheckRequest setChangeSubTypeDesc(String changeSubTypeDesc) {
        this.changeSubTypeDesc = changeSubTypeDesc;
        return this;
    }
    public String getChangeSubTypeDesc() {
        return this.changeSubTypeDesc;
    }

    public ChangeCheckRequest setChangeSystem(String changeSystem) {
        this.changeSystem = changeSystem;
        return this;
    }
    public String getChangeSystem() {
        return this.changeSystem;
    }

    public ChangeCheckRequest setChangeTimes(java.util.List<ChangeCheckRequestChangeTimes> changeTimes) {
        this.changeTimes = changeTimes;
        return this;
    }
    public java.util.List<ChangeCheckRequestChangeTimes> getChangeTimes() {
        return this.changeTimes;
    }

    public ChangeCheckRequest setChangeTitle(String changeTitle) {
        this.changeTitle = changeTitle;
        return this;
    }
    public String getChangeTitle() {
        return this.changeTitle;
    }

    public ChangeCheckRequest setChangeValidation(String changeValidation) {
        this.changeValidation = changeValidation;
        return this;
    }
    public String getChangeValidation() {
        return this.changeValidation;
    }

    public ChangeCheckRequest setCreatorEmpId(String creatorEmpId) {
        this.creatorEmpId = creatorEmpId;
        return this;
    }
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    public ChangeCheckRequest setDamagedChangeNotices(java.util.List<ChangeCheckRequestDamagedChangeNotices> damagedChangeNotices) {
        this.damagedChangeNotices = damagedChangeNotices;
        return this;
    }
    public java.util.List<ChangeCheckRequestDamagedChangeNotices> getDamagedChangeNotices() {
        return this.damagedChangeNotices;
    }

    public ChangeCheckRequest setExecutorEmpId(String executorEmpId) {
        this.executorEmpId = executorEmpId;
        return this;
    }
    public String getExecutorEmpId() {
        return this.executorEmpId;
    }

    public ChangeCheckRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public ChangeCheckRequest setFollower(java.util.List<String> follower) {
        this.follower = follower;
        return this;
    }
    public java.util.List<String> getFollower() {
        return this.follower;
    }

    public ChangeCheckRequest setGrayStatus(String grayStatus) {
        this.grayStatus = grayStatus;
        return this;
    }
    public String getGrayStatus() {
        return this.grayStatus;
    }

    public ChangeCheckRequest setHarmChangeNoticeEnum(String harmChangeNoticeEnum) {
        this.harmChangeNoticeEnum = harmChangeNoticeEnum;
        return this;
    }
    public String getHarmChangeNoticeEnum() {
        return this.harmChangeNoticeEnum;
    }

    public ChangeCheckRequest setIncidence(String incidence) {
        this.incidence = incidence;
        return this;
    }
    public String getIncidence() {
        return this.incidence;
    }

    public ChangeCheckRequest setInfluenceInfo(ChangeCheckRequestInfluenceInfo influenceInfo) {
        this.influenceInfo = influenceInfo;
        return this;
    }
    public ChangeCheckRequestInfluenceInfo getInfluenceInfo() {
        return this.influenceInfo;
    }

    public ChangeCheckRequest setInstance(ChangeCheckRequestInstance instance) {
        this.instance = instance;
        return this;
    }
    public ChangeCheckRequestInstance getInstance() {
        return this.instance;
    }

    public ChangeCheckRequest setNeedModifyDoc(String needModifyDoc) {
        this.needModifyDoc = needModifyDoc;
        return this;
    }
    public String getNeedModifyDoc() {
        return this.needModifyDoc;
    }

    public ChangeCheckRequest setProduct(java.util.List<ChangeCheckRequestProduct> product) {
        this.product = product;
        return this;
    }
    public java.util.List<ChangeCheckRequestProduct> getProduct() {
        return this.product;
    }

    public ChangeCheckRequest setReleasePackageInfos(java.util.List<ChangeCheckRequestReleasePackageInfos> releasePackageInfos) {
        this.releasePackageInfos = releasePackageInfos;
        return this;
    }
    public java.util.List<ChangeCheckRequestReleasePackageInfos> getReleasePackageInfos() {
        return this.releasePackageInfos;
    }

    public ChangeCheckRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public ChangeCheckRequest setReuseSourceOrderId(String reuseSourceOrderId) {
        this.reuseSourceOrderId = reuseSourceOrderId;
        return this;
    }
    public String getReuseSourceOrderId() {
        return this.reuseSourceOrderId;
    }

    public ChangeCheckRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public ChangeCheckRequest setRollback(String rollback) {
        this.rollback = rollback;
        return this;
    }
    public String getRollback() {
        return this.rollback;
    }

    public ChangeCheckRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public ChangeCheckRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public ChangeCheckRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public ChangeCheckRequest setWhiteType(Integer whiteType) {
        this.whiteType = whiteType;
        return this;
    }
    public Integer getWhiteType() {
        return this.whiteType;
    }

    public static class ChangeCheckRequestApproveFlowParamApproveNodesApproverDTO extends TeaModel {
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

        public static ChangeCheckRequestApproveFlowParamApproveNodesApproverDTO build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestApproveFlowParamApproveNodesApproverDTO self = new ChangeCheckRequestApproveFlowParamApproveNodesApproverDTO();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestApproveFlowParamApproveNodesApproverDTO setApproveDesc(String approveDesc) {
            this.approveDesc = approveDesc;
            return this;
        }
        public String getApproveDesc() {
            return this.approveDesc;
        }

        public ChangeCheckRequestApproveFlowParamApproveNodesApproverDTO setApproveTime(String approveTime) {
            this.approveTime = approveTime;
            return this;
        }
        public String getApproveTime() {
            return this.approveTime;
        }

        public ChangeCheckRequestApproveFlowParamApproveNodesApproverDTO setApproverId(String approverId) {
            this.approverId = approverId;
            return this;
        }
        public String getApproverId() {
            return this.approverId;
        }

        public ChangeCheckRequestApproveFlowParamApproveNodesApproverDTO setApproverName(String approverName) {
            this.approverName = approverName;
            return this;
        }
        public String getApproverName() {
            return this.approverName;
        }

        public ChangeCheckRequestApproveFlowParamApproveNodesApproverDTO setOpinion(Integer opinion) {
            this.opinion = opinion;
            return this;
        }
        public Integer getOpinion() {
            return this.opinion;
        }

    }

    public static class ChangeCheckRequestApproveFlowParamApproveNodes extends TeaModel {
        @NameInMap("ApproverDTO")
        public java.util.List<ChangeCheckRequestApproveFlowParamApproveNodesApproverDTO> approverDTO;

        @NameInMap("NodeStatus")
        public Integer nodeStatus;

        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("ProcessNodeOrder")
        public Integer processNodeOrder;

        @NameInMap("Strategy")
        public Integer strategy;

        public static ChangeCheckRequestApproveFlowParamApproveNodes build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestApproveFlowParamApproveNodes self = new ChangeCheckRequestApproveFlowParamApproveNodes();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestApproveFlowParamApproveNodes setApproverDTO(java.util.List<ChangeCheckRequestApproveFlowParamApproveNodesApproverDTO> approverDTO) {
            this.approverDTO = approverDTO;
            return this;
        }
        public java.util.List<ChangeCheckRequestApproveFlowParamApproveNodesApproverDTO> getApproverDTO() {
            return this.approverDTO;
        }

        public ChangeCheckRequestApproveFlowParamApproveNodes setNodeStatus(Integer nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        public ChangeCheckRequestApproveFlowParamApproveNodes setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public ChangeCheckRequestApproveFlowParamApproveNodes setProcessNodeOrder(Integer processNodeOrder) {
            this.processNodeOrder = processNodeOrder;
            return this;
        }
        public Integer getProcessNodeOrder() {
            return this.processNodeOrder;
        }

        public ChangeCheckRequestApproveFlowParamApproveNodes setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

    }

    public static class ChangeCheckRequestApproveFlowParam extends TeaModel {
        @NameInMap("ApproveNodes")
        public java.util.List<ChangeCheckRequestApproveFlowParamApproveNodes> approveNodes;

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

        public static ChangeCheckRequestApproveFlowParam build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestApproveFlowParam self = new ChangeCheckRequestApproveFlowParam();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestApproveFlowParam setApproveNodes(java.util.List<ChangeCheckRequestApproveFlowParamApproveNodes> approveNodes) {
            this.approveNodes = approveNodes;
            return this;
        }
        public java.util.List<ChangeCheckRequestApproveFlowParamApproveNodes> getApproveNodes() {
            return this.approveNodes;
        }

        public ChangeCheckRequestApproveFlowParam setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public ChangeCheckRequestApproveFlowParam setAuthSign(String authSign) {
            this.authSign = authSign;
            return this;
        }
        public String getAuthSign() {
            return this.authSign;
        }

        public ChangeCheckRequestApproveFlowParam setBgVid(String bgVid) {
            this.bgVid = bgVid;
            return this;
        }
        public String getBgVid() {
            return this.bgVid;
        }

        public ChangeCheckRequestApproveFlowParam setFlowStatus(Integer flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public Integer getFlowStatus() {
            return this.flowStatus;
        }

        public ChangeCheckRequestApproveFlowParam setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class ChangeCheckRequestBgCustomTemplateExtraDTO extends TeaModel {
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

        public static ChangeCheckRequestBgCustomTemplateExtraDTO build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestBgCustomTemplateExtraDTO self = new ChangeCheckRequestBgCustomTemplateExtraDTO();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestBgCustomTemplateExtraDTO setBgCustomTemplate(String bgCustomTemplate) {
            this.bgCustomTemplate = bgCustomTemplate;
            return this;
        }
        public String getBgCustomTemplate() {
            return this.bgCustomTemplate;
        }

        public ChangeCheckRequestBgCustomTemplateExtraDTO setBgCustomTemplateId(Long bgCustomTemplateId) {
            this.bgCustomTemplateId = bgCustomTemplateId;
            return this;
        }
        public Long getBgCustomTemplateId() {
            return this.bgCustomTemplateId;
        }

        public ChangeCheckRequestBgCustomTemplateExtraDTO setBgCustomTemplateInfo(String bgCustomTemplateInfo) {
            this.bgCustomTemplateInfo = bgCustomTemplateInfo;
            return this;
        }
        public String getBgCustomTemplateInfo() {
            return this.bgCustomTemplateInfo;
        }

        public ChangeCheckRequestBgCustomTemplateExtraDTO setBgCustomTemplateTitle(String bgCustomTemplateTitle) {
            this.bgCustomTemplateTitle = bgCustomTemplateTitle;
            return this;
        }
        public String getBgCustomTemplateTitle() {
            return this.bgCustomTemplateTitle;
        }

        public ChangeCheckRequestBgCustomTemplateExtraDTO setBgVid(String bgVid) {
            this.bgVid = bgVid;
            return this;
        }
        public String getBgVid() {
            return this.bgVid;
        }

        public ChangeCheckRequestBgCustomTemplateExtraDTO setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

    }

    public static class ChangeCheckRequestBlockInfosHitInfos extends TeaModel {
        @NameInMap("HitInfo")
        public String hitInfo;

        @NameInMap("HitObject")
        public String hitObject;

        @NameInMap("Scope")
        public String scope;

        public static ChangeCheckRequestBlockInfosHitInfos build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestBlockInfosHitInfos self = new ChangeCheckRequestBlockInfosHitInfos();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestBlockInfosHitInfos setHitInfo(String hitInfo) {
            this.hitInfo = hitInfo;
            return this;
        }
        public String getHitInfo() {
            return this.hitInfo;
        }

        public ChangeCheckRequestBlockInfosHitInfos setHitObject(String hitObject) {
            this.hitObject = hitObject;
            return this;
        }
        public String getHitObject() {
            return this.hitObject;
        }

        public ChangeCheckRequestBlockInfosHitInfos setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

    public static class ChangeCheckRequestBlockInfos extends TeaModel {
        @NameInMap("HitInfos")
        public java.util.List<ChangeCheckRequestBlockInfosHitInfos> hitInfos;

        @NameInMap("Id")
        public Long id;

        public static ChangeCheckRequestBlockInfos build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestBlockInfos self = new ChangeCheckRequestBlockInfos();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestBlockInfos setHitInfos(java.util.List<ChangeCheckRequestBlockInfosHitInfos> hitInfos) {
            this.hitInfos = hitInfos;
            return this;
        }
        public java.util.List<ChangeCheckRequestBlockInfosHitInfos> getHitInfos() {
            return this.hitInfos;
        }

        public ChangeCheckRequestBlockInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ChangeCheckRequestCallBackInfo extends TeaModel {
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

        public static ChangeCheckRequestCallBackInfo build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestCallBackInfo self = new ChangeCheckRequestCallBackInfo();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestCallBackInfo setApi(String api) {
            this.api = api;
            return this;
        }
        public String getApi() {
            return this.api;
        }

        public ChangeCheckRequestCallBackInfo setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public ChangeCheckRequestCallBackInfo setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public ChangeCheckRequestCallBackInfo setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public ChangeCheckRequestCallBackInfo setPopProduct(String popProduct) {
            this.popProduct = popProduct;
            return this;
        }
        public String getPopProduct() {
            return this.popProduct;
        }

        public ChangeCheckRequestCallBackInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ChangeCheckRequestCallBackInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ChangeCheckRequestCallBackInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ChangeCheckRequestChangeTimes extends TeaModel {
        @NameInMap("ChangeEndTime")
        public Long changeEndTime;

        @NameInMap("ChangeStartTime")
        public Long changeStartTime;

        public static ChangeCheckRequestChangeTimes build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestChangeTimes self = new ChangeCheckRequestChangeTimes();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestChangeTimes setChangeEndTime(Long changeEndTime) {
            this.changeEndTime = changeEndTime;
            return this;
        }
        public Long getChangeEndTime() {
            return this.changeEndTime;
        }

        public ChangeCheckRequestChangeTimes setChangeStartTime(Long changeStartTime) {
            this.changeStartTime = changeStartTime;
            return this;
        }
        public Long getChangeStartTime() {
            return this.changeStartTime;
        }

    }

    public static class ChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo extends TeaModel {
        @NameInMap("ExtraInfo")
        public java.util.Map<String, ?> extraInfo;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uid")
        public String uid;

        public static ChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo self = new ChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo setExtraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        public ChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ChangeCheckRequestDamagedChangeNoticesSensitiveCustomers extends TeaModel {
        @NameInMap("CustomerInfo")
        public java.util.List<ChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo> customerInfo;

        @NameInMap("ProductCode")
        public String productCode;

        public static ChangeCheckRequestDamagedChangeNoticesSensitiveCustomers build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestDamagedChangeNoticesSensitiveCustomers self = new ChangeCheckRequestDamagedChangeNoticesSensitiveCustomers();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestDamagedChangeNoticesSensitiveCustomers setCustomerInfo(java.util.List<ChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo> customerInfo) {
            this.customerInfo = customerInfo;
            return this;
        }
        public java.util.List<ChangeCheckRequestDamagedChangeNoticesSensitiveCustomersCustomerInfo> getCustomerInfo() {
            return this.customerInfo;
        }

        public ChangeCheckRequestDamagedChangeNoticesSensitiveCustomers setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class ChangeCheckRequestDamagedChangeNotices extends TeaModel {
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
        public java.util.List<ChangeCheckRequestDamagedChangeNoticesSensitiveCustomers> sensitiveCustomers;

        @NameInMap("Type")
        public String type;

        public static ChangeCheckRequestDamagedChangeNotices build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestDamagedChangeNotices self = new ChangeCheckRequestDamagedChangeNotices();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestDamagedChangeNotices setBgCancelNoticeContent(String bgCancelNoticeContent) {
            this.bgCancelNoticeContent = bgCancelNoticeContent;
            return this;
        }
        public String getBgCancelNoticeContent() {
            return this.bgCancelNoticeContent;
        }

        public ChangeCheckRequestDamagedChangeNotices setBgCancelNoticeEventId(String bgCancelNoticeEventId) {
            this.bgCancelNoticeEventId = bgCancelNoticeEventId;
            return this;
        }
        public String getBgCancelNoticeEventId() {
            return this.bgCancelNoticeEventId;
        }

        public ChangeCheckRequestDamagedChangeNotices setChannel(java.util.List<String> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<String> getChannel() {
            return this.channel;
        }

        public ChangeCheckRequestDamagedChangeNotices setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChangeCheckRequestDamagedChangeNotices setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public ChangeCheckRequestDamagedChangeNotices setSensitiveCustomers(java.util.List<ChangeCheckRequestDamagedChangeNoticesSensitiveCustomers> sensitiveCustomers) {
            this.sensitiveCustomers = sensitiveCustomers;
            return this;
        }
        public java.util.List<ChangeCheckRequestDamagedChangeNoticesSensitiveCustomers> getSensitiveCustomers() {
            return this.sensitiveCustomers;
        }

        public ChangeCheckRequestDamagedChangeNotices setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ChangeCheckRequestInfluenceInfoNoticeInfos extends TeaModel {
        @NameInMap("Channel")
        public java.util.List<String> channel;

        @NameInMap("Content")
        public String content;

        @NameInMap("EventId")
        public String eventId;

        public static ChangeCheckRequestInfluenceInfoNoticeInfos build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestInfluenceInfoNoticeInfos self = new ChangeCheckRequestInfluenceInfoNoticeInfos();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestInfluenceInfoNoticeInfos setChannel(java.util.List<String> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<String> getChannel() {
            return this.channel;
        }

        public ChangeCheckRequestInfluenceInfoNoticeInfos setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChangeCheckRequestInfluenceInfoNoticeInfos setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

    }

    public static class ChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo extends TeaModel {
        @NameInMap("ExtraInfo")
        public java.util.Map<String, ?> extraInfo;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uid")
        public String uid;

        public static ChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo self = new ChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo setExtraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        public ChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ChangeCheckRequestInfluenceInfoSensitiveCustomers extends TeaModel {
        @NameInMap("CustomerInfo")
        public java.util.List<ChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo> customerInfo;

        @NameInMap("ProductCode")
        public String productCode;

        public static ChangeCheckRequestInfluenceInfoSensitiveCustomers build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestInfluenceInfoSensitiveCustomers self = new ChangeCheckRequestInfluenceInfoSensitiveCustomers();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestInfluenceInfoSensitiveCustomers setCustomerInfo(java.util.List<ChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo> customerInfo) {
            this.customerInfo = customerInfo;
            return this;
        }
        public java.util.List<ChangeCheckRequestInfluenceInfoSensitiveCustomersCustomerInfo> getCustomerInfo() {
            return this.customerInfo;
        }

        public ChangeCheckRequestInfluenceInfoSensitiveCustomers setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class ChangeCheckRequestInfluenceInfo extends TeaModel {
        @NameInMap("NoticeInfos")
        public java.util.List<ChangeCheckRequestInfluenceInfoNoticeInfos> noticeInfos;

        @NameInMap("SensitiveCustomers")
        public java.util.List<ChangeCheckRequestInfluenceInfoSensitiveCustomers> sensitiveCustomers;

        public static ChangeCheckRequestInfluenceInfo build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestInfluenceInfo self = new ChangeCheckRequestInfluenceInfo();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestInfluenceInfo setNoticeInfos(java.util.List<ChangeCheckRequestInfluenceInfoNoticeInfos> noticeInfos) {
            this.noticeInfos = noticeInfos;
            return this;
        }
        public java.util.List<ChangeCheckRequestInfluenceInfoNoticeInfos> getNoticeInfos() {
            return this.noticeInfos;
        }

        public ChangeCheckRequestInfluenceInfo setSensitiveCustomers(java.util.List<ChangeCheckRequestInfluenceInfoSensitiveCustomers> sensitiveCustomers) {
            this.sensitiveCustomers = sensitiveCustomers;
            return this;
        }
        public java.util.List<ChangeCheckRequestInfluenceInfoSensitiveCustomers> getSensitiveCustomers() {
            return this.sensitiveCustomers;
        }

    }

    public static class ChangeCheckRequestInstance extends TeaModel {
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

        public static ChangeCheckRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestInstance self = new ChangeCheckRequestInstance();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestInstance setAttributionApp(java.util.List<String> attributionApp) {
            this.attributionApp = attributionApp;
            return this;
        }
        public java.util.List<String> getAttributionApp() {
            return this.attributionApp;
        }

        public ChangeCheckRequestInstance setInfluenceApp(java.util.List<String> influenceApp) {
            this.influenceApp = influenceApp;
            return this;
        }
        public java.util.List<String> getInfluenceApp() {
            return this.influenceApp;
        }

        public ChangeCheckRequestInstance setInstance(java.util.List<String> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<String> getInstance() {
            return this.instance;
        }

        public ChangeCheckRequestInstance setNc(java.util.List<String> nc) {
            this.nc = nc;
            return this;
        }
        public java.util.List<String> getNc() {
            return this.nc;
        }

        public ChangeCheckRequestInstance setUids(java.util.List<String> uids) {
            this.uids = uids;
            return this;
        }
        public java.util.List<String> getUids() {
            return this.uids;
        }

    }

    public static class ChangeCheckRequestProduct extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static ChangeCheckRequestProduct build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestProduct self = new ChangeCheckRequestProduct();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestProduct setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ChangeCheckRequestProduct setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ChangeCheckRequestReleasePackageInfos extends TeaModel {
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ReleasePackage")
        public java.util.List<String> releasePackage;

        public static ChangeCheckRequestReleasePackageInfos build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckRequestReleasePackageInfos self = new ChangeCheckRequestReleasePackageInfos();
            return TeaModel.build(map, self);
        }

        public ChangeCheckRequestReleasePackageInfos setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ChangeCheckRequestReleasePackageInfos setReleasePackage(java.util.List<String> releasePackage) {
            this.releasePackage = releasePackage;
            return this;
        }
        public java.util.List<String> getReleasePackage() {
            return this.releasePackage;
        }

    }

}
