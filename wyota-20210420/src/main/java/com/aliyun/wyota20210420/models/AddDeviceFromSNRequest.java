// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddDeviceFromSNRequest extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("CustomProperty")
    public String customProperty;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("LabelContents")
    public String labelContents;

    @NameInMap("SecureNetworkType")
    public String secureNetworkType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SerialNo")
    public String serialNo;

    public static AddDeviceFromSNRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceFromSNRequest self = new AddDeviceFromSNRequest();
        return TeaModel.build(map, self);
    }

    public AddDeviceFromSNRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public AddDeviceFromSNRequest setCustomProperty(String customProperty) {
        this.customProperty = customProperty;
        return this;
    }
    public String getCustomProperty() {
        return this.customProperty;
    }

    public AddDeviceFromSNRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddDeviceFromSNRequest setLabelContents(String labelContents) {
        this.labelContents = labelContents;
        return this;
    }
    public String getLabelContents() {
        return this.labelContents;
    }

    public AddDeviceFromSNRequest setSecureNetworkType(String secureNetworkType) {
        this.secureNetworkType = secureNetworkType;
        return this;
    }
    public String getSecureNetworkType() {
        return this.secureNetworkType;
    }

    public AddDeviceFromSNRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

}
