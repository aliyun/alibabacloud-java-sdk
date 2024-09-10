// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileByKeyResponseBody extends TeaModel {
    /**
     * <p>The status code returned. If the 200 status code is returned, the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
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
    public DescribeImageSensitiveFileByKeyResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F3B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the sensitive files.</p>
     */
    @NameInMap("SensitiveFileList")
    public java.util.List<DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList> sensitiveFileList;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeImageSensitiveFileByKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSensitiveFileByKeyResponseBody self = new DescribeImageSensitiveFileByKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageSensitiveFileByKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeImageSensitiveFileByKeyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeImageSensitiveFileByKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeImageSensitiveFileByKeyResponseBody setPageInfo(DescribeImageSensitiveFileByKeyResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeImageSensitiveFileByKeyResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeImageSensitiveFileByKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageSensitiveFileByKeyResponseBody setSensitiveFileList(java.util.List<DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList> sensitiveFileList) {
        this.sensitiveFileList = sensitiveFileList;
        return this;
    }
    public java.util.List<DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList> getSensitiveFileList() {
        return this.sensitiveFileList;
    }

    public DescribeImageSensitiveFileByKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeImageSensitiveFileByKeyResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The key of the last data entry.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESGgoSChAKDGNvbXBsZXRlVGltZRABCgQiAggAGAAiQAoJAGYXFWIAAAAACjMDLgAAADFTNzMyZDMwMzAzMDM1Mzc3Njc4MzA2ODY5NmI2YTY1Nzg2NTcxNjE2NDc4NjE=</p>
         */
        @NameInMap("LastRowKey")
        public String lastRowKey;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageSensitiveFileByKeyResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSensitiveFileByKeyResponseBodyPageInfo self = new DescribeImageSensitiveFileByKeyResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageSensitiveFileByKeyResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageSensitiveFileByKeyResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageSensitiveFileByKeyResponseBodyPageInfo setLastRowKey(String lastRowKey) {
            this.lastRowKey = lastRowKey;
            return this;
        }
        public String getLastRowKey() {
            return this.lastRowKey;
        }

        public DescribeImageSensitiveFileByKeyResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageSensitiveFileByKeyResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList extends TeaModel {
        /**
         * <p>The suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>Assess risks based on business conditions, remove risky content, and rebuild image</p>
         */
        @NameInMap("Advice")
        public String advice;

        /**
         * <p>The description of the sensitive file.</p>
         * 
         * <strong>example:</strong>
         * <p>Verify the validity of the leaked AK.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/lib/abc.txt</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The timestamp generated when the first scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1663321552000</p>
         */
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        /**
         * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1663691592000</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The digest of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0083a31cc0083a31ccf7c10367a6e783e8601e290f7c10367a6e783e860****</p>
         */
        @NameInMap("LayerDigest")
        public String layerDigest;

        /**
         * <p>The MD5 value of the sensitive file.</p>
         * 
         * <strong>example:</strong>
         * <p>b484b0dff093f358897486b58266****</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The sensitive content.</p>
         * 
         * <strong>example:</strong>
         * <p>AKPIDteow289f9s************</p>
         */
        @NameInMap("Promt")
        public String promt;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The type of the alert for the sensitive file. Valid values:</p>
         * <ul>
         * <li><strong>npm_token</strong>: NPM access token</li>
         * <li><strong>ftp_cfg</strong>: FTP configuration</li>
         * <li><strong>google_oauth_key</strong>: Google OAuth key</li>
         * <li><strong>planetscale_passwd</strong>: PlanetScale password</li>
         * <li><strong>github_ssh_key</strong>: Github SSH key</li>
         * <li><strong>msbuild_publish_profile</strong>: MSBuild publish profile</li>
         * <li><strong>fastly_cdn_token</strong>: Fastly CDN token</li>
         * <li><strong>ssh_private_key</strong>: SSH private key</li>
         * <li><strong>aws_cli</strong>: Amazon Web Services (AWS) CLI credential</li>
         * <li><strong>cpanel_proftpd</strong>: cPanel ProFTPD credential</li>
         * <li><strong>postgresql_passwd</strong>: PostgreSQL password file</li>
         * <li><strong>discord_client_cred</strong>: Discord client credential</li>
         * <li><strong>rails_database</strong>: Rails database configuration</li>
         * <li><strong>aws_access_key</strong>: AWS Access Key</li>
         * <li><strong>esmtp_cfg</strong>: Extended Simple Mail Transfer Protocol (ESMTP) configuration</li>
         * <li><strong>docker_registry_cfg</strong>: configuration of a Docker image repository</li>
         * <li><strong>pem</strong>: Privacy-Enhanced Mail (PEM)</li>
         * <li><strong>common_cred</strong>: common credential</li>
         * <li><strong>sftp_cfg</strong>: configuration of connection over Secure File Transfer Protocol (SFTP)</li>
         * <li><strong>grafana_token</strong>: Grafana token</li>
         * <li><strong>slack_token</strong>: Slack token</li>
         * <li><strong>ec_private_key</strong>: Elliptic Curve (EC) private key</li>
         * <li><strong>pypi_token</strong>: Python Package Index (PyPI) token</li>
         * <li><strong>finicity_token</strong>: Finicity token</li>
         * <li><strong>k8s_client_key</strong>: private key for the Kubernetes client</li>
         * <li><strong>git_cfg</strong>: Git configuration</li>
         * <li><strong>django_key</strong>: Django key</li>
         * <li><strong>jenkins_ssh</strong>: SSH configuration file for Jenkins</li>
         * <li><strong>openssh_private_key</strong>: OpenSSH private key</li>
         * <li><strong>square_oauth</strong>: Square OAuth credential</li>
         * <li><strong>typeform_token</strong>: Typeform token</li>
         * <li><strong>common_database_cfg</strong>: configuration of general database connection</li>
         * <li><strong>wordpress_database_cfg</strong>: WordPress database configuration</li>
         * <li><strong>googlecloud_api_key</strong>: API key for Google Cloud</li>
         * <li><strong>vscode_sftp</strong>: VSCode SFTP configuration</li>
         * <li><strong>apache_htpasswd</strong>: Apache htpasswd</li>
         * <li><strong>planetscale_token</strong>: PlanetScale token</li>
         * <li><strong>contentful_preview_token</strong>: preview token for Contentful</li>
         * <li><strong>php_database_cfg</strong>: database password for a PHP application</li>
         * <li><strong>atom_remote_sync</strong>: Atom remote synchronization configuration</li>
         * <li><strong>aws_session_token</strong>: AWS session token</li>
         * <li><strong>atom_sftp_cfg</strong>: Atom SFTP configuration</li>
         * <li><strong>asana_client_private_key</strong>: Asana client key</li>
         * <li><strong>tencentcloud_ak</strong>: secret ID of a third-party cloud</li>
         * <li><strong>rsa_private_key</strong>: Rivest-Shamir-Adleman (RSA) private key</li>
         * <li><strong>github_personal_token</strong>: personal access token for GitHub</li>
         * <li><strong>pgp</strong>: Pretty Good Privacy (PGP) encrypted file</li>
         * <li><strong>stripe_skpk</strong>: Stripe secret key</li>
         * <li><strong>square_token</strong>: Square access token</li>
         * <li><strong>rails_carrierwave</strong>: Rails Carrierwave credential</li>
         * <li><strong>dbeaver_database_cfg</strong>: DBeaver database configuration</li>
         * <li><strong>robomongo_cred</strong>: RoboMongo credential</li>
         * <li><strong>github_oauth_token</strong>: OAuth access token for GitHub</li>
         * <li><strong>pulumi_token</strong>: Pulumi token</li>
         * <li><strong>ventrilo_voip</strong>: configuration of a Ventrilo VoIP server</li>
         * <li><strong>macos_keychain</strong>: macOS Keychain</li>
         * <li><strong>amazon_mws_token</strong>: Amazon MWS token</li>
         * <li><strong>dynatrace_token</strong>: Dynatrace token</li>
         * <li><strong>java_keystore</strong>: Java KeyStore (JKS)</li>
         * <li><strong>microsoft_sdf</strong>: Microsoft SQL Server Compact Edition (CE) database</li>
         * <li><strong>kubernetes_dashboard_cred</strong>: user credential for Kubernetes Dashboard</li>
         * <li><strong>atlassian_token</strong>: Atlassian token</li>
         * <li><strong>rdp</strong>: remote desktop protocol (RDP)</li>
         * <li><strong>mailgun_key</strong>: Mailgun webhook signing key</li>
         * <li><strong>mailchimp_api_key</strong>: API key for Mailchimp</li>
         * <li><strong>netrc_cfg</strong>: netrc configuration file</li>
         * <li><strong>openvpn_cfg</strong>: configuration of the OpenVPN client</li>
         * <li><strong>github_refresh_token</strong>: GitHub refresh token</li>
         * <li><strong>salesforce</strong>: Salesforce credential</li>
         * <li><strong>salesforce</strong>: Sendinblue token</li>
         * <li><strong>pkcs_private_key</strong>: PKCS#12 private key</li>
         * <li><strong>rubyonrails_passwd</strong>: Ruby on Rails password file</li>
         * <li><strong>filezilla_ftp</strong>: FileZilla FTP configuration</li>
         * <li><strong>databricks_token</strong>: Databricks token</li>
         * <li><strong>gitLab_personal_toke</strong>: personal access token for GitLab</li>
         * <li><strong>rails_master_key</strong>: Rails master key</li>
         * <li><strong>sqlite</strong>: SQLite3 or SQLite database</li>
         * <li><strong>firefox_logins</strong>: Firefox logon configuration</li>
         * <li><strong>mailgun_private_token</strong>: Mailgun private token</li>
         * <li><strong>joomla_cfg</strong>: Joomla configuration</li>
         * <li><strong>hashicorp_terraform_token</strong>: HashiCorp Terraform token</li>
         * <li><strong>jetbrains_ides</strong>: JetBrains IDEs configuration</li>
         * <li><strong>heroku_api_key</strong>: API key for Heroku</li>
         * <li><strong>messagebird_token</strong>: MessageBird token</li>
         * <li><strong>github_app_token</strong>: Github app token</li>
         * <li><strong>hashicorp_vault_token</strong>: HashiCorp Vault token</li>
         * <li><strong>pgp_private_key</strong>: PGP private key</li>
         * <li><strong>sshpasswd</strong>: SSH password</li>
         * <li><strong>huaweicloud_ak</strong>: secret access key of a third-party cloud</li>
         * <li><strong>aws_s3cmd</strong>: AWS S3cmd configuration</li>
         * <li><strong>php_config</strong>: PHP configuration</li>
         * <li><strong>common_private_key</strong>: common private key</li>
         * <li><strong>microsoft_mdf</strong>: Microsoft SQL Server database</li>
         * <li><strong>mediawiki_cfg</strong>: MediaWiki configuration</li>
         * <li><strong>jenkins_cred</strong>: Jenkins credential</li>
         * <li><strong>rubygems_cred</strong>: RubyGems credential</li>
         * <li><strong>clojars_token</strong>: Clojars token</li>
         * <li><strong>phoenix_web_passwd</strong>: Phoenix web credential</li>
         * <li><strong>puttygen_private_key</strong>: PuTTYgen private key</li>
         * <li><strong>google_oauth_token</strong>: Google OAuth access token</li>
         * <li><strong>rubyonrails_cfg</strong>: Ruby On Rails database configuration</li>
         * <li><strong>lob_api_key</strong>: Lob API key for Lob</li>
         * <li><strong>pkcs_cred</strong>: PKCS#12 certificate</li>
         * <li><strong>otr_private_key</strong>: Off-the-Record Messaging (OTR) private key</li>
         * <li><strong>contentful_delivery_token</strong>: Contentful delivery token</li>
         * <li><strong>digital_ocean_tugboat</strong>: DigitalOcean Tugboat configuration</li>
         * <li><strong>dsa_private_key</strong>: Digital Signature Algorithm (DSA) private key</li>
         * <li><strong>rails_app_token</strong>: app token for Rails</li>
         * <li><strong>git_cred</strong>: Git user credential</li>
         * <li><strong>newrelic_api_key</strong>: User API key for New Relic</li>
         * <li><strong>github_hub</strong>: hub configuration for storing GitHub tokens</li>
         * <li><strong>rubygem</strong>: Rubygem Token</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>google_oauth_key</p>
         */
        @NameInMap("SensitiveFileKey")
        public String sensitiveFileKey;

        /**
         * <p>The name of the alert type for the sensitive file.</p>
         * 
         * <strong>example:</strong>
         * <p>Google OAuth Key</p>
         */
        @NameInMap("SensitiveFileName")
        public String sensitiveFileName;

        public static DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList self = new DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList();
            return TeaModel.build(map, self);
        }

        public DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList setAdvice(String advice) {
            this.advice = advice;
            return this;
        }
        public String getAdvice() {
            return this.advice;
        }

        public DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList setFirstScanTime(Long firstScanTime) {
            this.firstScanTime = firstScanTime;
            return this;
        }
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        public DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList setLayerDigest(String layerDigest) {
            this.layerDigest = layerDigest;
            return this;
        }
        public String getLayerDigest() {
            return this.layerDigest;
        }

        public DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList setPromt(String promt) {
            this.promt = promt;
            return this;
        }
        public String getPromt() {
            return this.promt;
        }

        public DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList setSensitiveFileKey(String sensitiveFileKey) {
            this.sensitiveFileKey = sensitiveFileKey;
            return this;
        }
        public String getSensitiveFileKey() {
            return this.sensitiveFileKey;
        }

        public DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList setSensitiveFileName(String sensitiveFileName) {
            this.sensitiveFileName = sensitiveFileName;
            return this;
        }
        public String getSensitiveFileName() {
            return this.sensitiveFileName;
        }

    }

}
