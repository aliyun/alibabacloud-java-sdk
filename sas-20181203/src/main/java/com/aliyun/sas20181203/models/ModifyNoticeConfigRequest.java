// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyNoticeConfigRequest extends TeaModel {
    /**
     * <p>The identifier of the notification item. Valid values:</p>
     * <ul>
     * <li><strong>yundun_security_Weekreport</strong>: notification for vulnerabilities</li>
     * <li><strong>yundun_sas_antiransomware_task</strong>: notification for results of restoration tasks</li>
     * <li><strong>sas_healthcheck</strong>: notification for baseline checks</li>
     * <li><strong>sas_suspicious</strong>: notification for alerts generated by Security Center</li>
     * <li><strong>yundun_aegis_AV_true</strong>: notification for precision defense</li>
     * <li><strong>yundun_sas_ak_leakage</strong>: notification for AccessKey pair leaks</li>
     * <li><strong>yundun_sas_config_alert</strong>: notification for configuration assessment</li>
     * <li><strong>yundun_sas_vul_Emergency</strong>: notification for urgent vulnerabilities</li>
     * <li><strong>yundun_webguard_event</strong>: notification for web tamper proofing</li>
     * <li><strong>yundun_sas_cloud_native_firewall</strong>: notification for alerts generated by the container firewall feature</li>
     * <li><strong>yundun_sas_cloud_native_firewall_Defense</strong>: notification for proactive defense implemented by the container firewall feature</li>
     * <li><strong>yundun_IP_Blocking</strong>: notification for blocked brute-force attacks initiated from malicious IP addresses</li>
     * <li><strong>yundun_sas_anti_virus_config</strong>: notification for virus scan</li>
     * <li><strong>yundun_sas_log</strong>: notification for excess logs</li>
     * <li><strong>yundun_honeypot_alarm</strong>: notification for alerts generated by the honeypot feature</li>
     * <li><strong>aliyun_rasp_alarm</strong>: notification for alerts generated by the application security feature</li>
     * <li><strong>virusScheduleTask</strong>: notification for completion of scheduled virus scans</li>
     * <li><strong>yundun_anti_Virus</strong>: notification that no security checks are performed</li>
     * <li><strong>sas_vulnerability</strong>: notification for vulnerabilities</li>
     * <li><strong>weeklyreport</strong>: notification for weekly reports</li>
     * <li><strong>agent</strong>: notification that the Security Center agent is offline</li>
     * <li><strong>bruteforcesuccess</strong>: notification for protection against brute-force attacks</li>
     * <li><strong>webshell</strong>: notification for webshells</li>
     * <li><strong>suspicious</strong>: notification for alerts generated by Server Guard</li>
     * <li><strong>patch</strong>: deprecated</li>
     * <li><strong>remotelogin</strong>: notification for remote logons</li>
     * <li><strong>health</strong>: notification for security checks</li>
     * <li><strong>yundun_sas_cloudsiem_log</strong>: notifications of insufficient threat analysis log capacity</li>
     * </ul>
     * <blockquote>
     * <p>If the value is <strong>yundun_security_Weekreport</strong>, weekly reports are sent to notify you of unhandled vulnerabilities.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>yundun_webguard_event</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The notification method. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: text message</li>
     * <li><strong>2</strong>: email</li>
     * <li><strong>4</strong>: internal message</li>
     * <li><strong>3</strong>: text message and email</li>
     * <li><strong>5</strong>: text message and internal message</li>
     * <li><strong>6</strong>: email and internal message</li>
     * <li><strong>7</strong>: text message, email, and internal message</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Route")
    public Integer route;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>42.178.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The time period during which Security Center sends notifications. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: any time</li>
     * <li><strong>1</strong>: 08:00 to 22:00</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeLimit")
    public Integer timeLimit;

    public static ModifyNoticeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNoticeConfigRequest self = new ModifyNoticeConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNoticeConfigRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ModifyNoticeConfigRequest setRoute(Integer route) {
        this.route = route;
        return this;
    }
    public Integer getRoute() {
        return this.route;
    }

    public ModifyNoticeConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyNoticeConfigRequest setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
        return this;
    }
    public Integer getTimeLimit() {
        return this.timeLimit;
    }

}
