// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockStatusRequest extends TeaModel {
    /**
     * <p>Specifies the language of the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>125.71.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>Specifies the protection status of the server. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enables protection.</li>
     * <li><strong>off</strong>: Initiates a shutdown of protection.</li>
     * </ul>
     * <blockquote>
     * <p>After you initiate a shutdown of web tamper-proofing for the current server, a tamper-proofing authorization quota is released.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The UUID of the server for which you want to modify the protection status against brute-force attacks.
     * You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the UUID of the server.</p>
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
