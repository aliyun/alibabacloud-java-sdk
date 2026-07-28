// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnAttachmentResponseBody extends TeaModel {
    /**
     * <p>The status code returned by the current task. <strong>200</strong> indicates that the task is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The timestamp when the IPsec-VPN connection was created. Unit: milliseconds.</p>
     * <p>The timestamp follows the UNIX format and represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1658201810000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The message returned by the current task.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The name of the IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>88187252-0E26-3C4D-9D1D-32A04454EBBA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the current task is successfully executed.</p>
     * <ul>
     * <li><strong>true</strong>: Successfully executed.</li>
     * <li><strong>false</strong>: Failed to execute.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The IPsec-VPN connection ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-p0wb09rama8qwwgfn****</p>
     */
    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    public static CreateVpnAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnAttachmentResponseBody self = new CreateVpnAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpnAttachmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVpnAttachmentResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateVpnAttachmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVpnAttachmentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVpnAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpnAttachmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateVpnAttachmentResponseBody setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

}
