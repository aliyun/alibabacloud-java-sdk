// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileByKeyResponseBody extends TeaModel {
    // The status code returned. If the 200 status code is returned, the request was successful.
    @NameInMap("Code")
    public String code;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeImageSensitiveFileByKeyResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of the sensitive files.
    @NameInMap("SensitiveFileList")
    public java.util.List<DescribeImageSensitiveFileByKeyResponseBodySensitiveFileList> sensitiveFileList;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
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
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The key of the last data entry.
        @NameInMap("LastRowKey")
        public String lastRowKey;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
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
        // The suggestion.
        @NameInMap("Advice")
        public String advice;

        // The file path.
        @NameInMap("FilePath")
        public String filePath;

        // The timestamp when the first scan was performed. Unit: milliseconds.
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        // The timestamp when the last scan was performed. Unit: milliseconds.
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        // The digest of the image layer.
        @NameInMap("LayerDigest")
        public String layerDigest;

        // The sensitive content.
        @NameInMap("Promt")
        public String promt;

        // The risk level of the sensitive file. Valid values:
        // 
        // *   **high**
        // *   **medium**
        // *   **low**
        @NameInMap("RiskLevel")
        public String riskLevel;

        // The alert type of the sensitive file. Valid values:
        // 
        // *   **npm_token**: NPM Token
        // *   **ftp_cfg**: FTP Config
        // *   **google\_oauth_key**: Google OAuth Key
        // *   **planetscale_passwd**: Planetscale password
        // *   **github\_ssh_key**: Github SSH Key
        // *   **msbuild\_publish_profile**: MSBuild publish profile
        // *   **fastly\_cdn_token**: Fastly CDN Token
        // *   **ssh\_private_key**: SSH Private Key
        // *   **aws_cli**: AWS CLI Credentials
        // *   **cpanel\_proftpd**: cPanel ProFTPd Credential
        // *   **postgresql_passwd**: PostgreSQl Passwd
        // *   **discord\_client_cred**: Discord Client Credential
        // *   **rails_database**: Rails Database Config
        // *   **aws\_access_key**: AWS Access Key
        // *   **esmtp_cfg**: ESMTP Config
        // *   **docker\_registry_cfg**: Docker Registry Config
        // *   **pem**: PEM
        // *   **common_cred**: Common Credential
        // *   **sftp_cfg**: SFTP Config
        // *   **grafana_token**: Grafana Token
        // *   **slack_token**: Slack Token
        // *   **ec\_private_key**: EC Private Key
        // *   **pypi_token**: PyPI Token
        // *   **finicity_token**: Finicity Token
        // *   **k8s\_client_key**: Kubernetes Client Key
        // *   **git_cfg**: Git Config
        // *   **django_key**: Django Key
        // *   **jenkins_ssh**: Jenkins SSH Config
        // *   **openssh\_private_key**: OPENSSH Private Key
        // *   **square_oauth**: Square OAuth Token
        // *   **typeform_token**: Typeform Token
        // *   **common\_database_cfg**: Common Database Config
        // *   **wordpress\_database_cfg**: Wordpress Database Config
        // *   **googlecloud\_api_key**: Google Cloud API Key
        // *   **vscode_sftp**: VSCode SFTP Config
        // *   **apache_htpasswd**: Apache htpasswd
        // *   **planetscale_token**: Planetscale Token
        // *   **contentful\_preview_token**: Contentful Preview Token
        // *   **php\_database_cfg**: PHP Database Config
        // *   **atom\_remote_sync**: Atom Remote Sync Config
        // *   **aws\_session_token**: AWS Session Token
        // *   **atom\_sftp_cfg**: Atom SFTP Config
        // *   **asana\_client\_private_key**: Asana Client Private Key
        // *   **tencentcloud_ak**: Tencent Cloud SecretId
        // *   **rsa\_private_key**: RSA Private Key
        // *   **github\_personal_token**: Github Personal Token
        // *   **pgp**: PGP
        // *   **stripe_skpk**: Stripe Secret Key
        // *   **square_token**: Square Token
        // *   **rails_carrierwave**: Rails Carrierwave Credential
        // *   **dbeaver\_database_cfg**: DBeaver Database Config
        // *   **robomongo_cred**: Robomongo Credential
        // *   **github\_oauth_token**: Github OAuth Token
        // *   **pulumi_token**: Pulumi Token
        // *   **ventrilo_voip**: Ventrilo VoIP Server Config
        // *   **macos_keychain**: macOS Keychain
        // *   **amazon\_mws_token**: Amazon MWS Token
        // *   **dynatrace_token**: Dynatrace Token
        // *   **java_keystore**: Java Keystore
        // *   **microsoft_sdf**: Microsoft SDF
        // *   **kubernetes\_dashboard_cred**: Kubernetes Dashboard User Credential
        // *   **atlassian_token**: Atlassian Token
        // *   **rdp**: RDP
        // *   **mailgun_key**: Mailgun Webhook Signing Key
        // *   **mailchimp\_api_key**: Mailchimp API Key
        // *   **netrc_cfg**: .netrc config
        // *   **openvpn_cfg**: OpenVPN Config
        // *   **github\_refresh_token**: Github Refresh Token
        // *   **salesforce**: Salesforce Credential
        // *   **sendinblue**: Sendinblue Token
        // *   **pkcs\_private_key**: PKCS Private Key
        // *   **rubyonrails_passwd**: Ruby on Rails Passwd
        // *   **filezilla_ftp**: FileZilla FTP Config
        // *   **databricks_token**: Databricks Token
        // *   **gitLab\_personal_token**: GitLab Personal Token
        // *   **rails\_master_key**: Rails Master Key
        // *   **sqlite**: SQLite3/SQLite Database
        // *   **firefox_logins**: Firefox Login Config
        // *   **mailgun\_private_token**: Mailgun Private Token
        // *   **joomla_cfg**: Joomla Config
        // *   **hashicorp\_terraform_token**: Hashicorp Terraform Token
        // *   **jetbrains_ides**: Jetbrains IDEs Config
        // *   **heroku\_api_key**: Heroku API key
        // *   **messagebird_token**: MessageBird Token
        // *   **github\_app_token**: Github App Token
        // *   **hashicorp\_vault_token**: Hashicorp Vault Token
        // *   **pgp\_private_key**: PGP Private Key
        // *   **sshpasswd**: SSH password
        // *   **huaweicloud_ak**: Huaei Cloud Access Key
        // *   **aws_s3cmd**: AWS S3cmd Config
        // *   **php_config**: php Config
        // *   **common\_private_key**: Common Private Key Type
        // *   **microsoft_mdf**: Microsoft MDF
        // *   **mediawiki_cfg**: MediaWiki Config
        // *   **jenkins_cred**: Jenkins Credential
        // *   **rubygems_cred**: Rubygems Credential
        // *   **clojars_token**: Clojars Token
        // *   **phoenix\_web_passwd**: Phoenix Web Credential
        // *   **puttygen\_private_key**: PuTTYgen Private Key
        // *   **google\_oauth_token**: Google Oauth Token
        // *   **rubyonrails_cfg**: Ruby On Rails Database Config
        // *   **lob\_api_key**: Lob API Key
        // *   **pkcs_cred**: PKCS#12
        // *   **otr\_private_key**: OTR Private Key
        // *   **contentful\_delivery_token**: Contentful Delivery Token
        // *   **digital\_ocean_tugboat**: Digital Ocean Tugboat Config
        // *   **dsa\_private_key**: DSA Private Key
        // *   **rails\_app_token**: Rails App Token
        // *   **git_cred**: Git User Credential
        // *   **newrelic\_api_key**: New Relic User API Key
        // *   **github_hub**: Github Token
        // *   **rubygem**: Rubygem Token
        @NameInMap("SensitiveFileKey")
        public String sensitiveFileKey;

        // The alert type name of the sensitive file.
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
