// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileEventsRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the event on web tamper proofing is handled. Valid values:</p>
     * <br>
     * <p>*   **n**: The event on web tamper proofing is handled.</p>
     * <p>*   **y**: The event on web tamper proofing is not handled.</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the process.</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
     * <p>The name of the asset.</p>
     * <br>
     * <p>> You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the names of assets.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp.</p>
     */
    @NameInMap("TsBegin")
    public Long tsBegin;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp.</p>
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
