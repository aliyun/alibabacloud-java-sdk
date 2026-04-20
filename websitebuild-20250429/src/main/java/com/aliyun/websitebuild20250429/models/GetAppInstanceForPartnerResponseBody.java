// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppInstanceForPartnerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <strong>example:</strong>
     * <p>dewuApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public GetAppInstanceForPartnerResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static GetAppInstanceForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceForPartnerResponseBody self = new GetAppInstanceForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceForPartnerResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppInstanceForPartnerResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppInstanceForPartnerResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppInstanceForPartnerResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppInstanceForPartnerResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppInstanceForPartnerResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppInstanceForPartnerResponseBody setModule(GetAppInstanceForPartnerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppInstanceForPartnerResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppInstanceForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppInstanceForPartnerResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppInstanceForPartnerResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppInstanceForPartnerResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppInstanceForPartnerResponseBodyModuleAiStaffList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>370196</p>
         */
        @NameInMap("StaffId")
        public String staffId;

        /**
         * <strong>example:</strong>
         * <p>StaffName</p>
         */
        @NameInMap("StaffName")
        public String staffName;

        /**
         * <strong>example:</strong>
         * <p>StaffType</p>
         */
        @NameInMap("StaffType")
        public String staffType;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAppInstanceForPartnerResponseBodyModuleAiStaffList build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleAiStaffList self = new GetAppInstanceForPartnerResponseBodyModuleAiStaffList();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleAiStaffList setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }
        public String getStaffId() {
            return this.staffId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAiStaffList setStaffName(String staffName) {
            this.staffName = staffName;
            return this;
        }
        public String getStaffName() {
            return this.staffName;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAiStaffList setStaffType(String staffType) {
            this.staffType = staffType;
            return this;
        }
        public String getStaffType() {
            return this.staffType;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAiStaffList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec extends TeaModel {
        /**
         * <p>bill</p>
         * 
         * <strong>example:</strong>
         * <p>bilingual</p>
         */
        @NameInMap("Bilingual")
        public Boolean bilingual;

        /**
         * <strong>example:</strong>
         * <p>WS20250801151731000007</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>busincessScope</p>
         * 
         * <strong>example:</strong>
         * <p>scopre</p>
         */
        @NameInMap("BusinessScope")
        public String businessScope;

        /**
         * <strong>example:</strong>
         * <p>style</p>
         */
        @NameInMap("ColorStyle")
        public String colorStyle;

        /**
         * <strong>example:</strong>
         * <p>bvt_test</p>
         */
        @NameInMap("CompanyName")
        public String companyName;

        /**
         * <strong>example:</strong>
         * <p>HongKong</p>
         */
        @NameInMap("DeployArea")
        public String deployArea;

        /**
         * <strong>example:</strong>
         * <p>2022-12-21T08:27:03Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>Wed Sep 10 09:53:35 CST 2025</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>m1zumwgy6u</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>business</p>
         * 
         * <strong>example:</strong>
         * <p>business</p>
         */
        @NameInMap("MainBusiness")
        public String mainBusiness;

        /**
         * <p>website</p>
         * 
         * <strong>example:</strong>
         * <p>website</p>
         */
        @NameInMap("ReferenceWebsite")
        public String referenceWebsite;

        /**
         * <p>sitegolas</p>
         * 
         * <strong>example:</strong>
         * <p>goals</p>
         */
        @NameInMap("SiteGoals")
        public String siteGoals;

        /**
         * <p>language</p>
         * 
         * <strong>example:</strong>
         * <p>sitelanguage</p>
         */
        @NameInMap("SiteLanguage")
        public String siteLanguage;

        /**
         * <p>sitelogo</p>
         * 
         * <strong>example:</strong>
         * <p>logo</p>
         */
        @NameInMap("SiteLogo")
        public String siteLogo;

        /**
         * <p>siteslogan</p>
         * 
         * <strong>example:</strong>
         * <p>slogan</p>
         */
        @NameInMap("SiteSlogan")
        public String siteSlogan;

        /**
         * <p>sitestyle</p>
         * 
         * <strong>example:</strong>
         * <p>style</p>
         */
        @NameInMap("SiteStyle")
        public String siteStyle;

        /**
         * <p>sitetitle</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("SiteTitle")
        public String siteTitle;

        /**
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("SiteType")
        public String siteType;

        /**
         * <p>userid</p>
         * 
         * <strong>example:</strong>
         * <p>userid</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec self = new GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setBilingual(Boolean bilingual) {
            this.bilingual = bilingual;
            return this;
        }
        public Boolean getBilingual() {
            return this.bilingual;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setBusinessScope(String businessScope) {
            this.businessScope = businessScope;
            return this;
        }
        public String getBusinessScope() {
            return this.businessScope;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setColorStyle(String colorStyle) {
            this.colorStyle = colorStyle;
            return this;
        }
        public String getColorStyle() {
            return this.colorStyle;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setDeployArea(String deployArea) {
            this.deployArea = deployArea;
            return this;
        }
        public String getDeployArea() {
            return this.deployArea;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setMainBusiness(String mainBusiness) {
            this.mainBusiness = mainBusiness;
            return this;
        }
        public String getMainBusiness() {
            return this.mainBusiness;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setReferenceWebsite(String referenceWebsite) {
            this.referenceWebsite = referenceWebsite;
            return this;
        }
        public String getReferenceWebsite() {
            return this.referenceWebsite;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setSiteGoals(String siteGoals) {
            this.siteGoals = siteGoals;
            return this;
        }
        public String getSiteGoals() {
            return this.siteGoals;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setSiteLanguage(String siteLanguage) {
            this.siteLanguage = siteLanguage;
            return this;
        }
        public String getSiteLanguage() {
            return this.siteLanguage;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setSiteLogo(String siteLogo) {
            this.siteLogo = siteLogo;
            return this;
        }
        public String getSiteLogo() {
            return this.siteLogo;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setSiteSlogan(String siteSlogan) {
            this.siteSlogan = siteSlogan;
            return this;
        }
        public String getSiteSlogan() {
            return this.siteSlogan;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setSiteStyle(String siteStyle) {
            this.siteStyle = siteStyle;
            return this;
        }
        public String getSiteStyle() {
            return this.siteStyle;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setSiteTitle(String siteTitle) {
            this.siteTitle = siteTitle;
            return this;
        }
        public String getSiteTitle() {
            return this.siteTitle;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setSiteType(String siteType) {
            this.siteType = siteType;
            return this;
        }
        public String getSiteType() {
            return this.siteType;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressActions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BeginDialogue</p>
         */
        @NameInMap("ActionKey")
        public String actionKey;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("ActionText")
        public String actionText;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("Href")
        public String href;

        public static GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressActions build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressActions self = new GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressActions();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressActions setActionKey(String actionKey) {
            this.actionKey = actionKey;
            return this;
        }
        public String getActionKey() {
            return this.actionKey;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressActions setActionText(String actionText) {
            this.actionText = actionText;
            return this;
        }
        public String getActionText() {
            return this.actionText;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressActions setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressActions setHref(String href) {
            this.href = href;
            return this;
        }
        public String getHref() {
            return this.href;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressDashboardActions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CollectedNumber</p>
         */
        @NameInMap("ActionKey")
        public String actionKey;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("ActionText")
        public String actionText;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("Href")
        public String href;

        public static GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressDashboardActions build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressDashboardActions self = new GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressDashboardActions();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressDashboardActions setActionKey(String actionKey) {
            this.actionKey = actionKey;
            return this;
        }
        public String getActionKey() {
            return this.actionKey;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressDashboardActions setActionText(String actionText) {
            this.actionText = actionText;
            return this;
        }
        public String getActionText() {
            return this.actionText;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressDashboardActions setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressDashboardActions setHref(String href) {
            this.href = href;
            return this;
        }
        public String getHref() {
            return this.href;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress extends TeaModel {
        @NameInMap("Actions")
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressActions> actions;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("AiCustomerConfigUrl")
        public String aiCustomerConfigUrl;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("AiDesignUrl")
        public String aiDesignUrl;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("AppPublishUrl")
        public String appPublishUrl;

        @NameInMap("DashboardActions")
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressDashboardActions> dashboardActions;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("DesignUrl")
        public String designUrl;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("InstanceLoginUrl")
        public String instanceLoginUrl;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("RenewBuyUrl")
        public String renewBuyUrl;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("ServerDeliveryUrl")
        public String serverDeliveryUrl;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("UpgradeBuyUrl")
        public String upgradeBuyUrl;

        public static GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress self = new GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress setActions(java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressActions> getActions() {
            return this.actions;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress setAiCustomerConfigUrl(String aiCustomerConfigUrl) {
            this.aiCustomerConfigUrl = aiCustomerConfigUrl;
            return this;
        }
        public String getAiCustomerConfigUrl() {
            return this.aiCustomerConfigUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress setAiDesignUrl(String aiDesignUrl) {
            this.aiDesignUrl = aiDesignUrl;
            return this;
        }
        public String getAiDesignUrl() {
            return this.aiDesignUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress setAppPublishUrl(String appPublishUrl) {
            this.appPublishUrl = appPublishUrl;
            return this;
        }
        public String getAppPublishUrl() {
            return this.appPublishUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress setDashboardActions(java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressDashboardActions> dashboardActions) {
            this.dashboardActions = dashboardActions;
            return this;
        }
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppOperationAddressDashboardActions> getDashboardActions() {
            return this.dashboardActions;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress setDesignUrl(String designUrl) {
            this.designUrl = designUrl;
            return this;
        }
        public String getDesignUrl() {
            return this.designUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress setInstanceLoginUrl(String instanceLoginUrl) {
            this.instanceLoginUrl = instanceLoginUrl;
            return this;
        }
        public String getInstanceLoginUrl() {
            return this.instanceLoginUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress setRenewBuyUrl(String renewBuyUrl) {
            this.renewBuyUrl = renewBuyUrl;
            return this;
        }
        public String getRenewBuyUrl() {
            return this.renewBuyUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress setServerDeliveryUrl(String serverDeliveryUrl) {
            this.serverDeliveryUrl = serverDeliveryUrl;
            return this;
        }
        public String getServerDeliveryUrl() {
            return this.serverDeliveryUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress setUpgradeBuyUrl(String upgradeBuyUrl) {
            this.upgradeBuyUrl = upgradeBuyUrl;
            return this;
        }
        public String getUpgradeBuyUrl() {
            return this.upgradeBuyUrl;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleAppServiceListGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d75fvq3ctk</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>mda-sb037wmidshg3w9v.mp4</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>QrCode</p>
         * 
         * <strong>example:</strong>
         * <p>qrcode</p>
         */
        @NameInMap("QrCode")
        public String qrCode;

        /**
         * <p>dingtalk wx...</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="https://static.yipigai.cn/timuocr/tmp_57bc9cb3be1075f4e5cdae87f5cbb86abc54a694aaf10965.jpg">https://static.yipigai.cn/timuocr/tmp_57bc9cb3be1075f4e5cdae87f5cbb86abc54a694aaf10965.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetAppInstanceForPartnerResponseBodyModuleAppServiceListGroup build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleAppServiceListGroup self = new GetAppInstanceForPartnerResponseBodyModuleAppServiceListGroup();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListGroup setQrCode(String qrCode) {
            this.qrCode = qrCode;
            return this;
        }
        public String getQrCode() {
            return this.qrCode;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListGroup setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList extends TeaModel {
        @NameInMap("Children")
        public java.util.List<?> children;

        /**
         * <strong>example:</strong>
         * <p>FinalStepNo</p>
         */
        @NameInMap("FinalStepNo")
        public Integer finalStepNo;

        /**
         * <strong>example:</strong>
         * <p>2023-01-13T07:58:12Z</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>IsContainerNode</p>
         * 
         * <strong>example:</strong>
         * <p>IsContainerNode</p>
         */
        @NameInMap("IsContainerNode")
        public Boolean isContainerNode;

        /**
         * <strong>example:</strong>
         * <p>2927b500-c4e2-4241-bacf-0a2991c4be12</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <strong>example:</strong>
         * <p>NodeStatus</p>
         */
        @NameInMap("NodeStatus")
        public String nodeStatus;

        /**
         * <strong>example:</strong>
         * <p>OperatorRole</p>
         */
        @NameInMap("OperatorRole")
        public String operatorRole;

        /**
         * <strong>example:</strong>
         * <p>dpYLaezmVNRMGX56Cg4gLjrrVrMqPxX6</p>
         */
        @NameInMap("ParentNodeId")
        public String parentNodeId;

        /**
         * <strong>example:</strong>
         * <p>StepNo</p>
         */
        @NameInMap("StepNo")
        public Integer stepNo;

        public static GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList self = new GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList setChildren(java.util.List<?> children) {
            this.children = children;
            return this;
        }
        public java.util.List<?> getChildren() {
            return this.children;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList setFinalStepNo(Integer finalStepNo) {
            this.finalStepNo = finalStepNo;
            return this;
        }
        public Integer getFinalStepNo() {
            return this.finalStepNo;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList setIsContainerNode(Boolean isContainerNode) {
            this.isContainerNode = isContainerNode;
            return this;
        }
        public Boolean getIsContainerNode() {
            return this.isContainerNode;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList setOperatorRole(String operatorRole) {
            this.operatorRole = operatorRole;
            return this;
        }
        public String getOperatorRole() {
            return this.operatorRole;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList setParentNodeId(String parentNodeId) {
            this.parentNodeId = parentNodeId;
            return this;
        }
        public String getParentNodeId() {
            return this.parentNodeId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList setStepNo(Integer stepNo) {
            this.stepNo = stepNo;
            return this;
        }
        public Integer getStepNo() {
            return this.stepNo;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressActions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CollectedNumber</p>
         */
        @NameInMap("ActionKey")
        public String actionKey;

        /**
         * <strong>example:</strong>
         * <p>ActionText</p>
         */
        @NameInMap("ActionText")
        public String actionText;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>Href</p>
         */
        @NameInMap("Href")
        public String href;

        public static GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressActions build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressActions self = new GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressActions();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressActions setActionKey(String actionKey) {
            this.actionKey = actionKey;
            return this;
        }
        public String getActionKey() {
            return this.actionKey;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressActions setActionText(String actionText) {
            this.actionText = actionText;
            return this;
        }
        public String getActionText() {
            return this.actionText;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressActions setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressActions setHref(String href) {
            this.href = href;
            return this;
        }
        public String getHref() {
            return this.href;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressDashboardActions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AbortDialogue</p>
         */
        @NameInMap("ActionKey")
        public String actionKey;

        /**
         * <strong>example:</strong>
         * <p>ActionText</p>
         */
        @NameInMap("ActionText")
        public String actionText;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>Href</p>
         */
        @NameInMap("Href")
        public String href;

        public static GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressDashboardActions build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressDashboardActions self = new GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressDashboardActions();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressDashboardActions setActionKey(String actionKey) {
            this.actionKey = actionKey;
            return this;
        }
        public String getActionKey() {
            return this.actionKey;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressDashboardActions setActionText(String actionText) {
            this.actionText = actionText;
            return this;
        }
        public String getActionText() {
            return this.actionText;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressDashboardActions setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressDashboardActions setHref(String href) {
            this.href = href;
            return this;
        }
        public String getHref() {
            return this.href;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress extends TeaModel {
        @NameInMap("Actions")
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressActions> actions;

        /**
         * <strong>example:</strong>
         * <p>AiCustomerConfigUrl</p>
         */
        @NameInMap("AiCustomerConfigUrl")
        public String aiCustomerConfigUrl;

        /**
         * <strong>example:</strong>
         * <p>AiDesignUrl</p>
         */
        @NameInMap("AiDesignUrl")
        public String aiDesignUrl;

        /**
         * <strong>example:</strong>
         * <p>AppPublishUrl</p>
         */
        @NameInMap("AppPublishUrl")
        public String appPublishUrl;

        @NameInMap("DashboardActions")
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressDashboardActions> dashboardActions;

        /**
         * <strong>example:</strong>
         * <p>DesignUrl</p>
         */
        @NameInMap("DesignUrl")
        public String designUrl;

        /**
         * <strong>example:</strong>
         * <p>InstanceLoginUrl</p>
         */
        @NameInMap("InstanceLoginUrl")
        public String instanceLoginUrl;

        /**
         * <strong>example:</strong>
         * <p>renewBuyUrl</p>
         */
        @NameInMap("RenewBuyUrl")
        public String renewBuyUrl;

        /**
         * <strong>example:</strong>
         * <p>ServerDeliveryUrl</p>
         */
        @NameInMap("ServerDeliveryUrl")
        public String serverDeliveryUrl;

        /**
         * <strong>example:</strong>
         * <p>UpgradeBuyUrl</p>
         */
        @NameInMap("UpgradeBuyUrl")
        public String upgradeBuyUrl;

        public static GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress self = new GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress setActions(java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressActions> getActions() {
            return this.actions;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress setAiCustomerConfigUrl(String aiCustomerConfigUrl) {
            this.aiCustomerConfigUrl = aiCustomerConfigUrl;
            return this;
        }
        public String getAiCustomerConfigUrl() {
            return this.aiCustomerConfigUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress setAiDesignUrl(String aiDesignUrl) {
            this.aiDesignUrl = aiDesignUrl;
            return this;
        }
        public String getAiDesignUrl() {
            return this.aiDesignUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress setAppPublishUrl(String appPublishUrl) {
            this.appPublishUrl = appPublishUrl;
            return this;
        }
        public String getAppPublishUrl() {
            return this.appPublishUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress setDashboardActions(java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressDashboardActions> dashboardActions) {
            this.dashboardActions = dashboardActions;
            return this;
        }
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddressDashboardActions> getDashboardActions() {
            return this.dashboardActions;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress setDesignUrl(String designUrl) {
            this.designUrl = designUrl;
            return this;
        }
        public String getDesignUrl() {
            return this.designUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress setInstanceLoginUrl(String instanceLoginUrl) {
            this.instanceLoginUrl = instanceLoginUrl;
            return this;
        }
        public String getInstanceLoginUrl() {
            return this.instanceLoginUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress setRenewBuyUrl(String renewBuyUrl) {
            this.renewBuyUrl = renewBuyUrl;
            return this;
        }
        public String getRenewBuyUrl() {
            return this.renewBuyUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress setServerDeliveryUrl(String serverDeliveryUrl) {
            this.serverDeliveryUrl = serverDeliveryUrl;
            return this;
        }
        public String getServerDeliveryUrl() {
            return this.serverDeliveryUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress setUpgradeBuyUrl(String upgradeBuyUrl) {
            this.upgradeBuyUrl = upgradeBuyUrl;
            return this;
        }
        public String getUpgradeBuyUrl() {
            return this.upgradeBuyUrl;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>WS20250801003834000003</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>DesignType</p>
         */
        @NameInMap("DesignType")
        public String designType;

        /**
         * <strong>example:</strong>
         * <p>DesignTypeText</p>
         */
        @NameInMap("DesignTypeText")
        public String designTypeText;

        /**
         * <strong>example:</strong>
         * <p>1620711265000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>Mon Sep 25 14:48:49 CST 2023</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>108232</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>LxInstanceId</p>
         */
        @NameInMap("LxInstanceId")
        public String lxInstanceId;

        /**
         * <strong>example:</strong>
         * <p>256146659280026</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ServiceSpec")
        public String serviceSpec;

        /**
         * <strong>example:</strong>
         * <p>ServiceSpecText</p>
         */
        @NameInMap("ServiceSpecText")
        public String serviceSpecText;

        @NameInMap("UpgradeStatus")
        public String upgradeStatus;

        public static GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile self = new GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile setDesignType(String designType) {
            this.designType = designType;
            return this;
        }
        public String getDesignType() {
            return this.designType;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile setDesignTypeText(String designTypeText) {
            this.designTypeText = designTypeText;
            return this;
        }
        public String getDesignTypeText() {
            return this.designTypeText;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile setLxInstanceId(String lxInstanceId) {
            this.lxInstanceId = lxInstanceId;
            return this;
        }
        public String getLxInstanceId() {
            return this.lxInstanceId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile setServiceSpec(String serviceSpec) {
            this.serviceSpec = serviceSpec;
            return this;
        }
        public String getServiceSpec() {
            return this.serviceSpec;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile setServiceSpecText(String serviceSpecText) {
            this.serviceSpecText = serviceSpecText;
            return this;
        }
        public String getServiceSpecText() {
            return this.serviceSpecText;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile setUpgradeStatus(String upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
            return this;
        }
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleAppServiceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>WS20251211153330000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>fase</p>
         */
        @NameInMap("Deleted")
        public Integer deleted;

        /**
         * <strong>example:</strong>
         * <p>2025-07-18T02:23:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>esp bizId</p>
         * 
         * <strong>example:</strong>
         * <p>EspBizId</p>
         */
        @NameInMap("EspBizId")
        public String espBizId;

        /**
         * <strong>example:</strong>
         * <p>2025-07-30T02:08:40Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>Tue Sep 09 10:27:49 CST 2025</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Group")
        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListGroup group;

        /**
         * <strong>example:</strong>
         * <p>InstanceBizId</p>
         */
        @NameInMap("InstanceBizId")
        public String instanceBizId;

        /**
         * <strong>example:</strong>
         * <p>19609820.png</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("NodeList")
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList> nodeList;

        @NameInMap("OperationAddress")
        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress operationAddress;

        /**
         * <strong>example:</strong>
         * <p>253790948890026</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("Profile")
        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile profile;

        /**
         * <strong>example:</strong>
         * <p>WEBSITE_DESIGN</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <strong>example:</strong>
         * <p>ServiceTypeText</p>
         */
        @NameInMap("ServiceTypeText")
        public String serviceTypeText;

        /**
         * <strong>example:</strong>
         * <p>Slug</p>
         */
        @NameInMap("Slug")
        public String slug;

        /**
         * <strong>example:</strong>
         * <p>1754447102000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>UserId</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetAppInstanceForPartnerResponseBodyModuleAppServiceList build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleAppServiceList self = new GetAppInstanceForPartnerResponseBodyModuleAppServiceList();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setDeleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }
        public Integer getDeleted() {
            return this.deleted;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setEspBizId(String espBizId) {
            this.espBizId = espBizId;
            return this;
        }
        public String getEspBizId() {
            return this.espBizId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setGroup(GetAppInstanceForPartnerResponseBodyModuleAppServiceListGroup group) {
            this.group = group;
            return this;
        }
        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListGroup getGroup() {
            return this.group;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setInstanceBizId(String instanceBizId) {
            this.instanceBizId = instanceBizId;
            return this;
        }
        public String getInstanceBizId() {
            return this.instanceBizId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setNodeList(java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList> nodeList) {
            this.nodeList = nodeList;
            return this;
        }
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppServiceListNodeList> getNodeList() {
            return this.nodeList;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setOperationAddress(GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress operationAddress) {
            this.operationAddress = operationAddress;
            return this;
        }
        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListOperationAddress getOperationAddress() {
            return this.operationAddress;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setProfile(GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile profile) {
            this.profile = profile;
            return this;
        }
        public GetAppInstanceForPartnerResponseBodyModuleAppServiceListProfile getProfile() {
            return this.profile;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setServiceTypeText(String serviceTypeText) {
            this.serviceTypeText = serviceTypeText;
            return this;
        }
        public String getServiceTypeText() {
            return this.serviceTypeText;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAppInstanceForPartnerResponseBodyModuleAppServiceList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData extends TeaModel {
        /**
         * <p>aliyun_pk</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AliyunPk")
        public String aliyunPk;

        /**
         * <strong>example:</strong>
         * <p>WS20250801153127000002</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>1672123722000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>Wed Nov 26 10:15:28 CST 2025</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>grantAliyunPk</p>
         */
        @NameInMap("GrantAliyunPk")
        public String grantAliyunPk;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>parent_pk</p>
         * 
         * <strong>example:</strong>
         * <p>1123213</p>
         */
        @NameInMap("ParentPk")
        public String parentPk;

        /**
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("PartnerId")
        public String partnerId;

        /**
         * <strong>example:</strong>
         * <p>diaplayName</p>
         */
        @NameInMap("UserDisplayName")
        public String userDisplayName;

        public static GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData self = new GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData setGrantAliyunPk(String grantAliyunPk) {
            this.grantAliyunPk = grantAliyunPk;
            return this;
        }
        public String getGrantAliyunPk() {
            return this.grantAliyunPk;
        }

        public GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData setParentPk(String parentPk) {
            this.parentPk = parentPk;
            return this;
        }
        public String getParentPk() {
            return this.parentPk;
        }

        public GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData setPartnerId(String partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public String getPartnerId() {
            return this.partnerId;
        }

        public GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData setUserDisplayName(String userDisplayName) {
            this.userDisplayName = userDisplayName;
            return this;
        }
        public String getUserDisplayName() {
            return this.userDisplayName;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModulePartnerDetail extends TeaModel {
        /**
         * <p>data</p>
         */
        @NameInMap("BindData")
        public GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData bindData;

        /**
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("PartnerId")
        public String partnerId;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAppInstanceForPartnerResponseBodyModulePartnerDetail build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModulePartnerDetail self = new GetAppInstanceForPartnerResponseBodyModulePartnerDetail();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModulePartnerDetail setBindData(GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData bindData) {
            this.bindData = bindData;
            return this;
        }
        public GetAppInstanceForPartnerResponseBodyModulePartnerDetailBindData getBindData() {
            return this.bindData;
        }

        public GetAppInstanceForPartnerResponseBodyModulePartnerDetail setPartnerId(String partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public String getPartnerId() {
            return this.partnerId;
        }

        public GetAppInstanceForPartnerResponseBodyModulePartnerDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("AdminUrl")
        public String adminUrl;

        /**
         * <strong>example:</strong>
         * <p>PC_WebSite</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("ApplicationTypeText")
        public String applicationTypeText;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("BindCname")
        public String bindCname;

        /**
         * <strong>example:</strong>
         * <p>WS20250801152128000005</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("CustomerService")
        public String customerService;

        /**
         * <strong>example:</strong>
         * <p>ChineseMainland</p>
         */
        @NameInMap("DeployArea")
        public String deployArea;

        /**
         * <strong>example:</strong>
         * <p>[white:],<em>.eduresource.cn,</em>.dingtalk.com,<em>.aliyun.com,</em>.aliyuncs.com,euser.edu-aliyun.com,s-gm.mmstat.com</p>
         */
        @NameInMap("DomainList")
        public String domainList;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("EditorUrl")
        public String editorUrl;

        /**
         * <strong>example:</strong>
         * <p>1605280632000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-05-06T03:07:45Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("IcpbaNo")
        public String icpbaNo;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Image\&quot;: []}</p>
         */
        @NameInMap("ImageList")
        public String imageList;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("LxInstanceId")
        public String lxInstanceId;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("OrdTime")
        public String ordTime;

        /**
         * <strong>example:</strong>
         * <p>256146659280026</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderNum")
        public Integer orderNum;

        /**
         * <strong>example:</strong>
         * <p>100086</p>
         */
        @NameInMap("PartnerId")
        public String partnerId;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("PayTime")
        public String payTime;

        /**
         * <strong>example:</strong>
         * <p><a href="https://preview-lyj.aliyuncs.com/preview/1daacb3ebbb8435d9091fb950c528d0f?subSceneIds=682185">https://preview-lyj.aliyuncs.com/preview/1daacb3ebbb8435d9091fb950c528d0f?subSceneIds=682185</a></p>
         */
        @NameInMap("PreviewUrl")
        public String previewUrl;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("SeoSite")
        public String seoSite;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("SiteLogo")
        public String siteLogo;

        /**
         * <strong>example:</strong>
         * <p>Basic_Edition</p>
         */
        @NameInMap("SiteVersion")
        public String siteVersion;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("SiteVersionText")
        public String siteVersionText;

        /**
         * <strong>example:</strong>
         * <p>edasmsc</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("TemplateEtag")
        public String templateEtag;

        /**
         * <strong>example:</strong>
         * <p>4644</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("TextList")
        public String textList;

        /**
         * <strong>example:</strong>
         * <p><a href="https://aloss-recruit-aiinterview.oss-cn-beijing.aliyuncs.com/thumbnail-1753495551714-10000.png">https://aloss-recruit-aiinterview.oss-cn-beijing.aliyuncs.com/thumbnail-1753495551714-10000.png</a></p>
         */
        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("UpgradeStatus")
        public String upgradeStatus;

        public static GetAppInstanceForPartnerResponseBodyModuleProfile build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleProfile self = new GetAppInstanceForPartnerResponseBodyModuleProfile();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setAdminUrl(String adminUrl) {
            this.adminUrl = adminUrl;
            return this;
        }
        public String getAdminUrl() {
            return this.adminUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setApplicationTypeText(String applicationTypeText) {
            this.applicationTypeText = applicationTypeText;
            return this;
        }
        public String getApplicationTypeText() {
            return this.applicationTypeText;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setBindCname(String bindCname) {
            this.bindCname = bindCname;
            return this;
        }
        public String getBindCname() {
            return this.bindCname;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setCustomerService(String customerService) {
            this.customerService = customerService;
            return this;
        }
        public String getCustomerService() {
            return this.customerService;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setDeployArea(String deployArea) {
            this.deployArea = deployArea;
            return this;
        }
        public String getDeployArea() {
            return this.deployArea;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setDomainList(String domainList) {
            this.domainList = domainList;
            return this;
        }
        public String getDomainList() {
            return this.domainList;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setEditorUrl(String editorUrl) {
            this.editorUrl = editorUrl;
            return this;
        }
        public String getEditorUrl() {
            return this.editorUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setIcpbaNo(String icpbaNo) {
            this.icpbaNo = icpbaNo;
            return this;
        }
        public String getIcpbaNo() {
            return this.icpbaNo;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setImageList(String imageList) {
            this.imageList = imageList;
            return this;
        }
        public String getImageList() {
            return this.imageList;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setLxInstanceId(String lxInstanceId) {
            this.lxInstanceId = lxInstanceId;
            return this;
        }
        public String getLxInstanceId() {
            return this.lxInstanceId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setOrdTime(String ordTime) {
            this.ordTime = ordTime;
            return this;
        }
        public String getOrdTime() {
            return this.ordTime;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setOrderNum(Integer orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Integer getOrderNum() {
            return this.orderNum;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setPartnerId(String partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public String getPartnerId() {
            return this.partnerId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setSeoSite(String seoSite) {
            this.seoSite = seoSite;
            return this;
        }
        public String getSeoSite() {
            return this.seoSite;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setSiteLogo(String siteLogo) {
            this.siteLogo = siteLogo;
            return this;
        }
        public String getSiteLogo() {
            return this.siteLogo;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setSiteVersion(String siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public String getSiteVersion() {
            return this.siteVersion;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setSiteVersionText(String siteVersionText) {
            this.siteVersionText = siteVersionText;
            return this;
        }
        public String getSiteVersionText() {
            return this.siteVersionText;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setTemplateEtag(String templateEtag) {
            this.templateEtag = templateEtag;
            return this;
        }
        public String getTemplateEtag() {
            return this.templateEtag;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setTextList(String textList) {
            this.textList = textList;
            return this;
        }
        public String getTextList() {
            return this.textList;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public GetAppInstanceForPartnerResponseBodyModuleProfile setUpgradeStatus(String upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
            return this;
        }
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("AdminUrl")
        public String adminUrl;

        /**
         * <strong>example:</strong>
         * <p>PC_WebSite</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("ApplicationTypeText")
        public String applicationTypeText;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("BindCname")
        public String bindCname;

        /**
         * <strong>example:</strong>
         * <p>WS20250801153127000002</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("CustomerService")
        public String customerService;

        /**
         * <strong>example:</strong>
         * <p>ChineseMainland</p>
         */
        @NameInMap("DeployArea")
        public String deployArea;

        /**
         * <strong>example:</strong>
         * <p>[\&quot;activity.syruijia.top\&quot;, \&quot;admin.syruijia.top\&quot;, \&quot;api.syruijia.top\&quot;, \&quot;game-admin.syruijia.top\&quot;, \&quot;h5game.syruijia.top\&quot;, \&quot;home.syruijia.top\&quot;, \&quot;invite.syruijia.top\&quot;]</p>
         */
        @NameInMap("DomainList")
        public String domainList;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("EditorUrl")
        public String editorUrl;

        /**
         * <strong>example:</strong>
         * <p>1621734214000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>Thu Oct 24 09:12:31 CST 2024</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("IcpbaNo")
        public String icpbaNo;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Image\&quot;: []}</p>
         */
        @NameInMap("ImageList")
        public String imageList;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("LxInstanceId")
        public String lxInstanceId;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("OrdTime")
        public String ordTime;

        /**
         * <strong>example:</strong>
         * <p>248808934190692</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderNum")
        public Integer orderNum;

        /**
         * <strong>example:</strong>
         * <p>100086</p>
         */
        @NameInMap("PartnerId")
        public String partnerId;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("PayTime")
        public String payTime;

        /**
         * <strong>example:</strong>
         * <p><a href="https://preview-lyj.aliyuncs.com/preview/temp/9fb36fc05d0a48cdb92d7397336c214f?subSceneIds=734285&type=interim">https://preview-lyj.aliyuncs.com/preview/temp/9fb36fc05d0a48cdb92d7397336c214f?subSceneIds=734285&amp;type=interim</a></p>
         */
        @NameInMap("PreviewUrl")
        public String previewUrl;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("SeoSite")
        public String seoSite;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("SiteLogo")
        public String siteLogo;

        /**
         * <strong>example:</strong>
         * <p>Trial_Edition</p>
         */
        @NameInMap("SiteVersion")
        public String siteVersion;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("SiteVersionText")
        public String siteVersionText;

        /**
         * <strong>example:</strong>
         * <p>10.71.130.205</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("TemplateEtag")
        public String templateEtag;

        /**
         * <strong>example:</strong>
         * <p>4644</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("TextList")
        public String textList;

        /**
         * <strong>example:</strong>
         * <p><a href="https://aloss-recruit-aiinterview.oss-cn-beijing.aliyuncs.com/thumbnail-1766456326256-0.png">https://aloss-recruit-aiinterview.oss-cn-beijing.aliyuncs.com/thumbnail-1766456326256-0.png</a></p>
         */
        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("UpgradeStatus")
        public String upgradeStatus;

        public static GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile self = new GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setAdminUrl(String adminUrl) {
            this.adminUrl = adminUrl;
            return this;
        }
        public String getAdminUrl() {
            return this.adminUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setApplicationTypeText(String applicationTypeText) {
            this.applicationTypeText = applicationTypeText;
            return this;
        }
        public String getApplicationTypeText() {
            return this.applicationTypeText;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setBindCname(String bindCname) {
            this.bindCname = bindCname;
            return this;
        }
        public String getBindCname() {
            return this.bindCname;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setCustomerService(String customerService) {
            this.customerService = customerService;
            return this;
        }
        public String getCustomerService() {
            return this.customerService;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setDeployArea(String deployArea) {
            this.deployArea = deployArea;
            return this;
        }
        public String getDeployArea() {
            return this.deployArea;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setDomainList(String domainList) {
            this.domainList = domainList;
            return this;
        }
        public String getDomainList() {
            return this.domainList;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setEditorUrl(String editorUrl) {
            this.editorUrl = editorUrl;
            return this;
        }
        public String getEditorUrl() {
            return this.editorUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setIcpbaNo(String icpbaNo) {
            this.icpbaNo = icpbaNo;
            return this;
        }
        public String getIcpbaNo() {
            return this.icpbaNo;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setImageList(String imageList) {
            this.imageList = imageList;
            return this;
        }
        public String getImageList() {
            return this.imageList;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setLxInstanceId(String lxInstanceId) {
            this.lxInstanceId = lxInstanceId;
            return this;
        }
        public String getLxInstanceId() {
            return this.lxInstanceId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setOrdTime(String ordTime) {
            this.ordTime = ordTime;
            return this;
        }
        public String getOrdTime() {
            return this.ordTime;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setOrderNum(Integer orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Integer getOrderNum() {
            return this.orderNum;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setPartnerId(String partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public String getPartnerId() {
            return this.partnerId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setSeoSite(String seoSite) {
            this.seoSite = seoSite;
            return this;
        }
        public String getSeoSite() {
            return this.seoSite;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setSiteLogo(String siteLogo) {
            this.siteLogo = siteLogo;
            return this;
        }
        public String getSiteLogo() {
            return this.siteLogo;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setSiteVersion(String siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public String getSiteVersion() {
            return this.siteVersion;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setSiteVersionText(String siteVersionText) {
            this.siteVersionText = siteVersionText;
            return this;
        }
        public String getSiteVersionText() {
            return this.siteVersionText;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setTemplateEtag(String templateEtag) {
            this.templateEtag = templateEtag;
            return this;
        }
        public String getTemplateEtag() {
            return this.templateEtag;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setTextList(String textList) {
            this.textList = textList;
            return this;
        }
        public String getTextList() {
            return this.textList;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile setUpgradeStatus(String upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
            return this;
        }
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("AppSubType")
        public String appSubType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <strong>example:</strong>
         * <p>WS20250929173805000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("BuildType")
        public String buildType;

        /**
         * <strong>example:</strong>
         * <p>fase</p>
         */
        @NameInMap("Deleted")
        public Integer deleted;

        /**
         * <strong>example:</strong>
         * <p>base</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>placeHolder</p>
         * 
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("DesignSpecBizId")
        public String designSpecBizId;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("DesignSpecId")
        public String designSpecId;

        /**
         * <strong>example:</strong>
         * <p>shikuntech.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>2025-05-23T15:01:25.891Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>pre</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("EspBizId")
        public String espBizId;

        /**
         * <strong>example:</strong>
         * <p>2025-06-19T07:39:55Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("GmtDelete")
        public String gmtDelete;

        /**
         * <strong>example:</strong>
         * <p>2025-01-14T09:09:57Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("GmtPublish")
        public String gmtPublish;

        /**
         * <strong>example:</strong>
         * <p><a href="https://app-center-icon-prod-shanghai.oss-cn-shanghai.aliyuncs.com/tenant/1617863868712071/1749090558651_%E9%AB%98%E5%BE%B7.png">https://app-center-icon-prod-shanghai.oss-cn-shanghai.aliyuncs.com/tenant/1617863868712071/1749090558651_%E9%AB%98%E5%BE%B7.png</a></p>
         */
        @NameInMap("IconUrl")
        public String iconUrl;

        /**
         * <strong>example:</strong>
         * <p>19609820.png</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>264987642530867,264988827010867,264982589530867,264985058640867,264982290930867,264982387520867,264987147460867,264985752990867,264988432850867</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("Profile")
        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile profile;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("SiteHost")
        public String siteHost;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("Slug")
        public String slug;

        /**
         * <strong>example:</strong>
         * <p>MARKET_CLOUD_DREAM</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>2025-07-22T02:23:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("StatusText")
        public String statusText;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("ThumbnailUrl")
        public String thumbnailUrl;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>2019-04-02</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList self = new GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setAppSubType(String appSubType) {
            this.appSubType = appSubType;
            return this;
        }
        public String getAppSubType() {
            return this.appSubType;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setBuildType(String buildType) {
            this.buildType = buildType;
            return this;
        }
        public String getBuildType() {
            return this.buildType;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setDeleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }
        public Integer getDeleted() {
            return this.deleted;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setDesignSpecBizId(String designSpecBizId) {
            this.designSpecBizId = designSpecBizId;
            return this;
        }
        public String getDesignSpecBizId() {
            return this.designSpecBizId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setDesignSpecId(String designSpecId) {
            this.designSpecId = designSpecId;
            return this;
        }
        public String getDesignSpecId() {
            return this.designSpecId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setEspBizId(String espBizId) {
            this.espBizId = espBizId;
            return this;
        }
        public String getEspBizId() {
            return this.espBizId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setGmtDelete(String gmtDelete) {
            this.gmtDelete = gmtDelete;
            return this;
        }
        public String getGmtDelete() {
            return this.gmtDelete;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setGmtPublish(String gmtPublish) {
            this.gmtPublish = gmtPublish;
            return this;
        }
        public String getGmtPublish() {
            return this.gmtPublish;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setProfile(GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile profile) {
            this.profile = profile;
            return this;
        }
        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceListProfile getProfile() {
            return this.profile;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setSiteHost(String siteHost) {
            this.siteHost = siteHost;
            return this;
        }
        public String getSiteHost() {
            return this.siteHost;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setStatusText(String statusText) {
            this.statusText = statusText;
            return this;
        }
        public String getStatusText() {
            return this.statusText;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }
        public String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetAppInstanceForPartnerResponseBodyModule extends TeaModel {
        @NameInMap("AiStaffList")
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAiStaffList> aiStaffList;

        @NameInMap("AppDesignSpec")
        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec appDesignSpec;

        @NameInMap("AppOperationAddress")
        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress appOperationAddress;

        @NameInMap("AppServiceList")
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppServiceList> appServiceList;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("AppSubType")
        public String appSubType;

        /**
         * <strong>example:</strong>
         * <p>TRACE</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <strong>example:</strong>
         * <p>WS20250915163734000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("BuildType")
        public String buildType;

        /**
         * <strong>example:</strong>
         * <p>fase</p>
         */
        @NameInMap("Deleted")
        public Integer deleted;

        /**
         * <strong>example:</strong>
         * <p>/bak-&gt;serverless.handler(2020091300200279)</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>placeHolder</p>
         * 
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("DesignSpecBizId")
        public String designSpecBizId;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("DesignSpecId")
        public String designSpecId;

        /**
         * <strong>example:</strong>
         * <p>stxycw.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>2026-01-05T15:59:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>pre</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("EspBizId")
        public String espBizId;

        /**
         * <strong>example:</strong>
         * <p>1740479834</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("GmtDelete")
        public String gmtDelete;

        /**
         * <strong>example:</strong>
         * <p>2025-08-28T02:25:41Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("GmtPublish")
        public String gmtPublish;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>250822465990301</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("PartnerDetail")
        public GetAppInstanceForPartnerResponseBodyModulePartnerDetail partnerDetail;

        @NameInMap("Profile")
        public GetAppInstanceForPartnerResponseBodyModuleProfile profile;

        @NameInMap("RelatedInstanceList")
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList> relatedInstanceList;

        /**
         * <strong>example:</strong>
         * <p>abcd.scd.wanwang.xin</p>
         */
        @NameInMap("SiteHost")
        public String siteHost;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("Slug")
        public String slug;

        /**
         * <strong>example:</strong>
         * <p>MARKET_CLOUD_DREAM</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>2023-03-24T10:10Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>FILE_DOWNLOAD_FAILED</p>
         */
        @NameInMap("StatusText")
        public String statusText;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("ThumbnailUrl")
        public String thumbnailUrl;

        /**
         * <strong>example:</strong>
         * <p>placeHolder</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>2019-04-02</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetAppInstanceForPartnerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceForPartnerResponseBodyModule self = new GetAppInstanceForPartnerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceForPartnerResponseBodyModule setAiStaffList(java.util.List<GetAppInstanceForPartnerResponseBodyModuleAiStaffList> aiStaffList) {
            this.aiStaffList = aiStaffList;
            return this;
        }
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAiStaffList> getAiStaffList() {
            return this.aiStaffList;
        }

        public GetAppInstanceForPartnerResponseBodyModule setAppDesignSpec(GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec appDesignSpec) {
            this.appDesignSpec = appDesignSpec;
            return this;
        }
        public GetAppInstanceForPartnerResponseBodyModuleAppDesignSpec getAppDesignSpec() {
            return this.appDesignSpec;
        }

        public GetAppInstanceForPartnerResponseBodyModule setAppOperationAddress(GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress appOperationAddress) {
            this.appOperationAddress = appOperationAddress;
            return this;
        }
        public GetAppInstanceForPartnerResponseBodyModuleAppOperationAddress getAppOperationAddress() {
            return this.appOperationAddress;
        }

        public GetAppInstanceForPartnerResponseBodyModule setAppServiceList(java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppServiceList> appServiceList) {
            this.appServiceList = appServiceList;
            return this;
        }
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleAppServiceList> getAppServiceList() {
            return this.appServiceList;
        }

        public GetAppInstanceForPartnerResponseBodyModule setAppSubType(String appSubType) {
            this.appSubType = appSubType;
            return this;
        }
        public String getAppSubType() {
            return this.appSubType;
        }

        public GetAppInstanceForPartnerResponseBodyModule setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetAppInstanceForPartnerResponseBodyModule setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetAppInstanceForPartnerResponseBodyModule setBuildType(String buildType) {
            this.buildType = buildType;
            return this;
        }
        public String getBuildType() {
            return this.buildType;
        }

        public GetAppInstanceForPartnerResponseBodyModule setDeleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }
        public Integer getDeleted() {
            return this.deleted;
        }

        public GetAppInstanceForPartnerResponseBodyModule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAppInstanceForPartnerResponseBodyModule setDesignSpecBizId(String designSpecBizId) {
            this.designSpecBizId = designSpecBizId;
            return this;
        }
        public String getDesignSpecBizId() {
            return this.designSpecBizId;
        }

        public GetAppInstanceForPartnerResponseBodyModule setDesignSpecId(String designSpecId) {
            this.designSpecId = designSpecId;
            return this;
        }
        public String getDesignSpecId() {
            return this.designSpecId;
        }

        public GetAppInstanceForPartnerResponseBodyModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetAppInstanceForPartnerResponseBodyModule setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetAppInstanceForPartnerResponseBodyModule setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetAppInstanceForPartnerResponseBodyModule setEspBizId(String espBizId) {
            this.espBizId = espBizId;
            return this;
        }
        public String getEspBizId() {
            return this.espBizId;
        }

        public GetAppInstanceForPartnerResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppInstanceForPartnerResponseBodyModule setGmtDelete(String gmtDelete) {
            this.gmtDelete = gmtDelete;
            return this;
        }
        public String getGmtDelete() {
            return this.gmtDelete;
        }

        public GetAppInstanceForPartnerResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAppInstanceForPartnerResponseBodyModule setGmtPublish(String gmtPublish) {
            this.gmtPublish = gmtPublish;
            return this;
        }
        public String getGmtPublish() {
            return this.gmtPublish;
        }

        public GetAppInstanceForPartnerResponseBodyModule setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAppInstanceForPartnerResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetAppInstanceForPartnerResponseBodyModule setPartnerDetail(GetAppInstanceForPartnerResponseBodyModulePartnerDetail partnerDetail) {
            this.partnerDetail = partnerDetail;
            return this;
        }
        public GetAppInstanceForPartnerResponseBodyModulePartnerDetail getPartnerDetail() {
            return this.partnerDetail;
        }

        public GetAppInstanceForPartnerResponseBodyModule setProfile(GetAppInstanceForPartnerResponseBodyModuleProfile profile) {
            this.profile = profile;
            return this;
        }
        public GetAppInstanceForPartnerResponseBodyModuleProfile getProfile() {
            return this.profile;
        }

        public GetAppInstanceForPartnerResponseBodyModule setRelatedInstanceList(java.util.List<GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList> relatedInstanceList) {
            this.relatedInstanceList = relatedInstanceList;
            return this;
        }
        public java.util.List<GetAppInstanceForPartnerResponseBodyModuleRelatedInstanceList> getRelatedInstanceList() {
            return this.relatedInstanceList;
        }

        public GetAppInstanceForPartnerResponseBodyModule setSiteHost(String siteHost) {
            this.siteHost = siteHost;
            return this;
        }
        public String getSiteHost() {
            return this.siteHost;
        }

        public GetAppInstanceForPartnerResponseBodyModule setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public GetAppInstanceForPartnerResponseBodyModule setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetAppInstanceForPartnerResponseBodyModule setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetAppInstanceForPartnerResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAppInstanceForPartnerResponseBodyModule setStatusText(String statusText) {
            this.statusText = statusText;
            return this;
        }
        public String getStatusText() {
            return this.statusText;
        }

        public GetAppInstanceForPartnerResponseBodyModule setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }
        public String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public GetAppInstanceForPartnerResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetAppInstanceForPartnerResponseBodyModule setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
