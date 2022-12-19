// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotAlarmEventsRequest extends TeaModel {
    // The number of the page to return.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The status of the alert events. Valid values:
    // 
    // *   **y**: handled
    // *   **n**: unhandled
    // *   **a**: all states
    @NameInMap("Dealed")
    public String dealed;

    // The destination IP address.
    @NameInMap("DstIp")
    public String dstIp;

    // The number of entries to return on each page. Default value: **100**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The risk levels of the alert events.
    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    // The source IP address.
    @NameInMap("SrcIp")
    public String srcIp;

    public static ListHoneypotAlarmEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotAlarmEventsRequest self = new ListHoneypotAlarmEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListHoneypotAlarmEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListHoneypotAlarmEventsRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public ListHoneypotAlarmEventsRequest setDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }
    public String getDstIp() {
        return this.dstIp;
    }

    public ListHoneypotAlarmEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHoneypotAlarmEventsRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHoneypotAlarmEventsRequest setRiskLevelList(java.util.List<String> riskLevelList) {
        this.riskLevelList = riskLevelList;
        return this;
    }
    public java.util.List<String> getRiskLevelList() {
        return this.riskLevelList;
    }

    public ListHoneypotAlarmEventsRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

}
