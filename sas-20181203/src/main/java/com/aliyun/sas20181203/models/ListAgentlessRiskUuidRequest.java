// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRiskUuidRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The public IP address of the asset that you want to query.</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The private IP address of the asset that you want to query.</p>
     */
    @NameInMap("IntranetIp")
    public String intranetIp;

    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("MachineName")
    public String machineName;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether risks exist. Valid values:</p>
     * <br>
     * <p>*   **true**: Risks exist.</p>
     * <p>*   **false**: Risks do not exist.</p>
     */
    @NameInMap("Risk")
    public Boolean risk;

    /**
     * <p>The name of the detection object.</p>
     */
    @NameInMap("TargetName")
    public String targetName;

    public static ListAgentlessRiskUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessRiskUuidRequest self = new ListAgentlessRiskUuidRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentlessRiskUuidRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAgentlessRiskUuidRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ListAgentlessRiskUuidRequest setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public ListAgentlessRiskUuidRequest setMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }
    public String getMachineName() {
        return this.machineName;
    }

    public ListAgentlessRiskUuidRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentlessRiskUuidRequest setRisk(Boolean risk) {
        this.risk = risk;
        return this;
    }
    public Boolean getRisk() {
        return this.risk;
    }

    public ListAgentlessRiskUuidRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

}
