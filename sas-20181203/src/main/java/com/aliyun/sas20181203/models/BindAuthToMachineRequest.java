// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindAuthToMachineRequest extends TeaModel {
    /**
     * <p>The edition of Security Center. Valid values:</p>
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
     * <p>The shortage in the quota for cores of servers that can be protected.</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("Bind")
    public java.util.List<String> bind;

    /**
     * <p>The UUID of the server that you want to bind to Security Center.</p>
     * <br>
     * <p>>  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
     */
    @NameInMap("BindAll")
    public Boolean bindAll;

    /**
     * <p>The status code that indicates the result. Valid values:</p>
     * <br>
     * <p>*   **0**: The servers are bound to or unbound from Security Center.</p>
     * <p>*   **1**: The values that you specified for the parameters are invalid.</p>
     * <p>*   **2**: The quota for servers that can be protected is insufficient.</p>
     * <p>*   **3**: The quota for cores of servers that can be protected is insufficient.</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The search conditions that are used to filter servers. The value of this parameter is in the JSON format and is case-sensitive.</p>
     * <br>
     * <p>>  A search condition can be an instance ID, instance name, virtual private cloud (VPC) ID, region, or public IP address. You can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported search conditions.</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>Binds servers to Security Center or unbinds servers from Security Center.</p>
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
