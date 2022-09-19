// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindAuthToMachineRequest extends TeaModel {
    @NameInMap("AuthVersion")
    public Integer authVersion;

    @NameInMap("AutoBind")
    public Integer autoBind;

    @NameInMap("Bind")
    public java.util.List<String> bind;

    @NameInMap("BindAll")
    public Boolean bindAll;

    @NameInMap("Criteria")
    public String criteria;

    @NameInMap("LogicalExp")
    public String logicalExp;

    @NameInMap("UnBind")
    public java.util.List<String> unBind;

    public static BindAuthToMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAuthToMachineRequest self = new BindAuthToMachineRequest();
        return TeaModel.build(map, self);
    }

    public BindAuthToMachineRequest setAuthVersion(Integer authVersion) {
        this.authVersion = authVersion;
        return this;
    }
    public Integer getAuthVersion() {
        return this.authVersion;
    }

    public BindAuthToMachineRequest setAutoBind(Integer autoBind) {
        this.autoBind = autoBind;
        return this;
    }
    public Integer getAutoBind() {
        return this.autoBind;
    }

    public BindAuthToMachineRequest setBind(java.util.List<String> bind) {
        this.bind = bind;
        return this;
    }
    public java.util.List<String> getBind() {
        return this.bind;
    }

    public BindAuthToMachineRequest setBindAll(Boolean bindAll) {
        this.bindAll = bindAll;
        return this;
    }
    public Boolean getBindAll() {
        return this.bindAll;
    }

    public BindAuthToMachineRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public BindAuthToMachineRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public BindAuthToMachineRequest setUnBind(java.util.List<String> unBind) {
        this.unBind = unBind;
        return this;
    }
    public java.util.List<String> getUnBind() {
        return this.unBind;
    }

}
