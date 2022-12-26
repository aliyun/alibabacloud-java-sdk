// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAccessKeyLeakDealRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("IdList")
    public java.util.List<Long> idList;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Type")
    public String type;

    public static ModifyAccessKeyLeakDealRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessKeyLeakDealRequest self = new ModifyAccessKeyLeakDealRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccessKeyLeakDealRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyAccessKeyLeakDealRequest setIdList(java.util.List<Long> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    public ModifyAccessKeyLeakDealRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModifyAccessKeyLeakDealRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
