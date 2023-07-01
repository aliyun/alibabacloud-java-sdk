// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListBySensitiveFileRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The image digest.</p>
     * <p>> Fuzzy match is supported.</p>
     */
    @NameInMap("ImageDigest")
    public String imageDigest;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the container image.</p>
     * <br>
     * <p>> You can call the [ListRepository](~~451339~~) operation to query the IDs of container images from the value of the InstanceId response parameter.</p>
     */
    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    /**
     * <p>The name of the image repository.</p>
     * <br>
     * <p>> Fuzzy match is supported.</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The namespace to which the image repository belongs.</p>
     * <p>> Fuzzy match is supported.</p>
     */
    @NameInMap("RepoNamespace")
    public String repoNamespace;

    /**
     * <p>The risk level of the file. Separate multiple levels with commas (,). Valid values:</p>
     * <br>
     * <p>- **high**</p>
     * <p>- **medium**</p>
     * <p>- **low**</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>An array consisting of the types of the assets that you want to scan. Valid values:</p>
     * <p>- **image**</p>
     * <p>- **container**</p>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    /**
     * <p>The alert type of the sensitive file. Valid values:</p>
     * <br>
     * <p>*   **npm_token**: NPM Token</p>
     * <p>*   **ftp_cfg**: FTP Config</p>
     * <p>*   **google\_oauth_key**: Google OAuth Key</p>
     * <p>*   **planetscale_passwd**: Planetscale password</p>
     * <p>*   **github\_ssh_key**: Github SSH Key</p>
     * <p>*   **msbuild\_publish_profile**: MSBuild publish profile</p>
     * <p>*   **fastly\_cdn_token**: Fastly CDN Token</p>
     * <p>*   **ssh\_private_key**: SSH Private Key</p>
     * <p>*   **aws_cli**: AWS CLI Credentials</p>
     * <p>*   **cpanel\_proftpd**: cPanel ProFTPd Credential</p>
     * <p>*   **postgresql_passwd**: PostgreSQl Passwd</p>
     * <p>*   **discord\_client_cred**: Discord Client Credential</p>
     * <p>*   **rails_database**: Rails Database Config</p>
     * <p>*   **aws\_access_key**: AWS Access Key</p>
     * <p>*   **esmtp_cfg**: ESMTP Config</p>
     * <p>*   **docker\_registry_cfg**: Docker Registry Config</p>
     * <p>*   **pem**: PEM</p>
     * <p>*   **common_cred**: Common Credential</p>
     * <p>*   **sftp_cfg**: SFTP Config</p>
     * <p>*   **grafana_token**: Grafana Token</p>
     * <p>*   **slack_token**: Slack Token</p>
     * <p>*   **ec\_private_key**: EC Private Key</p>
     * <p>*   **pypi_token**: PyPI Token</p>
     * <p>*   **finicity_token**: Finicity Token</p>
     * <p>*   **k8s\_client_key**: Kubernetes Client Key</p>
     * <p>*   **git_cfg**: Git Config</p>
     * <p>*   **django_key**: Django Key</p>
     * <p>*   **jenkins_ssh**: Jenkins SSH Config</p>
     * <p>*   **openssh\_private_key**: OPENSSH Private Key</p>
     * <p>*   **square_oauth**: Square OAuth Token</p>
     * <p>*   **typeform_token**: Typeform Token</p>
     * <p>*   **common\_database_cfg**: Common Database Config</p>
     * <p>*   **wordpress\_database_cfg**: Wordpress Database Config</p>
     * <p>*   **googlecloud\_api_key**: Google Cloud API Key</p>
     * <p>*   **vscode_sftp**: VSCode SFTP Config</p>
     * <p>*   **apache_htpasswd**: Apache htpasswd</p>
     * <p>*   **planetscale_token**: Planetscale Token</p>
     * <p>*   **contentful\_preview_token**: Contentful Preview Token</p>
     * <p>*   **php\_database_cfg**: PHP Database Config</p>
     * <p>*   **atom\_remote_sync**: Atom Remote Sync Config</p>
     * <p>*   **aws\_session_token**: AWS Session Token</p>
     * <p>*   **atom\_sftp_cfg**: Atom SFTP Config</p>
     * <p>*   **asana\_client\_private_key**: Asana Client Private Key</p>
     * <p>*   **tencentcloud_ak**: Tencent Cloud SecretId</p>
     * <p>*   **rsa\_private_key**: RSA Private Key</p>
     * <p>*   **github\_personal_token**: Github Personal Token</p>
     * <p>*   **pgp**: PGP</p>
     * <p>*   **stripe_skpk**: Stripe Secret Key</p>
     * <p>*   **square_token**: Square Token</p>
     * <p>*   **rails_carrierwave**: Rails Carrierwave Credential</p>
     * <p>*   **dbeaver\_database_cfg**: DBeaver Database Config</p>
     * <p>*   **robomongo_cred**: Robomongo Credential</p>
     * <p>*   **github\_oauth_token**: Github OAuth Token</p>
     * <p>*   **pulumi_token**: Pulumi Token</p>
     * <p>*   **ventrilo_voip**: Ventrilo VoIP Server Config</p>
     * <p>*   **macos_keychain**: macOS Keychain</p>
     * <p>*   **amazon\_mws_token**: Amazon MWS Token</p>
     * <p>*   **dynatrace_token**: Dynatrace Token</p>
     * <p>*   **java_keystore**: Java Keystore</p>
     * <p>*   **microsoft_sdf**: Microsoft SDF</p>
     * <p>*   **kubernetes\_dashboard_cred**: Kubernetes Dashboard User Credential</p>
     * <p>*   **atlassian_token**: Atlassian Token</p>
     * <p>*   **rdp**: RDP</p>
     * <p>*   **mailgun_key**: Mailgun Webhook Signing Key</p>
     * <p>*   **mailchimp\_api_key**: Mailchimp API Key</p>
     * <p>*   **netrc_cfg**: .netrc config</p>
     * <p>*   **openvpn_cfg**: OpenVPN Config</p>
     * <p>*   **github\_refresh_token**: Github Refresh Token</p>
     * <p>*   **salesforce**: Salesforce Credential</p>
     * <p>*   **sendinblue**: Sendinblue Token</p>
     * <p>*   **pkcs\_private_key**: PKCS Private Key</p>
     * <p>*   **rubyonrails_passwd**: Ruby on Rails Passwd</p>
     * <p>*   **filezilla_ftp**: FileZilla FTP Config</p>
     * <p>*   **databricks_token**: Databricks Token</p>
     * <p>*   **gitLab\_personal_token**: GitLab Personal Token</p>
     * <p>*   **rails\_master_key**: Rails Master Key</p>
     * <p>*   **sqlite**: SQLite3/SQLite Database</p>
     * <p>*   **firefox_logins**: Firefox Login Config</p>
     * <p>*   **mailgun\_private_token**: Mailgun Private Token</p>
     * <p>*   **joomla_cfg**: Joomla Config</p>
     * <p>*   **hashicorp\_terraform_token**: Hashicorp Terraform Token</p>
     * <p>*   **jetbrains_ides**: Jetbrains IDEs Config</p>
     * <p>*   **heroku\_api_key**: Heroku API key</p>
     * <p>*   **messagebird_token**: MessageBird Token</p>
     * <p>*   **github\_app_token**: Github App Token</p>
     * <p>*   **hashicorp\_vault_token**: Hashicorp Vault Token</p>
     * <p>*   **pgp\_private_key**: PGP Private Key</p>
     * <p>*   **sshpasswd**: SSH password</p>
     * <p>*   **huaweicloud_ak**: Huaei Cloud Access Key</p>
     * <p>*   **aws_s3cmd**: AWS S3cmd Config</p>
     * <p>*   **php_config**: php Config</p>
     * <p>*   **common\_private_key**: Common Private Key Type</p>
     * <p>*   **microsoft_mdf**: Microsoft MDF</p>
     * <p>*   **mediawiki_cfg**: MediaWiki Config</p>
     * <p>*   **jenkins_cred**: Jenkins Credential</p>
     * <p>*   **rubygems_cred**: Rubygems Credential</p>
     * <p>*   **clojars_token**: Clojars Token</p>
     * <p>*   **phoenix\_web_passwd**: Phoenix Web Credential</p>
     * <p>*   **puttygen\_private_key**: PuTTYgen Private Key</p>
     * <p>*   **google\_oauth_token**: Google Oauth Token</p>
     * <p>*   **rubyonrails_cfg**: Ruby On Rails Database Config</p>
     * <p>*   **lob\_api_key**: Lob API Key</p>
     * <p>*   **pkcs_cred**: PKCS#12</p>
     * <p>*   **otr\_private_key**: OTR Private Key</p>
     * <p>*   **contentful\_delivery_token**: Contentful Delivery Token</p>
     * <p>*   **digital\_ocean_tugboat**: Digital Ocean Tugboat Config</p>
     * <p>*   **dsa\_private_key**: DSA Private Key</p>
     * <p>*   **rails\_app_token**: Rails App Token</p>
     * <p>*   **git_cred**: Git User Credential</p>
     * <p>*   **newrelic\_api_key**: New Relic User API Key</p>
     * <p>*   **github_hub**: Github Token</p>
     * <p>*   **rubygem**: Rubygem Token</p>
     */
    @NameInMap("SensitiveFileKey")
    public String sensitiveFileKey;

    public static DescribeImageListBySensitiveFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListBySensitiveFileRequest self = new DescribeImageListBySensitiveFileRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageListBySensitiveFileRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageListBySensitiveFileRequest setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }
    public String getImageDigest() {
        return this.imageDigest;
    }

    public DescribeImageListBySensitiveFileRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageListBySensitiveFileRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageListBySensitiveFileRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    public DescribeImageListBySensitiveFileRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public DescribeImageListBySensitiveFileRequest setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    public DescribeImageListBySensitiveFileRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeImageListBySensitiveFileRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public DescribeImageListBySensitiveFileRequest setSensitiveFileKey(String sensitiveFileKey) {
        this.sensitiveFileKey = sensitiveFileKey;
        return this;
    }
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
    }

}
