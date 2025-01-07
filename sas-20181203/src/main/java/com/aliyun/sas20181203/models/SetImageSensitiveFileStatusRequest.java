// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetImageSensitiveFileStatusRequest extends TeaModel {
    @NameInMap("IdList")
    public java.util.List<Long> idList;

    /**
     * <p>The UUID of the image. Separate multiple UUIDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>f382fccd88b94c5c8c864def6815b854,ac32fccd88b94c5c8c864def6815bo9z</p>
     */
    @NameInMap("ImageUuids")
    public String imageUuids;

    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    /**
     * <p>The alert type of the sensitive file. Valid values:</p>
     * <ul>
     * <li><strong>npm_token</strong>: Node Package Manager (NPM) access token.</li>
     * <li><strong>ftp_cfg</strong>: FTP configuration.</li>
     * <li><strong>google_oauth_key</strong>: Google OAuth key.</li>
     * <li><strong>planetscale_passwd</strong>: PlanetScale password.</li>
     * <li><strong>github_ssh_key</strong>: Github SSH key.</li>
     * <li><strong>msbuild_publish_profile</strong>: MSBuild publish profile.</li>
     * <li><strong>fastly_cdn_token</strong>: Fastly CDN token.</li>
     * <li><strong>ssh_private_key</strong>: SSH private key.</li>
     * <li><strong>aws_cli</strong>: Amazon Web Services (AWS) CLI credential.</li>
     * <li><strong>cpanel_proftpd</strong>: cPanel ProFTPD credential.</li>
     * <li><strong>postgresql_passwd</strong>: PostgreSQL password file.</li>
     * <li><strong>discord_client_cred</strong>: Discord client credential.</li>
     * <li><strong>rails_database</strong>: Rails database configuration.</li>
     * <li><strong>aws_access_key</strong>: AWS access key.</li>
     * <li><strong>esmtp_cfg</strong>: Extended Simple Mail Transfer Protocol (ESMTP) configuration.</li>
     * <li><strong>docker_registry_cfg</strong>: configuration of a Docker image repository.</li>
     * <li><strong>pem</strong>: Privacy-Enhanced Mail (PEM).</li>
     * <li><strong>common_cred</strong>: common credential.</li>
     * <li><strong>sftp_cfg</strong>: Secure File Transfer Protocol (SFTP) connection configuration.</li>
     * <li><strong>grafana_token</strong>: Grafana token.</li>
     * <li><strong>slack_token</strong>: Slack token.</li>
     * <li><strong>ec_private_key</strong>: Elliptic Curve (EC) private key.</li>
     * <li><strong>pypi_token</strong>: upload token for the Python Package Index (PyPI).</li>
     * <li><strong>finicity_token</strong>: Finicity token.</li>
     * <li><strong>k8s_client_key</strong>: private key for the Kubernetes client.</li>
     * <li><strong>git_cfg</strong>: Git configuration.</li>
     * <li><strong>django_key</strong>: Django key.</li>
     * <li><strong>jenkins_ssh</strong>: Jenkins SSH configuration file.</li>
     * <li><strong>openssh_private_key</strong>: OpenSSL private key.</li>
     * <li><strong>square_oauth</strong>: OAuth credential for Square.</li>
     * <li><strong>typeform_token</strong>: Typeform token.</li>
     * <li><strong>common_database_cfg</strong>: general database connection configuration.</li>
     * <li><strong>wordpress_database_cfg</strong>: WordPress database configuration.</li>
     * <li><strong>googlecloud_api_key</strong>: API key for Google Cloud.</li>
     * <li><strong>vscode_sftp</strong>: VSCode SFTP configuration.</li>
     * <li><strong>apache_htpasswd</strong>: Apache htpasswd.</li>
     * <li><strong>planetscale_token</strong>: PlanetScale token.</li>
     * <li><strong>contentful_preview_token</strong>: preview token for Contentful.</li>
     * <li><strong>php_database_cfg</strong>: database password for a PHP application.</li>
     * <li><strong>atom_remote_sync</strong>: Atom remote synchronization configuration.</li>
     * <li><strong>aws_session_token</strong>: AWS session token.</li>
     * <li><strong>atom_sftp_cfg</strong>: Atom SFTP configuration.</li>
     * <li><strong>asana_client_private_key</strong>: private key for the Asana client.</li>
     * <li><strong>tencentcloud_ak</strong>: secret ID of a third-party cloud.</li>
     * <li><strong>rsa_private_key</strong>: Rivest-Shamir-Adleman (RSA) private key.</li>
     * <li><strong>github_personal_token</strong>: personal access token for GitHub.</li>
     * <li><strong>pgp</strong>: Pretty Good Privacy (PGP) encrypted file.</li>
     * <li><strong>stripe_skpk</strong>: Stripe secret key.</li>
     * <li><strong>square_token</strong>: Square access token.</li>
     * <li><strong>rails_carrierwave</strong>: file upload credential for Rails Carrierwave.</li>
     * <li><strong>dbeaver_database_cfg</strong>: DBeaver database configuration.</li>
     * <li><strong>robomongo_cred</strong>: RoboMongo credential.</li>
     * <li><strong>github_oauth_token</strong>: OAuth access token for GitHub.</li>
     * <li><strong>pulumi_token</strong>: Pulumi token.</li>
     * <li><strong>ventrilo_voip</strong>: Ventrilo VoIP server configuration.</li>
     * <li><strong>macos_keychain</strong>: macOS keychain.</li>
     * <li><strong>amazon_mws_token</strong>: Amazon MWS token.</li>
     * <li><strong>dynatrace_token</strong>: Dynatrace token.</li>
     * <li><strong>java_keystore</strong>: Java KeyStore (JKS).</li>
     * <li><strong>microsoft_sdf</strong>: Microsoft SQL Server Compact Edition (CE) database.</li>
     * <li><strong>kubernetes_dashboard_cred</strong>: user credential for Kubernetes Dashboard.</li>
     * <li><strong>atlassian_token</strong>: Atlassian token.</li>
     * <li><strong>rdp</strong>: remote desktop protocol (RDP).</li>
     * <li><strong>mailgun_key</strong>: Mailgun webhook signing key.</li>
     * <li><strong>mailchimp_api_key</strong>: API key for Mailchimp.</li>
     * <li><strong>netrc_cfg</strong>: .netrc configuration file.</li>
     * <li><strong>openvpn_cfg</strong>: configuration of the OpenVPN client.</li>
     * <li><strong>github_refresh_token</strong>: GitHub refresh token.</li>
     * <li><strong>salesforce</strong>: Salesforce credential.</li>
     * <li><strong>salesforce</strong>: Sendinblue token.</li>
     * <li><strong>pkcs_private_key</strong>: PKCS#12 key.</li>
     * <li><strong>rubyonrails_passwd</strong>: Ruby on Rails password file.</li>
     * <li><strong>filezilla_ftp</strong>: FileZilla FTP configuration.</li>
     * <li><strong>databricks_token</strong>: Databricks token.</li>
     * <li><strong>gitLab_personal_toke</strong>: personal access token for GitLab.</li>
     * <li><strong>rails_master_key</strong>: Rails master key.</li>
     * <li><strong>sqlite</strong>: SQLite3 or SQLite database.</li>
     * <li><strong>firefox_logins</strong>: Firefox logon configuration.</li>
     * <li><strong>mailgun_private_token</strong>: Mailgun private token.</li>
     * <li><strong>joomla_cfg</strong>: Joomla configuration.</li>
     * <li><strong>hashicorp_terraform_token</strong>: HashiCorp Terraform token.</li>
     * <li><strong>jetbrains_ides</strong>: JetBrains IDEs configuration.</li>
     * <li><strong>heroku_api_key</strong>: Heroku API key.</li>
     * <li><strong>messagebird_token</strong>: MessageBird token.</li>
     * <li><strong>github_app_token</strong>: Github app token.</li>
     * <li><strong>hashicorp_vault_token</strong>: HashiCorp Vault token.</li>
     * <li><strong>pgp_private_key</strong>: PGP private key.</li>
     * <li><strong>sshpasswd</strong>: SSH password.</li>
     * <li><strong>huaweicloud_ak</strong>: secret access key of a third-party cloud.</li>
     * <li><strong>aws_s3cmd</strong>: AWS S3cmd configuration.</li>
     * <li><strong>php_config</strong>: PHP configuration.</li>
     * <li><strong>common_private_key</strong>: common private key.</li>
     * <li><strong>microsoft_mdf</strong>: Microsoft SQL Server database.</li>
     * <li><strong>mediawiki_cfg</strong>: MediaWiki configuration.</li>
     * <li><strong>jenkins_cred</strong>: Jenkins credential.</li>
     * <li><strong>rubygems_cred</strong>: RubyGems credential.</li>
     * <li><strong>clojars_token</strong>: Clojars token.</li>
     * <li><strong>phoenix_web_passwd</strong>: Phoenix web credential.</li>
     * <li><strong>puttygen_private_key</strong>: PuTTYgen private key.</li>
     * <li><strong>google_oauth_token</strong>: Google OAuth access token.</li>
     * <li><strong>rubyonrails_cfg</strong>: Ruby On Rails database configuration.</li>
     * <li><strong>lob_api_key</strong>: Lob API key.</li>
     * <li><strong>pkcs_cred</strong>: PKCS#12 certificate.</li>
     * <li><strong>otr_private_key</strong>: Off-the-Record Messaging (OTR) private key.</li>
     * <li><strong>contentful_delivery_token</strong>: Contentful delivery token.</li>
     * <li><strong>digital_ocean_tugboat</strong>: DigitalOcean Tugboat configuration.</li>
     * <li><strong>dsa_private_key</strong>: Digital Signature Algorithm (DSA) private key.</li>
     * <li><strong>rails_app_token</strong>: Rails app token.</li>
     * <li><strong>git_cred</strong>: Git user credential.</li>
     * <li><strong>newrelic_api_key</strong>: User API key for New Relic.</li>
     * <li><strong>github_hub</strong>: hub configuration for storing GitHub tokens.</li>
     * <li><strong>rubygem</strong>: RubyGem token.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pem</p>
     */
    @NameInMap("SensitiveFileKey")
    public String sensitiveFileKey;

    /**
     * <p>The status of the sensitive file. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The sensitive file is not handled.</li>
     * <li><strong>1</strong>: The sensitive file is added to a whitelist.</li>
     * <li><strong>2</strong>: The sensitive file is reported by mistake.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static SetImageSensitiveFileStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetImageSensitiveFileStatusRequest self = new SetImageSensitiveFileStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetImageSensitiveFileStatusRequest setIdList(java.util.List<Long> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    public SetImageSensitiveFileStatusRequest setImageUuids(String imageUuids) {
        this.imageUuids = imageUuids;
        return this;
    }
    public String getImageUuids() {
        return this.imageUuids;
    }

    public SetImageSensitiveFileStatusRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public SetImageSensitiveFileStatusRequest setSensitiveFileKey(String sensitiveFileKey) {
        this.sensitiveFileKey = sensitiveFileKey;
        return this;
    }
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
    }

    public SetImageSensitiveFileStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
