// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppInstanceProfile extends TeaModel {
    /**
     * <p>The application type code. For example, PC_WebSite indicates a PC website.</p>
     * 
     * <strong>example:</strong>
     * <p>PC_WebSite</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The display name of the application type.</p>
     * 
     * <strong>example:</strong>
     * <p>PC website</p>
     */
    @NameInMap("ApplicationTypeText")
    public String applicationTypeText;

    /**
     * <p>The business identifier of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>WS_SITE_1</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The audit status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CaseAuditStatus")
    public String caseAuditStatus;

    /**
     * <p>The listing status.</p>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("CaseShelfStatus")
    public String caseShelfStatus;

    /**
     * <p>The ID of the ChatBI BuildSchemaIndex asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>task-1</p>
     */
    @NameInMap("ChatbiTaskId")
    public String chatbiTaskId;

    /**
     * <p>The status of the ChatBI BuildSchemaIndex task. Valid values: running, finish, and failed.</p>
     * 
     * <strong>example:</strong>
     * <p>finish</p>
     */
    @NameInMap("ChatbiTaskStatus")
    public String chatbiTaskStatus;

    /**
     * <p>The commodity code of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>domain_website_public_cn</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The contact information or instructions for customer service.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:support@example.com">support@example.com</a></p>
     */
    @NameInMap("CustomerService")
    public String customerService;

    /**
     * <p>The code of the region where the application is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>HongKong</p>
     */
    @NameInMap("DeployArea")
    public String deployArea;

    /**
     * <p>The ICP filing number of the bound custom domain name. Separate multiple ICP filing numbers with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>京ICP备12345678号-1</p>
     */
    @NameInMap("IcpbaNo")
    public String icpbaNo;

    /**
     * <p>The independent server information. This information is computed in real time by DescribeAppInstance and is not populated in list operations.</p>
     */
    @NameInMap("IndependentDeployment")
    public AppInstanceProfileIndependentDeployment independentDeployment;

    /**
     * <p>The ID of the associated Lingxiao instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lx-1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the current user is included in the grayscale whitelist for the ChatBI feature.</p>
     */
    @NameInMap("OpenChatBi")
    public Boolean openChatBi;

    /**
     * <p>The time when the order was placed. The format is yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-17 10:30:00</p>
     */
    @NameInMap("OrdTime")
    public String ordTime;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>order-1</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The time when the payment was made. The format is yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-17 10:35:00</p>
     */
    @NameInMap("PayTime")
    public String payTime;

    /**
     * <p>The URL used to access the application preview page.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/preview">https://example.com/preview</a></p>
     */
    @NameInMap("PreviewUrl")
    public String previewUrl;

    /**
     * <p>The configuration identifier of the SEO site.</p>
     * 
     * <strong>example:</strong>
     * <p>seo-site-1</p>
     */
    @NameInMap("SeoSite")
    public String seoSite;

    /**
     * <p>Specifies whether to enable the watermark for shared rendering. A value of 1 indicates that the feature is enabled, and a value of 0 indicates that the feature is disabled. If this parameter is not configured, it is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShareRenderWatermark")
    public String shareRenderWatermark;

    /**
     * <p>The site version code.</p>
     * 
     * <strong>example:</strong>
     * <p>Max_Edition</p>
     */
    @NameInMap("SiteVersion")
    public String siteVersion;

    /**
     * <p>The display name of the site version, which includes the deployment region.</p>
     * 
     * <strong>example:</strong>
     * <p>Ultimate Edition [Hong Kong]</p>
     */
    @NameInMap("SiteVersionText")
    public String siteVersionText;

    /**
     * <p>The identifier of the creation or synchronization source.</p>
     * 
     * <strong>example:</strong>
     * <p>MARKET_CLOUD_DREAM</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ETag identifier of the current application template.</p>
     * 
     * <strong>example:</strong>
     * <p>etag-1</p>
     */
    @NameInMap("TemplateEtag")
    public String templateEtag;

    /**
     * <p>The ID of the template used by the current application.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl-1</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The upgrade status of the instance. DOING indicates that the upgrade is in progress, SUCC indicates that the upgrade is successful, and FAIL indicates that the upgrade failed.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCC</p>
     */
    @NameInMap("UpgradeStatus")
    public String upgradeStatus;

    public static AppInstanceProfile build(java.util.Map<String, ?> map) throws Exception {
        AppInstanceProfile self = new AppInstanceProfile();
        return TeaModel.build(map, self);
    }

    public AppInstanceProfile setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public AppInstanceProfile setApplicationTypeText(String applicationTypeText) {
        this.applicationTypeText = applicationTypeText;
        return this;
    }
    public String getApplicationTypeText() {
        return this.applicationTypeText;
    }

    public AppInstanceProfile setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AppInstanceProfile setCaseAuditStatus(String caseAuditStatus) {
        this.caseAuditStatus = caseAuditStatus;
        return this;
    }
    public String getCaseAuditStatus() {
        return this.caseAuditStatus;
    }

    public AppInstanceProfile setCaseShelfStatus(String caseShelfStatus) {
        this.caseShelfStatus = caseShelfStatus;
        return this;
    }
    public String getCaseShelfStatus() {
        return this.caseShelfStatus;
    }

    public AppInstanceProfile setChatbiTaskId(String chatbiTaskId) {
        this.chatbiTaskId = chatbiTaskId;
        return this;
    }
    public String getChatbiTaskId() {
        return this.chatbiTaskId;
    }

    public AppInstanceProfile setChatbiTaskStatus(String chatbiTaskStatus) {
        this.chatbiTaskStatus = chatbiTaskStatus;
        return this;
    }
    public String getChatbiTaskStatus() {
        return this.chatbiTaskStatus;
    }

    public AppInstanceProfile setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public AppInstanceProfile setCustomerService(String customerService) {
        this.customerService = customerService;
        return this;
    }
    public String getCustomerService() {
        return this.customerService;
    }

    public AppInstanceProfile setDeployArea(String deployArea) {
        this.deployArea = deployArea;
        return this;
    }
    public String getDeployArea() {
        return this.deployArea;
    }

    public AppInstanceProfile setIcpbaNo(String icpbaNo) {
        this.icpbaNo = icpbaNo;
        return this;
    }
    public String getIcpbaNo() {
        return this.icpbaNo;
    }

    public AppInstanceProfile setIndependentDeployment(AppInstanceProfileIndependentDeployment independentDeployment) {
        this.independentDeployment = independentDeployment;
        return this;
    }
    public AppInstanceProfileIndependentDeployment getIndependentDeployment() {
        return this.independentDeployment;
    }

    public AppInstanceProfile setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AppInstanceProfile setOpenChatBi(Boolean openChatBi) {
        this.openChatBi = openChatBi;
        return this;
    }
    public Boolean getOpenChatBi() {
        return this.openChatBi;
    }

    public AppInstanceProfile setOrdTime(String ordTime) {
        this.ordTime = ordTime;
        return this;
    }
    public String getOrdTime() {
        return this.ordTime;
    }

    public AppInstanceProfile setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AppInstanceProfile setPayTime(String payTime) {
        this.payTime = payTime;
        return this;
    }
    public String getPayTime() {
        return this.payTime;
    }

    public AppInstanceProfile setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public AppInstanceProfile setSeoSite(String seoSite) {
        this.seoSite = seoSite;
        return this;
    }
    public String getSeoSite() {
        return this.seoSite;
    }

    public AppInstanceProfile setShareRenderWatermark(String shareRenderWatermark) {
        this.shareRenderWatermark = shareRenderWatermark;
        return this;
    }
    public String getShareRenderWatermark() {
        return this.shareRenderWatermark;
    }

    public AppInstanceProfile setSiteVersion(String siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public String getSiteVersion() {
        return this.siteVersion;
    }

    public AppInstanceProfile setSiteVersionText(String siteVersionText) {
        this.siteVersionText = siteVersionText;
        return this;
    }
    public String getSiteVersionText() {
        return this.siteVersionText;
    }

    public AppInstanceProfile setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AppInstanceProfile setTemplateEtag(String templateEtag) {
        this.templateEtag = templateEtag;
        return this;
    }
    public String getTemplateEtag() {
        return this.templateEtag;
    }

    public AppInstanceProfile setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public AppInstanceProfile setUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
        return this;
    }
    public String getUpgradeStatus() {
        return this.upgradeStatus;
    }

    public static class AppInstanceProfileIndependentDeployment extends TeaModel {
        /**
         * <p>Specifies whether retries are allowed after the independent server fails to be enabled.</p>
         */
        @NameInMap("CanRetry")
        public Boolean canRetry;

        /**
         * <p>The code of the region where the independent server is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>HongKong</p>
         */
        @NameInMap("DeployArea")
        public String deployArea;

        /**
         * <p>The type of the DNS record used when an independent IP address is bound to a domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("DnsRecordType")
        public String dnsRecordType;

        /**
         * <p>The eligibility status of the independent server. UPGRADE_REQUIRED indicates that an upgrade is required, AVAILABLE indicates that the feature can be enabled, and UNAVAILABLE indicates that the feature is currently unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Eligibility")
        public String eligibility;

        /**
         * <p>The status of the independent server. NOT_ENABLED indicates that the feature is not enabled, ENABLING indicates that the feature is being enabled, ACTIVE indicates that the feature is enabled, and FAILED indicates that the feature failed to be enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("EnableStatus")
        public String enableStatus;

        /**
         * <p>The independent IP address assigned after the independent server is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.10</p>
         */
        @NameInMap("IndependentIp")
        public String independentIp;

        /**
         * <p>The unified display specification of the independent server, which does not represent the real-time resource usage of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>2 vCPUs and 2 GB</p>
         */
        @NameInMap("ServerSpec")
        public String serverSpec;

        /**
         * <p>The ID of the task to enable the independent server.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static AppInstanceProfileIndependentDeployment build(java.util.Map<String, ?> map) throws Exception {
            AppInstanceProfileIndependentDeployment self = new AppInstanceProfileIndependentDeployment();
            return TeaModel.build(map, self);
        }

        public AppInstanceProfileIndependentDeployment setCanRetry(Boolean canRetry) {
            this.canRetry = canRetry;
            return this;
        }
        public Boolean getCanRetry() {
            return this.canRetry;
        }

        public AppInstanceProfileIndependentDeployment setDeployArea(String deployArea) {
            this.deployArea = deployArea;
            return this;
        }
        public String getDeployArea() {
            return this.deployArea;
        }

        public AppInstanceProfileIndependentDeployment setDnsRecordType(String dnsRecordType) {
            this.dnsRecordType = dnsRecordType;
            return this;
        }
        public String getDnsRecordType() {
            return this.dnsRecordType;
        }

        public AppInstanceProfileIndependentDeployment setEligibility(String eligibility) {
            this.eligibility = eligibility;
            return this;
        }
        public String getEligibility() {
            return this.eligibility;
        }

        public AppInstanceProfileIndependentDeployment setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public AppInstanceProfileIndependentDeployment setIndependentIp(String independentIp) {
            this.independentIp = independentIp;
            return this;
        }
        public String getIndependentIp() {
            return this.independentIp;
        }

        public AppInstanceProfileIndependentDeployment setServerSpec(String serverSpec) {
            this.serverSpec = serverSpec;
            return this;
        }
        public String getServerSpec() {
            return this.serverSpec;
        }

        public AppInstanceProfileIndependentDeployment setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
