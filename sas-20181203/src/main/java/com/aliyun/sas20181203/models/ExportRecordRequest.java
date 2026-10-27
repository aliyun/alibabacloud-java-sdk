// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportRecordRequest extends TeaModel {
    /**
     * <p>The type of the file to export. Valid values:</p>
     * <ul>
     * <li><strong>virusScanExport</strong>: The detail export of virus scan tasks. This parameter is required when ExportType is set to virusScanExport.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>virusScanExport</p>
     */
    @NameInMap("ExportFileType")
    public String exportFileType;

    /**
     * <p>The type of the detection result list to export. Valid values:</p>
     * <ul>
     * <li><strong>assetInstance</strong>: The server list in Asset Center.</li>
     * <li><strong>user</strong>: The Asset Fingerprints list of accounts.</li>
     * <li><strong>port</strong>: The Asset Fingerprints list of ports.</li>
     * <li><strong>process</strong>: The Asset Fingerprints list of processes.</li>
     * <li><strong>sca</strong>: The Asset Fingerprints list of middleware.</li>
     * <li><strong>database</strong>: The Asset Fingerprints list of databases.</li>
     * <li><strong>web</strong>: The Asset Fingerprints list of web services.</li>
     * <li><strong>software</strong>: The Asset Fingerprints list of software.</li>
     * <li><strong>cron</strong>: The Asset Fingerprints list of scheduled nodes.</li>
     * <li><strong>autorun</strong>: The Asset Fingerprints list of startup items.</li>
     * <li><strong>lkm</strong>: The Asset Fingerprints list of kernel modules.</li>
     * <li><strong>webserver</strong>: The Asset Fingerprints list of websites.</li>
     * <li><strong>virusScanExport</strong>: The list of virus scan node details.</li>
     * <li><strong>imageVulExport</strong>: The image system vulnerability list.</li>
     * <li><strong>imageBaseLineExport</strong>: The image baseline check result list.</li>
     * <li><strong>imageAffectedMaliciousExport</strong>: The image malicious sample check result list.</li>
     * <li><strong>baselineCspm</strong>: The detection result list of cloud platform configuration checks.</li>
     * <li><strong>attack</strong>: The list of attack analysis alerting events.</li>
     * <li><strong>attackEvent</strong>: The list of network defense alerting events.</li>
     * <li><strong>accessKey</strong>: The list of AccessKey leak detection alerting events.</li>
     * <li><strong>exportObjectScanEvents</strong>: The list of malicious file detection alerting events.</li>
     * <li><strong>domainDetail</strong>: The website assets.</li>
     * <li><strong>assetsPropertyScaProcessDetail</strong>: The protected processes of Runtime Application Self-Protection (RASP).</li>
     * <li><strong>exportHcWarning</strong>: The system baseline risk list.</li>
     * <li><strong>raspAttackAlert</strong>: The list of RASP attack alerting.</li>
     * <li><strong>raspApplicationConfiguration</strong>: The list of RASP application configurations.</li>
     * <li><strong>raspWeaknessDetection</strong>: The list of RASP weakness detections.</li>
     * <li><strong>raspInMemoryWebshellDetection</strong>: The list of RASP in-memory webshell detection alerting.</li>
     * <li><strong>raspInMemoryWebshellInsertion</strong>: The list of RASP in-memory webshell injection alerting.</li>
     * <li><strong>listAgentExport</strong>: The agent list.</li>
     * <li><strong>listSkillExport</strong>: The skill list.</li>
     * <li><strong>listModelExport</strong>: The model list.</li>
     * <li><strong>listAiAgentEventExport</strong>: The AI agent risk list.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>database</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>Specifies the language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies the filter conditions for the exported content.</p>
     * <blockquote>
     * <ul>
     * <li>When <strong>ExportType</strong> is set to <strong>assetInstance</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>MachineTypes</strong>: the asset types. Separate multiple values with commas.</li>
     * <li><strong>Criteria</strong>: the combined filter conditions in JSON array format, such as <code>[{&quot;name&quot;:&quot;fieldName&quot;,&quot;value&quot;:&quot;value&quot;},...]</code>. If you specify multiple values for the same field, a multi-value filter is applied. Multiple conditions are combined by using the OR operator by default. Valid values for <strong>name</strong>:<blockquote>
     * <ul>
     * <li><strong>internetIp</strong>: the public IP address.</li>
     * <li><strong>intranetIp</strong>: the private IP address.</li>
     * <li><strong>instanceName</strong>: the instance name.</li>
     * <li><strong>instanceId</strong>: the instance ID.</li>
     * <li><strong>vpcInstanceId</strong>: the VPC instance ID.</li>
     * <li><strong>machineType</strong>: the asset type.</li>
     * <li><strong>osName</strong>: the operating system name.</li>
     * <li><strong>osType</strong>: the operating system type. Valid values:<blockquote>
     * <ul>
     * <li><strong>linux</strong>: Linux.</li>
     * <li><strong>windows</strong>: Windows.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>hcStatus</strong>: the baseline risk status. Valid values:<blockquote>
     * <ul>
     * <li><strong>NO</strong>: No baseline risks.</li>
     * <li><strong>YES</strong>: Baseline risks exist.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>vulStatus</strong>: the vulnerability risk status. Valid values:<blockquote>
     * <ul>
     * <li><strong>NO</strong>: No vulnerability risks.</li>
     * <li><strong>YES</strong>: Vulnerability risks exist.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>asapVulStatus</strong>: the urgent vulnerability risk status. Valid values:<blockquote>
     * <ul>
     * <li><strong>NO</strong>: No urgent vulnerability risks.</li>
     * <li><strong>YES</strong>: Urgent vulnerability risks exist.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>alarmStatus</strong>: the alert status. Valid values:<blockquote>
     * <ul>
     * <li><strong>NO</strong>: No alerts.</li>
     * <li><strong>YES</strong>: Alerts exist.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>riskStatus</strong>: the overall risk status. Valid values:<blockquote>
     * <ul>
     * <li><strong>NO</strong>: No risks.</li>
     * <li><strong>YES</strong>: Risks exist.</li>
     * <li><strong>UNKNOWN</strong>: Unknown.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>clientStatus</strong>: the client status. Valid values:<blockquote>
     * <ul>
     * <li><strong>online</strong>: Online.</li>
     * <li><strong>offline</strong>: Offline.</li>
     * <li><strong>pause</strong>: Paused.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>clientSubStatus</strong>: the client sub-status. Valid values:<blockquote>
     * <ul>
     * <li><strong>online</strong>: Online.</li>
     * <li><strong>offline</strong>: Offline.</li>
     * <li><strong>pause</strong>: Paused.</li>
     * <li><strong>stopped</strong>: Stopped.</li>
     * <li><strong>uninstalled</strong>: Uninstalled.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>runningStatus</strong>: the running status. Valid values:<blockquote>
     * <ul>
     * <li><strong>Running</strong>: Running.</li>
     * <li><strong>notRunning</strong>: Not running.</li>
     * <li><strong>UNKNOWN</strong>: Unknown.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>tagName</strong>: the tag name.</li>
     * <li><strong>tagKeyValue</strong>: the tag key-value pair.</li>
     * <li><strong>vendorAuthAlias</strong>: the alias of the cloud service provider account.</li>
     * <li><strong>vendorUid</strong>: the UID of the cloud service provider account.</li>
     * <li><strong>vendorUserName</strong>: the name of the cloud service provider account.</li>
     * <li><strong>clusterId</strong>: the cluster ID.</li>
     * <li><strong>clusterIdList</strong>: the cluster IDs. Separate multiple IDs with commas.</li>
     * <li><strong>namespace</strong>: the namespace.</li>
     * <li><strong>appName</strong>: the application name.</li>
     * <li><strong>serviceId</strong>: the service ID in the container dimension.</li>
     * <li><strong>clusterNodeStatus</strong>: the cluster node status. Valid values:<blockquote>
     * <ul>
     * <li><strong>true</strong>: The asset is a cluster node.</li>
     * <li><strong>false</strong>: The asset is not a cluster node.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>groupName</strong>: the asset group name.</li>
     * <li><strong>groupId</strong>: the asset group ID.</li>
     * <li><strong>regionId</strong>: the region ID.</li>
     * <li><strong>importance</strong>: the importance level. Valid values:<blockquote>
     * <ul>
     * <li><strong>important</strong>: Important asset.</li>
     * <li><strong>general</strong>: General asset.</li>
     * <li><strong>test</strong>: Test asset.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>newInstance</strong>: the identifier for newly added assets. Valid values:<blockquote>
     * <ul>
     * <li><strong>NO</strong>: Not a newly added asset.</li>
     * <li><strong>YES</strong>: Newly added asset.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>containerStatus</strong>: the container status. Valid values:<blockquote>
     * <ul>
     * <li><strong>NO</strong>: No containers.</li>
     * <li><strong>YES</strong>: Containers exist.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>exposedStatus</strong>: the exposure status. Valid values:<blockquote>
     * <ul>
     * <li><strong>NO</strong>: Not exposed.</li>
     * <li><strong>YES</strong>: Exposed.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>aiStatus</strong>: the AI asset status. Valid values:<blockquote>
     * <ul>
     * <li><strong>true</strong>: AI asset.</li>
     * <li><strong>false</strong>: Non-AI asset.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>authVersion</strong>: the client version. Valid values:<blockquote>
     * <ul>
     * <li><strong>1</strong>: Free Edition.</li>
     * <li><strong>3</strong>: Enterprise Edition.</li>
     * <li><strong>5</strong>: Advanced Edition.</li>
     * <li><strong>6</strong>: Anti-virus Edition.</li>
     * <li><strong>7</strong>: Ultimate Edition.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>ipList</strong>: the IP addresses. Separate multiple IP addresses with commas.</li>
     * <li><strong>uuidList</strong>: the asset UUIDs.</li>
     * <li><strong>ecsType</strong>: the instance type.</li>
     * <li><strong>alisecguardStatus</strong>: the status of the protection plugin. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: Online.</li>
     * <li><strong>1</strong>: Disabled.</li>
     * <li><strong>2</strong>: Offline.</li>
     * <li><strong>-99</strong>: Installation failed.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>alihipsStatus</strong>: the status of the host intrusion prevention plugin. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: Online.</li>
     * <li><strong>1</strong>: Disabled.</li>
     * <li><strong>2</strong>: Offline.</li>
     * <li><strong>-99</strong>: Installation failed.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>alinetStatus</strong>: the status of the network protection plugin. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: Online.</li>
     * <li><strong>1</strong>: Disabled.</li>
     * <li><strong>2</strong>: Offline.</li>
     * <li><strong>-99</strong>: Installation failed.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>alidetStatus</strong>: the status of the detection plugin. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: Online.</li>
     * <li><strong>1</strong>: Disabled.</li>
     * <li><strong>2</strong>: Offline.</li>
     * <li><strong>-99</strong>: Installation failed.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>yundunMonitorStatus</strong>: the status of the monitoring plugin. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: Online.</li>
     * <li><strong>1</strong>: Disabled.</li>
     * <li><strong>2</strong>: Offline.</li>
     * <li><strong>-99</strong>: Installation failed.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>Importance</strong>: the importance level.</li>
     * <li><strong>LogicalExp</strong>: the logical operator used to combine multiple conditions. Valid values:<blockquote>
     * <ul>
     * <li><strong>AND</strong>: All conditions must be met.</li>
     * <li><strong>OR</strong>: Any condition is met. This is the default value.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>user</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>User</strong>: the account name.</li>
     * <li><strong>IsRoot</strong>: specifies whether the account has root permissions. Valid values:<blockquote>
     * <ul>
     * <li><strong>1</strong>: Yes.</li>
     * <li><strong>2</strong>: No.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>LastLoginTimeStart</strong>: the start time of the query range for the last logon time. Unit: milliseconds.</li>
     * <li><strong>LastLoginTimeEnd</strong>: the end time of the query range for the last logon time. Unit: milliseconds.</li>
     * <li><strong>uuid</strong>: the asset UUIDs. Separate multiple UUIDs with commas.</li>
     * <li><strong>remark</strong>: the remarks. This parameter matches the server name, public IP address, and private IP address at the same time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>port</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>port</strong>: the port number.</li>
     * <li><strong>procName</strong>: the process name.</li>
     * <li><strong>bindIp</strong>: the bound IP address.</li>
     * <li><strong>remark</strong>: the remarks. This parameter matches the server name, public IP address, and private IP address at the same time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>process</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>name</strong>: the process name.</li>
     * <li><strong>user</strong>: the user that runs the process.</li>
     * <li><strong>cmdline</strong>: the command line.</li>
     * <li><strong>procTimeStart</strong>: the start time of the query range for the process startup time. Unit: milliseconds.</li>
     * <li><strong>procTimeEnd</strong>: the end time of the query range for the process startup time. Unit: milliseconds.</li>
     * <li><strong>uuid</strong>: the asset UUIDs. Separate multiple UUIDs with commas. Only the data of the specified assets is exported.</li>
     * <li><strong>remark</strong>: the remarks. This parameter matches the server name, public IP address, and private IP address at the same time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>sca</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>scaName</strong>: the middleware name.</li>
     * <li><strong>scaVersion</strong>: the middleware version.</li>
     * <li><strong>port</strong>: the port.</li>
     * <li><strong>pid</strong>: the process ID.</li>
     * <li><strong>user</strong>: the user.</li>
     * <li><strong>processStartedStart</strong>: the start time of the query range for the process startup time. Unit: milliseconds.</li>
     * <li><strong>processStartedEnd</strong>: the end time of the query range for the process startup time. Unit: milliseconds.</li>
     * <li><strong>searchItem</strong>: the search field name. This parameter is used together with <strong>searchInfo</strong> to specify the field by which to search. Valid values:<blockquote>
     * <ul>
     * <li><strong>name</strong>: searches by component name. In this case, set <strong>searchInfo</strong> to the component name.</li>
     * <li><strong>type</strong>: searches by component type. In this case, set <strong>searchInfo</strong> to the component type.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>searchInfo</strong>: the search value. This parameter is used together with <strong>searchItem</strong>.</li>
     * <li><strong>uuid</strong>: the asset UUIDs. Separate multiple UUIDs with commas. Only the data of the specified assets is exported.</li>
     * <li><strong>remark</strong>: the remarks. This parameter matches the server name, public IP address, and private IP address at the same time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>database</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>port</strong>: the port.</li>
     * <li><strong>pid</strong>: the process ID.</li>
     * <li><strong>user</strong>: the user.</li>
     * <li><strong>ScaVersion</strong>: the version.</li>
     * <li><strong>processStartedStart</strong>: the start time of the query range for the process startup time. Unit: milliseconds.</li>
     * <li><strong>processStartedEnd</strong>: the end time of the query range for the process startup time. Unit: milliseconds.</li>
     * <li><strong>searchItem</strong>: the search field name. This parameter is used together with <strong>searchInfo</strong> to specify the field by which to search. Valid values:<blockquote>
     * <ul>
     * <li><strong>name</strong>: searches by database name. In this case, set <strong>searchInfo</strong> to the component name.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>searchInfo</strong>: the search value. This parameter is used together with <strong>searchItem</strong>.</li>
     * <li><strong>uuid</strong>: the asset UUIDs. Separate multiple UUIDs with commas. Only the data of the specified assets is exported.</li>
     * <li><strong>remark</strong>: the remarks. This parameter matches the server name, public IP address, and private IP address at the same time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>web</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>scaName</strong>: the web service name.</li>
     * <li><strong>scaNamePattern</strong>: the component name for fuzzy search.</li>
     * <li><strong>scaVersion</strong>: the version.</li>
     * <li><strong>bizType</strong>: the type. Set the value to <strong>sca_web</strong>.</li>
     * <li><strong>port</strong>: the port.</li>
     * <li><strong>pid</strong>: the process ID.</li>
     * <li><strong>user</strong>: the user.</li>
     * <li><strong>processStartedStart</strong>: the start time of the query range for the process startup time. Unit: milliseconds.</li>
     * <li><strong>processStartedEnd</strong>: the end time of the query range for the process startup time. Unit: milliseconds.</li>
     * <li><strong>searchItem</strong>: the search field name. This parameter is used together with <strong>searchInfo</strong> to specify the field by which to search. Valid values:<blockquote>
     * <ul>
     * <li><strong>name</strong>: searches by component name. In this case, set <strong>searchInfo</strong> to the component name.</li>
     * <li><strong>type</strong>: searches by component type. In this case, set <strong>searchInfo</strong> to the component type.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>searchInfo</strong>: the search value. This parameter is used together with <strong>searchItem</strong>.</li>
     * <li><strong>uuid</strong>: the asset UUIDs. Separate multiple UUIDs with commas. Only the data of the specified assets is exported.</li>
     * <li><strong>remark</strong>: the remarks. This parameter matches the server name, public IP address, and private IP address at the same time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>software</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>name</strong>: the software name.</li>
     * <li><strong>softwareVersion</strong>: the version.</li>
     * <li><strong>path</strong>: the software startup path.</li>
     * <li><strong>installTimeStart</strong>: the start time of the query range for the software update time. Unit: milliseconds.</li>
     * <li><strong>installTimeEnd</strong>: the end time of the query range for the software update time. Unit: milliseconds.</li>
     * <li><strong>uuid</strong>: the asset UUIDs. Separate multiple UUIDs with commas. Only the data of the specified assets is exported.</li>
     * <li><strong>remark</strong>: the remarks. This parameter matches the server name, public IP address, and private IP address at the same time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>cron</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>source</strong>: the task path.</li>
     * <li><strong>user</strong>: the account name.</li>
     * <li><strong>uuid</strong>: the asset UUIDs. Separate multiple UUIDs with commas. Only the data of the specified assets is exported.</li>
     * <li><strong>remark</strong>: the remarks. This parameter matches the server name, public IP address, and private IP address at the same time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>autorun</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>itemName</strong>: the startup item path.</li>
     * <li><strong>uuid</strong>: the asset UUIDs. Separate multiple UUIDs with commas. Only the data of the specified assets is exported.</li>
     * <li><strong>remark</strong>: the remarks. This parameter matches the server name, public IP address, and private IP address at the same time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>lkm</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>itemName</strong>: the kernel module name.</li>
     * <li><strong>uuid</strong>: the asset UUIDs. Separate multiple UUIDs with commas. Only the data of the specified assets is exported.</li>
     * <li><strong>remark</strong>: the remarks. This parameter matches the server name, public IP address, and private IP address at the same time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>webserver</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>itemName</strong>: the site domain name.</li>
     * <li><strong>uuid</strong>: the asset UUIDs. Separate multiple UUIDs with commas. Only the data of the specified assets is exported.</li>
     * <li><strong>remark</strong>: the remarks. This parameter matches the server name, public IP address, and private IP address at the same time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>virusScanExport</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>status</strong>: the scan task status. Valid values:<blockquote>
     * <ul>
     * <li><strong>INIT</strong>: Pending.</li>
     * <li><strong>START</strong>: Started.</li>
     * <li><strong>DISTRIBUTE</strong>: Dispatched.</li>
     * <li><strong>PROCESSING</strong>: In progress.</li>
     * <li><strong>BEGIN</strong>: Begun.</li>
     * <li><strong>SUCCESS</strong>: Completed.</li>
     * <li><strong>FAIL</strong>: Failed.</li>
     * <li><strong>TIMEOUT</strong>: Timed out.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>imageVulExport</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>Type</strong>: the vulnerability type. Valid values:<blockquote>
     * <ul>
     * <li><strong>cve</strong>: CVE vulnerability.</li>
     * <li><strong>sca</strong>: SCA vulnerability (Software Composition Analysis vulnerability).</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>aliasName</strong>: the alias of the vulnerability name.</li>
     * <li><strong>Necessity</strong>: the vulnerability priority. Valid values:<blockquote>
     * <ul>
     * <li><strong>asap</strong>: High.</li>
     * <li><strong>later</strong>: Medium.</li>
     * <li><strong>nntf</strong>: Low.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>Dealed</strong>: the handling status. Valid values:<blockquote>
     * <ul>
     * <li><strong>y</strong>: Handled.</li>
     * <li><strong>n</strong>: Unhandled.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>RepoInstanceId</strong>: the image repository instance ID.</li>
     * <li><strong>RepoName</strong>: the image repository name.</li>
     * <li><strong>RepoNamespace</strong>: the image repository namespace.</li>
     * <li><strong>Uuids</strong>: the asset UUIDs. Separate multiple UUIDs with commas.</li>
     * <li><strong>ScanRange</strong>: the scan scope. Valid values:<blockquote>
     * <ul>
     * <li><strong>image</strong>: Image scan.</li>
     * <li><strong>container</strong>: Container runtime image scan.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>IsLatest</strong>: specifies whether to export only the latest image versions. Valid values:<blockquote>
     * <ul>
     * <li><strong>true</strong>: Exports only the latest image versions.</li>
     * <li><strong>false</strong>: No limit.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>imageBaseLineExport</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>scanRange</strong>: the scan scope. Valid values:<blockquote>
     * <ul>
     * <li><strong>image</strong>: Image scan.</li>
     * <li><strong>container</strong>: Container runtime image scan.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>CriteriaType</strong>: the combined condition type. This parameter is used together with <strong>Criteria</strong>. Valid values:<blockquote>
     * <ul>
     * <li><strong>BaselineNameAlias</strong>: filters by baseline name. In this case, set <strong>Criteria</strong> to the baseline name.</li>
     * <li><strong>BaselineClassAlias</strong>: filters by baseline category. In this case, set <strong>Criteria</strong> to the baseline category name.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>Criteria</strong>: the value of the combined condition. This parameter is used together with <strong>CriteriaType</strong>.</li>
     * <li><strong>RiskLevel</strong>: the risk level. Valid values:<blockquote>
     * <ul>
     * <li><strong>high</strong>: High.</li>
     * <li><strong>medium</strong>: Medium.</li>
     * <li><strong>low</strong>: Low.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>BaselineNameKey</strong>: the baseline name.</li>
     * <li><strong>RepoInstanceId</strong>: the image repository instance ID.</li>
     * <li><strong>RepoName</strong>: the image repository name.</li>
     * <li><strong>RepoNamespace</strong>: the image repository namespace.</li>
     * <li><strong>RepoRegionId</strong>: the region of the image repository.</li>
     * <li><strong>ImageDigest</strong>: the image digest.</li>
     * <li><strong>ImageTag</strong>: the image tag.</li>
     * <li><strong>ImageUuid</strong>: the image asset UUID.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>imageAffectedMaliciousExport</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>Levels</strong>: the risk levels. Separate multiple levels with commas. Valid values:<blockquote>
     * <ul>
     * <li><strong>serious</strong>: Urgent.</li>
     * <li><strong>suspicious</strong>: Suspicious.</li>
     * <li><strong>remind</strong>: Reminder.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>MaliciousMd5</strong>: the MD5 hash of the malicious sample.</li>
     * <li><strong>FuzzyMaliciousName</strong>: the name of the malicious sample for fuzzy search.</li>
     * <li><strong>RepoInstanceId</strong>: the image repository instance ID.</li>
     * <li><strong>RepoNamespace</strong>: the image repository namespace.</li>
     * <li><strong>RepoName</strong>: the image repository name.</li>
     * <li><strong>ImageDigest</strong>: the image digest.</li>
     * <li><strong>ScanRange</strong>: the scan scope. Valid values:<blockquote>
     * <ul>
     * <li><strong>image</strong>: Image scan.</li>
     * <li><strong>container</strong>: Container runtime image scan.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>baselineCspm</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>CheckKey</strong>: the check item name.</li>
     * <li><strong>Statuses</strong>: the check result statuses. The value is a JSON array. Valid values:<blockquote>
     * <ul>
     * <li><strong>PASS</strong>: Passed.</li>
     * <li><strong>NOT_PASS</strong>: Failed.</li>
     * <li><strong>CHECKING</strong>: Checking.</li>
     * <li><strong>NOT_CHECK</strong>: Not checked.</li>
     * <li><strong>WHITELIST</strong>: Whitelisted.</li>
     * <li><strong>FAILED</strong>: Check failed.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>RiskLevels</strong>: the risk levels. The value is a JSON array. Valid values:<blockquote>
     * <ul>
     * <li><strong>HIGH</strong>: High.</li>
     * <li><strong>MEDIUM</strong>: Medium.</li>
     * <li><strong>LOW</strong>: Low.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>OperationTypes</strong>: specifies whether fixing is supported. The value is a JSON array. Valid values:<blockquote>
     * <ul>
     * <li><strong>SUPPORT_REPAIR</strong>: Supported.</li>
     * <li><strong>NOT_SUPPORT_REPAIR</strong>: Not supported.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>Vendors</strong>: the cloud service providers. The value is a JSON array. Valid values:<blockquote>
     * <ul>
     * <li><strong>ALIYUN</strong>: Alibaba Cloud.</li>
     * <li><strong>AWS</strong>: Amazon Web Services (AWS).</li>
     * <li><strong>MICROSOFT</strong>: Microsoft Azure.</li>
     * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud.</li>
     * <li><strong>TENCENT</strong>: Tencent Cloud.</li>
     * <li><strong>VOLCENGINE</strong>: Volcengine.</li>
     * <li><strong>GOOGLE</strong>: Google Cloud.</li>
     * <li><strong>STATECLOUD</strong>: Tianyi Cloud.</li>
     * <li><strong>BAIDUCLOUD</strong>: Baidu Cloud.</li>
     * <li><strong>UCLOUD</strong>: UCloud.</li>
     * <li><strong>KINGSOFTCLOUD</strong>: Kingsoft Cloud.</li>
     * <li><strong>ORACLECLOUD</strong>: Oracle Cloud.</li>
     * <li><strong>KSPM</strong>: Other (Kubernetes).</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>InstanceTypes</strong>: the asset types. The value is a JSON array.</li>
     * <li><strong>InstanceSubTypes</strong>: the asset subtypes. The value is a JSON array.</li>
     * <li><strong>InstanceIds</strong>: the asset instance IDs. The value is a JSON array.</li>
     * <li><strong>CheckIds</strong>: the check item IDs. The value is a JSON array. You can specify up to 500 IDs.</li>
     * <li><strong>CheckTypes</strong>: the check types. The value is a JSON array. Valid values:<blockquote>
     * <ul>
     * <li><strong>CUSTOM</strong>: Custom.</li>
     * <li><strong>SYSTEM</strong>: Predefined.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>StandardIds</strong>: the compliance standard IDs. The value is a JSON array.</li>
     * <li><strong>RequirementIds</strong>: the compliance requirement IDs. The value is a JSON array.</li>
     * <li><strong>CustomParam</strong>: specifies whether custom parameters are supported. Valid values:<blockquote>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>attack</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>Type</strong>: the attack analysis data type. Exact match. Valid values:<blockquote>
     * <ul>
     * <li><strong>TOTAL</strong>: Total attack statistics.</li>
     * <li><strong>TREND</strong>: Attack trend data.</li>
     * <li><strong>PIE_CHART</strong>: Attack type distribution data.</li>
     * <li><strong>SOURCE_TOP</strong>: Top source IP addresses of attacks.</li>
     * <li><strong>CLIENT_TOP</strong>: Top attacked assets.</li>
     * <li><strong>DETAILS</strong>: Attack details (paginated). Used when exporting the detail list.</li>
     * <li><strong>ATTACK_SCREEN</strong>: Attack dashboard data.</li>
     * <li><strong>GC_LEVEL</strong>: Security level data.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>StartTime</strong>: the start time of the query range for the attack time. Unit: milliseconds.</li>
     * <li><strong>EndTime</strong>: the end time of the query range for the attack time. Unit: milliseconds.</li>
     * <li><strong>Data</strong>: the data payload, which can be a JSON string or an encoded string.</li>
     * <li><strong>Base64</strong>: specifies whether to decode the <strong>Data</strong> parameter. Valid values:<blockquote>
     * <ul>
     * <li><strong>true</strong>: Decodes the <strong>Data</strong> parameter by using Base64.</li>
     * <li><strong>false</strong>: Does not decode the <strong>Data</strong> parameter.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>attackEvent</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>AttackType</strong>: the attack type. Valid values:<blockquote>
     * <ul>
     * <li><strong>9</strong>: SQL Server brute-force attack.</li>
     * <li><strong>5</strong>: SSH brute-force attack.</li>
     * <li><strong>6</strong>: RDP brute-force attack.</li>
     * <li><strong>101</strong>: Java Struts2 attack interception.</li>
     * <li><strong>102</strong>: Redis attack interception.</li>
     * <li><strong>103</strong>: AntSword web shell communication.</li>
     * <li><strong>104</strong>: Chopper web shell communication.</li>
     * <li><strong>133</strong>: XISE web shell communication.</li>
     * <li><strong>161</strong>: Web shell upload.</li>
     * <li><strong>209</strong>: PHP web shell upload.</li>
     * <li><strong>210</strong>: JSP web shell upload.</li>
     * <li><strong>211</strong>: ASP web shell upload.</li>
     * <li><strong>215</strong>: Web shell upload with a special extension.</li>
     * <li><strong>ai_webshell</strong>: Intelligent defense against web shell upload.</li>
     * <li><strong>java_common_rce</strong>: Interception of common Java RCE vulnerabilities.</li>
     * <li><strong>alinet_webrce</strong>: Adaptive web attack defense.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>StartTime</strong>: the start time of the query range for the attack time. Unit: milliseconds.</li>
     * <li><strong>EndTime</strong>: the end time of the query range for the attack time. Unit: milliseconds.</li>
     * <li><strong>AttackInstance</strong>: the attacked asset. This parameter matches the server name, public IP address, and private IP address at the same time.</li>
     * <li><strong>SrcIp</strong>: the source IP address of the attack.</li>
     * <li><strong>RemoteIp</strong>: the actual source IP address.</li>
     * <li><strong>DstPort</strong>: the destination port.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>accessKey</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>Status</strong>: the handling status. Valid values:<blockquote>
     * <ul>
     * <li><strong>dealed</strong>: Handled.</li>
     * <li><strong>pending</strong>: Unhandled.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>Query</strong>: the AccessKey ID.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>exportObjectScanEvents</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>AiDetect</strong>: specifies whether the event is detected by AI. Valid values:<blockquote>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>RiskLevel</strong>: the risk level. Valid values:<blockquote>
     * <ul>
     * <li><strong>high</strong>: High.</li>
     * <li><strong>medium</strong>: Medium.</li>
     * <li><strong>low</strong>: Low.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>Status</strong>: the status. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: Unhandled.</li>
     * <li><strong>1</strong>: Manually handled.</li>
     * <li><strong>2</strong>: Whitelisted.</li>
     * <li><strong>3</strong>: Ignored.</li>
     * <li><strong>4</strong>: Access denied.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>TimeStart</strong>: the start time of the query range for the latest detection time. Unit: milliseconds.</li>
     * <li><strong>TimeEnd</strong>: the end time of the query range for the latest detection time. Unit: milliseconds.</li>
     * <li><strong>EventName</strong>: the threat tag.</li>
     * <li><strong>Md5</strong>: the MD5 hash of the file.</li>
     * <li><strong>OssKey</strong>: the file name.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>domainDetail</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>fuzzyDomain</strong>: the domain name for fuzzy search.</li>
     * <li><strong>domainType</strong>: the domain name type. Valid values:<blockquote>
     * <ul>
     * <li><strong>root</strong>: Root domain name.</li>
     * <li><strong>sub</strong>: Subdomain name.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>exportHcWarning</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>CheckWarningStatusList</strong>: the status list. The value is a JSON array. Valid values:<blockquote>
     * <ul>
     * <li><strong>1</strong>: Failed.</li>
     * <li><strong>3</strong>: Passed.</li>
     * <li><strong>6</strong>: Whitelisted.</li>
     * <li><strong>8</strong>: Fixed.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>UuidList</strong>: the asset UUIDs. The value is a JSON array.</li>
     * <li><strong>CheckLevel</strong>: the risk level. Valid values:<blockquote>
     * <ul>
     * <li><strong>high</strong>: High.</li>
     * <li><strong>medium</strong>: Medium.</li>
     * <li><strong>low</strong>: Low.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>Source</strong>: the source. Set the value to <strong>default</strong>.</li>
     * <li><strong>RiskType</strong>: the risk type. Valid values:<blockquote>
     * <ul>
     * <li><strong>hc_custom</strong>: Custom baseline.</li>
     * <li><strong>cis</strong>: CIS benchmarks.</li>
     * <li><strong>hc_exploit</strong>: Unauthorized access.</li>
     * <li><strong>hc_djbh</strong>: Classified protection compliance.</li>
     * <li><strong>weak_password</strong>: Weak password.</li>
     * <li><strong>hw_security</strong>: Basic protection security practices.</li>
     * <li><strong>hc_container</strong>: Container security.</li>
     * <li><strong>hc_best_secruity</strong>: Best security practices.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>RiskName</strong>: the baseline name.</li>
     * <li><strong>CheckItemFuzzy</strong>: the check item name for fuzzy search.</li>
     * <li><strong>CleartextPwd</strong>: the export method for weak password baseline check results. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: Exports weak passwords after data masking.</li>
     * <li><strong>1</strong>: Exports weak passwords in plaintext.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>StrategyId</strong>: the policy ID.</li>
     * <li><strong>GroupId</strong>: the asset group ID.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>assetsPropertyScaProcessDetail</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>uuid</strong>: the asset UUID.</li>
     * <li><strong>pid</strong>: the process ID.</li>
     * <li><strong>remark</strong>: the remarks. This parameter matches the server name, public IP address, and private IP address at the same time.</li>
     * <li><strong>cmdline</strong>: the command line.</li>
     * <li><strong>bizType</strong>: the component type.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>raspAttackAlert</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>day</strong>: the number of days to query. If this parameter is empty, the query is based on the specified time range. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: Today.</li>
     * <li><strong>7</strong>: Last 7 days.</li>
     * <li><strong>30</strong>: Last 30 days.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>StartTimestamp</strong>: the start time. Unit: milliseconds.</li>
     * <li><strong>EndTimestamp</strong>: the end time. Unit: milliseconds.</li>
     * <li><strong>Severity</strong>: the severity level. Valid values:<blockquote>
     * <ul>
     * <li><strong>high</strong>: High.</li>
     * <li><strong>medium</strong>: Medium.</li>
     * <li><strong>low</strong>: Low.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>HandlerType</strong>: the handling action. Valid values:<blockquote>
     * <ul>
     * <li><strong>monitor</strong>: Monitor.</li>
     * <li><strong>block</strong>: Block.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>HandleStatus</strong>: the handling status. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: Unhandled.</li>
     * <li><strong>1</strong>: Handled.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>AttackUrl</strong>: the request URL.</li>
     * <li><strong>Hostname</strong>: the hostname.</li>
     * <li><strong>Remote</strong>: the attacker IP address.</li>
     * <li><strong>Pid</strong>: the process ID.</li>
     * <li><strong>ApplicationId</strong>: the application ID.</li>
     * <li><strong>RaspType</strong>: the application language. Valid values:<blockquote>
     * <ul>
     * <li><strong>java</strong>: Java.</li>
     * <li><strong>php</strong>: PHP.</li>
     * <li><strong>python</strong>: Python.</li>
     * <li><strong>nodejs</strong>: Node.js.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>AttackType</strong>: the attack type. Valid values:<blockquote>
     * <ul>
     * <li><strong>file_read</strong>: Arbitrary file read.</li>
     * <li><strong>sql</strong>: SQL injection.</li>
     * <li><strong>xxe</strong>: XXE.</li>
     * <li><strong>ssrf</strong>: SSRF.</li>
     * <li><strong>rce</strong>: Remote command execution.</li>
     * <li><strong>file</strong>: Malicious file read and write.</li>
     * <li><strong>thread_inject</strong>: Thread injection.</li>
     * <li><strong>file_upload</strong>: Malicious file upload.</li>
     * <li><strong>file_list</strong>: Directory traversal.</li>
     * <li><strong>memory_shell</strong>: In-memory webshell injection.</li>
     * <li><strong>jni</strong>: JNI injection.</li>
     * <li><strong>dns</strong>: Malicious DNS query.</li>
     * <li><strong>reflect</strong>: Malicious reflection call.</li>
     * <li><strong>file_delete</strong>: Arbitrary file deletion.</li>
     * <li><strong>jndi</strong>: JNDI injection.</li>
     * <li><strong>read_object</strong>: Deserialization attack.</li>
     * <li><strong>dangerous_protocol</strong>: Dangerous protocol usage.</li>
     * <li><strong>attach</strong>: Malicious attach.</li>
     * <li><strong>expression</strong>: Expression injection.</li>
     * <li><strong>engine</strong>: Engine injection.</li>
     * <li><strong>beans</strong>: Malicious beans binding.</li>
     * <li><strong>classloader</strong>: Malicious class loading.</li>
     * <li><strong>jstl</strong>: JSTL arbitrary file inclusion.</li>
     * <li><strong>callable</strong>: Callback function execution.</li>
     * <li><strong>unserialize</strong>: Deserialization.</li>
     * <li><strong>include</strong>: Malicious file inclusion.</li>
     * <li><strong>eval</strong>: Arbitrary code execution.</li>
     * <li><strong>template</strong>: Server-side template injection.</li>
     * <li><strong>process_binding</strong>: Malicious process binding.</li>
     * <li><strong>fork</strong>: Malicious process creation.</li>
     * <li><strong>file_link</strong>: Malicious file link.</li>
     * <li><strong>file_write</strong>: Arbitrary file write.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>raspApplicationConfiguration</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>ProtectionSwitch</strong>: the protection switch. Valid values:<blockquote>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>RaspType</strong>: the application language. Valid values:<blockquote>
     * <ul>
     * <li><strong>java</strong>: Java.</li>
     * <li><strong>php</strong>: PHP.</li>
     * <li><strong>python</strong>: Python.</li>
     * <li><strong>nodejs</strong>: Node.js.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>ProtectionMode</strong>: the protection mode. Valid values:<blockquote>
     * <ul>
     * <li><strong>monitor</strong>: Monitor.</li>
     * <li><strong>block</strong>: Block.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>ApplicationName</strong>: the application group name.</li>
     * <li><strong>SortField</strong>: the sort field. Valid values:<blockquote>
     * <ul>
     * <li><strong>authorizedProcess</strong>: Authorized processes.</li>
     * <li><strong>accessedProcess</strong>: Connected processes.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>SortOrder</strong>: the sort order. Valid values:<blockquote>
     * <ul>
     * <li><strong>desc</strong>: Descending.</li>
     * <li><strong>asc</strong>: Ascending.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>raspWeaknessDetection</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>day</strong>: the number of days to query. If this parameter is empty, the query is based on the specified time range. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: Today.</li>
     * <li><strong>7</strong>: Last 7 days.</li>
     * <li><strong>30</strong>: Last 30 days.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>StartTimestamp</strong>: the start time of the check time range. Unit: milliseconds.</li>
     * <li><strong>EndTimestamp</strong>: the end time of the check time range. Unit: milliseconds.</li>
     * <li><strong>CheckState</strong>: the status. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: To be confirmed.</li>
     * <li><strong>1</strong>: Confirmed.</li>
     * <li><strong>2</strong>: False positive.</li>
     * <li><strong>3</strong>: Ignored.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>Severity</strong>: the risk level. Valid values:<blockquote>
     * <ul>
     * <li><strong>high</strong>: High.</li>
     * <li><strong>medium</strong>: Medium.</li>
     * <li><strong>low</strong>: Low.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>Type</strong>: the weakness type. Valid values:<blockquote>
     * <ul>
     * <li><strong>fastjson</strong>: Insecure Fastjson configuration.</li>
     * <li><strong>jmx_config</strong>: Insecure JMX configuration.</li>
     * <li><strong>jndi_config</strong>: Insecure JNDI configuration.</li>
     * <li><strong>log4j</strong>: Insecure Log4j component.</li>
     * <li><strong>rhino_config</strong>: Insecure Rhino configuration.</li>
     * <li><strong>risk_start_up_param</strong>: Insecure startup parameters.</li>
     * <li><strong>shiro</strong>: Weak Shiro key.</li>
     * <li><strong>spring_config</strong>: Insecure Spring configuration.</li>
     * <li><strong>weak_auth</strong>: Weak server-side password.</li>
     * <li><strong>xml_config</strong>: Insecure XML configuration.</li>
     * <li><strong>sql_connection</strong>: Weak database password.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>ApplicationId</strong>: the application ID.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>raspInMemoryWebshellDetection</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>day</strong>: the number of days to query. If this parameter is empty, the query is based on the specified time range. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: Today.</li>
     * <li><strong>7</strong>: Last 7 days.</li>
     * <li><strong>30</strong>: Last 30 days.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>StartTimestamp</strong>: the start time of the check time range. Unit: milliseconds.</li>
     * <li><strong>EndTimestamp</strong>: the end time of the check time range. Unit: milliseconds.</li>
     * <li><strong>HandlerType</strong>: the handling action. Valid values:<blockquote>
     * <ul>
     * <li><strong>monitor</strong>: Monitor.</li>
     * <li><strong>block</strong>: Block.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>ApplicationId</strong>: the application ID.</li>
     * <li><strong>Confidence</strong>: the confidence level. Valid values:<blockquote>
     * <ul>
     * <li><strong>high</strong>: High.</li>
     * <li><strong>medium</strong>: Medium.</li>
     * <li><strong>low</strong>: Low.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>HandleStatus</strong>: the handling status. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: Unhandled.</li>
     * <li><strong>1</strong>: Automatically handled.</li>
     * <li><strong>2</strong>: Manually handled.</li>
     * <li><strong>3</strong>: Ignored.</li>
     * <li><strong>4</strong>: False positive.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>ClassName</strong>: the class name.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>raspInMemoryWebshellInsertion</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>day</strong>: the number of days to query. If this parameter is empty, the query is based on the specified time range. Valid values:<blockquote>
     * <ul>
     * <li><strong>0</strong>: Today.</li>
     * <li><strong>7</strong>: Last 7 days.</li>
     * <li><strong>30</strong>: Last 30 days.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>StartTimestamp</strong>: the start time of the check time range. Unit: milliseconds.</li>
     * <li><strong>EndTimestamp</strong>: the end time of the check time range. Unit: milliseconds.</li>
     * <li><strong>HandlerType</strong>: the handling action. Valid values:<blockquote>
     * <ul>
     * <li><strong>monitor</strong>: Monitor.</li>
     * <li><strong>block</strong>: Block.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>ApplicationId</strong>: the application ID.</li>
     * <li><strong>Severity</strong>: the attack severity level. Valid values:<blockquote>
     * <ul>
     * <li><strong>high</strong>: High.</li>
     * <li><strong>medium</strong>: Medium.</li>
     * <li><strong>low</strong>: Low.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><strong>AttackUrl</strong>: the request URL.</li>
     * <li><strong>Hostname</strong>: the hostname.</li>
     * <li><strong>Remote</strong>: the attacker IP address.</li>
     * <li><strong>Pid</strong>: the process ID.</li>
     * <li><strong>RaspType</strong>: the application language. Valid values:<blockquote>
     * <ul>
     * <li><strong>java</strong>: Java.</li>
     * <li><strong>php</strong>: PHP.</li>
     * <li><strong>python</strong>: Python.</li>
     * <li><strong>nodejs</strong>: Node.js.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>When <strong>ExportType</strong> is set to <strong>listAgentExport</strong>, the JSON supports the following filter conditions:<blockquote>
     * <ul>
     * <li><strong>Vendor</strong>: the agent vendor. Set the value to the vendor type ID. Valid values:<blockquote>
     * <ul>
     * <li><strong>300</strong>: Dify.</li>
     * <li><strong>301</strong>: Alibaba Cloud Model Studio.</li>
     * <li><strong>302</strong>: PAI.</li>
     * <li><strong>303</strong>: Volcengine.</li>
     * <li><strong>304</strong>: Agent Run.</li>
     * <li><strong>305</strong>: OpenClaw.</li>
     * <li><strong>306</strong>: ZeroClaw.</li>
     * <li><strong>307</strong>: Hermes Agent.</li>
     * <li><strong>308</strong>: QwenPaw.</li>
     * <li><strong>309</strong>: CoPaw.</li>
     * <li><strong>310</strong>: Gemini.</li>
     * <li><strong>311</strong>: Claude.</li>
     * <li><strong>312</strong>: CodeX.</li>
     * <li><strong>313</strong>: OpenCode.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Vendor&quot;:&quot;UNKNOWN&quot;,&quot;CurrentPage&quot;:1,&quot;PageSize&quot;:10,&quot;OrderBy&quot;:&quot;CheckTime&quot;,&quot;Order&quot;:&quot;desc&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The ID of the Alibaba Cloud account to which the member accounts in the resource folder belong.</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    public static ExportRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportRecordRequest self = new ExportRecordRequest();
        return TeaModel.build(map, self);
    }

    public ExportRecordRequest setExportFileType(String exportFileType) {
        this.exportFileType = exportFileType;
        return this;
    }
    public String getExportFileType() {
        return this.exportFileType;
    }

    public ExportRecordRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public ExportRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExportRecordRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public ExportRecordRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
