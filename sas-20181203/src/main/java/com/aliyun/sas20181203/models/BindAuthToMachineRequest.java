// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindAuthToMachineRequest extends TeaModel {
    // The edition of Security Center. Valid values:
    // 
    // *   **6**: Anti-virus edition
    // *   **5**: Advanced edition
    // *   **3**: Enterprise edition
    // *   **7**: Ultimate edition
    // *   **10**: Value-added Plan edition
    @NameInMap("AuthVersion")
    public Integer authVersion;

    // Specifies whether to automatically bind servers to Security Center. Valid values:
    // 
    // *   **0**: no
    // *   **1**: yes
    @NameInMap("AutoBind")
    public Integer autoBind;

    // The UUIDs of the servers that you want to bind to Security Center.
    // 
    // >  You must specify at least one of the **Bind** and **UnBind** parameters.
    @NameInMap("Bind")
    public java.util.List<String> bind;

    // Specifies whether to bind all servers to Security Center. Default value: **false**. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("BindAll")
    public Boolean bindAll;

    // The search conditions that are used to filter servers. The value of this parameter is in the JSON format and is case-sensitive.
    // 
    // >  A search condition can be an instance ID, instance name, virtual private cloud (VPC) ID, region, or public IP address. You can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported search conditions.
    @NameInMap("Criteria")
    public String criteria;

    // The logical relationship among multiple search conditions. Valid values:
    // 
    // *   **OR**: Search conditions are evaluated by using a logical **OR**.
    // *   **AND**: Search conditions are evaluated by using a logical **AND**.
    @NameInMap("LogicalExp")
    public String logicalExp;

    // The UUIDs of the servers that you want to unbind from Security Center.
    // 
    // >  You must specify at least one of the **Bind** and **UnBind** parameters.
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
