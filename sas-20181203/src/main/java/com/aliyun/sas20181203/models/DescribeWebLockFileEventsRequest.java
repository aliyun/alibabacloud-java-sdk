// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileEventsRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the event on web tamper proofing is handled. Valid values:</p>
     * <ul>
     * <li><strong>n</strong>: The event on web tamper proofing is handled.</li>
     * <li><strong>y</strong>: The event on web tamper proofing is not handled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>n</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the process.</p>
     * 
     * <strong>example:</strong>
     * <p>sys_create</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
     * <p>The name of the asset.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the names of assets.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test-ecs</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1660649981419</p>
     */
    @NameInMap("TsBegin")
    public Long tsBegin;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1660649981419</p>
     */
    @NameInMap("TsEnd")
    public Long tsEnd;

    public static DescribeWebLockFileEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockFileEventsRequest self = new DescribeWebLockFileEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockFileEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebLockFileEventsRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeWebLockFileEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebLockFileEventsRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public DescribeWebLockFileEventsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeWebLockFileEventsRequest setTsBegin(Long tsBegin) {
        this.tsBegin = tsBegin;
        return this;
    }
    public Long getTsBegin() {
        return this.tsBegin;
    }

    public DescribeWebLockFileEventsRequest setTsEnd(Long tsEnd) {
        this.tsEnd = tsEnd;
        return this;
    }
    public Long getTsEnd() {
        return this.tsEnd;
    }

}
