// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class InsertRenewInfoRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("EngName")
    public String engName;

    @NameInMap("Address")
    public String address;

    @NameInMap("EngAddress")
    public String engAddress;

    @NameInMap("RegisterTime")
    public Long registerTime;

    public static InsertRenewInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertRenewInfoRequest self = new InsertRenewInfoRequest();
        return TeaModel.build(map, self);
    }

    public InsertRenewInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InsertRenewInfoRequest setEngName(String engName) {
        this.engName = engName;
        return this;
    }
    public String getEngName() {
        return this.engName;
    }

    public InsertRenewInfoRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public InsertRenewInfoRequest setEngAddress(String engAddress) {
        this.engAddress = engAddress;
        return this;
    }
    public String getEngAddress() {
        return this.engAddress;
    }

    public InsertRenewInfoRequest setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
        return this;
    }
    public Long getRegisterTime() {
        return this.registerTime;
    }

}
