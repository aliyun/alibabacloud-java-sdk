// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ModifyDevicesSecureNetworkTypeRequest extends TeaModel {
    @NameInMap("AllDevices")
    public Long allDevices;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecureNetworkType")
    public String secureNetworkType;

    @NameInMap("SerialNos")
    public String serialNos;

    public static ModifyDevicesSecureNetworkTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDevicesSecureNetworkTypeRequest self = new ModifyDevicesSecureNetworkTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDevicesSecureNetworkTypeRequest setAllDevices(Long allDevices) {
        this.allDevices = allDevices;
        return this;
    }
    public Long getAllDevices() {
        return this.allDevices;
    }

    public ModifyDevicesSecureNetworkTypeRequest setSecureNetworkType(String secureNetworkType) {
        this.secureNetworkType = secureNetworkType;
        return this;
    }
    public String getSecureNetworkType() {
        return this.secureNetworkType;
    }

    public ModifyDevicesSecureNetworkTypeRequest setSerialNos(String serialNos) {
        this.serialNos = serialNos;
        return this;
    }
    public String getSerialNos() {
        return this.serialNos;
    }

}
