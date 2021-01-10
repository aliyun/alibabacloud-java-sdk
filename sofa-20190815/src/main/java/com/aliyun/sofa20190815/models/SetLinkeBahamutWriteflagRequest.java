// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutWriteflagRequest extends TeaModel {
    @NameInMap("ConfigKey")
    public String configKey;

    @NameInMap("ConfigVal")
    public String configVal;

    @NameInMap("KeyColumn")
    public String keyColumn;

    @NameInMap("KeyVal")
    public String keyVal;

    public static SetLinkeBahamutWriteflagRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutWriteflagRequest self = new SetLinkeBahamutWriteflagRequest();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutWriteflagRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public SetLinkeBahamutWriteflagRequest setConfigVal(String configVal) {
        this.configVal = configVal;
        return this;
    }
    public String getConfigVal() {
        return this.configVal;
    }

    public SetLinkeBahamutWriteflagRequest setKeyColumn(String keyColumn) {
        this.keyColumn = keyColumn;
        return this;
    }
    public String getKeyColumn() {
        return this.keyColumn;
    }

    public SetLinkeBahamutWriteflagRequest setKeyVal(String keyVal) {
        this.keyVal = keyVal;
        return this;
    }
    public String getKeyVal() {
        return this.keyVal;
    }

}
