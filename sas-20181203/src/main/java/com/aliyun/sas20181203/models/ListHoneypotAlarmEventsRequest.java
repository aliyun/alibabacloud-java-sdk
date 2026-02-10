// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotAlarmEventsRequest extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The status of the alert event. Default value: <strong>a</strong>. Valid values:</p>
     * <ul>
     * <li><strong>a</strong>: all states</li>
     * <li><strong>y</strong>: handled</li>
     * <li><strong>n</strong>: unhandled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>n</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The destination IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.XX.XX</p>
     */
    @NameInMap("DstIp")
    public String dstIp;

    /**
     * <p>The number of entries per page. Default value: 100. If you leave this parameter empty, 100 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty. We recommend that you set the value to a value no greater than 100.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The risk levels.</p>
     */
    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>101.132.XX.XX</p>
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
