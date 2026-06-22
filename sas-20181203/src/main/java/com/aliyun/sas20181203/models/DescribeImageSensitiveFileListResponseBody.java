// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileListResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success. Other values indicate failure. You can use this field to determine the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The detailed information about the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageSensitiveFileListResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique ID for each request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8D19A089-E6BC-5244-800C-7E590D50487F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of sensitive files.</p>
     */
    @NameInMap("SensitiveFileList")
    public java.util.List<DescribeImageSensitiveFileListResponseBodySensitiveFileList> sensitiveFileList;

    /**
     * <p>Indicates whether the query was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: successful</li>
     * <li><strong>false</strong>: failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeImageSensitiveFileListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSensitiveFileListResponseBody self = new DescribeImageSensitiveFileListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageSensitiveFileListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeImageSensitiveFileListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeImageSensitiveFileListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeImageSensitiveFileListResponseBody setPageInfo(DescribeImageSensitiveFileListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeImageSensitiveFileListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeImageSensitiveFileListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageSensitiveFileListResponseBody setSensitiveFileList(java.util.List<DescribeImageSensitiveFileListResponseBodySensitiveFileList> sensitiveFileList) {
        this.sensitiveFileList = sensitiveFileList;
        return this;
    }
    public java.util.List<DescribeImageSensitiveFileListResponseBodySensitiveFileList> getSensitiveFileList() {
        return this.sensitiveFileList;
    }

    public DescribeImageSensitiveFileListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeImageSensitiveFileListResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the current page in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The key of the last entry.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESGgoSChAKDGNvbXBsZXRlVGltZRABCgQiAggAGAAiQAoJAGYXFWIAAAAACjMDLgAAADFTNzMyZDMwMzAzMDM1Mzc3Njc4MzA2ODY5NmI2YTY1Nzg2NTcxNjE2N******</p>
         */
        @NameInMap("LastRowKey")
        public String lastRowKey;

        /**
         * <p>The number of entries returned per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>149</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageSensitiveFileListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSensitiveFileListResponseBodyPageInfo self = new DescribeImageSensitiveFileListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageSensitiveFileListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageSensitiveFileListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageSensitiveFileListResponseBodyPageInfo setLastRowKey(String lastRowKey) {
            this.lastRowKey = lastRowKey;
            return this;
        }
        public String getLastRowKey() {
            return this.lastRowKey;
        }

        public DescribeImageSensitiveFileListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageSensitiveFileListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeImageSensitiveFileListResponseBodySensitiveFileList extends TeaModel {
        /**
         * <p>The hardening suggestion for the sensitive file check item.</p>
         * 
         * <strong>example:</strong>
         * <p>PEM (Privacy Enhanced Mail) format is a common format for digital certificates. PEM files can contain certificates, public keys, private keys, and other sensitive information. When a PEM file is either unencrypted or protected with a weak password, or if the password has been compromise, it poses a significantly higher security risk. This detection rule aims to identify such PEM files.</p>
         */
        @NameInMap("Advice")
        public String advice;

        /**
         * <p>The classification key of the sensitive file.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("ClassKey")
        public String classKey;

        /**
         * <p>The classification name of the sensitive file.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <p>The number of times the sensitive file was detected by scans.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The description of the sensitive file check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Assess the risk based on business context and promptly remove any risky content.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The timestamp of the first scan. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1663321552000</p>
         */
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        /**
         * <p>The timestamp of the most recent scan. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1663321552000</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><p><strong>high</strong>: high</p>
         * </li>
         * <li><p><strong>medium</strong>: medium</p>
         * </li>
         * <li><p><strong>low</strong>: low.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The sensitive file alerting type. Valid values:</p>
         * <ul>
         * <li><strong>npm_token</strong>: NPM access token</li>
         * <li><strong>ftp_cfg</strong>: FTP configuration</li>
         * <li><strong>google_oauth_key</strong>: Google OAuth Key</li>
         * <li><strong>planetscale_passwd</strong>: Planetscale password</li>
         * <li><strong>github_ssh_key</strong>: Github SSH key</li>
         * <li><strong>msbuild_publish_profile</strong>: MSBuild publish profile</li>
         * <li><strong>fastly_cdn_token</strong>: Fastly CDN token</li>
         * <li><strong>ssh_private_key</strong>: SSH private key</li>
         * <li><strong>aws_cli</strong>: AWS CLI credentials</li>
         * <li><strong>cpanel_proftpd</strong>: cPanel ProFTPd credentials</li>
         * <li><strong>postgresql_passwd</strong>: PostgreSQL password file</li>
         * <li><strong>discord_client_cred</strong>: Discord client credentials</li>
         * <li><strong>rails_database</strong>: Rails database configuration</li>
         * <li><strong>aws_access_key</strong>: AWS Access Key</li>
         * <li><strong>esmtp_cfg</strong>: ESMTP mail server configuration</li>
         * <li><strong>docker_registry_cfg</strong>: Docker image repository configuration</li>
         * <li><strong>pem</strong>: PEM</li>
         * <li><strong>common_cred</strong>: common credentials</li>
         * <li><strong>sftp_cfg</strong>: SFTP connection configuration</li>
         * <li><strong>grafana_token</strong>: Grafana token</li>
         * <li><strong>slack_token</strong>: Slack Token</li>
         * <li><strong>ec_private_key</strong>: EC private key</li>
         * <li><strong>pypi_token</strong>: PyPI upload token</li>
         * <li><strong>finicity_token</strong>: Finicity platform token</li>
         * <li><strong>k8s_client_key</strong>: Kubernetes client private key</li>
         * <li><strong>git_cfg</strong>: Git configuration</li>
         * <li><strong>django_key</strong>: Django key</li>
         * <li><strong>jenkins_ssh</strong>: Jenkins SSH configuration file</li>
         * <li><strong>openssh_private_key</strong>: OPENSSH private key</li>
         * <li><strong>square_oauth</strong>: Square OAuth credentials</li>
         * <li><strong>typeform_token</strong>: Typeform token</li>
         * <li><strong>common_database_cfg</strong>: common database connection configuration</li>
         * <li><strong>wordpress_database_cfg</strong>: WordPress database configuration</li>
         * <li><strong>googlecloud_api_key</strong>: Google Cloud API Key</li>
         * <li><strong>vscode_sftp</strong>: VSCode SFTP configuration</li>
         * <li><strong>apache_htpasswd</strong>: Apache htpasswd</li>
         * <li><strong>planetscale_token</strong>: Planetscale token</li>
         * <li><strong>contentful_preview_token</strong>: Contentful Preview token</li>
         * <li><strong>php_database_cfg</strong>: PHP application database password</li>
         * <li><strong>atom_remote_sync</strong>: Atom remote synchronization configuration</li>
         * <li><strong>aws_session_token</strong>: AWS session token</li>
         * <li><strong>atom_sftp_cfg</strong>: Atom SFTP configuration</li>
         * <li><strong>asana_client_private_key</strong>: Asana client private key</li>
         * <li><strong>tencentcloud_ak</strong>: third-party cloud SecretId</li>
         * <li><strong>rsa_private_key</strong>: RSA private key</li>
         * <li><strong>github_personal_token</strong>: Github Personal access token</li>
         * <li><strong>pgp</strong>: PGP encrypt file</li>
         * <li><strong>stripe_skpk</strong>: Stripe Secret Key</li>
         * <li><strong>square_token</strong>: Square access token</li>
         * <li><strong>rails_carrierwave</strong>: Rails Carrierwave file upload credentials</li>
         * <li><strong>dbeaver_database_cfg</strong>: DBeaver database configuration</li>
         * <li><strong>robomongo_cred</strong>: Robomongo credentials</li>
         * <li><strong>github_oauth_token</strong>: Github OAuth access token</li>
         * <li><strong>pulumi_token</strong>: Pulumi token</li>
         * <li><strong>ventrilo_voip</strong>: Ventrilo VoIP Server configuration</li>
         * <li><strong>macos_keychain</strong>: macOS Keychain</li>
         * <li><strong>amazon_mws_token</strong>: Amazon MWS Token</li>
         * <li><strong>dynatrace_token</strong>: Dynatrace token</li>
         * <li><strong>java_keystore</strong>: Java KeyStore</li>
         * <li><strong>microsoft_sdf</strong>: Microsoft SQL CE database</li>
         * <li><strong>kubernetes_dashboard_cred</strong>: Kubernetes Dashboard user credentials</li>
         * <li><strong>atlassian_token</strong>: Atlassian token</li>
         * <li><strong>rdp</strong>: Remote Desktop Protocol (RDP) connection</li>
         * <li><strong>mailgun_key</strong>: Mailgun Webhook Signing Key</li>
         * <li><strong>mailchimp_api_key</strong>: Mailchimp API Key</li>
         * <li><strong>netrc_cfg</strong>: .netrc configuration file</li>
         * <li><strong>openvpn_cfg</strong>: OpenVPN client configuration</li>
         * <li><strong>github_refresh_token</strong>: Github Refresh Token</li>
         * <li><strong>salesforce</strong>: Salesforce credentials</li>
         * <li><strong>sendinblue</strong>: Sendinblue token</li>
         * <li><strong>pkcs_private_key</strong>: PKCS#12 key</li>
         * <li><strong>rubyonrails_passwd</strong>: Ruby on Rails password file</li>
         * <li><strong>filezilla_ftp</strong>: FileZilla FTP configuration</li>
         * <li><strong>databricks_token</strong>: Databricks token</li>
         * <li><strong>gitLab_personal_token</strong>: GitLab Personal access token</li>
         * <li><strong>rails_master_key</strong>: Rails Master Key</li>
         * <li><strong>sqlite</strong>: SQLite3/SQLite database</li>
         * <li><strong>firefox_logins</strong>: Firefox logon configuration</li>
         * <li><strong>mailgun_private_token</strong>: Mailgun Private token</li>
         * <li><strong>joomla_cfg</strong>: Joomla configuration</li>
         * <li><strong>hashicorp_terraform_token</strong>: Hashicorp Terraform Token</li>
         * <li><strong>jetbrains_ides</strong>: Jetbrains IDEs configuration</li>
         * <li><strong>heroku_api_key</strong>: Heroku API key</li>
         * <li><strong>messagebird_token</strong>: MessageBird token</li>
         * <li><strong>github_app_token</strong>: Github App Token</li>
         * <li><strong>hashicorp_vault_token</strong>: Hashicorp Vault Token</li>
         * <li><strong>pgp_private_key</strong>: PGP private key</li>
         * <li><strong>sshpasswd</strong>: SSH password</li>
         * <li><strong>huaweicloud_ak</strong>: third-party cloud Secret Access Key</li>
         * <li><strong>aws_s3cmd</strong>: AWS S3cmd configuration</li>
         * <li><strong>php_config</strong>: PHP configuration</li>
         * <li><strong>common_private_key</strong>: common private key types</li>
         * <li><strong>microsoft_mdf</strong>: Microsoft SQL database</li>
         * <li><strong>mediawiki_cfg</strong>: MediaWiki configuration</li>
         * <li><strong>jenkins_cred</strong>: Jenkins credentials</li>
         * <li><strong>rubygems_cred</strong>: Rubygems credentials</li>
         * <li><strong>clojars_token</strong>: Clojars token</li>
         * <li><strong>phoenix_web_passwd</strong>: Phoenix Web credentials</li>
         * <li><strong>puttygen_private_key</strong>: PuTTYgen private key</li>
         * <li><strong>google_oauth_token</strong>: Google OAuth access token</li>
         * <li><strong>rubyonrails_cfg</strong>: Ruby On Rails database configuration</li>
         * <li><strong>lob_api_key</strong>: Lob API Key</li>
         * <li><strong>pkcs_cred</strong>: PKCS#12 certificate</li>
         * <li><strong>otr_private_key</strong>: OTR private key</li>
         * <li><strong>contentful_delivery_token</strong>: Contentful Delivery token</li>
         * <li><strong>digital_ocean_tugboat</strong>: Digital Ocean Tugboat configuration</li>
         * <li><strong>dsa_private_key</strong>: DSA private key</li>
         * <li><strong>rails_app_token</strong>: Rails App token</li>
         * <li><strong>git_cred</strong>: Git user credentials</li>
         * <li><strong>newrelic_api_key</strong>: New Relic User API Key</li>
         * <li><strong>github_hub</strong>: hub configuration that stores Github tokens</li>
         * <li><strong>rubygem</strong>: Rubygem token.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>google_oauth_key</p>
         */
        @NameInMap("SensitiveFileKey")
        public String sensitiveFileKey;

        /**
         * <p>The name of the sensitive file alerting type.</p>
         * 
         * <strong>example:</strong>
         * <p>AccessKeyLeak</p>
         */
        @NameInMap("SensitiveFileName")
        public String sensitiveFileName;

        /**
         * <p>The status of the sensitive file check item. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Unprocessed.</li>
         * <li><strong>1</strong>: Processed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The number of unprocessed images.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UnprocessedNum")
        public Integer unprocessedNum;

        public static DescribeImageSensitiveFileListResponseBodySensitiveFileList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSensitiveFileListResponseBodySensitiveFileList self = new DescribeImageSensitiveFileListResponseBodySensitiveFileList();
            return TeaModel.build(map, self);
        }

        public DescribeImageSensitiveFileListResponseBodySensitiveFileList setAdvice(String advice) {
            this.advice = advice;
            return this;
        }
        public String getAdvice() {
            return this.advice;
        }

        public DescribeImageSensitiveFileListResponseBodySensitiveFileList setClassKey(String classKey) {
            this.classKey = classKey;
            return this;
        }
        public String getClassKey() {
            return this.classKey;
        }

        public DescribeImageSensitiveFileListResponseBodySensitiveFileList setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public DescribeImageSensitiveFileListResponseBodySensitiveFileList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageSensitiveFileListResponseBodySensitiveFileList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageSensitiveFileListResponseBodySensitiveFileList setFirstScanTime(Long firstScanTime) {
            this.firstScanTime = firstScanTime;
            return this;
        }
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        public DescribeImageSensitiveFileListResponseBodySensitiveFileList setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public DescribeImageSensitiveFileListResponseBodySensitiveFileList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeImageSensitiveFileListResponseBodySensitiveFileList setSensitiveFileKey(String sensitiveFileKey) {
            this.sensitiveFileKey = sensitiveFileKey;
            return this;
        }
        public String getSensitiveFileKey() {
            return this.sensitiveFileKey;
        }

        public DescribeImageSensitiveFileListResponseBodySensitiveFileList setSensitiveFileName(String sensitiveFileName) {
            this.sensitiveFileName = sensitiveFileName;
            return this;
        }
        public String getSensitiveFileName() {
            return this.sensitiveFileName;
        }

        public DescribeImageSensitiveFileListResponseBodySensitiveFileList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeImageSensitiveFileListResponseBodySensitiveFileList setUnprocessedNum(Integer unprocessedNum) {
            this.unprocessedNum = unprocessedNum;
            return this;
        }
        public Integer getUnprocessedNum() {
            return this.unprocessedNum;
        }

    }

}
