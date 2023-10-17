// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListBySensitiveFileShrinkRequest extends TeaModel {
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
     * <p>The ID of the specified container image.</p>
     * <br>
     * <p>> You can call the [ListRepository](~~451339~~) operation to obtain the IDs of container images from the value of the **InstanceId** response parameter.</p>
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
    public String scanRangeShrink;

    /**
     * <p>The type of the alert for the sensitive file. Valid values:</p>
     * <br>
     * <p>*   **npm_token**: npm access token.</p>
     * <p>*   **ftp_cfg**: FTP configuration.</p>
     * <p>*   **google_oauth_key**: Google OAuth key.</p>
     * <p>*   **planetscale_passwd**: PlanetScale password.</p>
     * <p>*   **github_ssh_key**: Github SSH key.</p>
     * <p>*   **msbuild_publish_profile**: MSBuild publish profile.</p>
     * <p>*   **fastly_cdn_token**: Fastly CDN token.</p>
     * <p>*   **ssh_private_key**: SSH private key.</p>
     * <p>*   **aws_cli**: Amazon Web Services (AWS) CLI credential.</p>
     * <p>*   **cpanel_proftpd**: cPanel ProFTPD credential.</p>
     * <p>*   **postgresql_passwd**: PostgreSQL password file.</p>
     * <p>*   **discord_client_cred**: Discord client credential.</p>
     * <p>*   **rails_database**: Rails database configuration.</p>
     * <p>*   **aws_access_key**: AWS access key.</p>
     * <p>*   **esmtp_cfg**: configuration of mail server over Extended Simple Mail Transfer Protocol (ESMTP).</p>
     * <p>*   **docker_registry_cfg**: configuration of a Docker image repository.</p>
     * <p>*   **pem**: Privacy-Enhanced Mail (PEM).</p>
     * <p>*   **common_cred**: common credential.</p>
     * <p>*   **sftp_cfg**: configuration of connection over Secure File Transfer Protocol (SFTP).</p>
     * <p>*   **grafana_token**: Grafana token.</p>
     * <p>*   **slack_token**: Slack token.</p>
     * <p>*   **ec_private_key**: Elliptic Curve (EC) private key.</p>
     * <p>*   **pypi_token**: Python Package Index (PyPI) token.</p>
     * <p>*   **finicity_token**: Finicity token.</p>
     * <p>*   **k8s_client_key**: private key for the Kubernetes client.</p>
     * <p>*   **git_cfg**: Git configuration.</p>
     * <p>*   **django_key**: Django key.</p>
     * <p>*   **jenkins_ssh**: SSH configuration file for Jenkins.</p>
     * <p>*   **openssh_private_key**: OpenSSH private key.</p>
     * <p>*   **square_oauth**: Square OAuth credential.</p>
     * <p>*   **typeform_token**: Typeform token.</p>
     * <p>*   **common_database_cfg**: configuration of general database connection.</p>
     * <p>*   **wordpress_database_cfg**: WordPress database configuration.</p>
     * <p>*   **googlecloud_api_key**: API key for Google Cloud.</p>
     * <p>*   **vscode_sftp**: VSCode SFTP configuration.</p>
     * <p>*   **apache_htpasswd**: Apache htpasswd.</p>
     * <p>*   **planetscale_token**: PlanetScale token.</p>
     * <p>*   **contentful_preview_token**: preview token for Contentful.</p>
     * <p>*   **php_database_cfg**: database password for a PHP application.</p>
     * <p>*   **atom_remote_sync**: Atom remote synchronization configuration.</p>
     * <p>*   **aws_session_token**: AWS session token.</p>
     * <p>*   **atom_sftp_cfg**: Atom SFTP configuration.</p>
     * <p>*   **asana_client_private_key**: private key for the Asana client.</p>
     * <p>*   **tencentcloud_ak**: secret ID of a third-party cloud.</p>
     * <p>*   **rsa_private_key**: Rivest-Shamir-Adleman (RSA) private key.</p>
     * <p>*   **github_personal_token**: personal access token for GitHub.</p>
     * <p>*   **pgp**: Pretty Good Privacy (PGP) encrypted file.</p>
     * <p>*   **stripe_skpk**: Stripe secret key.</p>
     * <p>*   **square_token**: Square access token.</p>
     * <p>*   **rails_carrierwave**: Rails Carrierwave credential.</p>
     * <p>*   **dbeaver_database_cfg**: DBeaver database configuration.</p>
     * <p>*   **robomongo_cred**: RoboMongo credential.</p>
     * <p>*   **github_oauth_token**: OAuth access token for GitHub.</p>
     * <p>*   **pulumi_token**: Pulumi token.</p>
     * <p>*   **ventrilo_voip**: configuration of a Ventrilo VoIP server.</p>
     * <p>*   **macos_keychain**: macOS keychain.</p>
     * <p>*   **amazon_mws_token**: Amazon MWS token.</p>
     * <p>*   **dynatrace_token**: Dynatrace token.</p>
     * <p>*   **java_keystore**: Java KeyStore (JKS).</p>
     * <p>*   **microsoft_sdf**: Microsoft SQL Server Compact Edition (CE) database.</p>
     * <p>*   **kubernetes_dashboard_cred**: user credential for Kubernetes Dashboard.</p>
     * <p>*   **atlassian_token**: Atlassian token.</p>
     * <p>*   **rdp**: remote desktop protocol (RDP).</p>
     * <p>*   **mailgun_key**: Mailgun webhook signing key.</p>
     * <p>*   **mailchimp_api_key**: API key for Mailchimp.</p>
     * <p>*   **netrc_cfg**: .netrc configuration file.</p>
     * <p>*   **openvpn_cfg**: configuration of the OpenVPN client.</p>
     * <p>*   **github_refresh_token**: GitHub refresh token.</p>
     * <p>*   **salesforce**: Salesforce credential.</p>
     * <p>*   **salesforce**: Sendinblue token.</p>
     * <p>*   **pkcs_private_key**: PKCS#12 private key.</p>
     * <p>*   **rubyonrails_passwd**: Ruby on Rails password file.</p>
     * <p>*   **filezilla_ftp**: FileZilla FTP configuration.</p>
     * <p>*   **databricks_token**: Databricks token.</p>
     * <p>*   **gitLab_personal_toke**: personal access token for GitLab.</p>
     * <p>*   **rails_master_key**: Rails master key.</p>
     * <p>*   **sqlite**: SQLite3 or SQLite database.</p>
     * <p>*   **firefox_logins**: Firefox logon configuration.</p>
     * <p>*   **mailgun_private_token**: Mailgun private token.</p>
     * <p>*   **joomla_cfg**: Joomla configuration.</p>
     * <p>*   **hashicorp_terraform_token**: HashiCorp Terraform token.</p>
     * <p>*   **jetbrains_ides**: JetBrains IDEs configuration.</p>
     * <p>*   **heroku_api_key**: API key for Heroku.</p>
     * <p>*   **messagebird_token**: MessageBird token.</p>
     * <p>*   **github_app_token**: Github app token.</p>
     * <p>*   **hashicorp_vault_token**: HashiCorp Vault token.</p>
     * <p>*   **pgp_private_key**: PGP private key.</p>
     * <p>*   **sshpasswd**: SSH password.</p>
     * <p>*   **huaweicloud_ak**: secret access key of a third-party cloud.</p>
     * <p>*   **aws_s3cmd**: AWS S3cmd configuration.</p>
     * <p>*   **php_config**: PHP configuration.</p>
     * <p>*   **common_private_key**: common private key.</p>
     * <p>*   **microsoft_mdf**: Microsoft SQL Server database.</p>
     * <p>*   **mediawiki_cfg**: MediaWiki configuration.</p>
     * <p>*   **jenkins_cred**: Jenkins credential.</p>
     * <p>*   **rubygems_cred**: RubyGems credential.</p>
     * <p>*   **clojars_token**: Clojars token.</p>
     * <p>*   **phoenix_web_passwd**: Phoenix web credential.</p>
     * <p>*   **puttygen_private_key**: PuTTYgen private key.</p>
     * <p>*   **google_oauth_token**: Google OAuth access token.</p>
     * <p>*   **rubyonrails_cfg**: Ruby On Rails database configuration.</p>
     * <p>*   **lob_api_key**: Lob API key for Lob.</p>
     * <p>*   **pkcs_cred**: PKCS#12 certificate.</p>
     * <p>*   **otr_private_key**: Off-the-Record Messaging (OTR) private key.</p>
     * <p>*   **contentful_delivery_token**: Contentful delivery token.</p>
     * <p>*   **digital_ocean_tugboat**: DigitalOcean Tugboat configuration.</p>
     * <p>*   **dsa_private_key**: Digital Signature Algorithm (DSA) private key.</p>
     * <p>*   **rails_app_token**: app token for Rails.</p>
     * <p>*   **git_cred**: user credential for Git.</p>
     * <p>*   **newrelic_api_key**: User API key for New Relic.</p>
     * <p>*   **github_hub**: hub configuration for storing GitHub tokens.</p>
     * <p>*   **rubygem**: RubyGem token.</p>
     */
    @NameInMap("SensitiveFileKey")
    public String sensitiveFileKey;

    @NameInMap("Status")
    public String status;

    public static DescribeImageListBySensitiveFileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListBySensitiveFileShrinkRequest self = new DescribeImageListBySensitiveFileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageListBySensitiveFileShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageListBySensitiveFileShrinkRequest setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }
    public String getImageDigest() {
        return this.imageDigest;
    }

    public DescribeImageListBySensitiveFileShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageListBySensitiveFileShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageListBySensitiveFileShrinkRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    public DescribeImageListBySensitiveFileShrinkRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public DescribeImageListBySensitiveFileShrinkRequest setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    public DescribeImageListBySensitiveFileShrinkRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeImageListBySensitiveFileShrinkRequest setScanRangeShrink(String scanRangeShrink) {
        this.scanRangeShrink = scanRangeShrink;
        return this;
    }
    public String getScanRangeShrink() {
        return this.scanRangeShrink;
    }

    public DescribeImageListBySensitiveFileShrinkRequest setSensitiveFileKey(String sensitiveFileKey) {
        this.sensitiveFileKey = sensitiveFileKey;
        return this;
    }
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
    }

    public DescribeImageListBySensitiveFileShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
