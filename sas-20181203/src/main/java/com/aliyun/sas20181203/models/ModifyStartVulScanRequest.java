// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStartVulScanRequest extends TeaModel {
    /**
     * <p>The types of vulnerabilities that can be detected. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerabilities</li>
     * <li><strong>sys</strong>: Windows system vulnerabilities</li>
     * <li><strong>cms</strong>: Web-CMS vulnerabilities</li>
     * <li><strong>app</strong>: application vulnerabilities</li>
     * <li><strong>emg</strong>: urgent vulnerabilities</li>
     * <li><strong>image</strong>: container image vulnerabilities</li>
     * <li><strong>sca</strong>: vulnerabilities that are detected based on software component analysis</li>
     * </ul>
     * <blockquote>
     * <p>If you leave this parameter empty, all types of vulnerabilities can be detected.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>&quot;cve,sys,cms,app,emg&quot;</p>
     */
    @NameInMap("Types")
    public String types;

    /**
     * <p>The UUIDs of servers.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;i-sdada-xxxxx&quot;,&quot;i-ifaedada-sfsasdxxx&quot;}</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static ModifyStartVulScanRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStartVulScanRequest self = new ModifyStartVulScanRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStartVulScanRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

    public ModifyStartVulScanRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
