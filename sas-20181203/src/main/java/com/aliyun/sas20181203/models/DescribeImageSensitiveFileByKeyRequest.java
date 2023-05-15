// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileByKeyRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The UUID of the image.</p>
     */
    @NameInMap("ImageUuid")
    public String imageUuid;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the asset that you want to scan. Valid values:</p>
     * <br>
     * <p>*   **image**</p>
     * <p>*   **container**</p>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    /**
     * <p>The alert type of the sensitive file. Valid values:</p>
     * <br>
     * <p>*   **npm_token**: NPM Token</p>
     * <p>*   **ftp_cfg**: FTP Config</p>
     * <p>*   **google_oauth_key**: Google OAuth Key</p>
     * <p>*   **planetscale_passwd**: Planetscale password</p>
     * <p>*   **github_ssh_key**: Github SSH Key</p>
     * <p>*   **msbuild_publish_profile**: MSBuild publish profile</p>
     * <p>*   **fastly_cdn_token**: Fastly CDN Token</p>
     * <p>*   **ssh_private_key**: SSH Private Key</p>
     * <p>*   **aws_cli**: AWS CLI Credentials</p>
     * <p>*   **cpanel_proftpd**: cPanel ProFTPd Credential</p>
     * <p>*   **postgresql_passwd**: PostgreSQl Passwd</p>
     * <p>*   **discord_client_cred**: Discord Client Credential</p>
     * <p>*   **rails_database**: Rails Database Config</p>
     * <p>*   **aws_access_key**: AWS Access Key</p>
     * <p>*   **esmtp_cfg**: ESMTP Config</p>
     * <p>*   **docker_registry_cfg**: Docker Registry Config</p>
     * <p>*   **pem**: PEM</p>
     * <p>*   **common_cred**: Common Credential</p>
     * <p>*   **sftp_cfg**: SFTP Config</p>
     * <p>*   **grafana_token**: Grafana Token</p>
     * <p>*   **slack_token**: Slack Token</p>
     * <p>*   **ec_private_key**: EC Private Key</p>
     * <p>*   **pypi_token**: PyPI Token</p>
     * <p>*   **finicity_token**: Finicity Token</p>
     * <p>*   **k8s_client_key**: Kubernetes Client Key</p>
     * <p>*   **git_cfg**: Git Config</p>
     * <p>*   **django_key**: Django Key</p>
     * <p>*   **jenkins_ssh**: Jenkins SSH Config</p>
     * <p>*   **openssh_private_key**: OPENSSH Private Key</p>
     * <p>*   **square_oauth**: Square OAuth Token</p>
     * <p>*   **typeform_token**: Typeform Token</p>
     * <p>*   **common_database_cfg**: Common Database Config</p>
     * <p>*   **wordpress_database_cfg**: Wordpress Database Config</p>
     * <p>*   **googlecloud_api_key**: Google Cloud API Key</p>
     * <p>*   **vscode_sftp**: VSCode SFTP Config</p>
     * <p>*   **apache_htpasswd**: Apache htpasswd</p>
     * <p>*   **planetscale_token**: Planetscale Token</p>
     * <p>*   **contentful_preview_token**: Contentful Preview Token</p>
     * <p>*   **php_database_cfg**: PHP Database Config</p>
     * <p>*   **atom_remote_sync**: Atom Remote Sync Config</p>
     * <p>*   **aws_session_token**: AWS Session Token</p>
     * <p>*   **atom_sftp_cfg**: Atom SFTP Config</p>
     * <p>*   **asana_client_private_key**: Asana Client Private Key</p>
     * <p>*   **tencentcloud_ak**: Tencent Cloud SecretId</p>
     * <p>*   **rsa_private_key**: RSA Private Key</p>
     * <p>*   **github_personal_token**: Github Personal Token</p>
     * <p>*   **pgp**: PGP</p>
     * <p>*   **stripe_skpk**: Stripe Secret Key</p>
     * <p>*   **square_token**: Square Token</p>
     * <p>*   **rails_carrierwave**: Rails Carrierwave Credential</p>
     * <p>*   **dbeaver_database_cfg**: DBeaver Database Config</p>
     * <p>*   **robomongo_cred**: Robomongo Credential</p>
     * <p>*   **github_oauth_token**: Github OAuth Token</p>
     * <p>*   **pulumi_token**: Pulumi Token</p>
     * <p>*   **ventrilo_voip**: Ventrilo VoIP Server Config</p>
     * <p>*   **macos_keychain**: macOS Keychain</p>
     * <p>*   **amazon_mws_token**: Amazon MWS Token</p>
     * <p>*   **dynatrace_token**: Dynatrace Token</p>
     * <p>*   **java_keystore**: Java Keystore</p>
     * <p>*   **microsoft_sdf**: Microsoft SDF</p>
     * <p>*   **kubernetes_dashboard_cred**: Kubernetes Dashboard User Credential</p>
     * <p>*   **atlassian_token**: Atlassian Token</p>
     * <p>*   **rdp**: RDP</p>
     * <p>*   **mailgun_key**: Mailgun Webhook Signing Key</p>
     * <p>*   **mailchimp_api_key**: Mailchimp API Key</p>
     * <p>*   **netrc_cfg**: .netrc config</p>
     * <p>*   **openvpn_cfg**: OpenVPN Config</p>
     * <p>*   **github_refresh_token**: Github Refresh Token</p>
     * <p>*   **salesforce**: Salesforce Credential</p>
     * <p>*   **sendinblue**: Sendinblue Token</p>
     * <p>*   **pkcs_private_key**: PKCS Private Key</p>
     * <p>*   **rubyonrails_passwd**: Ruby on Rails Passwd</p>
     * <p>*   **filezilla_ftp**: FileZilla FTP Config</p>
     * <p>*   **databricks_token**: Databricks Token</p>
     * <p>*   **gitLab_personal_token**: GitLab Personal Token</p>
     * <p>*   **rails_master_key**: Rails Master Key</p>
     * <p>*   **sqlite**: SQLite3/SQLite Database</p>
     * <p>*   **firefox_logins**: Firefox Login Config</p>
     * <p>*   **mailgun_private_token**: Mailgun Private Token</p>
     * <p>*   **joomla_cfg**: Joomla Config</p>
     * <p>*   **hashicorp_terraform_token**: Hashicorp Terraform Token</p>
     * <p>*   **jetbrains_ides**: Jetbrains IDEs Config</p>
     * <p>*   **heroku_api_key**: Heroku API key</p>
     * <p>*   **messagebird_token**: MessageBird Token</p>
     * <p>*   **github_app_token**: Github App Token</p>
     * <p>*   **hashicorp_vault_token**: Hashicorp Vault Token</p>
     * <p>*   **pgp_private_key**: PGP Private Key</p>
     * <p>*   **sshpasswd**: SSH password</p>
     * <p>*   **huaweicloud_ak**: Huaei Cloud Access Key</p>
     * <p>*   **aws_s3cmd**: AWS S3cmd Config</p>
     * <p>*   **php_config**: php Config</p>
     * <p>*   **common_private_key**: Common Private Key Type</p>
     * <p>*   **microsoft_mdf**: Microsoft MDF</p>
     * <p>*   **mediawiki_cfg**: MediaWiki Config</p>
     * <p>*   **jenkins_cred**: Jenkins Credential</p>
     * <p>*   **rubygems_cred**: Rubygems Credential</p>
     * <p>*   **clojars_token**: Clojars Token</p>
     * <p>*   **phoenix_web_passwd**: Phoenix Web Credential</p>
     * <p>*   **puttygen_private_key**: PuTTYgen Private Key</p>
     * <p>*   **google_oauth_token**: Google Oauth Token</p>
     * <p>*   **rubyonrails_cfg**: Ruby On Rails Database Config</p>
     * <p>*   **lob_api_key**: Lob API Key</p>
     * <p>*   **pkcs_cred**: PKCS#12</p>
     * <p>*   **otr_private_key**: OTR Private Key</p>
     * <p>*   **contentful_delivery_token**: Contentful Delivery Token</p>
     * <p>*   **digital_ocean_tugboat**: Digital Ocean Tugboat Config</p>
     * <p>*   **dsa_private_key**: DSA Private Key</p>
     * <p>*   **rails_app_token**: Rails App Token</p>
     * <p>*   **git_cred**: Git User Credential</p>
     * <p>*   **newrelic_api_key**: New Relic User API Key</p>
     * <p>*   **github_hub**: Github Token</p>
     * <p>*   **rubygem**: Rubygem Token</p>
     */
    @NameInMap("SensitiveFileKey")
    public String sensitiveFileKey;

    public static DescribeImageSensitiveFileByKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSensitiveFileByKeyRequest self = new DescribeImageSensitiveFileByKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageSensitiveFileByKeyRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageSensitiveFileByKeyRequest setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
        return this;
    }
    public String getImageUuid() {
        return this.imageUuid;
    }

    public DescribeImageSensitiveFileByKeyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageSensitiveFileByKeyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageSensitiveFileByKeyRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public DescribeImageSensitiveFileByKeyRequest setSensitiveFileKey(String sensitiveFileKey) {
        this.sensitiveFileKey = sensitiveFileKey;
        return this;
    }
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
    }

}
