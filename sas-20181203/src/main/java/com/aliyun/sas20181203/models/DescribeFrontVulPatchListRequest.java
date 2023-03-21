// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFrontVulPatchListRequest extends TeaModel {
    @NameInMap("Info")
    public String info;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("Type")
    public String type;

    public static DescribeFrontVulPatchListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFrontVulPatchListRequest self = new DescribeFrontVulPatchListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFrontVulPatchListRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public DescribeFrontVulPatchListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFrontVulPatchListRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public DescribeFrontVulPatchListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
