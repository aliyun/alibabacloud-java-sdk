// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BatchOperateCommonOverallConfigRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("TypeList")
    public java.util.List<String> typeList;

    public static BatchOperateCommonOverallConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchOperateCommonOverallConfigRequest self = new BatchOperateCommonOverallConfigRequest();
        return TeaModel.build(map, self);
    }

    public BatchOperateCommonOverallConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public BatchOperateCommonOverallConfigRequest setTypeList(java.util.List<String> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<String> getTypeList() {
        return this.typeList;
    }

}
