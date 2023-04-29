// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotAlarmEventsRequest extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The destination IP address.</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The risk level. Valid values:</p>
     * <br>
     * <p>*   **2**: low</p>
     * <p>*   **3**: medium</p>
     * <p>*   **4**: high</p>
     */
    @NameInMap("DstIp")
    public String dstIp;

    /**
     * <p>The alert events.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    /**
     * <p>The risk levels of the alert events.</p>
     */
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
