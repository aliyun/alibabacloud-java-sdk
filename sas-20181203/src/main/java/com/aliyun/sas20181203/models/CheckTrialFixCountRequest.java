// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckTrialFixCountRequest extends TeaModel {
    /**
     * <p>The information about the vulnerability. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>name</strong>: the name of the vulnerability.</p>
     * </li>
     * <li><p><strong>uuid</strong>: the UUID of the server on which the vulnerability is detected.</p>
     * </li>
     * <li><p><strong>tag</strong>: the tag that is added to the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>oval</strong>: Linux software vulnerability.</li>
     * <li><strong>system</strong>: Windows system vulnerability.</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You must specify a value for Info or values for VulNames and Uuids to identify a vulnerability.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;oval:com.redhat.rhsa:def:20192143\&quot;,\&quot;uuid\&quot;:\&quot;80ee3226-1f96-4da0-a3ed-55c104e2****\&quot;,\&quot;tag\&quot;:\&quot;oval\&quot;}]</p>
     */
    @NameInMap("Info")
    public String info;

    /**
     * <p>The type of the vulnerability that you want to fix. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability.</li>
     * <li><strong>sys</strong>: Windows system vulnerability.</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUIDs of the servers.</p>
     */
    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    /**
     * <p>The names of the vulnerabilities.</p>
     */
    @NameInMap("VulNames")
    public java.util.List<String> vulNames;

    public static CheckTrialFixCountRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckTrialFixCountRequest self = new CheckTrialFixCountRequest();
        return TeaModel.build(map, self);
    }

    public CheckTrialFixCountRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public CheckTrialFixCountRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CheckTrialFixCountRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    public CheckTrialFixCountRequest setVulNames(java.util.List<String> vulNames) {
        this.vulNames = vulNames;
        return this;
    }
    public java.util.List<String> getVulNames() {
        return this.vulNames;
    }

}
