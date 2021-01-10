// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutFlagcabinetRequest extends TeaModel {
    @NameInMap("ConfigKey")
    public String configKey;

    @NameInMap("ConfigVal")
    public String configVal;

    @NameInMap("KeyColumn")
    public String keyColumn;

    @NameInMap("KeyVal")
    public String keyVal;

    public static SaveLinkeBahamutFlagcabinetRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutFlagcabinetRequest self = new SaveLinkeBahamutFlagcabinetRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutFlagcabinetRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public SaveLinkeBahamutFlagcabinetRequest setConfigVal(String configVal) {
        this.configVal = configVal;
        return this;
    }
    public String getConfigVal() {
        return this.configVal;
    }

    public SaveLinkeBahamutFlagcabinetRequest setKeyColumn(String keyColumn) {
        this.keyColumn = keyColumn;
        return this;
    }
    public String getKeyColumn() {
        return this.keyColumn;
    }

    public SaveLinkeBahamutFlagcabinetRequest setKeyVal(String keyVal) {
        this.keyVal = keyVal;
        return this;
    }
    public String getKeyVal() {
        return this.keyVal;
    }

}
