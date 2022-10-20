// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class DApp extends TeaModel {
    @NameInMap("BaseAppCode")
    public String baseAppCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("ContainerAppCode")
    public String containerAppCode;

    @NameInMap("ContainerDeploy")
    public Boolean containerDeploy;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    public static DApp build(java.util.Map<String, ?> map) throws Exception {
        DApp self = new DApp();
        return TeaModel.build(map, self);
    }

    public DApp setBaseAppCode(String baseAppCode) {
        this.baseAppCode = baseAppCode;
        return this;
    }
    public String getBaseAppCode() {
        return this.baseAppCode;
    }

    public DApp setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DApp setContainerAppCode(String containerAppCode) {
        this.containerAppCode = containerAppCode;
        return this;
    }
    public String getContainerAppCode() {
        return this.containerAppCode;
    }

    public DApp setContainerDeploy(Boolean containerDeploy) {
        this.containerDeploy = containerDeploy;
        return this;
    }
    public Boolean getContainerDeploy() {
        return this.containerDeploy;
    }

    public DApp setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DApp setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DApp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DApp setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
