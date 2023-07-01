// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRiskUuidRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("InternetIp")
    public String internetIp;

    @NameInMap("IntranetIp")
    public String intranetIp;

    @NameInMap("MachineName")
    public String machineName;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Risk")
    public Boolean risk;

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
