// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutFlagcabinetgetflagRequest extends TeaModel {
    @NameInMap("ConfigKey")
    public String configKey;

    @NameInMap("KeyColumn")
    public String keyColumn;

    @NameInMap("KeyVal")
    public String keyVal;

    public static GetLinkeBahamutFlagcabinetgetflagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutFlagcabinetgetflagRequest self = new GetLinkeBahamutFlagcabinetgetflagRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutFlagcabinetgetflagRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public GetLinkeBahamutFlagcabinetgetflagRequest setKeyColumn(String keyColumn) {
        this.keyColumn = keyColumn;
        return this;
    }
    public String getKeyColumn() {
        return this.keyColumn;
    }

    public GetLinkeBahamutFlagcabinetgetflagRequest setKeyVal(String keyVal) {
        this.keyVal = keyVal;
        return this;
    }
    public String getKeyVal() {
        return this.keyVal;
    }

}
