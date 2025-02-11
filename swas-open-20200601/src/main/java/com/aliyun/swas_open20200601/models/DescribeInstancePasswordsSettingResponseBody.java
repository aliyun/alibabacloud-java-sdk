// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeInstancePasswordsSettingResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a logon password is set for the simple application server.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InstancePasswordSetting")
    public Boolean instancePasswordSetting;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether a VNC connection password is set for the simple application server.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("VncPasswordSetting")
    public Boolean vncPasswordSetting;

    public static DescribeInstancePasswordsSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePasswordsSettingResponseBody self = new DescribeInstancePasswordsSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePasswordsSettingResponseBody setInstancePasswordSetting(Boolean instancePasswordSetting) {
        this.instancePasswordSetting = instancePasswordSetting;
        return this;
    }
    public Boolean getInstancePasswordSetting() {
        return this.instancePasswordSetting;
    }

    public DescribeInstancePasswordsSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancePasswordsSettingResponseBody setVncPasswordSetting(Boolean vncPasswordSetting) {
        this.vncPasswordSetting = vncPasswordSetting;
        return this;
    }
    public Boolean getVncPasswordSetting() {
        return this.vncPasswordSetting;
    }

}
