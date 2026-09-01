// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStartVulScanRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests should use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>Settings for the types of vulnerabilities to detect by using the one-click scan feature. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability.</li>
     * <li><strong>sys</strong>: Windows system vulnerability.</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
     * <li><strong>app</strong>: application vulnerability detected by the web scanner.</li>
     * <li><strong>emg</strong>: urgent vulnerability.</li>
     * <li><strong>image</strong>: container image vulnerability.</li>
     * <li><strong>sca</strong>: application vulnerability detected by software constituency parsing.<blockquote>
     * <p>If this parameter is left empty, all vulnerability types are detected.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;cve,sys,cms,app,emg&quot;</p>
     */
    @NameInMap("Types")
    public String types;

    /**
     * <p>The UUIDs of the servers. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/421726.html">DescribeCloudCenterInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1587bedb-fdb4-48c4-9330-****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static ModifyStartVulScanRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStartVulScanRequest self = new ModifyStartVulScanRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStartVulScanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyStartVulScanRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
