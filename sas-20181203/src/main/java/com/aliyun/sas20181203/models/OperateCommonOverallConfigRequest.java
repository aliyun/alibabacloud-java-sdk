// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateCommonOverallConfigRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Type")
    public String type;

    public static OperateCommonOverallConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateCommonOverallConfigRequest self = new OperateCommonOverallConfigRequest();
        return TeaModel.build(map, self);
    }

    public OperateCommonOverallConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public OperateCommonOverallConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public OperateCommonOverallConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
