// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileListShrinkRequest extends TeaModel {
    /**
     * <p>The value of the sensitive file type.</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The type of the sensitive files that you want to query. Valid values:</p>
     * <br>
     * <p>*   **SensitiveFileKey**: the type of alerts for sensitive files. Valid values:</p>
     * <br>
     * <p>    *   **npm_token**: Node Package Manager (NPM) access token</p>
     * <p>    *   **ftp_cfg**: FTP configuration</p>
     * <p>    *   **google_oauth_key**: Google OAuth key</p>
     * <p>    *   **planetscale_passwd**: PlanetScale password</p>
     * <p>    *   **github_ssh_key**: Github SSH key</p>
     * <p>    *   **msbuild_publish_profile**: MSBuild publish profile</p>
     * <p>    *   **fastly_cdn_token**: Fastly CDN token</p>
     * <p>    *   **ssh_private_key**: SSH private key</p>
     * <p>    *   **aws_cli**: Amazon Web Services (AWS) CLI credentials</p>
     * <p>    *   **cpanel_proftpd**: cPanel ProFTPD credentials</p>
     * <p>    *   **postgresql_passwd**: PostgreSQL password</p>
     * <p>    *   **discord_client_cred**: Discord client credentials</p>
     * <p>    *   **rails_database**: Rails database configuration</p>
     * <p>    *   **aws_access_key**: AWS access key</p>
     * <p>    *   **esmtp_cfg**: Extended Simple Mail Transfer Protocol (ESMTP) configuration</p>
     * <p>    *   **docker_registry_cfg**: Docker image repository configuration</p>
     * <p>    *   **pem**: Privacy-Enhanced Mail (PEM)</p>
     * <p>    *   **common_cred**: common credentials</p>
     * <p>    *   **sftp_cfg**: Secure File Transfer Protocol (SFTP) connection configuration</p>
     * <p>    *   **grafana_token**: Grafana token</p>
     * <p>    *   **slack_token**: Slack token</p>
     * <p>    *   **ec_private_key**: EC private key</p>
     * <p>    *   **pypi_token**: upload token for the Python Package Index (PyPI)</p>
     * <p>    *   **finicity_token**: Finicity token</p>
     * <p>    *   **k8s_client_key**: Kubernetes private key</p>
     * <p>    *   **git_cfg**: Git configuration</p>
     * <p>    *   **django_key**: Django key</p>
     * <p>    *   **jenkins_ssh**: Jenkins SSH configuration file</p>
     * <p>    *   **openssh_private_key**: OpenSSL private key</p>
     * <p>    *   **square_oauth**: OAuth credential for Square</p>
     * <p>    *   **typeform_token**: Typeform token</p>
     * <p>    *   **common_database_cfg**: general database connection configuration</p>
     * <p>    *   **wordpress_database_cfg**: WordPress database configuration</p>
     * <p>    *   **googlecloud_api_key**: API key for Google Cloud</p>
     * <p>    *   **vscode_sftp**: VSCode SFTP configuration</p>
     * <p>    *   **apache_htpasswd**: Apache htpasswd</p>
     * <p>    *   **planetscale_token**: PlanetScale token</p>
     * <p>    *   **contentful_preview_token**: preview token for Contentful</p>
     * <p>    *   **php_database_cfg**: database password for a PHP application</p>
     * <p>    *   **atom_remote_sync**: Atom remote synchronization configuration</p>
     * <p>    *   **aws_session_token**: AWS session token</p>
     * <p>    *   **atom_sftp_cfg**: Atom SFTP configuration</p>
     * <p>    *   **asana_client_private_key**: Asana client key</p>
     * <p>    *   **tencentcloud_ak**: secret ID of a third-party cloud</p>
     * <p>    *   **rsa_private_key**: Rivest-Shamir-Adleman (RSA) private key</p>
     * <p>    *   **github_personal_token**: personal access token for GitHub</p>
     * <p>    *   **pgp**: Pretty Good Privacy (PGP) encrypted file</p>
     * <p>    *   **stripe_skpk**: Stripe secret key</p>
     * <p>    *   **square_token**: Square access token</p>
     * <p>    *   **rails_carrierwave**: file upload credentials for Rails Carrierwave</p>
     * <p>    *   **dbeaver_database_cfg**: DBeaver database configuration</p>
     * <p>    *   **robomongo_cred**: Robomongo credentials</p>
     * <p>    *   **github_oauth_token**: OAuth access token for GitHub</p>
     * <p>    *   **pulumi_token**: Pulumi token</p>
     * <p>    *   **ventrilo_voip**: Ventrilo VoIP server configuration</p>
     * <p>    *   **macos_keychain** :macOS keychain</p>
     * <p>    *   **amazon_mws_token**: Amazon MWS token</p>
     * <p>    *   **dynatrace_token**: Dynatrace token</p>
     * <p>    *   **java_keystore**: Java KeyStore (JKS)</p>
     * <p>    *   **microsoft_sdf**: Microsoft SQL Server Compact Edition (CE) database</p>
     * <p>    *   **kubernetes_dashboard_cred**: user credentials for Kubernetes Dashboard</p>
     * <p>    *   **atlassian_token**: Atlassian token</p>
     * <p>    *   **rdp**: remote desktop protocol (RDP)</p>
     * <p>    *   **mailgun_key**: Mailgun webhook signing key</p>
     * <p>    *   **mailchimp_api_key**: API key for Mailchimp</p>
     * <p>    *   **netrc_cfg**: .netrc configuration file</p>
     * <p>    *   **openvpn_cfg**: OpenVPN configuration</p>
     * <p>    *   **github_refresh_token**: GitHub refresh token</p>
     * <p>    *   **salesforce**: Salesforce credentials</p>
     * <p>    *   **salesforce**: Sendinblue credentials</p>
     * <p>    *   **pkcs_private_key**: PKCS#12 key</p>
     * <p>    *   **rubyonrails_passwd**: Ruby on Rails password file</p>
     * <p>    *   **filezilla_ftp**: FileZilla FTP configuration</p>
     * <p>    *   **databricks_token**: Databricks token</p>
     * <p>    *   **gitLab_personal_toke**: personal access token for GitLab</p>
     * <p>    *   **rails_master_key**: Rails master key</p>
     * <p>    *   **sqlite**: SQLite3 or SQLite database</p>
     * <p>    *   **firefox_logins**: Firefox logon configuration</p>
     * <p>    *   **mailgun_private_token**: Mailgun private token</p>
     * <p>    *   **joomla_cfg**: Joomla configuration</p>
     * <p>    *   **hashicorp_terraform_token**: HashiCorp Terraform token</p>
     * <p>    *   **jetbrains_ides**: JetBrains IDEs configuration</p>
     * <p>    *   **heroku_api_key**: Heroku API key</p>
     * <p>    *   **messagebird_token**: MessageBird token</p>
     * <p>    *   **messagebird_token**: MessageBird token</p>
     * <p>    *   **hashicorp_vault_token**: HashiCorp Vault token</p>
     * <p>    *   **pgp_private_key**: PGP private key</p>
     * <p>    *   **sshpasswd**: SSH password</p>
     * <p>    *   **huaweicloud_ak**: secret access key of a third-party cloud</p>
     * <p>    *   **aws_s3cmd**: AWS S3cmd configuration</p>
     * <p>    *   **php_config**: PHP configuration</p>
     * <p>    *   **common_private_key**: private key of a common type</p>
     * <p>    *   **microsoft_mdf**: Microsoft SQL Server database</p>
     * <p>    *   **mediawiki_cfg**: MediaWiki configuration</p>
     * <p>    *   **jenkins_cred**: Jenkins credentials</p>
     * <p>    *   **rubygems_cred**: RubyGems credentials</p>
     * <p>    *   **clojars_token**: Clojars token</p>
     * <p>    *   **phoenix_web_passwd**: Phoenix web credentials</p>
     * <p>    *   **puttygen_private_key**: PuTTYgen private key</p>
     * <p>    *   **google_oauth_token**: Google OAuth access token</p>
     * <p>    *   **rubyonrails_cfg**: Ruby On Rails database configuration</p>
     * <p>    *   **lob_api_key**: Lob API key</p>
     * <p>    *   **pkcs_cred**: PKCS#12 certificate</p>
     * <p>    *   **otr_private_key**: Off-the-Record Messaging (OTR) private key</p>
     * <p>    *   **contentful_delivery_token**: delivery token for Contentful</p>
     * <p>    *   **digital_ocean_tugboat**: DigitalOcean Tugboat configuration</p>
     * <p>    *   **dsa_private_key**: Digital Signature Algorithm (DSA) private key</p>
     * <p>    *   **rails_app_token**: Rails app token</p>
     * <p>    *   **git_cred**: Git user credential</p>
     * <p>    *   **newrelic_api_key**: User API key for New Relic</p>
     * <p>    *   **github_hub**: hub configuration for storing GitHub tokens</p>
     * <p>    *   **rubygem**: RubyGem token</p>
     * <br>
     * <p>*   **SensitiveFileName**: the name of the alert type for sensitive files.</p>
     */
    @NameInMap("CriteriaType")
    public String criteriaType;

    /**
     * <p>The number of the page to return. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The UUID of the image.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the UUIDs of images from the value of the **ImageUuid** response parameter.</p>
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
     * <p>The number of entries to return on each page. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
     * <p>An array that consists of the types of the assets that you want to scan. Valid values:</p>
     * <br>
     * <p>*   **image**</p>
     * <p>*   **container**</p>
     */
    @NameInMap("ScanRange")
    public String scanRangeShrink;

    public static DescribeImageSensitiveFileListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSensitiveFileListShrinkRequest self = new DescribeImageSensitiveFileListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageSensitiveFileListShrinkRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeImageSensitiveFileListShrinkRequest setCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
        return this;
    }
    public String getCriteriaType() {
        return this.criteriaType;
    }

    public DescribeImageSensitiveFileListShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageSensitiveFileListShrinkRequest setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
        return this;
    }
    public String getImageUuid() {
        return this.imageUuid;
    }

    public DescribeImageSensitiveFileListShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageSensitiveFileListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageSensitiveFileListShrinkRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeImageSensitiveFileListShrinkRequest setScanRangeShrink(String scanRangeShrink) {
        this.scanRangeShrink = scanRangeShrink;
        return this;
    }
    public String getScanRangeShrink() {
        return this.scanRangeShrink;
    }

}
