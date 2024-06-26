// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyNoticeConfigRequest extends TeaModel {
    /**
     * <p>The identifier of the notification item. Valid values:</p>
     * <br>
     * <p>*   **yundun_security_Weekreport**: notification for vulnerabilities</p>
     * <p>*   **yundun_sas_antiransomware_task**: notification for results of restoration tasks</p>
     * <p>*   **sas_healthcheck**: notification for baseline checks</p>
     * <p>*   **sas_suspicious**: notification for alerts generated by Security Center</p>
     * <p>*   **yundun_aegis_AV_true**: notification for precision defense</p>
     * <p>*   **yundun_sas_ak_leakage**: notification for AccessKey pair leaks</p>
     * <p>*   **yundun_sas_config_alert**: notification for configuration assessment</p>
     * <p>*   **yundun_sas_vul_Emergency**: notification for urgent vulnerabilities</p>
     * <p>*   **yundun_webguard_event**: notification for web tamper proofing</p>
     * <p>*   **yundun_sas_cloud_native_firewall**: notification for alerts generated by the container firewall feature</p>
     * <p>*   **yundun_sas_cloud_native_firewall_Defense**: notification for proactive defense implemented by the container firewall feature</p>
     * <p>*   **yundun_IP_Blocking**: notification for blocked brute-force attacks initiated from malicious IP addresses</p>
     * <p>*   **yundun_sas_anti_virus_config**: notification for virus scan</p>
     * <p>*   **yundun_sas_log**: notification for excess logs</p>
     * <p>*   **yundun_honeypot_alarm**: notification for alerts generated by the honeypot feature</p>
     * <p>*   **aliyun_rasp_alarm**: notification for alerts generated by the application security feature</p>
     * <p>*   **virusScheduleTask**: notification for completion of scheduled virus scans</p>
     * <p>*   **yundun_anti_Virus**: notification that no security checks are performed</p>
     * <p>*   **sas_vulnerability**: notification for vulnerabilities</p>
     * <p>*   **weeklyreport**: notification for weekly reports</p>
     * <p>*   **agent**: notification that the Security Center agent is offline</p>
     * <p>*   **bruteforcesuccess**: notification for protection against brute-force attacks</p>
     * <p>*   **webshell**: notification for webshells</p>
     * <p>*   **suspicious**: notification for alerts generated by Server Guard</p>
     * <p>*   **patch**: deprecated</p>
     * <p>*   **remotelogin**: notification for remote logons</p>
     * <p>*   **health**: notification for security checks</p>
     * <p>*   **yundun_sas_cloudsiem_log**: notifications of insufficient threat analysis log capacity</p>
     * <br>
     * <p>> If the value is **yundun_security_Weekreport**, weekly reports are sent to notify you of unhandled vulnerabilities.</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The notification method. Valid values:</p>
     * <br>
     * <p>*   **1**: text message</p>
     * <p>*   **2**: email</p>
     * <p>*   **4**: internal message</p>
     * <p>*   **3**: text message and email</p>
     * <p>*   **5**: text message and internal message</p>
     * <p>*   **6**: email and internal message</p>
     * <p>*   **7**: text message, email, and internal message</p>
     */
    @NameInMap("Route")
    public Integer route;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The time period during which Security Center sends notifications. Valid values:</p>
     * <br>
     * <p>*   **0**: any time</p>
     * <p>*   **1**: 08:00 to 22:00</p>
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
