// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockStatusRequest extends TeaModel {
    /**
     * <p>The language type for requests and responses. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>125.71.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The protection status of the server. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enables protection.</li>
     * <li><strong>off</strong>: Shuts down protection.</li>
     * </ul>
     * <blockquote>
     * <p>After you shut down web tamper-proofing for the server, a tamper-proofing authorization quota is released.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The UUID of the server for which you want to modify the brute-force attacks prevention status.
     * You can invoke the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the UUID of the server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inet-1234567****</p>
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
