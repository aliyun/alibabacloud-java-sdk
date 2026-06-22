// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyNoticeConfigRequest extends TeaModel {
    /**
     * <p>The notification configuration type. By default, notifications are sent by SMS, email, or internal message. Valid values:</p>
     * <ul>
     * <li><strong>cms</strong>: CloudMonitor push.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cms</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The focus level. Separate multiple levels with commas (,).</p>
     * <p>When <strong>Project</strong> is <strong>yundun_soar_incident_generate</strong> or <strong>yundun_soar_incident_update</strong>, valid values:</p>
     * <ul>
     * <li><strong>CRITICAL</strong>: Critical.</li>
     * <li><strong>HIGH</strong>: High-risk.</li>
     * <li><strong>MEDIUM</strong>: Medium-risk.</li>
     * <li><strong>LOW</strong>: Low-risk.</li>
     * <li><strong>INFO</strong>: Informational.</li>
     * </ul>
     * <p>When <strong>Project</strong> is <strong>yundun_sas_antiransomware_task</strong>, valid values:</p>
     * <ul>
     * <li><strong>Success</strong>: Execution succeeded.</li>
     * <li><strong>Failed</strong>: Execution failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CRITICAL,HIGH</p>
     */
    @NameInMap("FocusLevel")
    public String focusLevel;

    /**
     * <h3>Project identity</h3>
     * <h4>When the BizType field is empty: valid values</h4>
     * <ul>
     * <li><strong>yundun_security_Weekreport</strong>: Security weekly report (email only)</li>
     * <li><strong>sas_healthcheck</strong>: Baseline check</li>
     * <li><strong>yundun_defennce_antiRansomware_overflow</strong>: Anti-ransomware storage space exceeded</li>
     * <li><strong>yundun_sas_cloudsiem_log</strong>: Cloud Threat Detection and Response (CTDR) log excess notification</li>
     * <li><strong>sas_suspicious</strong>: Security alert</li>
     * <li><strong>yundun_aegis_AV_true</strong>: Precise defense</li>
     * <li><strong>yundun_sas_ak_leakage AccessKey</strong>: AccessKey leak intelligence</li>
     * <li><strong>yundun_sas_config_alert</strong>: Cloud platform configuration check</li>
     * <li><strong>yundun_sas_vul_Emergency</strong>: Emergency vulnerability intelligence</li>
     * <li><strong>yundun_webguard_event</strong>: Web tamper-proofing</li>
     * <li><strong>yundun_sas_cloud_native_firewall</strong>: Container firewall anomaly alert notification (email only)</li>
     * <li><strong>yundun_sas_cloud_native_firewall_Defense</strong>: Container firewall active defense notification (email only)</li>
     * <li><strong>yundun_IP_Blocking</strong>: Malicious IP blocking alerting notification</li>
     * <li><strong>yundun_sas_anti_virus_config</strong>: Virus scan notification</li>
     * <li><strong>yundun_sas_log</strong>: Log storage exceeded</li>
     * <li><strong>yundun_honeypot_alarm</strong>: Cloud honeypot alerting</li>
     * <li><strong>aliyun_rasp_alarm</strong>: Application protection alerting</li>
     * <li><strong>yundun_soar_incident_generate</strong>: New security incident</li>
     * <li><strong>yundun_soar_incident_update</strong>: Updated security incident<blockquote>
     * <p><strong>yundun_security_Weekreport</strong> sends a weekly report to notify you of unresolved vulnerabilities.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <hr>
     * <h4>When the BizType field is <code>cms</code>: valid values</h4>
     * <ul>
     * <li><strong>Vul_event</strong>: Vulnerability result details</li>
     * <li><strong>Hc_summary</strong>: Baseline check result summary</li>
     * <li><strong>Cspm_summary</strong>: Cloud Security Posture Management (CSPM) result summary</li>
     * <li><strong>Vul_summary</strong>: Vulnerability result summary</li>
     * <li><strong>Agentless_event</strong>: Agentless detection result details</li>
     * <li><strong>Filedetect_event</strong>: Malicious file SDK result details</li>
     * <li><strong>Rasp_event</strong>: Application protection result details.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yundun_webguard_event</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <h3>Notification method</h3>
     * <h4>When BizType is empty</h4>
     * <ul>
     * <li>0: disabled</li>
     * <li>1: SMS enabled</li>
     * <li>2: email enabled</li>
     * <li>4: internal message enabled</li>
     * <li>3: SMS and email enabled</li>
     * <li>5: SMS and internal message enabled</li>
     * <li>6: email and internal message enabled</li>
     * <li>7: SMS, email, and internal message all enabled</li>
     * </ul>
     * <h4>When BizType is <code>cms</code></h4>
     * <ul>
     * <li>0: CloudMonitor push disabled</li>
     * <li>1: CloudMonitor push enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Route")
    public Integer route;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>42.178.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <h3>Notification time limit</h3>
     * <h4>When the BizType field is empty: valid values</h4>
     * <ul>
     * <li><strong>0</strong>: No limit.</li>
     * <li><strong>1</strong>: Notifications are sent only between 08:00 and 22:00.</li>
     * </ul>
     * <h4>When the BizType field is <code>cms</code></h4>
     * <p>Specifies the push frequency limit, in seconds. The minimum value is <strong>60</strong>.</p>
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

    public ModifyNoticeConfigRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ModifyNoticeConfigRequest setFocusLevel(String focusLevel) {
        this.focusLevel = focusLevel;
        return this;
    }
    public String getFocusLevel() {
        return this.focusLevel;
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
