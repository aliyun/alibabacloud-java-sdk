// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileListResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageSensitiveFileListResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the information about the sensitive files.</p>
     */
    @NameInMap("SensitiveFileList")
    public java.util.List<DescribeImageSensitiveFileListResponseBodySensitiveFileList> sensitiveFileList;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
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
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The key of the last data entry.</p>
         */
        @NameInMap("LastRowKey")
        public String lastRowKey;

        /**
         * <p>The number of entries returned per page. Default value: 20.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
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
         * <p>The number of scans that are performed on the sensitive file.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The timestamp when the first scan was performed. Unit: milliseconds.</p>
         */
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        /**
         * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The risk level. Valid values:</p>
         * <br>
         * <p>*   **high**</p>
         * <p>*   **medium**</p>
         * <p>*   **low**</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The alert type for the sensitive file. Valid values:</p>
         * <br>
         * <p>*   **npm_token**: npm access token</p>
         * <p>*   **ftp_cfg**: FTP configuration</p>
         * <p>*   **google\_oauth_key**: Google OAuth key</p>
         * <p>*   **planetscale_passwd**: PlanetScale password</p>
         * <p>*   **github\_ssh_key**: GitHub SSH key</p>
         * <p>*   **msbuild\_publish_profile**: MSBuild publish profile</p>
         * <p>*   **fastly\_cdn_token**: Fastly CDN token</p>
         * <p>*   **ssh\_private_key**: SSH private key</p>
         * <p>*   **aws_cli**: AWS CLI credential</p>
         * <p>*   **cpanel_proftpd**: cPanel ProFTPD credential</p>
         * <p>*   **postgresql_passwd**: PostgreSQL password file</p>
         * <p>*   **discord\_client_cred**: Discord client credential</p>
         * <p>*   **rails_database**: Rails database configuration</p>
         * <p>*   **aws\_access_key**: AWS access key</p>
         * <p>*   **esmtp_cfg** :configuration of ESMTP</p>
         * <p>*   **docker\_registry_cfg**: configuration of a Docker image repository</p>
         * <p>*   **pem**: PEM</p>
         * <p>*   **common_cred**: common credential</p>
         * <p>*   **sftp_cfg**: SFTP connection configuration</p>
         * <p>*   **grafana_token**: Grafana token</p>
         * <p>*   **slack_token**: Slack token</p>
         * <p>*   **ec\_private_key**: EC private key</p>
         * <p>*   **pypi_token**: upload token for the PyPI</p>
         * <p>*   **finicity_token**: Finicity token</p>
         * <p>*   **k8s\_client_key**: Kubernetes private key</p>
         * <p>*   **git_cfg**: Git configuration</p>
         * <p>*   **django_key**: Django key</p>
         * <p>*   **jenkins_ssh**: Jenkins SSH configuration file</p>
         * <p>*   **openssh\_private_key**: OpenSSL private key</p>
         * <p>*   **square_oauth**: OAuth credential for Square</p>
         * <p>*   **typeform_token**: Typeform token</p>
         * <p>*   **common\_database_cfg**: general database connection configuration</p>
         * <p>*   **wordpress\_database_cfg**: WordPress database configuration</p>
         * <p>*   **googlecloud\_api_key**: API key for Google Cloud</p>
         * <p>*   **vscode_sftp**: VSCode SFTP configuration</p>
         * <p>*   **apache_htpasswd**: Apache htpasswd</p>
         * <p>*   **planetscale_token**: PlanetScale token</p>
         * <p>*   **contentful\_preview_token**: preview token for Contentful</p>
         * <p>*   **php\_database_cfg**: database password for a PHP application</p>
         * <p>*   **atom\_remote_sync**: Atom remote synchronization configuration</p>
         * <p>*   **aws\_session_token**: AWS session token</p>
         * <p>*   **atom\_sftp_cfg**: Atom SFTP configuration</p>
         * <p>*   **tencentcloud_ak**: Asana client key</p>
         * <p>*   **tencentcloud_ak**: secret ID of a third-party cloud</p>
         * <p>*   **rsa\_private_key**: RSA private key</p>
         * <p>*   **github\_personal_token**: personal access token for GitHub</p>
         * <p>*   **pgp**: PGP encrypted file</p>
         * <p>*   **stripe_skpk**: Stripe secret key</p>
         * <p>*   **square_token**: Square access token</p>
         * <p>*   **rails_carrierwave**: file upload credential for Rails Carrierwave</p>
         * <p>*   **dbeaver\_database_cfg**: DBeaver database configuration</p>
         * <p>*   **robomongo_cred**: credential for RoboMongo</p>
         * <p>*   **github\_oauth_token**: OAuth access token for GitHub</p>
         * <p>*   **pulumi_token**: Pulumi token</p>
         * <p>*   **ventrilo_voip**: configuration of a Ventrilo VoIP server</p>
         * <p>*   **macos_keychain**: macOS keychain</p>
         * <p>*   **amazon\_mws_token**: Amazon MWS token</p>
         * <p>*   **dynatrace_token**: Dynatrace token</p>
         * <p>*   **java_keystore**: JKS</p>
         * <p>*   **microsoft_sdf**: Microsoft SQL Server CE database</p>
         * <p>*   **kubernetes\_dashboard_cred**: user credential for Kubernetes Dashboard</p>
         * <p>*   **atlassian_token**: Atlassian token</p>
         * <p>*   **rdp**: RDP</p>
         * <p>*   **mailgun_key**: Mailgun webhook signing key</p>
         * <p>*   **mailchimp\_api_key**: API key for Mailchimp</p>
         * <p>*   **netrc_cfg**: .netrc configuration file</p>
         * <p>*   **openvpn_cfg**: OpenVPN configuration</p>
         * <p>*   **github\_refresh_token**: GitHub refresh token</p>
         * <p>*   **salesforce**: Salesforce credential</p>
         * <p>*   **salesforce**: Sendinblue credential</p>
         * <p>*   **pkcs\_private_key**: PKCS#12 key</p>
         * <p>*   **rubyonrails_passwd**: Ruby on Rails password file</p>
         * <p>*   **filezilla_ftp**: FileZilla FTP configuration</p>
         * <p>*   **databricks_token**: Databricks token</p>
         * <p>*   **gitLab\_personal_toke**: personal access token for GitLab</p>
         * <p>*   **rails\_master_key**: Rails master key</p>
         * <p>*   **sqlite**: SQLite3 or SQLite database</p>
         * <p>*   **firefox_logins**: Firefox logon configuration</p>
         * <p>*   **mailgun\_private_token**: Mailgun private token</p>
         * <p>*   **joomla_cfg**: Joomla configuration</p>
         * <p>*   **hashicorp\_terraform_token**: HashiCorp Terraform token</p>
         * <p>*   **jetbrains_ides**: JetBrains IDEs configuration</p>
         * <p>*   **heroku\_api_key**: Heroku API key</p>
         * <p>*   **messagebird_token**: MessageBird token</p>
         * <p>*   **messagebird_token**: MessageBird token</p>
         * <p>*   **hashicorp\_vault_token**: HashiCorp Vault token</p>
         * <p>*   **pgp\_private_key**: PGP private key</p>
         * <p>*   **sshpasswd**: SSH password</p>
         * <p>*   **huaweicloud_ak**: secret access key of a third-party cloud</p>
         * <p>*   **aws_s3cmd**: AWS S3cmd configuration</p>
         * <p>*   **php_config**: PHP configuration</p>
         * <p>*   **common\_private_key**: private key of a common type</p>
         * <p>*   **microsoft_mdf**: Microsoft SQL Server database</p>
         * <p>*   **mediawiki_cfg**: MediaWiki configuration</p>
         * <p>*   **jenkins_cred**: Jenkins credential</p>
         * <p>*   **rubygems_cred**: RubyGems credential</p>
         * <p>*   **clojars_token**: Clojars token</p>
         * <p>*   **phoenix\_web_passwd**: Phoenix web credential</p>
         * <p>*   **puttygen\_private_key**: PuTTYgen private key</p>
         * <p>*   **google\_oauth_token**: Google OAuth access token</p>
         * <p>*   **rubyonrails_cfg**: Ruby On Rails database configuration</p>
         * <p>*   **lob\_api_key**: Lob API key</p>
         * <p>*   **pkcs_cred**: PKCS#12 certificate</p>
         * <p>*   **otr\_private_key**: OTR private key</p>
         * <p>*   **contentful\_delivery_token**: delivery token for Contentful</p>
         * <p>*   **digital\_ocean_tugboat**: DigitalOcean Tugboat configuration</p>
         * <p>*   **dsa\_private_key**: Digital DSA private key</p>
         * <p>*   **rails\_app_token**: Rails app token</p>
         * <p>*   **git_cred**: Git user credential</p>
         * <p>*   **newrelic\_api_key**: User API key for New Relic</p>
         * <p>*   **github_hub**: hub configuration for storing GitHub tokens</p>
         * <p>*   **rubygem**: RubyGem token</p>
         */
        @NameInMap("SensitiveFileKey")
        public String sensitiveFileKey;

        /**
         * <p>The name of the alert type for the sensitive file.</p>
         */
        @NameInMap("SensitiveFileName")
        public String sensitiveFileName;

        public static DescribeImageSensitiveFileListResponseBodySensitiveFileList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSensitiveFileListResponseBodySensitiveFileList self = new DescribeImageSensitiveFileListResponseBodySensitiveFileList();
            return TeaModel.build(map, self);
        }

        public DescribeImageSensitiveFileListResponseBodySensitiveFileList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
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

    }

}
