// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateImageVulRequest extends TeaModel {
    @NameInMap("Info")
    public String info;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("Type")
    public String type;

    public static OperateImageVulRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateImageVulRequest self = new OperateImageVulRequest();
        return TeaModel.build(map, self);
    }

    public OperateImageVulRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public OperateImageVulRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateImageVulRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
