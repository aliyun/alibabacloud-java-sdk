// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileByKeyShrinkRequest extends TeaModel {
    /**
     * <p>Specifies the page number of the returned results. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The image UUID.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeImageListBySensitiveFile~~">DescribeImageListBySensitiveFile</a> operation to obtain this parameter from the ImageInfos[].Uuid field in the response.
     * This parameter is required. If you do not specify this parameter, the API returns an HTTP 400 error with the error code -101.
     * The ByKey suffix in the operation name indicates filtering by sensitive file type. To locate an image, you must specify this parameter (imageUuid). SensitiveFileKey is an optional filter condition for the sensitive file type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0083a31ccf7c10367a6e783e8601****</p>
     */
    @NameInMap("ImageUuid")
    public String imageUuid;

    /**
     * <p>Specifies the language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies the maximum number of entries to return on each page in a paging query. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The scan scope. Valid values:</p>
     * <ul>
     * <li><strong>image</strong>: image</li>
     * <li><strong>container</strong>: container</li>
     * </ul>
     */
    @NameInMap("ScanRange")
    public String scanRangeShrink;

    /**
     * <p>The sensitive file alerting type. Valid values:</p>
     * <ul>
     * <li><strong>npm_token</strong>: NPM access token</li>
     * <li><strong>ftp_cfg</strong>: FTP configuration</li>
     * <li><strong>google_oauth_key</strong>: Google OAuth key</li>
     * <li><strong>planetscale_passwd</strong>: PlanetScale password</li>
     * <li><strong>github_ssh_key</strong>: GitHub SSH key</li>
     * <li><strong>msbuild_publish_profile</strong>: MSBuild publish profile</li>
     * <li><strong>fastly_cdn_token</strong>: Fastly CDN token</li>
     * <li><strong>ssh_private_key</strong>: SSH private key</li>
     * <li><strong>aws_cli</strong>: AWS CLI credential</li>
     * <li><strong>cpanel_proftpd</strong>: cPanel ProFTPd credential</li>
     * <li><strong>postgresql_passwd</strong>: PostgreSQL password file</li>
     * <li><strong>discord_client_cred</strong>: Discord client credential</li>
     * <li><strong>rails_database</strong>: Rails database configuration</li>
     * <li><strong>aws_access_key</strong>: AWS access key</li>
     * <li><strong>esmtp_cfg</strong>: ESMTP mail server configuration</li>
     * <li><strong>docker_registry_cfg</strong>: Docker image repository configuration</li>
     * <li><strong>pem</strong>: PEM file</li>
     * <li><strong>common_cred</strong>: common credential</li>
     * <li><strong>sftp_cfg</strong>: SFTP connection configuration</li>
     * <li><strong>grafana_token</strong>: Grafana token</li>
     * <li><strong>slack_token</strong>: Slack token</li>
     * <li><strong>ec_private_key</strong>: EC private key</li>
     * <li><strong>pypi_token</strong>: PyPI upload token</li>
     * <li><strong>finicity_token</strong>: Finicity platform token</li>
     * <li><strong>k8s_client_key</strong>: Kubernetes client private key</li>
     * <li><strong>git_cfg</strong>: Git configuration</li>
     * <li><strong>django_key</strong>: Django key</li>
     * <li><strong>jenkins_ssh</strong>: Jenkins SSH configuration file</li>
     * <li><strong>openssh_private_key</strong>: OpenSSH private key</li>
     * <li><strong>square_oauth</strong>: Square OAuth credential</li>
     * <li><strong>typeform_token</strong>: Typeform token</li>
     * <li><strong>common_database_cfg</strong>: common database connection configuration</li>
     * <li><strong>wordpress_database_cfg</strong>: WordPress database configuration</li>
     * <li><strong>googlecloud_api_key</strong>: Google Cloud API key</li>
     * <li><strong>vscode_sftp</strong>: VSCode SFTP configuration</li>
     * <li><strong>apache_htpasswd</strong>: Apache htpasswd file</li>
     * <li><strong>planetscale_token</strong>: PlanetScale token</li>
     * <li><strong>contentful_preview_token</strong>: Contentful preview token</li>
     * <li><strong>php_database_cfg</strong>: PHP application database password</li>
     * <li><strong>atom_remote_sync</strong>: Atom remote synchronization configuration</li>
     * <li><strong>aws_session_token</strong>: AWS session token</li>
     * <li><strong>atom_sftp_cfg</strong>: Atom SFTP configuration</li>
     * <li><strong>asana_client_private_key</strong>: Asana project management platform client key</li>
     * <li><strong>tencentcloud_ak</strong>: Tencent Cloud SecretId</li>
     * <li><strong>rsa_private_key</strong>: RSA private key</li>
     * <li><strong>github_personal_token</strong>: GitHub personal access token</li>
     * <li><strong>pgp</strong>: PGP encrypted file</li>
     * <li><strong>stripe_skpk</strong>: Stripe secret key</li>
     * <li><strong>square_token</strong>: Square access token</li>
     * <li><strong>rails_carrierwave</strong>: Rails Carrierwave file upload credential</li>
     * <li><strong>dbeaver_database_cfg</strong>: DBeaver database configuration</li>
     * <li><strong>robomongo_cred</strong>: Robomongo credential</li>
     * <li><strong>github_oauth_token</strong>: GitHub OAuth access token</li>
     * <li><strong>pulumi_token</strong>: Pulumi token</li>
     * <li><strong>ventrilo_voip</strong>: Ventrilo VoIP server configuration</li>
     * <li><strong>macos_keychain</strong>: macOS keychain</li>
     * <li><strong>amazon_mws_token</strong>: Amazon MWS token</li>
     * <li><strong>dynatrace_token</strong>: Dynatrace token</li>
     * <li><strong>java_keystore</strong>: Java keystore</li>
     * <li><strong>microsoft_sdf</strong>: Microsoft SQL CE database</li>
     * <li><strong>kubernetes_dashboard_cred</strong>: Kubernetes Dashboard user credential</li>
     * <li><strong>atlassian_token</strong>: Atlassian token</li>
     * <li><strong>rdp</strong>: Remote Desktop Protocol (RDP) connection</li>
     * <li><strong>mailgun_key</strong>: Mailgun webhook signing key</li>
     * <li><strong>mailchimp_api_key</strong>: Mailchimp API key</li>
     * <li><strong>netrc_cfg</strong>: .netrc configuration file</li>
     * <li><strong>openvpn_cfg</strong>: OpenVPN client configuration</li>
     * <li><strong>github_refresh_token</strong>: GitHub refresh token</li>
     * <li><strong>salesforce</strong>: Salesforce credential</li>
     * <li><strong>sendinblue</strong>: Sendinblue token</li>
     * <li><strong>pkcs_private_key</strong>: PKCS#12 key</li>
     * <li><strong>rubyonrails_passwd</strong>: Ruby on Rails password file</li>
     * <li><strong>filezilla_ftp</strong>: FileZilla FTP configuration</li>
     * <li><strong>databricks_token</strong>: Databricks token</li>
     * <li><strong>gitLab_personal_token</strong>: GitLab personal access token</li>
     * <li><strong>rails_master_key</strong>: Rails master key</li>
     * <li><strong>sqlite</strong>: SQLite3/SQLite database</li>
     * <li><strong>firefox_logins</strong>: Firefox logon configuration</li>
     * <li><strong>mailgun_private_token</strong>: Mailgun private token</li>
     * <li><strong>joomla_cfg</strong>: Joomla configuration</li>
     * <li><strong>hashicorp_terraform_token</strong>: HashiCorp Terraform token</li>
     * <li><strong>jetbrains_ides</strong>: JetBrains IDEs configuration</li>
     * <li><strong>heroku_api_key</strong>: Heroku API key</li>
     * <li><strong>messagebird_token</strong>: MessageBird token</li>
     * <li><strong>github_app_token</strong>: GitHub App token</li>
     * <li><strong>hashicorp_vault_token</strong>: HashiCorp Vault token</li>
     * <li><strong>pgp_private_key</strong>: PGP private key</li>
     * <li><strong>sshpasswd</strong>: SSH password</li>
     * <li><strong>huaweicloud_ak</strong>: Huawei Cloud Secret Access Key</li>
     * <li><strong>aws_s3cmd</strong>: AWS S3cmd configuration</li>
     * <li><strong>php_config</strong>: PHP configuration</li>
     * <li><strong>common_private_key</strong>: common private key type</li>
     * <li><strong>microsoft_mdf</strong>: Microsoft SQL database</li>
     * <li><strong>mediawiki_cfg</strong>: MediaWiki configuration</li>
     * <li><strong>jenkins_cred</strong>: Jenkins credential</li>
     * <li><strong>rubygems_cred</strong>: RubyGems credential</li>
     * <li><strong>clojars_token</strong>: Clojars token</li>
     * <li><strong>phoenix_web_passwd</strong>: Phoenix web credential</li>
     * <li><strong>puttygen_private_key</strong>: PuTTYgen private key</li>
     * <li><strong>google_oauth_token</strong>: Google OAuth access token</li>
     * <li><strong>rubyonrails_cfg</strong>: Ruby on Rails database configuration</li>
     * <li><strong>lob_api_key</strong>: Lob API key</li>
     * <li><strong>pkcs_cred</strong>: PKCS#12 certificate</li>
     * <li><strong>otr_private_key</strong>: OTR private key</li>
     * <li><strong>contentful_delivery_token</strong>: Contentful delivery token</li>
     * <li><strong>digital_ocean_tugboat</strong>: DigitalOcean Tugboat configuration</li>
     * <li><strong>dsa_private_key</strong>: DSA private key</li>
     * <li><strong>rails_app_token</strong>: Rails app token</li>
     * <li><strong>git_cred</strong>: Git user credential</li>
     * <li><strong>newrelic_api_key</strong>: New Relic user API key</li>
     * <li><strong>github_hub</strong>: hub configuration that stores GitHub tokens</li>
     * <li><strong>rubygem</strong>: RubyGems token</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>google_oauth_key</p>
     */
    @NameInMap("SensitiveFileKey")
    public String sensitiveFileKey;

    public static DescribeImageSensitiveFileByKeyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSensitiveFileByKeyShrinkRequest self = new DescribeImageSensitiveFileByKeyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageSensitiveFileByKeyShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageSensitiveFileByKeyShrinkRequest setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
        return this;
    }
    public String getImageUuid() {
        return this.imageUuid;
    }

    public DescribeImageSensitiveFileByKeyShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageSensitiveFileByKeyShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageSensitiveFileByKeyShrinkRequest setScanRangeShrink(String scanRangeShrink) {
        this.scanRangeShrink = scanRangeShrink;
        return this;
    }
    public String getScanRangeShrink() {
        return this.scanRangeShrink;
    }

    public DescribeImageSensitiveFileByKeyShrinkRequest setSensitiveFileKey(String sensitiveFileKey) {
        this.sensitiveFileKey = sensitiveFileKey;
        return this;
    }
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
    }

}
