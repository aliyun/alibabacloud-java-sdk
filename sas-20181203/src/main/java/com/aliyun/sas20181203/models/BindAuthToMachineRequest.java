// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindAuthToMachineRequest extends TeaModel {
    /**
     * <p>The edition of Security Center that is authorized to protect the asset. Valid values:</p>
     * <br>
     * <p>*   **6**: Anti-virus edition</p>
     * <p>*   **5**: Advanced edition</p>
     * <p>*   **3**: Enterprise edition</p>
     * <p>*   **7**: Ultimate edition</p>
     * <p>*   **10**: Value-added Plan edition</p>
     */
    @NameInMap("AuthVersion")
    public Integer authVersion;

    /**
     * <p>Specifies whether to automatically bind servers to Security Center. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <p>The UUIDs of the servers that you want to bind to Security Center.</p>
     * <br>
     * <p>>  You must specify at least one of the **Bind** and **UnBind** parameters.</p>
     */
    @NameInMap("Bind")
    public java.util.List<String> bind;

    /**
     * <p>Specifies whether to bind all servers to Security Center. Default value: **false**. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("BindAll")
    public Boolean bindAll;

    /**
     * <p>The search conditions that are used to filter servers. The value of this parameter is in the JSON format and is case-sensitive.</p>
     * <br>
     * <p>>  A search condition can be an instance ID, instance name, virtual private cloud (VPC) ID, region, or public IP address. You can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported search conditions.</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    @NameInMap("IsPreBind")
    public Integer isPreBind;

    /**
     * <p>The logical relationship that you want to use to evaluate multiple search conditions. Default value: **OR**. Valid values:</p>
     * <br>
     * <p>*   **OR******</p>
     * <p>*   **AND******</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    @NameInMap("NtmVersion")
    public String ntmVersion;

    @NameInMap("PreBindOrderId")
    public Long preBindOrderId;

    /**
     * <p>The UUIDs of the servers that you want to unbind from Security Center.</p>
     * <br>
     * <p>>  You must specify at least one of the **Bind** and **UnBind** parameters.</p>
     */
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

    public BindAuthToMachineRequest setIsPreBind(Integer isPreBind) {
        this.isPreBind = isPreBind;
        return this;
    }
    public Integer getIsPreBind() {
        return this.isPreBind;
    }

    public BindAuthToMachineRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public BindAuthToMachineRequest setNtmVersion(String ntmVersion) {
        this.ntmVersion = ntmVersion;
        return this;
    }
    public String getNtmVersion() {
        return this.ntmVersion;
    }

    public BindAuthToMachineRequest setPreBindOrderId(Long preBindOrderId) {
        this.preBindOrderId = preBindOrderId;
        return this;
    }
    public Long getPreBindOrderId() {
        return this.preBindOrderId;
    }

    public BindAuthToMachineRequest setUnBind(java.util.List<String> unBind) {
        this.unBind = unBind;
        return this;
    }
    public java.util.List<String> getUnBind() {
        return this.unBind;
    }

}
