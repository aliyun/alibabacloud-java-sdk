// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileListResponseBody extends TeaModel {
    // The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
    @NameInMap("Code")
    public String code;

    // The HTTP status code.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeImageSensitiveFileListResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of the information about the sensitive files.
    @NameInMap("SensitiveFileList")
    public java.util.List<DescribeImageSensitiveFileListResponseBodySensitiveFileList> sensitiveFileList;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
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
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The key of the last data entry.
        @NameInMap("LastRowKey")
        public String lastRowKey;

        // The number of entries returned per page. Default value: 20.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
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
        // The number of scans that are performed on the sensitive file.
        @NameInMap("Count")
        public Integer count;

        // The timestamp when the first scan was performed. Unit: milliseconds.
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        // The timestamp when the last scan was performed. Unit: milliseconds.
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        // The risk level. Valid values:
        // 
        // *   **high**
        // *   **medium**
        // *   **low**
        @NameInMap("RiskLevel")
        public String riskLevel;

        // The alert type for the sensitive file. Valid values:
        // 
        // *   **npm_token**: npm access token
        // *   **ftp_cfg**: FTP configuration
        // *   **google\_oauth_key**: Google OAuth key
        // *   **planetscale_passwd**: PlanetScale password
        // *   **github\_ssh_key**: GitHub SSH key
        // *   **msbuild\_publish_profile**: MSBuild publish profile
        // *   **fastly\_cdn_token**: Fastly CDN token
        // *   **ssh\_private_key**: SSH private key
        // *   **aws_cli**: AWS CLI credential
        // *   **cpanel_proftpd**: cPanel ProFTPD credential
        // *   **postgresql_passwd**: PostgreSQL password file
        // *   **discord\_client_cred**: Discord client credential
        // *   **rails_database**: Rails database configuration
        // *   **aws\_access_key**: AWS access key
        // *   **esmtp_cfg** :configuration of ESMTP
        // *   **docker\_registry_cfg**: configuration of a Docker image repository
        // *   **pem**: PEM
        // *   **common_cred**: common credential
        // *   **sftp_cfg**: SFTP connection configuration
        // *   **grafana_token**: Grafana token
        // *   **slack_token**: Slack token
        // *   **ec\_private_key**: EC private key
        // *   **pypi_token**: upload token for the PyPI
        // *   **finicity_token**: Finicity token
        // *   **k8s\_client_key**: Kubernetes private key
        // *   **git_cfg**: Git configuration
        // *   **django_key**: Django key
        // *   **jenkins_ssh**: Jenkins SSH configuration file
        // *   **openssh\_private_key**: OpenSSL private key
        // *   **square_oauth**: OAuth credential for Square
        // *   **typeform_token**: Typeform token
        // *   **common\_database_cfg**: general database connection configuration
        // *   **wordpress\_database_cfg**: WordPress database configuration
        // *   **googlecloud\_api_key**: API key for Google Cloud
        // *   **vscode_sftp**: VSCode SFTP configuration
        // *   **apache_htpasswd**: Apache htpasswd
        // *   **planetscale_token**: PlanetScale token
        // *   **contentful\_preview_token**: preview token for Contentful
        // *   **php\_database_cfg**: database password for a PHP application
        // *   **atom\_remote_sync**: Atom remote synchronization configuration
        // *   **aws\_session_token**: AWS session token
        // *   **atom\_sftp_cfg**: Atom SFTP configuration
        // *   **tencentcloud_ak**: Asana client key
        // *   **tencentcloud_ak**: secret ID of a third-party cloud
        // *   **rsa\_private_key**: RSA private key
        // *   **github\_personal_token**: personal access token for GitHub
        // *   **pgp**: PGP encrypted file
        // *   **stripe_skpk**: Stripe secret key
        // *   **square_token**: Square access token
        // *   **rails_carrierwave**: file upload credential for Rails Carrierwave
        // *   **dbeaver\_database_cfg**: DBeaver database configuration
        // *   **robomongo_cred**: credential for RoboMongo
        // *   **github\_oauth_token**: OAuth access token for GitHub
        // *   **pulumi_token**: Pulumi token
        // *   **ventrilo_voip**: configuration of a Ventrilo VoIP server
        // *   **macos_keychain**: macOS keychain
        // *   **amazon\_mws_token**: Amazon MWS token
        // *   **dynatrace_token**: Dynatrace token
        // *   **java_keystore**: JKS
        // *   **microsoft_sdf**: Microsoft SQL Server CE database
        // *   **kubernetes\_dashboard_cred**: user credential for Kubernetes Dashboard
        // *   **atlassian_token**: Atlassian token
        // *   **rdp**: RDP
        // *   **mailgun_key**: Mailgun webhook signing key
        // *   **mailchimp\_api_key**: API key for Mailchimp
        // *   **netrc_cfg**: .netrc configuration file
        // *   **openvpn_cfg**: OpenVPN configuration
        // *   **github\_refresh_token**: GitHub refresh token
        // *   **salesforce**: Salesforce credential
        // *   **salesforce**: Sendinblue credential
        // *   **pkcs\_private_key**: PKCS#12 key
        // *   **rubyonrails_passwd**: Ruby on Rails password file
        // *   **filezilla_ftp**: FileZilla FTP configuration
        // *   **databricks_token**: Databricks token
        // *   **gitLab\_personal_toke**: personal access token for GitLab
        // *   **rails\_master_key**: Rails master key
        // *   **sqlite**: SQLite3 or SQLite database
        // *   **firefox_logins**: Firefox logon configuration
        // *   **mailgun\_private_token**: Mailgun private token
        // *   **joomla_cfg**: Joomla configuration
        // *   **hashicorp\_terraform_token**: HashiCorp Terraform token
        // *   **jetbrains_ides**: JetBrains IDEs configuration
        // *   **heroku\_api_key**: Heroku API key
        // *   **messagebird_token**: MessageBird token
        // *   **messagebird_token**: MessageBird token
        // *   **hashicorp\_vault_token**: HashiCorp Vault token
        // *   **pgp\_private_key**: PGP private key
        // *   **sshpasswd**: SSH password
        // *   **huaweicloud_ak**: secret access key of a third-party cloud
        // *   **aws_s3cmd**: AWS S3cmd configuration
        // *   **php_config**: PHP configuration
        // *   **common\_private_key**: private key of a common type
        // *   **microsoft_mdf**: Microsoft SQL Server database
        // *   **mediawiki_cfg**: MediaWiki configuration
        // *   **jenkins_cred**: Jenkins credential
        // *   **rubygems_cred**: RubyGems credential
        // *   **clojars_token**: Clojars token
        // *   **phoenix\_web_passwd**: Phoenix web credential
        // *   **puttygen\_private_key**: PuTTYgen private key
        // *   **google\_oauth_token**: Google OAuth access token
        // *   **rubyonrails_cfg**: Ruby On Rails database configuration
        // *   **lob\_api_key**: Lob API key
        // *   **pkcs_cred**: PKCS#12 certificate
        // *   **otr\_private_key**: OTR private key
        // *   **contentful\_delivery_token**: delivery token for Contentful
        // *   **digital\_ocean_tugboat**: DigitalOcean Tugboat configuration
        // *   **dsa\_private_key**: Digital DSA private key
        // *   **rails\_app_token**: Rails app token
        // *   **git_cred**: Git user credential
        // *   **newrelic\_api_key**: User API key for New Relic
        // *   **github_hub**: hub configuration for storing GitHub tokens
        // *   **rubygem**: RubyGem token
        @NameInMap("SensitiveFileKey")
        public String sensitiveFileKey;

        // The name of the alert type for the sensitive file.
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
