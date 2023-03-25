// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockStatusRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>Specifies whether to enable or disable web tamper proofing for the specified server. Valid values:</p>
     * <br>
     * <p>*   **on**: enables web tamper proofing</p>
     * <p>*   **off**: disables web tamper proofing</p>
     * <br>
     * <p>> After you disable web tamper proofing for the specified server, one quota is released.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The UUID of the server for which you want to enable or disable web tamper proofing. You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ModifyWebLockStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockStatusRequest self = new ModifyWebLockStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyWebLockStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyWebLockStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyWebLockStatusRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
